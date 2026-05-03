package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorThinIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.920 95.220 C 219.897 95.107 219.864 94.997 219.820 94.890 C 219.786 94.747 219.742 94.607 219.690 94.470 C 219.637 94.342 219.573 94.218 219.500 94.100 C 219.440 93.990 219.390 93.880 219.330 93.780 C 219.185 93.563 219.018 93.361 218.830 93.180 L 218.830 93.180 L 162.830 37.180 L 162.830 37.180 C 162.729 37.080 162.618 36.990 162.500 36.910 C 161.795 36.330 160.913 36.009 160.000 36.000 L 40.000 36.000 C 37.791 36.000 36.000 37.791 36.000 40.000 L 36.000 160.000 C 36.006 160.912 36.324 161.794 36.900 162.500 C 36.980 162.618 37.070 162.729 37.170 162.830 L 93.170 218.830 C 93.921 219.580 94.939 220.001 96.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 L 220.000 96.000 C 219.998 95.738 219.971 95.477 219.920 95.220 ZM 164.000 49.660 L 206.340 92.000 L 164.000 92.000 ZM 92.000 206.340 L 49.660 164.000 L 92.000 164.000 ZM 92.000 156.000 L 44.000 156.000 L 44.000 49.660 L 92.000 97.660 ZM 49.660 44.000 L 156.000 44.000 L 156.000 92.000 L 97.660 92.000 ZM 156.000 100.000 L 156.000 156.000 L 100.000 156.000 L 100.000 100.000 ZM 100.000 212.000 L 100.000 164.000 L 158.340 164.000 L 206.340 212.000 ZM 212.000 206.340 L 164.000 158.340 L 164.000 100.000 L 212.000 100.000 Z"),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
