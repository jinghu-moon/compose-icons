package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlipayLine: ImageVector
    get() {
        if (_alipayLine != null) return _alipayLine!!
        _alipayLine = remixIcon(
            name = "AlipayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.408 16.79c-2.173-.951-3.719-1.646-4.64-2.086-1.4 1.696-2.872 2.72-5.08 2.72C6.48 17.424 5 16.064 5.176 14.392c.12-1.096 .872-2.888 4.128-2.576 1.72 .16 2.504 .48 3.912 .944 .36-.664 .664-1.4 .888-2.176h-6.224v-.616h3.072v-1.104h-3.752v-.68h3.752v-1.592c0 0 .032-.248 .312-.248h1.536v1.848h4v.68h-4v1.104h3.264c-.296 1.224-.752 2.344-1.32 3.32 .51 .182 2.097 .676 4.76 1.483C19.825 13.913 20 12.977 20 12 20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 2.622 0 4.949-1.261 6.408-3.21ZM12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM8.432 16.368c1.44 0 2.824-.872 3.96-2.352C10.784 13.24 9.448 12.856 7.952 12.856c-1.304 0-1.984 .8-2.104 1.416-.12 .616 .248 2.096 2.584 2.096Z"),
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
        return _alipayLine!!
    }

private var _alipayLine: ImageVector? = null
