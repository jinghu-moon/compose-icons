package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorLightIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 34.000 C 183.417 33.998 182.838 34.083 182.280 34.250 L 22.280 82.250 L 22.280 82.250 C 19.739 83.010 17.999 85.348 18.000 88.000 L 18.000 112.000 C 18.000 115.314 20.686 118.000 24.000 118.000 L 32.000 118.000 C 41.787 118.046 49.762 125.866 50.000 135.650 C 50.071 140.405 48.213 144.987 44.850 148.350 C 41.317 151.942 36.498 153.975 31.460 154.000 L 24.000 154.000 C 20.686 154.000 18.000 156.686 18.000 160.000 L 18.000 192.000 C 18.000 195.314 20.686 198.000 24.000 198.000 L 224.000 198.000 C 231.732 198.000 238.000 191.732 238.000 184.000 L 238.000 88.000 C 237.967 58.190 213.810 34.033 184.000 34.000 ZM 184.850 46.000 C 205.394 46.445 222.610 61.666 225.570 82.000 L 64.880 82.000 ZM 194.000 104.000 C 194.000 114.523 187.657 124.008 177.933 128.028 C 168.209 132.048 157.020 129.810 149.590 122.359 C 142.159 114.908 139.953 103.713 144.000 94.000 L 192.000 94.000 C 193.324 97.168 194.003 100.567 194.000 104.000 ZM 138.000 186.000 L 86.000 186.000 L 86.000 184.000 C 86.000 169.641 97.641 158.000 112.000 158.000 C 126.359 158.000 138.000 169.641 138.000 184.000 ZM 226.000 184.000 C 226.000 185.105 225.105 186.000 224.000 186.000 L 150.000 186.000 L 150.000 184.000 C 150.000 163.013 132.987 146.000 112.000 146.000 C 91.013 146.000 74.000 163.013 74.000 184.000 L 74.000 186.000 L 30.000 186.000 L 30.000 166.000 L 31.460 166.000 C 39.734 165.976 47.655 162.646 53.460 156.750 C 59.077 151.089 62.159 143.393 62.000 135.420 C 61.610 119.110 48.314 106.071 32.000 106.000 L 30.000 106.000 L 30.000 94.000 L 131.340 94.000 C 127.124 109.453 133.050 125.890 146.157 135.097 C 159.264 144.304 176.736 144.304 189.843 135.097 C 202.950 125.890 208.876 109.453 204.660 94.000 L 226.000 94.000 Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
