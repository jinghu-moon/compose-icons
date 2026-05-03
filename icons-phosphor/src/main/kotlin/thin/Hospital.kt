package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorThinIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 212.000 L 236.000 212.000 L 236.000 128.000 C 236.000 121.373 230.627 116.000 224.000 116.000 L 164.000 116.000 L 164.000 48.000 C 164.000 41.373 158.627 36.000 152.000 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 L 44.000 212.000 L 32.000 212.000 C 29.791 212.000 28.000 213.791 28.000 216.000 C 28.000 218.209 29.791 220.000 32.000 220.000 L 248.000 220.000 C 250.209 220.000 252.000 218.209 252.000 216.000 C 252.000 213.791 250.209 212.000 248.000 212.000 ZM 224.000 124.000 C 226.209 124.000 228.000 125.791 228.000 128.000 L 228.000 212.000 L 164.000 212.000 L 164.000 124.000 ZM 52.000 48.000 C 52.000 45.791 53.791 44.000 56.000 44.000 L 152.000 44.000 C 154.209 44.000 156.000 45.791 156.000 48.000 L 156.000 212.000 L 132.000 212.000 L 132.000 160.000 C 132.000 157.791 130.209 156.000 128.000 156.000 L 80.000 156.000 C 77.791 156.000 76.000 157.791 76.000 160.000 L 76.000 212.000 L 52.000 212.000 ZM 124.000 212.000 L 84.000 212.000 L 84.000 164.000 L 124.000 164.000 ZM 76.000 96.000 C 76.000 93.791 77.791 92.000 80.000 92.000 L 100.000 92.000 L 100.000 72.000 C 100.000 69.791 101.791 68.000 104.000 68.000 C 106.209 68.000 108.000 69.791 108.000 72.000 L 108.000 92.000 L 128.000 92.000 C 130.209 92.000 132.000 93.791 132.000 96.000 C 132.000 98.209 130.209 100.000 128.000 100.000 L 108.000 100.000 L 108.000 120.000 C 108.000 122.209 106.209 124.000 104.000 124.000 C 101.791 124.000 100.000 122.209 100.000 120.000 L 100.000 100.000 L 80.000 100.000 C 77.791 100.000 76.000 98.209 76.000 96.000 Z"),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
