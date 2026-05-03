package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorLightIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 78.000 C 192.569 78.000 206.000 64.569 206.000 48.000 C 206.000 31.431 192.569 18.000 176.000 18.000 C 159.431 18.000 146.000 31.431 146.000 48.000 C 146.000 64.569 159.431 78.000 176.000 78.000 ZM 176.000 30.000 C 185.941 30.000 194.000 38.059 194.000 48.000 C 194.000 57.941 185.941 66.000 176.000 66.000 C 166.059 66.000 158.000 57.941 158.000 48.000 C 158.000 38.059 166.059 30.000 176.000 30.000 ZM 166.000 168.000 C 166.000 202.242 138.242 230.000 104.000 230.000 C 69.758 230.000 42.000 202.242 42.000 168.000 C 42.000 133.758 69.758 106.000 104.000 106.000 C 107.314 106.000 110.000 108.686 110.000 112.000 C 110.000 115.314 107.314 118.000 104.000 118.000 C 76.386 118.000 54.000 140.386 54.000 168.000 C 54.000 195.614 76.386 218.000 104.000 218.000 C 131.614 218.000 154.000 195.614 154.000 168.000 C 154.000 164.686 156.686 162.000 160.000 162.000 C 163.314 162.000 166.000 164.686 166.000 168.000 ZM 204.640 132.200 C 205.784 133.595 206.240 135.432 205.880 137.200 L 189.880 217.200 C 189.310 219.994 186.852 222.001 184.000 222.000 C 183.600 221.999 183.202 221.959 182.810 221.880 C 179.563 221.227 177.460 218.067 178.110 214.820 L 192.680 142.000 L 128.000 142.000 C 125.856 142.001 123.874 140.858 122.801 139.002 C 121.728 137.145 121.728 134.857 122.800 133.000 L 143.870 96.320 C 114.376 79.929 77.855 83.266 51.820 104.730 C 50.174 106.151 47.888 106.570 45.844 105.825 C 43.801 105.080 42.321 103.288 41.976 101.141 C 41.630 98.994 42.474 96.828 44.180 95.480 C 75.863 69.337 120.852 66.794 155.280 89.200 C 157.935 90.939 158.777 94.445 157.200 97.200 L 138.370 130.000 L 200.000 130.000 C 201.798 130.001 203.501 130.808 204.640 132.200 Z"),
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
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
