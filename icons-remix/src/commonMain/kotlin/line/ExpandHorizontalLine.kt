package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandHorizontalLine: ImageVector
    get() {
        if (_expandHorizontalLine != null) return _expandHorizontalLine!!
        _expandHorizontalLine = remixIcon(
            name = "ExpandHorizontalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 0.500 12.000 L 5.450 7.050 L 6.864 8.465 L 4.328 11.000 L 10.000 11.000 L 10.000 13.000 L 4.328 13.000 L 6.861 15.533 L 5.447 16.947 L 0.500 12.000 ZM 14.000 13.000 L 19.671 13.000 L 17.136 15.535 L 18.550 16.949 L 23.500 12.000 L 18.550 7.050 L 17.136 8.464 L 19.672 11.000 L 14.000 11.000 L 14.000 13.000 Z"),
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
        return _expandHorizontalLine!!
    }

private var _expandHorizontalLine: ImageVector? = null
