package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationExclamation: ImageVector
    get() {
        if (_locationExclamation != null) return _locationExclamation!!
        _locationExclamation = tablerOutlineIcon(
            name = "LocationExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.024 19.55 14.5 21c-.09 .196-.285 .321-.5 .321-.215 0-.41-.125-.5-.321L10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3l-3.317 9.186")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _locationExclamation!!
    }

private var _locationExclamation: ImageVector? = null
