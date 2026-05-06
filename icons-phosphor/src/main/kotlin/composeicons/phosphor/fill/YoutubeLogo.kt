package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorFillIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.33 69.52C232.418 62.041 227.026 55.938 219.84 53.12 185.56 39.88 131 40 128 40c-3 0-57.56-.12-91.84 13.12C28.974 55.938 23.582 62.041 21.67 69.52 19.08 79.5 16 97.74 16 128c0 30.26 3.08 48.5 5.67 58.48 1.909 7.483 7.301 13.59 14.49 16.41C69 215.56 120.4 216 127.34 216h1.32c6.94 0 58.37-.44 91.18-13.11 7.189-2.82 12.581-8.927 14.49-16.41C236.92 176.48 240 158.26 240 128c0-30.26-3.08-48.5-5.67-58.48ZM160.59 134.52l-40 28c-2.439 1.708-5.625 1.921-8.269 .552C109.677 161.702 108.012 158.978 108 156v-56c.001-2.983 1.661-5.718 4.308-7.095 2.646-1.377 5.839-1.167 8.282 .545l40 28c2.135 1.497 3.407 3.942 3.407 6.55 0 2.608-1.271 5.053-3.407 6.55Z"),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
