package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorFillIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 144.000 C 105.909 144.000 88.000 126.091 88.000 104.000 C 88.000 81.909 105.909 64.000 128.000 64.000 C 150.091 64.000 168.000 81.909 168.000 104.000 C 168.000 126.091 150.091 144.000 128.000 144.000 ZM 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 ZM 136.000 176.000 L 136.000 159.420 C 165.071 155.224 185.960 129.281 183.856 99.984 C 181.753 70.688 157.372 47.994 128.000 47.994 C 98.628 47.994 74.247 70.688 72.144 99.984 C 70.040 129.281 90.929 155.224 120.000 159.420 L 120.000 176.000 L 96.000 176.000 C 91.582 176.000 88.000 179.582 88.000 184.000 C 88.000 188.418 91.582 192.000 96.000 192.000 L 120.000 192.000 L 120.000 208.000 C 120.000 212.418 123.582 216.000 128.000 216.000 C 132.418 216.000 136.000 212.418 136.000 208.000 L 136.000 192.000 L 160.000 192.000 C 164.418 192.000 168.000 188.418 168.000 184.000 C 168.000 179.582 164.418 176.000 160.000 176.000 Z"),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
