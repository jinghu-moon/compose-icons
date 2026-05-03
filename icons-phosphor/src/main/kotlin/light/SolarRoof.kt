package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorLightIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.370 125.320 L 205.370 45.320 C 204.354 43.285 202.275 41.999 200.000 42.000 L 56.000 42.000 C 53.725 41.999 51.646 43.285 50.630 45.320 L 10.630 125.320 C 10.218 126.153 10.002 127.070 10.000 128.000 L 10.000 184.000 C 10.000 191.732 16.268 198.000 24.000 198.000 L 232.000 198.000 C 239.732 198.000 246.000 191.732 246.000 184.000 L 246.000 128.000 C 245.998 127.070 245.782 126.153 245.370 125.320 ZM 99.710 122.000 L 85.710 94.000 L 120.290 94.000 L 134.290 122.000 ZM 100.290 54.000 L 114.290 82.000 L 79.710 82.000 L 65.710 54.000 ZM 148.290 54.000 L 162.290 82.000 L 127.710 82.000 L 113.710 54.000 ZM 147.710 122.000 L 133.710 94.000 L 168.290 94.000 L 182.290 122.000 ZM 195.710 122.000 L 181.710 94.000 L 216.290 94.000 L 230.290 122.000 ZM 210.290 82.000 L 175.710 82.000 L 161.710 54.000 L 196.290 54.000 ZM 22.000 184.000 L 22.000 129.420 L 56.000 61.420 L 90.000 129.420 L 90.000 186.000 L 24.000 186.000 C 22.895 186.000 22.000 185.105 22.000 184.000 ZM 232.000 186.000 L 102.000 186.000 L 102.000 134.000 L 234.000 134.000 L 234.000 184.000 C 234.000 185.105 233.105 186.000 232.000 186.000 Z"),
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
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
