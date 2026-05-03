package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorThinIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 44.000 L 168.000 44.000 C 166.883 44.001 165.817 44.468 165.060 45.290 L 70.250 148.000 L 32.000 148.000 C 25.373 148.000 20.000 153.373 20.000 160.000 L 20.000 200.000 C 20.000 206.627 25.373 212.000 32.000 212.000 L 88.000 212.000 C 89.117 211.999 90.183 211.532 90.940 210.710 L 185.750 108.000 L 224.000 108.000 C 230.627 108.000 236.000 102.627 236.000 96.000 L 236.000 56.000 C 236.000 49.373 230.627 44.000 224.000 44.000 ZM 228.000 96.000 C 228.000 98.209 226.209 100.000 224.000 100.000 L 184.000 100.000 C 182.883 100.001 181.817 100.468 181.060 101.290 L 86.250 204.000 L 32.000 204.000 C 29.791 204.000 28.000 202.209 28.000 200.000 L 28.000 160.000 C 28.000 157.791 29.791 156.000 32.000 156.000 L 72.000 156.000 C 73.117 155.999 74.183 155.532 74.940 154.710 L 169.750 52.000 L 224.000 52.000 C 226.209 52.000 228.000 53.791 228.000 56.000 ZM 226.830 173.170 C 228.393 174.733 228.393 177.267 226.830 178.830 C 225.267 180.393 222.733 180.393 221.170 178.830 L 204.000 161.660 L 204.000 208.000 C 204.000 210.209 202.209 212.000 200.000 212.000 C 197.791 212.000 196.000 210.209 196.000 208.000 L 196.000 161.660 L 178.830 178.830 C 177.267 180.393 174.733 180.393 173.170 178.830 C 171.607 177.267 171.607 174.733 173.170 173.170 L 197.170 149.170 C 197.920 148.419 198.938 147.997 200.000 147.997 C 201.062 147.997 202.080 148.419 202.830 149.170 Z"),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
