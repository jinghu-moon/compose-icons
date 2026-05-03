package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorBoldIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 76.000 L 188.000 76.000 L 188.000 64.000 C 187.987 49.809 179.639 36.950 166.682 31.163 C 153.725 25.375 138.577 27.740 128.000 37.200 C 118.704 28.883 105.765 25.971 93.803 29.503 C 81.840 33.035 72.558 42.508 69.270 54.540 C 58.184 50.144 45.641 51.523 35.775 58.223 C 25.909 64.923 20.002 76.074 20.000 88.000 L 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 L 236.000 112.000 C 236.000 92.118 219.882 76.000 200.000 76.000 ZM 140.000 64.000 C 140.000 57.373 145.373 52.000 152.000 52.000 C 158.627 52.000 164.000 57.373 164.000 64.000 L 164.000 76.000 L 140.000 76.000 ZM 92.000 64.000 C 92.000 57.373 97.373 52.000 104.000 52.000 C 110.627 52.000 116.000 57.373 116.000 64.000 L 116.000 104.000 C 116.000 110.627 110.627 116.000 104.000 116.000 C 97.373 116.000 92.000 110.627 92.000 104.000 ZM 44.000 88.000 C 44.000 81.373 49.373 76.000 56.000 76.000 C 62.627 76.000 68.000 81.373 68.000 88.000 L 68.000 104.000 C 68.000 110.627 62.627 116.000 56.000 116.000 C 49.373 116.000 44.000 110.627 44.000 104.000 ZM 212.000 128.000 C 212.024 172.435 177.438 209.202 133.084 211.891 C 88.731 214.581 49.955 182.262 44.610 138.150 C 56.870 142.244 70.384 139.437 80.000 130.800 C 92.108 141.686 110.027 143.057 123.650 134.140 C 125.494 136.515 127.628 138.652 130.000 140.500 C 120.988 150.122 115.981 162.817 116.000 176.000 C 116.000 182.627 121.373 188.000 128.000 188.000 C 134.627 188.000 140.000 182.627 140.000 176.000 C 140.000 160.536 152.536 148.000 168.000 148.000 C 174.627 148.000 180.000 142.627 180.000 136.000 C 180.000 129.373 174.627 124.000 168.000 124.000 L 152.000 124.000 C 145.373 124.000 140.000 118.627 140.000 112.000 L 140.000 100.000 L 200.000 100.000 C 206.627 100.000 212.000 105.373 212.000 112.000 Z"),
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
        return _handFist!!
    }

private var _handFist: ImageVector? = null
