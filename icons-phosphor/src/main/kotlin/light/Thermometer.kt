package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorLightIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 58.000 C 197.641 58.000 186.000 69.641 186.000 84.000 C 186.000 98.359 197.641 110.000 212.000 110.000 C 226.359 110.000 238.000 98.359 238.000 84.000 C 238.000 69.641 226.359 58.000 212.000 58.000 ZM 212.000 98.000 C 204.268 98.000 198.000 91.732 198.000 84.000 C 198.000 76.268 204.268 70.000 212.000 70.000 C 219.732 70.000 226.000 76.268 226.000 84.000 C 226.000 91.732 219.732 98.000 212.000 98.000 ZM 126.000 154.600 L 126.000 88.000 C 126.000 84.686 123.314 82.000 120.000 82.000 C 116.686 82.000 114.000 84.686 114.000 88.000 L 114.000 154.600 C 98.910 157.680 88.604 171.686 90.152 187.009 C 91.700 202.332 104.599 213.994 120.000 213.994 C 135.401 213.994 148.300 202.332 149.848 187.009 C 151.396 171.686 141.090 157.680 126.000 154.600 ZM 120.000 202.000 C 110.059 202.000 102.000 193.941 102.000 184.000 C 102.000 174.059 110.059 166.000 120.000 166.000 C 129.941 166.000 138.000 174.059 138.000 184.000 C 138.000 193.941 129.941 202.000 120.000 202.000 ZM 158.000 135.000 L 158.000 48.000 C 158.000 27.013 140.987 10.000 120.000 10.000 C 99.013 10.000 82.000 27.013 82.000 48.000 L 82.000 135.000 C 61.060 151.243 52.758 179.000 61.343 204.073 C 69.927 229.145 93.498 245.990 120.000 245.990 C 146.502 245.990 170.073 229.145 178.657 204.073 C 187.242 179.000 178.940 151.243 158.000 135.000 ZM 120.000 234.000 C 98.173 233.979 78.882 219.802 72.344 198.977 C 65.806 178.152 73.532 155.493 91.430 143.000 C 93.063 141.863 94.025 139.990 94.000 138.000 L 94.000 48.000 C 94.000 33.641 105.641 22.000 120.000 22.000 C 134.359 22.000 146.000 33.641 146.000 48.000 L 146.000 138.000 C 146.001 139.962 146.961 141.799 148.570 142.920 C 166.542 155.390 174.322 178.094 167.775 198.965 C 161.228 219.836 141.874 234.029 120.000 234.000 Z"),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
