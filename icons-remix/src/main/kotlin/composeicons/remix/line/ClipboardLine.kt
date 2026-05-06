package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ClipboardLine: ImageVector
    get() {
        if (_clipboardLine != null) return _clipboardLine!!
        _clipboardLine = remixIcon(
            name = "ClipboardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 4v-2h10v2h3.007c.549 0 .993 .445 .993 .993v16.013c0 .549-.445 .993-.993 .993h-16.013C3.445 22 3 21.555 3 21.007v-16.013C3 4.445 3.445 4 3.993 4h3.007ZM7 6h-2v14h14v-14h-2v2h-10v-2ZM9 4v2h6v-2h-6Z"),
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
        return _clipboardLine!!
    }

private var _clipboardLine: ImageVector? = null
