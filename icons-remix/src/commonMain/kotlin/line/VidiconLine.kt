package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VidiconLine: ImageVector
    get() {
        if (_vidiconLine != null) return _vidiconLine!!
        _vidiconLine = remixIcon(
            name = "VidiconLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 9.200 L 22.213 5.551 C 22.440 5.392 22.751 5.447 22.910 5.674 C 22.968 5.758 23.000 5.858 23.000 5.960 L 23.000 18.040 C 23.000 18.316 22.776 18.540 22.500 18.540 C 22.397 18.540 22.297 18.508 22.213 18.449 L 17.000 14.800 L 17.000 19.000 C 17.000 19.552 16.552 20.000 16.000 20.000 L 2.000 20.000 C 1.448 20.000 1.000 19.552 1.000 19.000 L 1.000 5.000 C 1.000 4.448 1.448 4.000 2.000 4.000 L 16.000 4.000 C 16.552 4.000 17.000 4.448 17.000 5.000 L 17.000 9.200 ZM 17.000 12.359 L 21.000 15.159 L 21.000 8.841 L 17.000 11.641 L 17.000 12.359 ZM 3.000 6.000 L 3.000 18.000 L 15.000 18.000 L 15.000 6.000 L 3.000 6.000 ZM 5.000 8.000 L 7.000 8.000 L 7.000 10.000 L 5.000 10.000 L 5.000 8.000 Z"),
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
        return _vidiconLine!!
    }

private var _vidiconLine: ImageVector? = null
