package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HemisphereOff: ImageVector
    get() {
        if (_hemisphereOff != null) return _hemisphereOff!!
        _hemisphereOff = tablerOutlineIcon(
            name = "HemisphereOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.588 6.603C4.41 7.15 3 8.02 3 9c0 1.657 4.03 3 9 3M15.72 11.733C18.834 11.26 21 10.215 21 9 21 7.343 16.97 6 12 6c-.662 0-1.308 .024-1.93 .07")
            addPathData("M3 9c-0 3.252 1.754 6.252 4.589 7.846 2.835 1.594 6.309 1.534 9.088-.156M18.842 14.847C20.237 13.219 21.003 11.144 21 9")
            addPathData("M3 3 21 21")
        }
        return _hemisphereOff!!
    }

private var _hemisphereOff: ImageVector? = null
