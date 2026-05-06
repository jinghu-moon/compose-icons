package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorFillIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M187.14 114.84 213.92 85.38c2.907-3.277 2.638-8.283-.604-11.229-3.242-2.946-8.251-2.737-11.236 .469L181.53 97.22 164.33 43.15C162.234 36.497 156.055 31.98 149.08 32h-42.17C99.935 31.98 93.756 36.497 91.66 43.15L40.75 203.15c-1.547 4.865-.681 10.175 2.333 14.296 3.014 4.12 7.812 6.555 12.917 6.554h144c5.105 .001 9.903-2.434 12.917-6.554 3.014-4.12 3.88-9.431 2.333-14.296ZM71.27 160 106.91 48h42.17l20 62.9L124.46 160ZM146.08 160l28.62-31.48 10 31.48Z"),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
