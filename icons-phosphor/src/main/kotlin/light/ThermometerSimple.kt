package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorLightIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.000 154.600 L 134.000 88.000 C 134.000 84.686 131.314 82.000 128.000 82.000 C 124.686 82.000 122.000 84.686 122.000 88.000 L 122.000 154.600 C 106.910 157.680 96.604 171.686 98.152 187.009 C 99.700 202.332 112.599 213.994 128.000 213.994 C 143.401 213.994 156.300 202.332 157.848 187.009 C 159.396 171.686 149.090 157.680 134.000 154.600 ZM 128.000 202.000 C 118.059 202.000 110.000 193.941 110.000 184.000 C 110.000 174.059 118.059 166.000 128.000 166.000 C 137.941 166.000 146.000 174.059 146.000 184.000 C 146.000 193.941 137.941 202.000 128.000 202.000 ZM 166.000 135.000 L 166.000 48.000 C 166.000 27.013 148.987 10.000 128.000 10.000 C 107.013 10.000 90.000 27.013 90.000 48.000 L 90.000 135.000 C 69.060 151.243 60.758 179.000 69.343 204.073 C 77.927 229.145 101.498 245.990 128.000 245.990 C 154.502 245.990 178.073 229.145 186.657 204.073 C 195.242 179.000 186.940 151.243 166.000 135.000 ZM 128.000 234.000 C 106.173 233.979 86.882 219.802 80.344 198.977 C 73.806 178.152 81.532 155.493 99.430 143.000 C 101.063 141.863 102.025 139.990 102.000 138.000 L 102.000 48.000 C 102.000 33.641 113.641 22.000 128.000 22.000 C 142.359 22.000 154.000 33.641 154.000 48.000 L 154.000 138.000 C 154.001 139.962 154.961 141.799 156.570 142.920 C 174.542 155.390 182.322 178.094 175.775 198.965 C 169.228 219.836 149.874 234.029 128.000 234.000 Z"),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
