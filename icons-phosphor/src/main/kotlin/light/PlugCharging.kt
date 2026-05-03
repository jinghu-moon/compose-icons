package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorLightIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 58.000 L 174.000 58.000 L 174.000 16.000 C 174.000 12.686 171.314 10.000 168.000 10.000 C 164.686 10.000 162.000 12.686 162.000 16.000 L 162.000 58.000 L 94.000 58.000 L 94.000 16.000 C 94.000 12.686 91.314 10.000 88.000 10.000 C 84.686 10.000 82.000 12.686 82.000 16.000 L 82.000 58.000 L 32.550 58.000 C 30.873 57.876 29.219 58.449 27.979 59.585 C 26.739 60.721 26.023 62.319 26.000 64.000 C 26.000 67.314 28.686 70.000 32.000 70.000 L 50.000 70.000 L 50.000 160.000 C 50.000 180.987 67.013 198.000 88.000 198.000 L 122.000 198.000 L 122.000 240.000 C 122.000 243.314 124.686 246.000 128.000 246.000 C 131.314 246.000 134.000 243.314 134.000 240.000 L 134.000 198.000 L 168.000 198.000 C 188.987 198.000 206.000 180.987 206.000 160.000 L 206.000 70.000 L 224.000 70.000 C 227.314 70.000 230.000 67.314 230.000 64.000 C 230.000 60.686 227.314 58.000 224.000 58.000 ZM 194.000 160.000 C 194.000 174.359 182.359 186.000 168.000 186.000 L 88.000 186.000 C 73.641 186.000 62.000 174.359 62.000 160.000 L 62.000 70.000 L 194.000 70.000 ZM 107.070 131.420 C 105.946 129.802 105.688 127.735 106.380 125.890 L 118.380 93.890 C 119.545 90.786 123.006 89.215 126.110 90.380 C 129.214 91.545 130.785 95.006 129.620 98.110 L 120.620 122.000 L 144.000 122.000 C 145.969 121.999 147.813 122.964 148.935 124.583 C 150.056 126.201 150.312 128.267 149.620 130.110 L 137.620 162.110 C 136.455 165.214 132.994 166.785 129.890 165.620 C 126.786 164.455 125.215 160.994 126.380 157.890 L 135.380 134.000 L 112.000 134.000 C 110.033 134.000 108.191 133.036 107.070 131.420 Z"),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
