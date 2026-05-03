package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorLightIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.860 131.510 L 184.860 203.510 C 183.732 205.069 181.924 205.991 180.000 205.991 C 178.076 205.991 176.268 205.069 175.140 203.510 L 76.000 66.250 L 28.860 131.510 C 27.668 133.395 25.529 134.463 23.307 134.284 C 21.084 134.104 19.144 132.707 18.270 130.656 C 17.395 128.605 17.730 126.238 19.140 124.510 L 71.140 52.510 C 72.268 50.951 74.076 50.029 76.000 50.029 C 77.924 50.029 79.732 50.951 80.860 52.510 L 180.000 189.750 L 227.140 124.490 C 229.146 122.031 232.720 121.560 235.295 123.414 C 237.870 125.269 238.556 128.808 236.860 131.490 Z"),
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
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
