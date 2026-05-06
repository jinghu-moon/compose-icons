package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkypeFill: ImageVector
    get() {
        if (_skypeFill != null) return _skypeFill!!
        _skypeFill = remixIcon(
            name = "SkypeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.311 20.4c-.427 .066-.865 .1-1.31 .1C7.307 20.5 3.501 16.694 3.501 12c0-.446 .034-.883 .1-1.31C3.218 9.961 3.001 9.131 3.001 8.25 3.001 5.351 5.351 3 8.251 3c.881 0 1.711 .217 2.44 .6 .427-.066 .864-.1 1.31-.1 4.694 0 8.5 3.806 8.5 8.5 0 .446-.034 .883-.1 1.31 .383 .729 .6 1.559 .6 2.44 0 2.899-2.351 5.25-5.25 5.25-.881 0-1.711-.217-2.44-.6ZM12.053 17.156l-.041 .001c2.873 0 4.303-1.386 4.303-3.243 0-1.198-.551-2.471-2.725-2.958l-1.983-.44C10.852 10.343 9.985 10.115 9.985 9.4c0-.715 .619-1.213 1.724-1.213 2.231 0 2.027 1.528 3.131 1.528 .575 0 1.093-.342 1.093-.93 0-1.37-2.197-2.399-4.056-2.399-2.022 0-4.173 .858-4.173 3.143 0 1.099 .393 2.27 2.559 2.813l2.689 .671c.816 .202 1.018 .658 1.018 1.072 0 .687-.684 1.358-1.918 1.358-2.417 0-2.079-1.858-3.374-1.858-.581 0-1.002 .398-1.002 .972 0 1.114 1.351 2.598 4.377 2.598Z"),
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
        return _skypeFill!!
    }

private var _skypeFill: ImageVector? = null
