package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volcano: ImageVector
    get() {
        if (_volcano != null) return _volcano!!
        _volcano = tablerOutlineIcon(
            name = "Volcano",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 8v-1C9 5.895 8.105 5 7 5 5.895 5 5 5.895 5 7")
            addPathData("M15 8v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
            addPathData("M4 20 7.472 12.188C7.793 11.466 8.509 11 9.3 11h5.4c.791-0 1.507 .466 1.828 1.188L20 20")
            addPathData("M6.192 15.064c.155-.039 .315-.061 .475-.064 .527-.009 1.026 .178 1.333 .5 .307 .32 .806 .507 1.333 .5 .527 .007 1.026-.18 1.334-.5 .307-.322 .806-.509 1.333-.5 .527-.009 1.026 .178 1.333 .5 .308 .32 .807 .507 1.334 .5 .527 .007 1.026-.18 1.333-.5 .307-.322 .806-.509 1.333-.5 .161 .003 .32 .025 .472 .064")
            addPathData("M12 8v-4")
        }
        return _volcano!!
    }

private var _volcano: ImageVector? = null
