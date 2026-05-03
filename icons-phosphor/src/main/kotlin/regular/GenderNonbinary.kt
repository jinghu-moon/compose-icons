package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorRegularIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 96.460 L 136.000 62.130 L 163.880 78.860 C 167.669 81.135 172.585 79.909 174.860 76.120 C 177.135 72.331 175.909 67.415 172.120 65.140 L 143.550 48.000 L 172.120 30.860 C 175.909 28.585 177.135 23.669 174.860 19.880 C 172.585 16.091 167.669 14.865 163.880 17.140 L 128.000 38.670 L 92.120 17.140 C 88.331 14.865 83.415 16.091 81.140 19.880 C 78.865 23.669 80.091 28.585 83.880 30.860 L 112.450 48.000 L 83.880 65.140 C 80.091 67.415 78.865 72.331 81.140 76.120 C 83.415 79.909 88.331 81.135 92.120 78.860 L 120.000 62.130 L 120.000 96.460 C 82.029 100.705 53.986 133.872 56.112 172.020 C 58.238 210.169 89.792 240.014 128.000 240.014 C 166.208 240.014 197.762 210.169 199.888 172.020 C 202.014 133.872 173.971 100.705 136.000 96.460 ZM 128.000 224.000 C 97.072 224.000 72.000 198.928 72.000 168.000 C 72.000 137.072 97.072 112.000 128.000 112.000 C 158.928 112.000 184.000 137.072 184.000 168.000 C 183.967 198.914 158.914 223.967 128.000 224.000 Z"),
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
