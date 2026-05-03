package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorThinIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 84.000 L 106.470 84.000 L 83.580 38.210 C 82.902 36.855 81.516 35.999 80.000 36.000 L 48.000 36.000 C 45.791 36.000 44.000 37.791 44.000 40.000 L 44.000 84.000 L 24.000 84.000 C 21.791 84.000 20.000 85.791 20.000 88.000 C 20.000 90.209 21.791 92.000 24.000 92.000 L 44.000 92.000 L 44.000 212.000 L 24.000 212.000 C 21.791 212.000 20.000 213.791 20.000 216.000 C 20.000 218.209 21.791 220.000 24.000 220.000 L 128.000 220.000 C 130.209 220.000 132.000 218.209 132.000 216.000 C 132.000 213.791 130.209 212.000 128.000 212.000 L 108.000 212.000 L 108.000 92.000 L 212.000 92.000 L 212.000 184.000 C 212.000 186.209 210.209 188.000 208.000 188.000 L 192.000 188.000 C 189.791 188.000 188.000 186.209 188.000 184.000 L 188.000 176.000 C 188.000 173.791 186.209 172.000 184.000 172.000 C 181.791 172.000 180.000 173.791 180.000 176.000 L 180.000 184.000 C 180.000 190.627 185.373 196.000 192.000 196.000 L 208.000 196.000 C 214.627 196.000 220.000 190.627 220.000 184.000 L 220.000 92.000 L 240.000 92.000 C 242.209 92.000 244.000 90.209 244.000 88.000 C 244.000 85.791 242.209 84.000 240.000 84.000 ZM 52.000 44.000 L 77.530 44.000 L 97.530 84.000 L 52.000 84.000 ZM 52.000 212.000 L 52.000 156.000 L 100.000 156.000 L 100.000 212.000 ZM 100.000 148.000 L 52.000 148.000 L 52.000 92.000 L 100.000 92.000 Z"),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
