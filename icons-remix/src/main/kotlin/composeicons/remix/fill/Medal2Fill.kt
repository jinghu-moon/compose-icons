package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Medal2Fill: ImageVector
    get() {
        if (_medal2Fill != null) return _medal2Fill!!
        _medal2Fill = remixIcon(
            name = "Medal2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 8.5l2.116 5.087 5.492 .44-4.185 3.585 1.278 5.36L12 20.1 7.298 22.972 8.576 17.612 4.392 14.028l5.492-.44L12 8.5ZM8 2v9h-2v-9h2ZM18 2v9h-2v-9h2ZM13 2v5h-2v-5h2Z"),
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
        return _medal2Fill!!
    }

private var _medal2Fill: ImageVector? = null
