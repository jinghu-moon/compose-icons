package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorLightIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 114.000 L 210.490 114.000 L 166.590 70.100 C 163.968 67.469 160.404 65.993 156.690 66.000 L 44.280 66.000 C 39.599 65.999 35.228 68.336 32.630 72.230 L 3.000 116.670 C 2.345 117.657 1.997 118.816 2.000 120.000 L 2.000 168.000 C 2.000 175.732 8.268 182.000 16.000 182.000 L 34.600 182.000 C 37.439 195.982 49.733 206.030 64.000 206.030 C 78.267 206.030 90.561 195.982 93.400 182.000 L 162.600 182.000 C 165.439 195.982 177.733 206.030 192.000 206.030 C 206.267 206.030 218.561 195.982 221.400 182.000 L 240.000 182.000 C 247.732 182.000 254.000 175.732 254.000 168.000 L 254.000 128.000 C 254.000 120.268 247.732 114.000 240.000 114.000 ZM 42.620 78.890 C 42.990 78.335 43.613 78.001 44.280 78.000 L 156.690 78.000 C 157.220 78.002 157.727 78.214 158.100 78.590 L 193.520 114.000 L 19.210 114.000 ZM 64.000 194.000 C 54.059 194.000 46.000 185.941 46.000 176.000 C 46.000 166.059 54.059 158.000 64.000 158.000 C 73.941 158.000 82.000 166.059 82.000 176.000 C 82.000 185.941 73.941 194.000 64.000 194.000 ZM 192.000 194.000 C 182.059 194.000 174.000 185.941 174.000 176.000 C 174.000 166.059 182.059 158.000 192.000 158.000 C 201.941 158.000 210.000 166.059 210.000 176.000 C 210.000 185.941 201.941 194.000 192.000 194.000 ZM 242.000 168.000 C 242.000 169.105 241.105 170.000 240.000 170.000 L 221.400 170.000 C 218.561 156.018 206.267 145.970 192.000 145.970 C 177.733 145.970 165.439 156.018 162.600 170.000 L 93.400 170.000 C 90.561 156.018 78.267 145.970 64.000 145.970 C 49.733 145.970 37.439 156.018 34.600 170.000 L 16.000 170.000 C 14.895 170.000 14.000 169.105 14.000 168.000 L 14.000 126.000 L 240.000 126.000 C 241.105 126.000 242.000 126.895 242.000 128.000 Z"),
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
