package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlaskOff: ImageVector
    get() {
        if (_flaskOff != null) return _flaskOff!!
        _flaskOff = tablerOutlineIcon(
            name = "FlaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3h6")
            addPathData("M13 9h1")
            addPathData("M10 3v3M9.732 9.736 6 20c-.098 .197-.098 .428 .001 .625 .098 .197 .283 .336 .499 .375h11c.216-.04 .401-.179 .499-.375 .098-.197 .099-.428 .001-.625L16.857 16.858M14.569 10.564 14 9v-6")
            addPathData("M3 3 21 21")
        }
        return _flaskOff!!
    }

private var _flaskOff: ImageVector? = null
