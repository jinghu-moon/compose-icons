package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandWidthLine: ImageVector
    get() {
        if (_expandWidthLine != null) return _expandWidthLine!!
        _expandWidthLine = remixIcon(
            name = "ExpandWidthLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 18.000 L 2.000 6.000 L 4.000 6.000 L 4.000 18.000 L 2.000 18.000 ZM 9.450 7.050 L 4.500 12.000 L 9.447 16.947 L 10.861 15.533 L 8.328 13.000 L 15.671 13.000 L 13.136 15.535 L 14.550 16.949 L 19.500 12.000 L 14.550 7.050 L 13.136 8.464 L 15.672 11.000 L 8.328 11.000 L 10.864 8.464 L 9.450 7.050 ZM 20.000 6.000 L 22.000 6.000 L 22.000 18.000 L 20.000 18.000 L 20.000 6.000 Z"),
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
        return _expandWidthLine!!
    }

private var _expandWidthLine: ImageVector? = null
