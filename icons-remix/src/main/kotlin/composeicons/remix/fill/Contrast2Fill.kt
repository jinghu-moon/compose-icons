package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Contrast2Fill: ImageVector
    get() {
        if (_contrast2Fill != null) return _contrast2Fill!!
        _contrast2Fill = remixIcon(
            name = "Contrast2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 21.997c-5.523 0-10-4.477-10-10C2 6.474 6.477 1.997 12 1.997c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM5.329 16.422c1.435 2.145 3.88 3.558 6.655 3.558 4.418 0 8-3.582 8-8 0-2.775-1.413-5.22-3.559-6.655 .845 3.028 .077 6.411-2.304 8.793-2.381 2.381-5.765 3.149-8.792 2.304Z"),
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
        return _contrast2Fill!!
    }

private var _contrast2Fill: ImageVector? = null
