package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorThinIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 108.000 72.000 C 108.000 74.209 106.209 76.000 104.000 76.000 L 40.000 76.000 C 37.791 76.000 36.000 74.209 36.000 72.000 C 36.000 69.791 37.791 68.000 40.000 68.000 L 104.000 68.000 C 106.209 68.000 108.000 69.791 108.000 72.000 ZM 104.000 180.000 L 76.000 180.000 L 76.000 152.000 C 76.000 149.791 74.209 148.000 72.000 148.000 C 69.791 148.000 68.000 149.791 68.000 152.000 L 68.000 180.000 L 40.000 180.000 C 37.791 180.000 36.000 181.791 36.000 184.000 C 36.000 186.209 37.791 188.000 40.000 188.000 L 68.000 188.000 L 68.000 216.000 C 68.000 218.209 69.791 220.000 72.000 220.000 C 74.209 220.000 76.000 218.209 76.000 216.000 L 76.000 188.000 L 104.000 188.000 C 106.209 188.000 108.000 186.209 108.000 184.000 C 108.000 181.791 106.209 180.000 104.000 180.000 ZM 152.000 172.000 L 216.000 172.000 C 218.209 172.000 220.000 170.209 220.000 168.000 C 220.000 165.791 218.209 164.000 216.000 164.000 L 152.000 164.000 C 149.791 164.000 148.000 165.791 148.000 168.000 C 148.000 170.209 149.791 172.000 152.000 172.000 ZM 216.000 196.000 L 152.000 196.000 C 149.791 196.000 148.000 197.791 148.000 200.000 C 148.000 202.209 149.791 204.000 152.000 204.000 L 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 C 220.000 197.791 218.209 196.000 216.000 196.000 ZM 157.170 98.830 C 157.920 99.581 158.938 100.003 160.000 100.003 C 161.062 100.003 162.080 99.581 162.830 98.830 L 184.000 77.660 L 205.170 98.830 C 206.733 100.393 209.267 100.393 210.830 98.830 C 212.393 97.267 212.393 94.733 210.830 93.170 L 189.660 72.000 L 210.830 50.830 C 212.393 49.267 212.393 46.733 210.830 45.170 C 209.267 43.607 206.733 43.607 205.170 45.170 L 184.000 66.340 L 162.830 45.170 C 161.267 43.607 158.733 43.607 157.170 45.170 C 155.607 46.733 155.607 49.267 157.170 50.830 L 178.340 72.000 L 157.170 93.170 C 156.419 93.920 155.997 94.938 155.997 96.000 C 155.997 97.062 156.419 98.080 157.170 98.830 Z"),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
