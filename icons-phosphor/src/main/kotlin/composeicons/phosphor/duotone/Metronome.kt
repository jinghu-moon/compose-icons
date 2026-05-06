package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorDuotoneIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 216h-144c-2.554 .003-4.957-1.215-6.465-3.277-1.508-2.062-1.941-4.72-1.165-7.153L60.37 168h135.29l12 37.57c.778 2.439 .341 5.102-1.174 7.166-1.515 2.063-3.926 3.277-6.486 3.264Z"),
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
                pathData = parseSvgPathData("M187.14 114.84 213.92 85.38c2.907-3.277 2.638-8.283-.604-11.229-3.242-2.946-8.251-2.737-11.236 .469L181.53 97.22 164.33 43.15C162.234 36.497 156.055 31.98 149.08 32h-42.17C99.935 31.98 93.756 36.497 91.66 43.15L40.75 203.15c-1.547 4.865-.681 10.175 2.333 14.296 3.014 4.12 7.812 6.555 12.917 6.554h144c5.105 .001 9.903-2.434 12.917-6.554 3.014-4.12 3.88-9.431 2.333-14.296ZM184.72 160h-38.64l28.62-31.48ZM106.91 48h42.17l20 62.9L124.46 160h-53.19ZM56 208 66.18 176h123.63L200 208Z"),
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
