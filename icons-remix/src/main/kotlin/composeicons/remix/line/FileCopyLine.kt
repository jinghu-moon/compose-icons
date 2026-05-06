package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileCopyLine: ImageVector
    get() {
        if (_fileCopyLine != null) return _fileCopyLine!!
        _fileCopyLine = remixIcon(
            name = "FileCopyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 6v-3c0-.552 .448-1 1-1h12c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-3v2.999c0 .553-.45 1.001-1.007 1.001h-11.986C3.451 22 3 21.555 3 20.999L3.003 7.001C3.003 6.448 3.453 6 4.009 6h2.99ZM5.002 8 5 20h10v-12h-9.997ZM9 6h8v10h2v-12h-10v2Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _fileCopyLine!!
    }

private var _fileCopyLine: ImageVector? = null
