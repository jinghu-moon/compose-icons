package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Restaurant2Fill: ImageVector
    get() {
        if (_restaurant2Fill != null) return _restaurant2Fill!!
        _restaurant2Fill = remixIcon(
            name = "Restaurant2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.222 3.808l6.718 6.717L8.111 13.354 4.222 9.464C2.66 7.902 2.66 5.37 4.222 3.808ZM14.268 12.146l-.854 .853 7.071 7.071-1.414 1.414L12 14.414 4.929 21.485 3.515 20.071l9.339-9.339c-.588-1.457 .02-3.555 1.621-5.157C16.428 3.623 19.119 3.148 20.486 4.515c1.367 1.367 .892 4.058-1.061 6.01-1.602 1.602-3.7 2.209-5.157 1.621Z"),
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
        return _restaurant2Fill!!
    }

private var _restaurant2Fill: ImageVector? = null
