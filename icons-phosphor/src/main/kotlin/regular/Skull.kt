package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorRegularIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 104.000 C 76.536 104.000 64.000 116.536 64.000 132.000 C 64.000 147.464 76.536 160.000 92.000 160.000 C 107.464 160.000 120.000 147.464 120.000 132.000 C 120.000 116.536 107.464 104.000 92.000 104.000 ZM 92.000 144.000 C 85.373 144.000 80.000 138.627 80.000 132.000 C 80.000 125.373 85.373 120.000 92.000 120.000 C 98.627 120.000 104.000 125.373 104.000 132.000 C 104.000 138.627 98.627 144.000 92.000 144.000 ZM 164.000 104.000 C 148.536 104.000 136.000 116.536 136.000 132.000 C 136.000 147.464 148.536 160.000 164.000 160.000 C 179.464 160.000 192.000 147.464 192.000 132.000 C 192.000 116.536 179.464 104.000 164.000 104.000 ZM 164.000 144.000 C 157.373 144.000 152.000 138.627 152.000 132.000 C 152.000 125.373 157.373 120.000 164.000 120.000 C 170.627 120.000 176.000 125.373 176.000 132.000 C 176.000 138.627 170.627 144.000 164.000 144.000 ZM 128.000 16.000 C 70.650 16.000 24.000 60.860 24.000 116.000 C 24.000 150.100 42.270 182.000 72.000 200.280 L 72.000 216.000 C 72.000 224.837 79.163 232.000 88.000 232.000 L 168.000 232.000 C 176.837 232.000 184.000 224.837 184.000 216.000 L 184.000 200.280 C 213.730 182.000 232.000 150.100 232.000 116.000 C 232.000 60.860 185.350 16.000 128.000 16.000 ZM 172.120 188.690 C 169.576 190.101 167.999 192.781 168.000 195.690 L 168.000 216.000 L 152.000 216.000 L 152.000 192.000 C 152.000 187.582 148.418 184.000 144.000 184.000 C 139.582 184.000 136.000 187.582 136.000 192.000 L 136.000 216.000 L 120.000 216.000 L 120.000 192.000 C 120.000 187.582 116.418 184.000 112.000 184.000 C 107.582 184.000 104.000 187.582 104.000 192.000 L 104.000 216.000 L 88.000 216.000 L 88.000 195.690 C 88.001 192.781 86.424 190.101 83.880 188.690 C 56.810 173.690 40.000 145.840 40.000 116.000 C 40.000 69.680 79.480 32.000 128.000 32.000 C 176.520 32.000 216.000 69.680 216.000 116.000 C 216.000 145.830 199.190 173.690 172.120 188.690 Z"),
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
        return _skull!!
    }

private var _skull: ImageVector? = null
