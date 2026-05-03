package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CollapseVerticalLine: ImageVector
    get() {
        if (_collapseVerticalLine != null) return _collapseVerticalLine!!
        _collapseVerticalLine = remixIcon(
            name = "CollapseVerticalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 13.500 L 16.949 18.449 L 15.535 19.864 L 13.000 17.328 L 13.000 23.000 L 11.000 23.000 L 11.000 17.328 L 8.466 19.861 L 7.052 18.447 L 12.000 13.500 ZM 11.000 1.000 L 11.000 6.670 L 8.464 4.135 L 7.050 5.550 L 12.000 10.500 L 16.950 5.550 L 15.535 4.136 L 13.000 6.672 L 13.000 1.000 L 11.000 1.000 Z"),
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
        return _collapseVerticalLine!!
    }

private var _collapseVerticalLine: ImageVector? = null
