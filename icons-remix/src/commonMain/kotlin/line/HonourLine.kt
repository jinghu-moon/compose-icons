package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HonourLine: ImageVector
    get() {
        if (_honourLine != null) return _honourLine!!
        _honourLine = remixIcon(
            name = "HonourLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 4.000 L 21.000 18.722 C 21.000 18.919 20.883 19.099 20.702 19.179 L 12.000 23.031 L 3.298 19.179 C 3.117 19.099 3.000 18.919 3.000 18.722 L 3.000 4.000 L 1.000 4.000 L 1.000 2.000 L 23.000 2.000 L 23.000 4.000 L 21.000 4.000 ZM 5.000 4.000 L 5.000 17.745 L 12.000 20.844 L 19.000 17.745 L 19.000 4.000 L 5.000 4.000 ZM 8.000 8.000 L 16.000 8.000 L 16.000 10.000 L 8.000 10.000 L 8.000 8.000 ZM 8.000 12.000 L 16.000 12.000 L 16.000 14.000 L 8.000 14.000 L 8.000 12.000 Z"),
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
        return _honourLine!!
    }

private var _honourLine: ImageVector? = null
