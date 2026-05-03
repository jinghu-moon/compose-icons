package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorThinIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 173.170 82.830 C 171.607 81.267 171.607 78.733 173.170 77.170 C 174.733 75.607 177.267 75.607 178.830 77.170 L 196.000 94.340 L 196.000 48.000 C 196.000 45.791 197.791 44.000 200.000 44.000 C 202.209 44.000 204.000 45.791 204.000 48.000 L 204.000 94.340 L 221.170 77.170 C 222.733 75.607 225.267 75.607 226.830 77.170 C 228.393 78.733 228.393 81.267 226.830 82.830 L 202.830 106.830 C 202.080 107.581 201.062 108.003 200.000 108.003 C 198.938 108.003 197.920 107.581 197.170 106.830 ZM 236.000 160.000 L 236.000 200.000 C 236.000 206.627 230.627 212.000 224.000 212.000 L 168.000 212.000 C 166.883 211.999 165.817 211.532 165.060 210.710 L 70.250 108.000 L 32.000 108.000 C 25.373 108.000 20.000 102.627 20.000 96.000 L 20.000 56.000 C 20.000 49.373 25.373 44.000 32.000 44.000 L 88.000 44.000 C 89.117 44.001 90.183 44.468 90.940 45.290 L 185.750 148.000 L 224.000 148.000 C 230.627 148.000 236.000 153.373 236.000 160.000 ZM 228.000 160.000 C 228.000 157.791 226.209 156.000 224.000 156.000 L 184.000 156.000 C 182.883 155.999 181.817 155.532 181.060 154.710 L 86.250 52.000 L 32.000 52.000 C 29.791 52.000 28.000 53.791 28.000 56.000 L 28.000 96.000 C 28.000 98.209 29.791 100.000 32.000 100.000 L 72.000 100.000 C 73.117 100.001 74.183 100.468 74.940 101.290 L 169.750 204.000 L 224.000 204.000 C 226.209 204.000 228.000 202.209 228.000 200.000 Z"),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
