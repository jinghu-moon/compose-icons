package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PokeballOff: ImageVector
    get() {
        if (_pokeballOff != null) return _pokeballOff!!
        _pokeballOff = tablerOutlineIcon(
            name = "PokeballOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.04 16.048C21.788 12.58 21.114 8.382 18.369 5.635 15.624 2.888 11.426 2.212 7.957 3.958M5.637 5.636C2.125 9.153 2.129 14.852 5.646 18.364c3.517 3.512 9.216 3.508 12.728-.009")
            addPathData("M9.884 9.874c-1.173 1.171-1.174 3.071-.003 4.243 1.171 1.173 3.071 1.174 4.243 .003M14.694 10.679c-.3-.609-.797-1.099-1.41-1.39")
            addPathData("M3 12h6M16 12h5")
            addPathData("M3 3 21 21")
        }
        return _pokeballOff!!
    }

private var _pokeballOff: ImageVector? = null
