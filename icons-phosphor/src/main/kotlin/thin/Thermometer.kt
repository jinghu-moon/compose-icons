package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorThinIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 60.000 C 198.745 60.000 188.000 70.745 188.000 84.000 C 188.000 97.255 198.745 108.000 212.000 108.000 C 225.255 108.000 236.000 97.255 236.000 84.000 C 236.000 70.745 225.255 60.000 212.000 60.000 ZM 212.000 100.000 C 203.163 100.000 196.000 92.837 196.000 84.000 C 196.000 75.163 203.163 68.000 212.000 68.000 C 220.837 68.000 228.000 75.163 228.000 84.000 C 228.000 92.837 220.837 100.000 212.000 100.000 ZM 124.000 156.290 L 124.000 88.000 C 124.000 85.791 122.209 84.000 120.000 84.000 C 117.791 84.000 116.000 85.791 116.000 88.000 L 116.000 156.290 C 101.465 158.388 91.020 171.360 92.072 186.008 C 93.124 200.656 105.314 212.003 120.000 212.003 C 134.686 212.003 146.876 200.656 147.928 186.008 C 148.980 171.360 138.535 158.388 124.000 156.290 ZM 120.000 204.000 C 108.954 204.000 100.000 195.046 100.000 184.000 C 100.000 172.954 108.954 164.000 120.000 164.000 C 131.046 164.000 140.000 172.954 140.000 184.000 C 140.000 195.046 131.046 204.000 120.000 204.000 ZM 156.000 136.000 L 156.000 48.000 C 156.000 28.118 139.882 12.000 120.000 12.000 C 100.118 12.000 84.000 28.118 84.000 48.000 L 84.000 136.000 C 63.339 151.495 54.912 178.473 63.079 202.974 C 71.246 227.474 94.174 244.000 120.000 244.000 C 145.826 244.000 168.754 227.474 176.921 202.974 C 185.088 178.473 176.661 151.495 156.000 136.000 ZM 120.000 236.000 C 97.277 236.002 77.184 221.249 70.381 199.569 C 63.578 177.888 71.640 154.301 90.290 141.320 C 91.373 140.564 92.013 139.321 92.000 138.000 L 92.000 48.000 C 92.000 32.536 104.536 20.000 120.000 20.000 C 135.464 20.000 148.000 32.536 148.000 48.000 L 148.000 138.000 C 148.000 139.307 148.638 140.532 149.710 141.280 C 168.397 154.249 176.486 177.859 169.679 199.563 C 162.871 221.267 142.747 236.027 120.000 236.000 Z"),
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
