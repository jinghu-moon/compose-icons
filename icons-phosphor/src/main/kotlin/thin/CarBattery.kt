package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorThinIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 136.000 C 188.000 138.209 186.209 140.000 184.000 140.000 L 172.000 140.000 L 172.000 152.000 C 172.000 154.209 170.209 156.000 168.000 156.000 C 165.791 156.000 164.000 154.209 164.000 152.000 L 164.000 140.000 L 152.000 140.000 C 149.791 140.000 148.000 138.209 148.000 136.000 C 148.000 133.791 149.791 132.000 152.000 132.000 L 164.000 132.000 L 164.000 120.000 C 164.000 117.791 165.791 116.000 168.000 116.000 C 170.209 116.000 172.000 117.791 172.000 120.000 L 172.000 132.000 L 184.000 132.000 C 186.209 132.000 188.000 133.791 188.000 136.000 ZM 104.000 132.000 L 72.000 132.000 C 69.791 132.000 68.000 133.791 68.000 136.000 C 68.000 138.209 69.791 140.000 72.000 140.000 L 104.000 140.000 C 106.209 140.000 108.000 138.209 108.000 136.000 C 108.000 133.791 106.209 132.000 104.000 132.000 ZM 236.000 88.000 L 236.000 184.000 C 236.000 190.627 230.627 196.000 224.000 196.000 L 32.000 196.000 C 25.373 196.000 20.000 190.627 20.000 184.000 L 20.000 88.000 C 20.000 81.373 25.373 76.000 32.000 76.000 L 52.000 76.000 L 52.000 56.000 C 52.000 49.373 57.373 44.000 64.000 44.000 L 96.000 44.000 C 102.627 44.000 108.000 49.373 108.000 56.000 L 108.000 76.000 L 148.000 76.000 L 148.000 56.000 C 148.000 49.373 153.373 44.000 160.000 44.000 L 192.000 44.000 C 198.627 44.000 204.000 49.373 204.000 56.000 L 204.000 76.000 L 224.000 76.000 C 230.627 76.000 236.000 81.373 236.000 88.000 ZM 156.000 76.000 L 196.000 76.000 L 196.000 56.000 C 196.000 53.791 194.209 52.000 192.000 52.000 L 160.000 52.000 C 157.791 52.000 156.000 53.791 156.000 56.000 ZM 60.000 76.000 L 100.000 76.000 L 100.000 56.000 C 100.000 53.791 98.209 52.000 96.000 52.000 L 64.000 52.000 C 61.791 52.000 60.000 53.791 60.000 56.000 ZM 228.000 88.000 C 228.000 85.791 226.209 84.000 224.000 84.000 L 32.000 84.000 C 29.791 84.000 28.000 85.791 28.000 88.000 L 28.000 184.000 C 28.000 186.209 29.791 188.000 32.000 188.000 L 224.000 188.000 C 226.209 188.000 228.000 186.209 228.000 184.000 Z"),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
