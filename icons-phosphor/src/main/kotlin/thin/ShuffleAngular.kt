package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) return _shuffleAngular!!
        _shuffleAngular = phosphorThinIcon(
            name = "ShuffleAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.830 181.170 C 235.581 181.920 236.003 182.938 236.003 184.000 C 236.003 185.062 235.581 186.080 234.830 186.830 L 210.830 210.830 C 209.267 212.393 206.733 212.393 205.170 210.830 C 203.607 209.267 203.607 206.733 205.170 205.170 L 222.340 188.000 L 168.000 188.000 C 166.711 188.000 165.501 187.378 164.750 186.330 L 85.940 76.000 L 32.000 76.000 C 29.791 76.000 28.000 74.209 28.000 72.000 C 28.000 69.791 29.791 68.000 32.000 68.000 L 88.000 68.000 C 89.289 68.000 90.499 68.622 91.250 69.670 L 170.060 180.000 L 222.340 180.000 L 205.170 162.830 C 203.607 161.267 203.607 158.733 205.170 157.170 C 206.733 155.607 209.267 155.607 210.830 157.170 ZM 145.340 103.730 C 146.203 104.347 147.276 104.595 148.323 104.421 C 149.369 104.246 150.303 103.663 150.920 102.800 L 170.060 76.000 L 222.340 76.000 L 205.170 93.170 C 203.607 94.733 203.607 97.267 205.170 98.830 C 206.733 100.393 209.267 100.393 210.830 98.830 L 234.830 74.830 C 235.581 74.080 236.003 73.062 236.003 72.000 C 236.003 70.938 235.581 69.920 234.830 69.170 L 210.830 45.170 C 209.267 43.607 206.733 43.607 205.170 45.170 C 203.607 46.733 203.607 49.267 205.170 50.830 L 222.340 68.000 L 168.000 68.000 C 166.711 68.000 165.501 68.622 164.750 69.670 L 144.410 98.150 C 143.793 99.013 143.545 100.086 143.719 101.133 C 143.894 102.179 144.477 103.113 145.340 103.730 ZM 110.660 152.270 C 109.797 151.653 108.724 151.405 107.677 151.579 C 106.631 151.754 105.697 152.337 105.080 153.200 L 85.940 180.000 L 32.000 180.000 C 29.791 180.000 28.000 181.791 28.000 184.000 C 28.000 186.209 29.791 188.000 32.000 188.000 L 88.000 188.000 C 89.289 188.000 90.499 187.378 91.250 186.330 L 111.590 157.850 C 112.207 156.987 112.455 155.914 112.281 154.867 C 112.106 153.821 111.523 152.887 110.660 152.270 Z"),
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
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
