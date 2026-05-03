package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorBoldIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 104.000 C 212.005 59.167 176.800 22.232 132.018 20.088 C 87.236 17.943 48.663 51.345 44.384 95.974 C 40.104 140.602 71.627 180.725 116.000 187.130 L 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 L 140.000 187.130 C 181.299 181.117 211.944 145.734 212.000 104.000 ZM 128.000 164.000 C 94.863 164.000 68.000 137.137 68.000 104.000 C 68.000 70.863 94.863 44.000 128.000 44.000 C 161.137 44.000 188.000 70.863 188.000 104.000 C 187.961 137.121 161.121 163.961 128.000 164.000 Z"),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
