package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileShieldLine: ImageVector
    get() {
        if (_fileShieldLine != null) return _fileShieldLine!!
        _fileShieldLine = remixIcon(
            name = "FileShieldLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 8.000 L 14.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 9.000 L 16.000 9.000 L 16.000 13.620 C 16.000 14.464 15.554 15.253 14.812 15.722 L 12.000 17.498 L 9.187 15.722 C 8.446 15.253 8.000 14.464 8.000 13.620 L 8.000 8.000 L 14.000 8.000 ZM 21.000 8.000 L 21.000 20.993 C 21.000 21.550 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 2.992 C 3.000 2.455 3.449 2.000 4.002 2.000 L 14.997 2.000 L 21.000 8.000 ZM 10.000 13.620 C 10.000 13.770 10.087 13.924 10.255 14.031 L 12.000 15.132 L 13.745 14.031 C 13.913 13.924 14.000 13.770 14.000 13.620 L 14.000 10.000 L 10.000 10.000 L 10.000 13.620 Z"),
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
        return _fileShieldLine!!
    }

private var _fileShieldLine: ImageVector? = null
