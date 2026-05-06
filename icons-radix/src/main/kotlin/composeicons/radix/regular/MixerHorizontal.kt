package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MixerHorizontal: ImageVector
    get() {
        if (_mixerHorizontal != null) return _mixerHorizontal!!
        _mixerHorizontal = radixIcon(
            name = "MixerHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.5 8c1.211 0 2.22 .861 2.45 2.004C11.967 10.002 11.983 10 12 10h1.5c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-1.5c-.017 0-.033-.003-.05-.005C11.72 12.139 10.711 13 9.5 13 8.289 13 7.279 12.139 7.049 10.995 7.033 10.997 7.017 11 7 11h-5.5C1.224 11 1 10.776 1 10.5 1 10.224 1.224 10 1.5 10h5.5c.017 0 .033 .002 .049 .004C7.279 8.861 8.289 8 9.5 8ZM9.5 9C8.672 9 8 9.672 8 10.5 8 11.328 8.672 12 9.5 12 10.328 12 11 11.328 11 10.5 11 9.672 10.328 9 9.5 9ZM5.5 2c1.211 0 2.22 .861 2.45 2.004C7.967 4.002 7.983 4 8 4h5.5l.101 .01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49L13.5 5h-5.5C7.983 5 7.967 4.997 7.95 4.995 7.72 6.139 6.711 7 5.5 7 4.289 7 3.279 6.139 3.049 4.995 3.033 4.997 3.017 5 3 5h-1.5C1.224 5 1 4.776 1 4.5 1 4.224 1.224 4 1.5 4h1.5c.017 0 .033 .002 .049 .004C3.279 2.861 4.289 2 5.5 2ZM5.5 3C4.672 3 4 3.672 4 4.5 4 5.328 4.672 6 5.5 6 6.328 6 7 5.328 7 4.5 7 3.672 6.328 3 5.5 3Z"),
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
        return _mixerHorizontal!!
    }

private var _mixerHorizontal: ImageVector? = null
