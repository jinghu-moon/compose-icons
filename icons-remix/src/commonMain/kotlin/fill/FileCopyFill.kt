package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileCopyFill: ImageVector
    get() {
        if (_fileCopyFill != null) return _fileCopyFill!!
        _fileCopyFill = remixIcon(
            name = "FileCopyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 6.000 L 7.000 3.000 C 7.000 2.448 7.448 2.000 8.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 17.000 C 21.000 17.552 20.552 18.000 20.000 18.000 L 17.000 18.000 L 17.000 20.999 C 17.000 21.552 16.550 22.000 15.993 22.000 L 4.007 22.000 C 3.451 22.000 3.000 21.555 3.000 20.999 L 3.003 7.001 C 3.003 6.448 3.453 6.000 4.009 6.000 L 7.000 6.000 ZM 9.000 6.000 L 17.000 6.000 L 17.000 16.000 L 19.000 16.000 L 19.000 4.000 L 9.000 4.000 L 9.000 6.000 Z"),
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
        return _fileCopyFill!!
    }

private var _fileCopyFill: ImageVector? = null
