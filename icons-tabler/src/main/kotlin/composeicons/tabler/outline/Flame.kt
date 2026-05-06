package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = tablerOutlineIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 10.941C14.333 7.633 12.167 3.118 11 2 11 5.395 8.765 7.299 7.333 8.706 5.903 10.114 5 12 5 14.294 5 17.998 8.134 21 12 21c3.866 0 7-3.002 7-6.706C19 12.582 17.768 9.891 16.667 8.706 14.583 12.059 13.41 12.059 12 10.941"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _flame!!
    }

private var _flame: ImageVector? = null
