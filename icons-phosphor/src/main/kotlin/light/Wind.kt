package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorLightIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 182.000 184.000 C 182.000 200.569 168.569 214.000 152.000 214.000 C 139.100 214.000 126.640 205.620 122.370 194.080 C 121.221 190.971 122.811 187.519 125.920 186.370 C 129.029 185.221 132.481 186.811 133.630 189.920 C 136.130 196.690 144.200 202.000 152.000 202.000 C 161.941 202.000 170.000 193.941 170.000 184.000 C 170.000 174.059 161.941 166.000 152.000 166.000 L 40.000 166.000 C 36.686 166.000 34.000 163.314 34.000 160.000 C 34.000 156.686 36.686 154.000 40.000 154.000 L 152.000 154.000 C 168.569 154.000 182.000 167.431 182.000 184.000 ZM 150.000 72.000 C 150.000 55.431 136.569 42.000 120.000 42.000 C 107.100 42.000 94.640 50.380 90.370 61.920 C 89.221 65.029 90.811 68.481 93.920 69.630 C 97.029 70.779 100.481 69.189 101.630 66.080 C 104.130 59.310 112.200 54.000 120.000 54.000 C 129.941 54.000 138.000 62.059 138.000 72.000 C 138.000 81.941 129.941 90.000 120.000 90.000 L 24.000 90.000 C 20.686 90.000 18.000 92.686 18.000 96.000 C 18.000 99.314 20.686 102.000 24.000 102.000 L 120.000 102.000 C 136.569 102.000 150.000 88.569 150.000 72.000 ZM 208.000 74.000 C 195.100 74.000 182.640 82.380 178.370 93.920 C 177.221 97.029 178.811 100.481 181.920 101.630 C 185.029 102.779 188.481 101.189 189.630 98.080 C 192.130 91.310 200.200 86.000 208.000 86.000 C 217.941 86.000 226.000 94.059 226.000 104.000 C 226.000 113.941 217.941 122.000 208.000 122.000 L 32.000 122.000 C 28.686 122.000 26.000 124.686 26.000 128.000 C 26.000 131.314 28.686 134.000 32.000 134.000 L 208.000 134.000 C 224.569 134.000 238.000 120.569 238.000 104.000 C 238.000 87.431 224.569 74.000 208.000 74.000 Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
