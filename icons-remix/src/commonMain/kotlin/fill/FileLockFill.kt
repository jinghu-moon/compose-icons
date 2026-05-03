package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileLockFill: ImageVector
    get() {
        if (_fileLockFill != null) return _fileLockFill!!
        _fileLockFill = remixIcon(
            name = "FileLockFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 2.000 L 21.000 7.000 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.445 2.000 3.993 2.000 L 16.000 2.000 ZM 15.000 11.000 L 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000 C 10.343 7.000 9.000 8.343 9.000 10.000 L 9.000 11.000 L 8.000 11.000 L 8.000 16.000 L 16.000 16.000 L 16.000 11.000 L 15.000 11.000 ZM 13.000 11.000 L 11.000 11.000 L 11.000 10.000 C 11.000 9.448 11.448 9.000 12.000 9.000 C 12.552 9.000 13.000 9.448 13.000 10.000 L 13.000 11.000 Z"),
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
        return _fileLockFill!!
    }

private var _fileLockFill: ImageVector? = null
