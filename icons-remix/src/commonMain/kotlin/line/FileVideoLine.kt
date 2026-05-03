package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileVideoLine: ImageVector
    get() {
        if (_fileVideoLine != null) return _fileVideoLine!!
        _fileVideoLine = remixIcon(
            name = "FileVideoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 4.000 L 15.000 8.000 L 19.000 8.000 L 19.000 20.000 L 5.000 20.000 L 5.000 4.000 L 15.000 4.000 ZM 3.999 2.000 C 3.447 2.000 3.000 2.444 3.000 2.992 L 3.000 21.008 C 3.000 21.545 3.445 22.000 3.993 22.000 L 20.007 22.000 C 20.555 22.000 21.000 21.549 21.000 20.993 L 21.000 7.000 L 16.000 2.000 L 3.999 2.000 ZM 15.001 11.667 L 10.122 8.414 C 10.056 8.371 9.979 8.347 9.900 8.347 C 9.679 8.347 9.500 8.526 9.500 8.747 L 9.500 15.252 C 9.500 15.331 9.523 15.409 9.567 15.474 C 9.690 15.658 9.938 15.708 10.122 15.585 L 15.001 12.333 C 15.045 12.303 15.082 12.266 15.112 12.222 C 15.234 12.038 15.185 11.790 15.001 11.667 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _fileVideoLine!!
    }

private var _fileVideoLine: ImageVector? = null
