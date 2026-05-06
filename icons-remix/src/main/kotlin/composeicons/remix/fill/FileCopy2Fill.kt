package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileCopy2Fill: ImageVector
    get() {
        if (_fileCopy2Fill != null) return _fileCopy2Fill!!
        _fileCopy2Fill = remixIcon(
            name = "FileCopy2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 6v-3c0-.552 .448-1 1-1h12c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-3v2.999c0 .553-.45 1.001-1.007 1.001h-11.986C3.451 22 3 21.555 3 20.999L3.003 7.001C3.003 6.448 3.453 6 4.009 6h2.99ZM9 6h8v10h2v-12h-10v2ZM7 11v2h6v-2h-6ZM7 15v2h6v-2h-6Z"),
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
        return _fileCopy2Fill!!
    }

private var _fileCopy2Fill: ImageVector? = null
