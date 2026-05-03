package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileImageFill: ImageVector
    get() {
        if (_fileImageFill != null) return _fileImageFill!!
        _fileImageFill = remixIcon(
            name = "FileImageFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 7.000 L 16.000 2.000 L 3.993 2.000 C 3.445 2.000 3.000 2.444 3.000 2.992 L 3.000 21.008 C 3.000 21.545 3.445 22.000 3.993 22.000 L 20.007 22.000 C 20.555 22.000 21.000 21.556 21.000 21.008 L 21.000 7.000 ZM 11.000 9.500 C 11.000 10.328 10.328 11.000 9.500 11.000 C 8.672 11.000 8.000 10.328 8.000 9.500 C 8.000 8.672 8.672 8.000 9.500 8.000 C 10.328 8.000 11.000 8.672 11.000 9.500 ZM 17.500 17.000 L 8.000 17.000 L 13.500 10.000 L 17.500 17.000 Z"),
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
        return _fileImageFill!!
    }

private var _fileImageFill: ImageVector? = null
