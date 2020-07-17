package Dominio;

public enum Estado {
	pendiente {
		@Override
		public Boolean Correcta() {
			// TODO Auto-generated method stub
			return null;
		}
	}, correcta {
		@Override
		public Boolean Correcta() {
			// TODO Auto-generated method stub
			return true;
		}
	}, mal {
		@Override
		public Boolean Correcta() {
			// TODO Auto-generated method stub
			return false;
		}
	};
	
	public abstract Boolean Correcta();
}
