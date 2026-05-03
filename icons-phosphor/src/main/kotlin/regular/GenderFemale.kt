package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorRegularIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 96.000 C 207.999 52.857 173.789 17.485 130.670 16.046 C 87.551 14.606 51.057 47.616 48.178 90.663 C 45.300 133.710 77.073 171.286 120.000 175.600 L 120.000 200.000 L 88.000 200.000 C 83.582 200.000 80.000 203.582 80.000 208.000 C 80.000 212.418 83.582 216.000 88.000 216.000 L 120.000 216.000 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 216.000 L 168.000 216.000 C 172.418 216.000 176.000 212.418 176.000 208.000 C 176.000 203.582 172.418 200.000 168.000 200.000 L 136.000 200.000 L 136.000 175.600 C 176.855 171.443 207.950 137.066 208.000 96.000 ZM 64.000 96.000 C 64.000 60.654 92.654 32.000 128.000 32.000 C 163.346 32.000 192.000 60.654 192.000 96.000 C 192.000 131.346 163.346 160.000 128.000 160.000 C 92.670 159.961 64.039 131.330 64.000 96.000 Z"),
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
