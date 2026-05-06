package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChinaRailwayLine: ImageVector
    get() {
        if (_chinaRailwayLine != null) return _chinaRailwayLine!!
        _chinaRailwayLine = remixIcon(
            name = "ChinaRailwayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 20v-7h-2v-3h6v3h-2v7h5v2h-12v-2h5ZM10 2.223v-1.223h4v1.223c4.008 .909 7 4.494 7 8.777 0 3.123-1.591 5.875-4.007 7.489L15.883 16.825C17.762 15.57 19 13.429 19 11 19 7.134 15.866 4 12 4 8.134 4 5 7.134 5 11c0 2.429 1.238 4.57 3.117 5.825L7.007 18.489C4.591 16.875 3 14.123 3 11 3 6.717 5.992 3.132 10 2.223Z"),
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
        return _chinaRailwayLine!!
    }

private var _chinaRailwayLine: ImageVector? = null
