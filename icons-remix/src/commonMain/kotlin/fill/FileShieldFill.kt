package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileShieldFill: ImageVector
    get() {
        if (_fileShieldFill != null) return _fileShieldFill!!
        _fileShieldFill = remixIcon(
            name = "FileShieldFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 7.000 L 21.000 20.993 C 21.000 21.551 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 2.992 C 3.000 2.455 3.447 2.000 3.998 2.000 L 15.997 2.000 L 21.000 7.000 ZM 8.000 8.000 L 8.000 13.600 C 8.000 14.450 8.446 15.243 9.187 15.714 L 12.000 17.500 L 14.812 15.714 C 15.554 15.243 16.000 14.450 16.000 13.600 L 16.000 8.000 L 8.000 8.000 ZM 10.000 10.000 L 14.000 10.000 L 14.000 13.600 C 14.000 13.758 13.910 13.918 13.740 14.026 L 12.000 15.131 L 10.260 14.026 C 10.090 13.918 10.000 13.758 10.000 13.600 L 10.000 10.000 Z"),
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
        return _fileShieldFill!!
    }

private var _fileShieldFill: ImageVector? = null
