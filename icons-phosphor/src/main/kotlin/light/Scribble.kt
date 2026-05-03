package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorLightIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.250 188.240 C 201.131 191.359 199.378 195.589 199.378 200.000 C 199.378 204.411 201.131 208.641 204.250 211.760 C 205.855 213.256 206.516 215.508 205.973 217.634 C 205.430 219.760 203.770 221.420 201.644 221.963 C 199.518 222.506 197.266 221.845 195.770 220.240 C 190.399 214.874 187.381 207.593 187.381 200.000 C 187.381 192.407 190.399 185.126 195.770 179.760 L 205.140 170.380 C 211.446 163.854 211.356 153.478 204.938 147.062 C 198.519 140.647 188.143 140.561 181.620 146.870 L 114.870 213.620 C 103.689 224.801 85.561 224.801 74.380 213.620 C 63.199 202.439 63.199 184.311 74.380 173.130 L 173.140 74.380 C 179.446 67.854 179.356 57.478 172.938 51.062 C 166.519 44.647 156.143 44.561 149.620 50.870 L 82.860 117.620 C 71.679 128.801 53.551 128.801 42.370 117.620 C 31.189 106.439 31.189 88.311 42.370 77.130 L 83.750 35.760 C 85.261 34.223 87.480 33.614 89.563 34.165 C 91.647 34.716 93.275 36.342 93.828 38.425 C 94.382 40.508 93.775 42.728 92.240 44.240 L 50.860 85.620 C 44.554 92.146 44.644 102.522 51.062 108.938 C 57.481 115.353 67.857 115.439 74.380 109.130 L 141.130 42.380 C 152.311 31.199 170.439 31.199 181.620 42.380 C 192.801 53.561 192.801 71.689 181.620 82.870 L 82.860 181.620 C 76.554 188.146 76.644 198.522 83.062 204.938 C 89.481 211.353 99.857 211.439 106.380 205.130 L 173.140 138.380 C 184.321 127.199 202.449 127.199 213.630 138.380 C 224.811 149.561 224.811 167.689 213.630 178.870 Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
