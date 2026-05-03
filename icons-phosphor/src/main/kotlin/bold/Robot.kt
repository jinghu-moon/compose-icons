package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorBoldIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 72.000 104.000 C 72.000 95.163 79.163 88.000 88.000 88.000 C 96.837 88.000 104.000 95.163 104.000 104.000 C 104.000 112.837 96.837 120.000 88.000 120.000 C 79.163 120.000 72.000 112.837 72.000 104.000 ZM 168.000 120.000 C 176.837 120.000 184.000 112.837 184.000 104.000 C 184.000 95.163 176.837 88.000 168.000 88.000 C 159.163 88.000 152.000 95.163 152.000 104.000 C 152.000 112.837 159.163 120.000 168.000 120.000 ZM 236.000 80.000 L 236.000 192.000 C 236.000 211.882 219.882 228.000 200.000 228.000 L 56.000 228.000 C 36.118 228.000 20.000 211.882 20.000 192.000 L 20.000 80.000 C 20.000 60.118 36.118 44.000 56.000 44.000 L 116.000 44.000 L 116.000 16.000 C 116.000 9.373 121.373 4.000 128.000 4.000 C 134.627 4.000 140.000 9.373 140.000 16.000 L 140.000 44.000 L 200.000 44.000 C 219.882 44.000 236.000 60.118 236.000 80.000 ZM 212.000 80.000 C 212.000 73.373 206.627 68.000 200.000 68.000 L 56.000 68.000 C 49.373 68.000 44.000 73.373 44.000 80.000 L 44.000 192.000 C 44.000 198.627 49.373 204.000 56.000 204.000 L 200.000 204.000 C 206.627 204.000 212.000 198.627 212.000 192.000 ZM 200.000 162.000 C 200.000 178.569 186.569 192.000 170.000 192.000 L 86.000 192.000 C 69.431 192.000 56.000 178.569 56.000 162.000 C 56.000 145.431 69.431 132.000 86.000 132.000 L 170.000 132.000 C 186.569 132.000 200.000 145.431 200.000 162.000 ZM 120.000 156.000 L 120.000 168.000 L 136.000 168.000 L 136.000 156.000 ZM 86.000 168.000 L 96.000 168.000 L 96.000 156.000 L 86.000 156.000 C 82.686 156.000 80.000 158.686 80.000 162.000 C 80.000 165.314 82.686 168.000 86.000 168.000 ZM 176.000 162.000 C 176.000 158.686 173.314 156.000 170.000 156.000 L 160.000 156.000 L 160.000 168.000 L 170.000 168.000 C 173.314 168.000 176.000 165.314 176.000 162.000 Z"),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
