package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorThinIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 144.000 C 244.000 146.209 242.209 148.000 240.000 148.000 C 237.791 148.000 236.000 146.209 236.000 144.000 C 235.939 88.797 191.203 44.061 136.000 44.000 C 85.213 44.055 44.055 85.213 44.000 136.000 C 44.050 182.371 81.629 219.950 128.000 220.000 C 169.955 219.956 203.956 185.955 204.000 144.000 C 203.961 106.461 173.539 76.039 136.000 76.000 C 102.879 76.039 76.039 102.879 76.000 136.000 C 76.033 164.705 99.295 187.967 128.000 188.000 C 152.289 187.972 171.972 168.289 172.000 144.000 C 172.000 124.118 155.882 108.000 136.000 108.000 C 120.536 108.000 108.000 120.536 108.000 136.000 C 108.000 147.046 116.954 156.000 128.000 156.000 C 134.627 156.000 140.000 150.627 140.000 144.000 C 140.000 141.791 138.209 140.000 136.000 140.000 C 133.791 140.000 132.000 138.209 132.000 136.000 C 132.000 133.791 133.791 132.000 136.000 132.000 C 142.627 132.000 148.000 137.373 148.000 144.000 C 148.000 155.046 139.046 164.000 128.000 164.000 C 112.536 164.000 100.000 151.464 100.000 136.000 C 100.000 116.118 116.118 100.000 136.000 100.000 C 160.289 100.028 179.972 119.711 180.000 144.000 C 179.967 172.705 156.705 195.967 128.000 196.000 C 94.879 195.961 68.039 169.121 68.000 136.000 C 68.039 98.461 98.461 68.039 136.000 68.000 C 177.955 68.044 211.956 102.045 212.000 144.000 C 211.950 190.371 174.371 227.950 128.000 228.000 C 77.213 227.945 36.055 186.787 36.000 136.000 C 36.061 80.797 80.797 36.061 136.000 36.000 C 195.619 36.066 243.934 84.381 244.000 144.000 Z"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
