package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FilePdfFill: ImageVector
    get() {
        if (_filePdfFill != null) return _filePdfFill!!
        _filePdfFill = remixIcon(
            name = "FilePdfFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 2.000 L 21.000 7.000 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.445 2.000 3.993 2.000 L 16.000 2.000 ZM 12.000 16.000 C 14.209 16.000 16.000 14.209 16.000 12.000 C 16.000 9.791 14.209 8.000 12.000 8.000 L 8.000 8.000 L 8.000 16.000 L 12.000 16.000 ZM 10.000 10.000 L 12.000 10.000 C 13.105 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 L 10.000 14.000 L 10.000 10.000 Z"),
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
        return _filePdfFill!!
    }

private var _filePdfFill: ImageVector? = null
