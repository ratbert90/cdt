package org.eclipse.cdt.internal.core.dom;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



/**
 * @author jcamelon
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ParameterDeclaration extends Declaration implements DeclSpecifier.IContainer, TypeSpecifier.IOwner {

	private DeclSpecifier declSpec = null; 
	private TypeSpecifier typeSpecifier;
	
	public ParameterDeclaration( IScope scope )
	{
		super( scope );
	}
	
	/**
	 * Returns the typeSpecifier.
	 * @return TypeSpecifier
	 */
	public TypeSpecifier getTypeSpecifier() {
		return typeSpecifier;
	}

	/**
	 * Sets the typeSpecifier.
	 * @param typeSpecifier The typeSpecifier to set
	 */
	public void setTypeSpecifier(TypeSpecifier typeSpecifier) {
		getDeclSpecifier().setType(DeclSpecifier.t_type);
		this.typeSpecifier = typeSpecifier;
	}
	
	/**
	 * @see org.eclipse.cdt.internal.core.dom.DeclarationSpecifier.CElementWrapper#getDeclSpecifier()
	 */
	public DeclSpecifier getDeclSpecifier() {
		if( declSpec == null )
			declSpec = new DeclSpecifier(); 
			
		return declSpec; 
	}

	private List declarators = new LinkedList();
	
	public void addDeclarator(Object declarator) {
		declarators.add(declarator);
	}

	public List getDeclarators() {
		return Collections.unmodifiableList( declarators );
	}

}
