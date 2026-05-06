package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Restaurant2Line: ImageVector
    get() {
        if (_restaurant2Line != null) return _restaurant2Line!!
        _restaurant2Line = remixIcon(
            name = "Restaurant2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.268 12.147l-.854 .854 7.071 7.071-1.414 1.414L12 14.414 4.929 21.485 3.515 20.071l9.339-9.339c-.588-1.457 .02-3.555 1.621-5.157C16.428 3.623 19.119 3.148 20.486 4.515c1.367 1.367 .892 4.058-1.061 6.01-1.602 1.602-3.7 2.209-5.157 1.621ZM4.222 3.808l6.718 6.718L8.111 13.354 4.222 9.465C2.66 7.903 2.66 5.37 4.222 3.808ZM18.011 9.111C19.268 7.854 19.527 6.385 19.072 5.929c-.456-.456-1.925-.197-3.182 1.061-1.257 1.257-1.516 2.726-1.061 3.182 .456 .456 1.925 .197 3.182-1.061Z"),
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
        return _restaurant2Line!!
    }

private var _restaurant2Line: ImageVector? = null
