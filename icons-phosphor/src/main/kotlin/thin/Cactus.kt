package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorThinIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 212.000 L 164.000 212.000 L 164.000 180.000 L 172.000 180.000 C 207.330 179.961 235.961 151.330 236.000 116.000 C 236.000 102.745 225.255 92.000 212.000 92.000 C 198.745 92.000 188.000 102.745 188.000 116.000 C 188.000 124.837 180.837 132.000 172.000 132.000 L 164.000 132.000 L 164.000 56.000 C 164.000 36.118 147.882 20.000 128.000 20.000 C 108.118 20.000 92.000 36.118 92.000 56.000 L 92.000 92.000 L 84.000 92.000 C 75.163 92.000 68.000 84.837 68.000 76.000 C 68.000 62.745 57.255 52.000 44.000 52.000 C 30.745 52.000 20.000 62.745 20.000 76.000 C 20.039 111.330 48.670 139.961 84.000 140.000 L 92.000 140.000 L 92.000 212.000 L 40.000 212.000 C 37.791 212.000 36.000 213.791 36.000 216.000 C 36.000 218.209 37.791 220.000 40.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 C 220.000 213.791 218.209 212.000 216.000 212.000 ZM 96.000 132.000 L 84.000 132.000 C 53.086 131.967 28.033 106.914 28.000 76.000 C 28.000 67.163 35.163 60.000 44.000 60.000 C 52.837 60.000 60.000 67.163 60.000 76.000 C 60.000 89.255 70.745 100.000 84.000 100.000 L 96.000 100.000 C 98.209 100.000 100.000 98.209 100.000 96.000 L 100.000 56.000 C 100.000 40.536 112.536 28.000 128.000 28.000 C 143.464 28.000 156.000 40.536 156.000 56.000 L 156.000 136.000 C 156.000 138.209 157.791 140.000 160.000 140.000 L 172.000 140.000 C 185.255 140.000 196.000 129.255 196.000 116.000 C 196.000 107.163 203.163 100.000 212.000 100.000 C 220.837 100.000 228.000 107.163 228.000 116.000 C 227.967 146.914 202.914 171.967 172.000 172.000 L 160.000 172.000 C 157.791 172.000 156.000 173.791 156.000 176.000 L 156.000 212.000 L 100.000 212.000 L 100.000 136.000 C 100.000 133.791 98.209 132.000 96.000 132.000 Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
