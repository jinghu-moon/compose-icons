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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 19.000 L 11.000 13.000 L 9.000 12.000 L 9.000 9.000 L 15.000 9.000 L 15.000 12.000 L 13.000 13.000 L 13.000 19.000 L 18.000 20.000 L 18.000 22.000 L 6.000 22.000 L 6.000 20.000 L 11.000 19.000 ZM 10.000 2.223 L 10.000 1.000 L 14.000 1.000 L 14.000 2.223 C 18.008 3.132 21.000 6.717 21.000 11.000 C 21.000 14.123 19.409 16.875 16.993 18.489 L 15.883 16.825 C 17.762 15.570 19.000 13.429 19.000 11.000 C 19.000 7.134 15.866 4.000 12.000 4.000 C 8.134 4.000 5.000 7.134 5.000 11.000 C 5.000 13.429 6.238 15.570 8.117 16.825 L 7.007 18.489 C 4.591 16.875 3.000 14.123 3.000 11.000 C 3.000 6.717 5.992 3.132 10.000 2.223 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _chinaRailwayFill!!
    }

private var _chinaRailwayFill: ImageVector? = null
