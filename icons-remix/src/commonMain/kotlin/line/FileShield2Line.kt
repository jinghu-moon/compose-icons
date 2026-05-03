package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileShield2Line: ImageVector
    get() {
        if (_fileShield2Line != null) return _fileShield2Line!!
        _fileShield2Line = remixIcon(
            name = "FileShield2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 9.000 L 14.000 4.000 L 5.000 4.000 L 5.000 20.000 L 11.056 20.000 C 11.384 20.417 11.780 20.785 12.236 21.085 L 13.626 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 2.992 C 3.000 2.455 3.449 2.000 4.002 2.000 L 14.997 2.000 L 21.000 8.000 L 21.000 9.000 L 14.000 9.000 ZM 12.000 11.000 L 21.000 11.000 L 21.000 16.949 C 21.000 17.940 20.499 18.865 19.664 19.414 L 16.500 21.498 L 13.336 19.414 C 12.501 18.865 12.000 17.940 12.000 16.949 L 12.000 11.000 ZM 14.000 16.949 C 14.000 17.265 14.162 17.563 14.436 17.744 L 16.500 19.103 L 18.564 17.744 C 18.838 17.563 19.000 17.265 19.000 16.949 L 19.000 13.000 L 14.000 13.000 L 14.000 16.949 Z"),
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
        return _fileShield2Line!!
    }

private var _fileShield2Line: ImageVector? = null
