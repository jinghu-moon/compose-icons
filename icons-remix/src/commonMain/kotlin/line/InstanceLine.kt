package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InstanceLine: ImageVector
    get() {
        if (_instanceLine != null) return _instanceLine!!
        _instanceLine = remixIcon(
            name = "InstanceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.500 7.653 L 4.500 16.347 L 12.000 20.689 L 19.500 16.347 L 19.500 7.653 L 12.000 3.311 L 4.500 7.653 ZM 12.000 1.000 L 21.500 6.500 L 21.500 17.500 L 12.000 23.000 L 2.500 17.500 L 2.500 6.500 L 12.000 1.000 ZM 6.499 9.971 L 11.000 12.576 L 11.000 17.625 L 13.000 17.625 L 13.000 12.576 L 17.501 9.971 L 16.499 8.240 L 12.000 10.844 L 7.501 8.240 L 6.499 9.971 Z"),
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
        return _instanceLine!!
    }

private var _instanceLine: ImageVector? = null
