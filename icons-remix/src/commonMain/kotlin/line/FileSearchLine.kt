package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileSearchLine: ImageVector
    get() {
        if (_fileSearchLine != null) return _fileSearchLine!!
        _fileSearchLine = remixIcon(
            name = "FileSearchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 8.000 L 15.000 8.000 L 15.000 4.000 ZM 3.000 2.992 C 3.000 2.444 3.447 2.000 3.999 2.000 L 16.000 2.000 L 21.000 7.000 L 21.000 20.993 C 21.000 21.549 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 ZM 13.529 14.446 C 11.995 15.352 9.986 15.146 8.668 13.828 C 7.106 12.266 7.106 9.734 8.668 8.172 C 10.231 6.609 12.763 6.609 14.325 8.172 C 15.643 9.490 15.849 11.498 14.943 13.032 L 17.154 15.243 L 15.740 16.657 L 13.529 14.446 ZM 12.911 12.414 C 13.692 11.633 13.692 10.367 12.911 9.586 C 12.130 8.805 10.864 8.805 10.083 9.586 C 9.302 10.367 9.302 11.633 10.083 12.414 C 10.864 13.195 12.130 13.195 12.911 12.414 Z"),
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
        return _fileSearchLine!!
    }

private var _fileSearchLine: ImageVector? = null
