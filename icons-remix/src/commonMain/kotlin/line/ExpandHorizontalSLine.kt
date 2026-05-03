package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandHorizontalSLine: ImageVector
    get() {
        if (_expandHorizontalSLine != null) return _expandHorizontalSLine!!
        _expandHorizontalSLine = remixIcon(
            name = "ExpandHorizontalSLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.450 7.050 L 2.500 12.000 L 7.447 16.947 L 8.861 15.533 L 6.328 13.000 L 17.671 13.000 L 15.136 15.535 L 16.550 16.949 L 21.500 12.000 L 16.550 7.050 L 15.136 8.464 L 17.672 11.000 L 6.328 11.000 L 8.864 8.465 L 7.450 7.050 Z"),
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
        return _expandHorizontalSLine!!
    }

private var _expandHorizontalSLine: ImageVector? = null
