package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorThinIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 156.290 L 132.000 88.000 C 132.000 85.791 130.209 84.000 128.000 84.000 C 125.791 84.000 124.000 85.791 124.000 88.000 L 124.000 156.290 C 109.465 158.388 99.020 171.360 100.072 186.008 C 101.124 200.656 113.314 212.003 128.000 212.003 C 142.686 212.003 154.876 200.656 155.928 186.008 C 156.980 171.360 146.535 158.388 132.000 156.290 ZM 128.000 204.000 C 116.954 204.000 108.000 195.046 108.000 184.000 C 108.000 172.954 116.954 164.000 128.000 164.000 C 139.046 164.000 148.000 172.954 148.000 184.000 C 148.000 195.046 139.046 204.000 128.000 204.000 ZM 164.000 136.000 L 164.000 48.000 C 164.000 28.118 147.882 12.000 128.000 12.000 C 108.118 12.000 92.000 28.118 92.000 48.000 L 92.000 136.000 C 71.339 151.495 62.912 178.473 71.079 202.974 C 79.246 227.474 102.174 244.000 128.000 244.000 C 153.826 244.000 176.754 227.474 184.921 202.974 C 193.088 178.473 184.661 151.495 164.000 136.000 ZM 128.000 236.000 C 105.277 236.002 85.184 221.249 78.381 199.569 C 71.578 177.888 79.640 154.301 98.290 141.320 C 99.373 140.564 100.013 139.321 100.000 138.000 L 100.000 48.000 C 100.000 32.536 112.536 20.000 128.000 20.000 C 143.464 20.000 156.000 32.536 156.000 48.000 L 156.000 138.000 C 156.000 139.307 156.638 140.532 157.710 141.280 C 176.397 154.249 184.486 177.859 177.679 199.563 C 170.871 221.267 150.747 236.027 128.000 236.000 Z"),
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
