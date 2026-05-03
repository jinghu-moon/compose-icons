package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorThinIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 96.000 L 220.000 208.000 C 220.000 210.209 218.209 212.000 216.000 212.000 C 213.791 212.000 212.000 210.209 212.000 208.000 L 212.000 96.000 C 211.961 62.879 185.121 36.039 152.000 36.000 L 104.000 36.000 C 70.879 36.039 44.039 62.879 44.000 96.000 L 44.000 208.000 C 44.000 210.209 42.209 212.000 40.000 212.000 C 37.791 212.000 36.000 210.209 36.000 208.000 L 36.000 96.000 C 36.039 58.461 66.461 28.039 104.000 28.000 L 152.000 28.000 C 189.539 28.039 219.961 58.461 220.000 96.000 ZM 180.000 96.000 L 180.000 168.000 C 180.000 179.046 171.046 188.000 160.000 188.000 L 158.470 188.000 L 163.580 198.210 C 164.055 199.159 164.134 200.259 163.798 201.266 C 163.462 202.273 162.740 203.106 161.790 203.580 C 161.233 203.853 160.621 203.997 160.000 204.000 C 158.484 204.001 157.098 203.145 156.420 201.790 L 149.530 188.000 L 106.470 188.000 L 99.580 201.790 C 98.902 203.145 97.516 204.001 96.000 204.000 C 95.379 203.997 94.767 203.853 94.210 203.580 C 93.260 203.106 92.538 202.273 92.202 201.266 C 91.866 200.259 91.945 199.159 92.420 198.210 L 97.530 188.000 L 96.000 188.000 C 84.954 188.000 76.000 179.046 76.000 168.000 L 76.000 96.000 C 76.000 84.954 84.954 76.000 96.000 76.000 L 160.000 76.000 C 171.046 76.000 180.000 84.954 180.000 96.000 ZM 84.000 96.000 L 84.000 148.000 L 172.000 148.000 L 172.000 96.000 C 172.000 89.373 166.627 84.000 160.000 84.000 L 96.000 84.000 C 89.373 84.000 84.000 89.373 84.000 96.000 ZM 116.000 156.000 L 116.000 180.000 L 140.000 180.000 L 140.000 156.000 ZM 96.000 180.000 L 108.000 180.000 L 108.000 156.000 L 84.000 156.000 L 84.000 168.000 C 84.000 174.627 89.373 180.000 96.000 180.000 ZM 172.000 168.000 L 172.000 156.000 L 148.000 156.000 L 148.000 180.000 L 160.000 180.000 C 166.627 180.000 172.000 174.627 172.000 168.000 Z"),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
