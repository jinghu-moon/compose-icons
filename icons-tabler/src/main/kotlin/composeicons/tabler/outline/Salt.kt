package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Salt: ImageVector
    get() {
        if (_salt != null) return _salt!!
        _salt = tablerOutlineIcon(
            name = "Salt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v.01")
            addPathData("M10 16v.01")
            addPathData("M14 16v.01")
            addPathData("M7.5 8h9L16.219 5.752C16.094 4.751 15.243 4 14.234 4h-4.468C8.757 3.999 7.905 4.751 7.78 5.752L7.5 8")
            addPathData("M7.5 8 5.888 17.671c-.097 .58 .067 1.173 .447 1.622 .38 .449 .938 .707 1.526 .707h8.278c.588 0 1.146-.259 1.526-.707 .38-.449 .543-1.042 .447-1.622L16.5 8")
        }
        return _salt!!
    }

private var _salt: ImageVector? = null
