package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorFillIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.28 177.85c-4.341 5.554-11.805 7.614-18.38 5.07l-24.76-19c-.193-.141-.371-.302-.53-.48L109.18 71.62c-1.021-1.116-1.325-2.713-.786-4.127 .54-1.413 1.83-2.402 3.336-2.553 43-4.62 87.74 9.12 119.86 41.24h0c19.99 19.99 21.92 49.46 4.69 71.67ZM53.93 34.62C52.018 32.465 49.095 31.504 46.277 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L69.71 75.77C52.786 82.883 37.402 93.21 24.41 106.18c-20 20-21.92 49.46-4.69 71.67 4.341 5.554 11.805 7.614 18.38 5.07l49-17.37 .29-.11c5.022-2.008 8.69-6.417 9.75-11.72l5.9-29.51c2.806-.969 5.668-1.767 8.57-2.39l90.5 99.56c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858Z"),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
