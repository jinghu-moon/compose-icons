package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FilePdf2Line: ImageVector
    get() {
        if (_filePdf2Line != null) return _filePdf2Line!!
        _filePdf2Line = remixIcon(
            name = "FilePdf2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 4.000 L 15.000 4.000 L 15.000 8.000 L 19.000 8.000 L 19.000 20.000 L 5.000 20.000 L 5.000 4.000 ZM 3.999 2.000 C 3.447 2.000 3.000 2.444 3.000 2.992 L 3.000 21.008 C 3.000 21.545 3.445 22.000 3.993 22.000 L 20.007 22.000 C 20.555 22.000 21.000 21.549 21.000 20.993 L 21.000 7.000 L 16.000 2.000 L 3.999 2.000 ZM 10.500 7.500 C 10.500 9.077 10.044 10.937 9.275 12.653 C 8.503 14.376 7.461 15.850 6.375 16.719 L 7.555 18.332 C 10.482 16.380 13.723 15.042 16.858 15.490 L 17.316 13.551 C 14.644 12.660 12.500 9.990 12.500 7.500 L 10.500 7.500 ZM 11.100 13.472 C 11.367 12.875 11.604 12.256 11.804 11.628 C 12.275 12.353 12.855 13.018 13.510 13.595 C 12.528 13.771 11.566 14.060 10.635 14.428 C 10.800 14.114 10.955 13.795 11.100 13.472 Z"),
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
        return _filePdf2Line!!
    }

private var _filePdf2Line: ImageVector? = null
