package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ProgressHelp: ImageVector
    get() {
        if (_progressHelp != null) return _progressHelp!!
        _progressHelp = tablerOutlineIcon(
            name = "ProgressHelp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16v.01")
            addPathData("M12 13c.926 .003 1.733-.63 1.95-1.53 .217-.9-.211-1.831-1.036-2.252-.819-.42-1.819-.219-2.414 .483")
            addPathData("M10 20.777c-.87-.197-1.706-.524-2.48-.969")
            addPathData("M14 3.223c4.094 .935 6.998 4.577 6.998 8.777 0 4.2-2.904 7.842-6.998 8.777")
            addPathData("M4.579 17.093C4.034 16.3 3.619 15.425 3.352 14.501")
            addPathData("M3.124 10.5c.16-.95 .468-1.85 .9-2.675l.169-.305")
            addPathData("M6.907 4.579C7.843 3.935 8.892 3.475 10 3.223")
        }
        return _progressHelp!!
    }

private var _progressHelp: ImageVector? = null
