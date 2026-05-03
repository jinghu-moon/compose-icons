package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorThinIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 88.000 L 100.000 184.000 C 100.000 186.209 98.209 188.000 96.000 188.000 C 93.791 188.000 92.000 186.209 92.000 184.000 L 92.000 88.000 C 92.000 85.791 93.791 84.000 96.000 84.000 C 98.209 84.000 100.000 85.791 100.000 88.000 ZM 128.000 84.000 C 125.791 84.000 124.000 85.791 124.000 88.000 L 124.000 184.000 C 124.000 186.209 125.791 188.000 128.000 188.000 C 130.209 188.000 132.000 186.209 132.000 184.000 L 132.000 88.000 C 132.000 85.791 130.209 84.000 128.000 84.000 ZM 160.000 84.000 C 157.791 84.000 156.000 85.791 156.000 88.000 L 156.000 184.000 C 156.000 186.209 157.791 188.000 160.000 188.000 C 162.209 188.000 164.000 186.209 164.000 184.000 L 164.000 88.000 C 164.000 85.791 162.209 84.000 160.000 84.000 ZM 204.000 64.000 L 204.000 208.000 C 204.000 214.627 198.627 220.000 192.000 220.000 L 172.000 220.000 L 172.000 240.000 C 172.000 242.209 170.209 244.000 168.000 244.000 C 165.791 244.000 164.000 242.209 164.000 240.000 L 164.000 220.000 L 92.000 220.000 L 92.000 240.000 C 92.000 242.209 90.209 244.000 88.000 244.000 C 85.791 244.000 84.000 242.209 84.000 240.000 L 84.000 220.000 L 64.000 220.000 C 57.373 220.000 52.000 214.627 52.000 208.000 L 52.000 64.000 C 52.000 57.373 57.373 52.000 64.000 52.000 L 92.000 52.000 L 92.000 24.000 C 92.000 12.954 100.954 4.000 112.000 4.000 L 144.000 4.000 C 155.046 4.000 164.000 12.954 164.000 24.000 L 164.000 52.000 L 192.000 52.000 C 198.627 52.000 204.000 57.373 204.000 64.000 ZM 100.000 52.000 L 156.000 52.000 L 156.000 24.000 C 156.000 17.373 150.627 12.000 144.000 12.000 L 112.000 12.000 C 105.373 12.000 100.000 17.373 100.000 24.000 ZM 196.000 64.000 C 196.000 61.791 194.209 60.000 192.000 60.000 L 64.000 60.000 C 61.791 60.000 60.000 61.791 60.000 64.000 L 60.000 208.000 C 60.000 210.209 61.791 212.000 64.000 212.000 L 192.000 212.000 C 194.209 212.000 196.000 210.209 196.000 208.000 Z"),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
