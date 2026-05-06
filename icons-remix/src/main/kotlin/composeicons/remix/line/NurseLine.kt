package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NurseLine: ImageVector
    get() {
        if (_nurseLine != null) return _nurseLine!!
        _nurseLine = remixIcon(
            name = "NurseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 15c4.08 0 7.446 3.054 7.938 7h-15.876c.492-3.946 3.858-7 7.938-7ZM10.188 17.279C8.754 17.734 7.546 18.713 6.802 20h5.199L10.188 17.279ZM13.814 17.28 12.001 20h5.199c-.744-1.287-1.952-2.266-3.385-2.72ZM18.001 2v6c0 3.314-2.686 6-6 6C8.687 14 6.001 11.314 6.001 8v-6h12ZM8.001 8c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4h-8ZM16.001 4h-8L8 6h8l0-2Z"),
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
        return _nurseLine!!
    }

private var _nurseLine: ImageVector? = null
