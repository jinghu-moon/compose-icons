package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sausage: ImageVector
    get() {
        if (_sausage != null) return _sausage!!
        _sausage = tablerOutlineIcon(
            name = "Sausage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.5 5.5C4.119 5.5 3 6.619 3 8c0 7.18 5.82 13 13 13 1.381 0 2.5-1.119 2.5-2.5C18.5 17.119 17.381 16 16 16 11.582 16 8 12.418 8 8 8 6.619 6.881 5.5 5.5 5.5")
            addPathData("M5.195 5.519 3.952 3.53C3.759 3.222 3.749 2.833 3.925 2.515 4.102 2.197 4.436 2 4.8 2h1.392c.364-0 .698 .197 .875 .515 .176 .318 .166 .707-.027 1.015L5.795 5.52")
            addPathData("M18.482 18.225l1.989-1.243c.308-.193 .697-.203 1.015-.027 .318 .176 .515 .511 .515 .875v1.392c0 .364-.197 .698-.515 .875-.318 .176-.707 .166-1.015-.027L18.48 18.825")
        }
        return _sausage!!
    }

private var _sausage: ImageVector? = null
