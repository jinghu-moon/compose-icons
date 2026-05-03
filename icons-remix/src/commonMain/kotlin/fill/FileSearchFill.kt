package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileSearchFill: ImageVector
    get() {
        if (_fileSearchFill != null) return _fileSearchFill!!
        _fileSearchFill = remixIcon(
            name = "FileSearchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 2.000 L 21.000 7.000 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.445 2.000 3.993 2.000 L 16.000 2.000 ZM 13.529 14.446 L 15.740 16.657 L 17.154 15.243 L 14.943 13.032 C 15.849 11.498 15.643 9.490 14.325 8.172 C 12.763 6.609 10.231 6.609 8.668 8.172 C 7.106 9.734 7.106 12.266 8.668 13.828 C 9.986 15.146 11.995 15.352 13.529 14.446 ZM 12.911 12.414 C 12.130 13.195 10.864 13.195 10.083 12.414 C 9.302 11.633 9.302 10.367 10.083 9.586 C 10.864 8.805 12.130 8.805 12.911 9.586 C 13.692 10.367 13.692 11.633 12.911 12.414 Z"),
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
        return _fileSearchFill!!
    }

private var _fileSearchFill: ImageVector? = null
