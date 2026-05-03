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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.140 133.110 L 131.140 197.110 C 129.289 198.247 126.968 198.294 125.072 197.234 C 123.176 196.174 122.001 194.172 122.000 192.000 L 122.000 74.740 L 27.150 133.110 C 24.328 134.847 20.632 133.967 18.895 131.145 C 17.158 128.323 18.038 124.627 20.860 122.890 L 124.860 58.890 C 126.711 57.753 129.032 57.706 130.928 58.766 C 132.824 59.826 133.999 61.828 134.000 64.000 L 134.000 181.260 L 228.850 122.890 C 231.672 121.153 235.368 122.033 237.105 124.855 C 238.842 127.677 237.962 131.373 235.140 133.110 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
