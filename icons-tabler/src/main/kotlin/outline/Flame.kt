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
                pathData = parseSvgPathData("M 12.000 10.941 C 14.333 7.633 12.167 3.118 11.000 2.000 C 11.000 5.395 8.765 7.299 7.333 8.706 C 5.903 10.114 5.000 12.000 5.000 14.294 C 5.000 17.998 8.134 21.000 12.000 21.000 C 15.866 21.000 19.000 17.998 19.000 14.294 C 19.000 12.582 17.768 9.891 16.667 8.706 C 14.583 12.059 13.410 12.059 12.000 10.941"),
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
