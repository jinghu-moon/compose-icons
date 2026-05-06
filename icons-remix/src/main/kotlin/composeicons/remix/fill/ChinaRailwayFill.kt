package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChinaRailwayFill: ImageVector
    get() {
        if (_chinaRailwayFill != null) return _chinaRailwayFill!!
        _chinaRailwayFill = remixIcon(
            name = "ChinaRailwayFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 19v-6L9 12v-3h6v3l-2 1v6l5 1v2h-12v-2l5-1ZM10 2.223v-1.223h4v1.223c4.008 .909 7 4.494 7 8.777 0 3.123-1.591 5.875-4.007 7.489L15.883 16.825C17.762 15.57 19 13.429 19 11 19 7.134 15.866 4 12 4 8.134 4 5 7.134 5 11c0 2.429 1.238 4.57 3.117 5.825L7.007 18.489C4.591 16.875 3 14.123 3 11 3 6.717 5.992 3.132 10 2.223Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _chinaRailwayFill!!
    }

private var _chinaRailwayFill: ImageVector? = null
