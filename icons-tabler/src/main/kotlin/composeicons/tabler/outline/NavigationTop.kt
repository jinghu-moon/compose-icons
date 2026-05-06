package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationTop: ImageVector
    get() {
        if (_navigationTop != null) return _navigationTop!!
        _navigationTop = tablerOutlineIcon(
            name = "NavigationTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.54 19.977c.123 .048 .262 .02 .357-.07 .095-.09 .128-.227 .084-.35L12 9 7.018 19.557c-.044 .123-.011 .26 .084 .35 .095 .09 .234 .118 .357 .07L12 18.5l4.54 1.477")
            addPathData("M12 3v2")
        }
        return _navigationTop!!
    }

private var _navigationTop: ImageVector? = null
