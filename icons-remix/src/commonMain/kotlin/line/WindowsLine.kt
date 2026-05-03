package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WindowsLine: ImageVector
    get() {
        if (_windowsLine != null) return _windowsLine!!
        _windowsLine = remixIcon(
            name = "WindowsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.001 2.500 L 21.001 21.500 L 3.001 19.500 L 3.001 4.500 L 21.001 2.500 ZM 19.001 12.999 L 12.001 13.000 L 12.001 18.487 L 19.001 19.265 L 19.001 12.999 ZM 5.001 17.710 L 10.001 18.265 L 10.001 13.000 L 5.001 12.999 L 5.001 17.710 ZM 19.001 10.999 L 19.001 4.735 L 12.001 5.512 L 12.001 11.000 L 19.001 10.999 ZM 10.001 5.734 L 5.001 6.290 L 5.001 10.999 L 10.001 11.000 L 10.001 5.734 Z"),
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
        return _windowsLine!!
    }

private var _windowsLine: ImageVector? = null
