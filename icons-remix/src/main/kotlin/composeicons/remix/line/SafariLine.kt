package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SafariLine: ImageVector
    get() {
        if (_safariLine != null) return _safariLine!!
        _safariLine = remixIcon(
            name = "SafariLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.813 6.503l-4.398 6.911L6.504 17.812c1.205 1.14 2.765 1.91 4.497 2.126v-1.938h2v1.938c1.461-.182 2.799-.758 3.906-1.618L15.536 16.95l1.414-1.414 1.37 1.37c.86-1.106 1.436-2.445 1.618-3.906h-1.938v-2h1.938C19.723 9.268 18.954 7.708 17.813 6.503ZM17.498 6.188C16.293 5.047 14.733 4.278 13.001 4.062v1.938h-2v-1.938C9.54 4.244 8.202 4.82 7.095 5.68L8.465 7.05 7.051 8.464 5.681 7.094C4.821 8.201 4.245 9.539 4.063 11h1.938v2h-1.938c.216 1.732 .985 3.292 2.126 4.497l4.398-6.911L17.498 6.188ZM12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _safariLine!!
    }

private var _safariLine: ImageVector? = null
