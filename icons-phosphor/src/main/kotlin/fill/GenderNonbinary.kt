package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorFillIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 128.000 208.000 C 100.840 207.997 78.257 187.091 76.161 160.012 C 74.065 132.933 93.163 108.802 120.000 104.620 L 120.000 83.820 L 91.000 95.430 C 86.897 97.087 82.227 95.103 80.570 91.000 C 78.913 86.897 80.897 82.227 85.000 80.570 L 106.460 72.000 L 85.000 63.430 C 80.897 61.773 78.913 57.103 80.570 53.000 C 82.227 48.897 86.897 46.913 91.000 48.570 L 128.000 63.380 L 165.000 48.570 C 169.103 46.913 173.773 48.897 175.430 53.000 C 177.087 57.103 175.103 61.773 171.000 63.430 L 149.540 72.000 L 171.000 80.570 C 175.103 82.227 177.087 86.897 175.430 91.000 C 173.773 95.103 169.103 97.087 165.000 95.430 L 136.000 83.820 L 136.000 104.620 C 162.837 108.802 181.935 132.933 179.839 160.012 C 177.743 187.091 155.160 207.997 128.000 208.000 ZM 164.000 156.000 C 164.000 175.882 147.882 192.000 128.000 192.000 C 108.118 192.000 92.000 175.882 92.000 156.000 C 92.000 136.118 108.118 120.000 128.000 120.000 C 147.882 120.000 164.000 136.118 164.000 156.000 Z"),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
