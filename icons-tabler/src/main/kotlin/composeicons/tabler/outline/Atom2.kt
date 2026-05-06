package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Atom2: ImageVector
    get() {
        if (_atom2 != null) return _atom2!!
        _atom2 = tablerOutlineIcon(
            name = "Atom2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M12 21v.01")
            addPathData("M3 9v.01")
            addPathData("M21 9v.01")
            addPathData("M8 20.1C5.226 18.747 3.339 16.067 3 13")
            addPathData("M16 20.1C18.774 18.747 20.661 16.067 21 13")
            addPathData("M6.2 5C9.516 2.287 14.284 2.287 17.6 5")
        }
        return _atom2!!
    }

private var _atom2: ImageVector? = null
