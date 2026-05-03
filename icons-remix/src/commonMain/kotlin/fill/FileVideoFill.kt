package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileVideoFill: ImageVector
    get() {
        if (_fileVideoFill != null) return _fileVideoFill!!
        _fileVideoFill = remixIcon(
            name = "FileVideoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 2.000 L 21.000 7.000 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.445 2.000 3.993 2.000 L 16.000 2.000 ZM 15.001 11.667 L 10.122 8.414 C 10.056 8.371 9.979 8.347 9.900 8.347 C 9.679 8.347 9.500 8.526 9.500 8.747 L 9.500 15.252 C 9.500 15.331 9.523 15.409 9.567 15.474 C 9.690 15.658 9.938 15.708 10.122 15.585 L 15.001 12.333 C 15.045 12.303 15.082 12.266 15.112 12.222 C 15.234 12.038 15.185 11.790 15.001 11.667 Z"),
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
        return _fileVideoFill!!
    }

private var _fileVideoFill: ImageVector? = null
