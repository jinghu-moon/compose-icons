package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NurseFill: ImageVector
    get() {
        if (_nurseFill != null) return _nurseFill!!
        _nurseFill = remixIcon(
            name = "NurseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.957 15.564c2.658 1.058 4.615 3.5 4.982 6.436h-15.876c.366-2.936 2.323-5.378 4.982-6.436L12.001 20l2.957-4.436ZM18.001 2v6c0 3.314-2.686 6-6 6C8.687 14 6.001 11.314 6.001 8v-6h12ZM16.001 8h-8c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4Z"),
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
        return _nurseFill!!
    }

private var _nurseFill: ImageVector? = null
