package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DiceSix: ImageVector
    get() {
        if (_diceSix != null) return _diceSix!!
        _diceSix = phosphorBoldIcon(
            name = "DiceSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 28.000 L 64.000 28.000 C 44.118 28.000 28.000 44.118 28.000 64.000 L 28.000 192.000 C 28.000 211.882 44.118 228.000 64.000 228.000 L 192.000 228.000 C 211.882 228.000 228.000 211.882 228.000 192.000 L 228.000 64.000 C 228.000 44.118 211.882 28.000 192.000 28.000 ZM 204.000 192.000 C 204.000 198.627 198.627 204.000 192.000 204.000 L 64.000 204.000 C 57.373 204.000 52.000 198.627 52.000 192.000 L 52.000 64.000 C 52.000 57.373 57.373 52.000 64.000 52.000 L 192.000 52.000 C 198.627 52.000 204.000 57.373 204.000 64.000 ZM 112.000 84.000 C 112.000 92.837 104.837 100.000 96.000 100.000 C 87.163 100.000 80.000 92.837 80.000 84.000 C 80.000 75.163 87.163 68.000 96.000 68.000 C 104.837 68.000 112.000 75.163 112.000 84.000 ZM 176.000 84.000 C 176.000 92.837 168.837 100.000 160.000 100.000 C 151.163 100.000 144.000 92.837 144.000 84.000 C 144.000 75.163 151.163 68.000 160.000 68.000 C 168.837 68.000 176.000 75.163 176.000 84.000 ZM 112.000 128.000 C 112.000 136.837 104.837 144.000 96.000 144.000 C 87.163 144.000 80.000 136.837 80.000 128.000 C 80.000 119.163 87.163 112.000 96.000 112.000 C 104.837 112.000 112.000 119.163 112.000 128.000 ZM 176.000 128.000 C 176.000 136.837 168.837 144.000 160.000 144.000 C 151.163 144.000 144.000 136.837 144.000 128.000 C 144.000 119.163 151.163 112.000 160.000 112.000 C 168.837 112.000 176.000 119.163 176.000 128.000 ZM 112.000 172.000 C 112.000 180.837 104.837 188.000 96.000 188.000 C 87.163 188.000 80.000 180.837 80.000 172.000 C 80.000 163.163 87.163 156.000 96.000 156.000 C 104.837 156.000 112.000 163.163 112.000 172.000 ZM 176.000 172.000 C 176.000 180.837 168.837 188.000 160.000 188.000 C 151.163 188.000 144.000 180.837 144.000 172.000 C 144.000 163.163 151.163 156.000 160.000 156.000 C 168.837 156.000 176.000 163.163 176.000 172.000 Z"),
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
        return _diceSix!!
    }

private var _diceSix: ImageVector? = null
