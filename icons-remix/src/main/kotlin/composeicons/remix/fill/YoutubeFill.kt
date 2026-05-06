package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.YoutubeFill: ImageVector
    get() {
        if (_youtubeFill != null) return _youtubeFill!!
        _youtubeFill = remixIcon(
            name = "YoutubeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.244 4c.534 .003 1.87 .016 3.29 .073l.503 .022c1.429 .068 2.858 .183 3.566 .381 .945 .265 1.688 1.04 1.939 2.022 .4 1.559 .45 4.602 .456 5.338l.001 .153v.011c0 0 0 .004 0 .011l-.001 .153c-.006 .736-.056 3.779-.456 5.338-.254 .985-.997 1.76-1.939 2.022-.708 .198-2.137 .313-3.566 .381l-.503 .022c-1.42 .057-2.756 .07-3.29 .073l-.234 .001h-.01c0 0-.003 0-.01 0l-.234-.001c-1.13-.006-5.857-.057-7.36-.476C3.45 19.257 2.707 18.483 2.456 17.501 2.056 15.942 2.006 12.899 2 12.163v-.327c.006-.736 .056-3.779 .456-5.338C2.71 5.512 3.453 4.737 4.395 4.476 5.898 4.057 10.624 4.006 11.755 4h.489ZM9.999 8.499v7l6-3.5L9.999 8.499Z"),
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
        return _youtubeFill!!
    }

private var _youtubeFill: ImageVector? = null
