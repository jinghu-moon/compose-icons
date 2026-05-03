package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = phosphorThinIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 124.000 16.000 L 124.000 8.000 C 124.000 5.791 125.791 4.000 128.000 4.000 C 130.209 4.000 132.000 5.791 132.000 8.000 L 132.000 16.000 C 132.000 18.209 130.209 20.000 128.000 20.000 C 125.791 20.000 124.000 18.209 124.000 16.000 ZM 200.000 44.000 C 201.061 44.001 202.079 43.580 202.830 42.830 L 210.830 34.830 C 212.393 33.267 212.393 30.733 210.830 29.170 C 209.267 27.607 206.733 27.607 205.170 29.170 L 197.170 37.170 C 196.025 38.314 195.682 40.036 196.302 41.531 C 196.921 43.027 198.381 44.001 200.000 44.000 ZM 53.170 42.830 C 54.733 44.393 57.267 44.393 58.830 42.830 C 60.393 41.267 60.393 38.733 58.830 37.170 L 50.830 29.170 C 49.267 27.607 46.733 27.607 45.170 29.170 C 43.607 30.733 43.607 33.267 45.170 34.830 ZM 136.660 76.050 C 134.478 75.685 132.415 77.158 132.050 79.340 C 131.685 81.522 133.158 83.585 135.340 83.950 C 156.240 87.450 172.000 106.390 172.000 128.000 C 172.000 130.209 173.791 132.000 176.000 132.000 C 178.209 132.000 180.000 130.209 180.000 128.000 C 180.000 102.530 161.370 80.200 136.660 76.050 ZM 228.000 176.000 L 228.000 200.000 C 228.000 206.627 222.627 212.000 216.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 L 28.000 176.000 C 28.000 169.373 33.373 164.000 40.000 164.000 L 44.000 164.000 L 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 L 128.640 44.000 C 174.640 44.340 212.000 82.470 212.000 129.000 L 212.000 164.000 L 216.000 164.000 C 222.627 164.000 228.000 169.373 228.000 176.000 ZM 52.000 164.000 L 204.000 164.000 L 204.000 129.000 C 204.000 86.850 170.170 52.310 128.580 52.000 C 108.323 51.845 88.843 59.784 74.465 74.054 C 60.086 88.323 51.999 107.743 52.000 128.000 ZM 220.000 176.000 C 220.000 173.791 218.209 172.000 216.000 172.000 L 40.000 172.000 C 37.791 172.000 36.000 173.791 36.000 176.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 L 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 Z"),
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
        return _siren!!
    }

private var _siren: ImageVector? = null
