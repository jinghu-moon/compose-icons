package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorThinIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.430 178.060 C 210.884 178.970 209.999 179.626 208.969 179.882 C 207.939 180.139 206.850 179.977 205.940 179.430 L 132.000 135.060 L 132.000 216.000 C 132.000 218.209 130.209 220.000 128.000 220.000 C 125.791 220.000 124.000 218.209 124.000 216.000 L 124.000 135.060 L 50.060 179.430 C 48.166 180.568 45.708 179.954 44.570 178.060 C 43.432 176.166 44.046 173.708 45.940 172.570 L 120.220 128.000 L 45.940 83.430 C 44.046 82.292 43.432 79.834 44.570 77.940 C 45.708 76.046 48.166 75.432 50.060 76.570 L 124.000 120.940 L 124.000 40.000 C 124.000 37.791 125.791 36.000 128.000 36.000 C 130.209 36.000 132.000 37.791 132.000 40.000 L 132.000 120.940 L 205.940 76.570 C 207.834 75.432 210.292 76.046 211.430 77.940 C 212.568 79.834 211.954 82.292 210.060 83.430 L 135.780 128.000 L 210.060 172.570 C 210.970 173.116 211.626 174.001 211.882 175.031 C 212.139 176.061 211.977 177.150 211.430 178.060 Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
