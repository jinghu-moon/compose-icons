package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorDuotoneIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.06 108.79l-48.7 42 14.88 62.79c.804 3.3-.457 6.759-3.198 8.766-2.74 2.007-6.419 2.166-9.322 .404L128 189.09 73.28 222.74c-2.903 1.763-6.582 1.603-9.322-.404-2.74-2.007-4.002-5.466-3.198-8.766L75.64 150.78l-48.7-42c-2.538-2.228-3.507-5.753-2.466-8.965C25.515 96.602 28.368 94.316 31.73 94L95.64 88.8 120.26 29.2c1.284-3.145 4.343-5.201 7.74-5.201 3.397 0 6.456 2.056 7.74 5.201l24.62 59.6L224.27 94c3.367 .312 6.225 2.6 7.267 5.817 1.042 3.217 .068 6.746-2.477 8.973Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M239.18 97.26C237.135 90.973 231.51 86.531 224.92 86l-59-4.76L143.14 26.15C140.62 20.01 134.641 16.001 128.005 16.001c-6.636 0-12.615 4.009-15.135 10.149L90.11 81.23 31.08 86c-6.6 .558-12.223 5.018-14.268 11.319-2.045 6.3-.115 13.213 4.898 17.541l45 38.83L53 211.75c-1.568 6.451 .913 13.211 6.282 17.116 5.369 3.905 12.564 4.183 18.218 .704L128 198.49l50.53 31.08c5.655 3.437 12.822 3.138 18.172-.757 5.35-3.896 7.834-10.625 6.298-17.063L189.24 153.68l45-38.83c5.055-4.323 7.006-11.267 4.94-17.59ZM223.84 102.73l-48.7 42c-2.264 1.951-3.251 5.002-2.56 7.91l14.88 62.8c.08 .18 .005 .391-.17 .48-.18 .14-.23 .11-.38 0L132.19 182.27c-2.57-1.58-5.81-1.58-8.38 0L69.09 215.94c-.15 .09-.19 .12-.38 0-.175-.089-.25-.3-.17-.48L83.42 152.66c.691-2.908-.296-5.959-2.56-7.91l-48.7-42c-.12-.1-.23-.19-.13-.5 .1-.31 .18-.27 .33-.29L96.28 96.8c2.989-.256 5.583-2.164 6.72-4.94L127.62 32.25c.08-.17 .11-.25 .35-.25 .24 0 .27 .08 .35 .25L153 91.86c1.147 2.778 3.754 4.678 6.75 4.92l63.92 5.16c.15 0 .24 0 .33 .29 .09 .29 0 .4-.16 .5Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
