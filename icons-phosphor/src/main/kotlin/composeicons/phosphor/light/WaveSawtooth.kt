package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorLightIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.14 133.11l-104 64c-1.851 1.137-4.172 1.184-6.068 .124C123.176 196.174 122.001 194.172 122 192v-117.26L27.15 133.11c-2.822 1.737-6.518 .857-8.255-1.965-1.737-2.822-.857-6.518 1.965-8.255l104-64c1.851-1.137 4.172-1.184 6.068-.124 1.896 1.06 3.071 3.062 3.072 5.234v117.26l94.85-58.37c2.822-1.737 6.518-.857 8.255 1.965 1.737 2.822 .857 6.518-1.965 8.255Z"),
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
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
