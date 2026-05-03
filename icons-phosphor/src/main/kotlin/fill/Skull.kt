package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorFillIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 16.000 C 70.650 16.000 24.000 60.860 24.000 116.000 C 24.000 150.100 42.270 182.000 72.000 200.280 L 72.000 216.000 C 72.000 224.837 79.163 232.000 88.000 232.000 L 96.000 232.000 C 98.209 232.000 100.000 230.209 100.000 228.000 L 100.000 200.270 C 99.942 195.987 103.202 192.387 107.470 192.020 C 109.682 191.873 111.856 192.651 113.473 194.167 C 115.090 195.684 116.005 197.803 116.000 200.020 L 116.000 228.020 C 116.000 230.229 117.791 232.020 120.000 232.020 L 136.000 232.020 C 138.209 232.020 140.000 230.229 140.000 228.020 L 140.000 200.270 C 139.942 195.987 143.202 192.387 147.470 192.020 C 149.682 191.873 151.856 192.651 153.473 194.167 C 155.090 195.684 156.005 197.803 156.000 200.020 L 156.000 228.020 C 156.000 230.229 157.791 232.020 160.000 232.020 L 168.000 232.020 C 176.837 232.020 184.000 224.857 184.000 216.020 L 184.000 200.280 C 213.730 182.000 232.000 150.100 232.000 116.000 C 232.000 60.860 185.350 16.000 128.000 16.000 ZM 92.000 152.000 C 80.954 152.000 72.000 143.046 72.000 132.000 C 72.000 120.954 80.954 112.000 92.000 112.000 C 103.046 112.000 112.000 120.954 112.000 132.000 C 112.000 143.046 103.046 152.000 92.000 152.000 ZM 164.000 152.000 C 152.954 152.000 144.000 143.046 144.000 132.000 C 144.000 120.954 152.954 112.000 164.000 112.000 C 175.046 112.000 184.000 120.954 184.000 132.000 C 184.000 143.046 175.046 152.000 164.000 152.000 Z"),
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
        return _skull!!
    }

private var _skull: ImageVector? = null
