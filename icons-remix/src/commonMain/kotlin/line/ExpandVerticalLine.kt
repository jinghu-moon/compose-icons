package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandVerticalLine: ImageVector
    get() {
        if (_expandVerticalLine != null) return _expandVerticalLine!!
        _expandVerticalLine = remixIcon(
            name = "ExpandVerticalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 0.500 L 16.949 5.449 L 15.535 6.863 L 13.000 4.328 L 13.000 10.000 L 11.000 10.000 L 11.000 4.328 L 8.466 6.861 L 7.052 5.447 L 12.000 0.500 ZM 11.000 14.000 L 11.000 19.670 L 8.464 17.135 L 7.050 18.550 L 12.000 23.500 L 16.950 18.550 L 15.535 17.136 L 13.000 19.672 L 13.000 14.000 L 11.000 14.000 Z"),
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
        return _expandVerticalLine!!
    }

private var _expandVerticalLine: ImageVector? = null
