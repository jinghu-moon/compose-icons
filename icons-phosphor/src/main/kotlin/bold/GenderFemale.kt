package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorBoldIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 96.000 C 212.005 51.167 176.800 14.232 132.018 12.088 C 87.236 9.943 48.663 43.345 44.384 87.974 C 40.104 132.602 71.627 172.725 116.000 179.130 L 116.000 196.000 L 88.000 196.000 C 81.373 196.000 76.000 201.373 76.000 208.000 C 76.000 214.627 81.373 220.000 88.000 220.000 L 116.000 220.000 L 116.000 240.000 C 116.000 246.627 121.373 252.000 128.000 252.000 C 134.627 252.000 140.000 246.627 140.000 240.000 L 140.000 220.000 L 168.000 220.000 C 174.627 220.000 180.000 214.627 180.000 208.000 C 180.000 201.373 174.627 196.000 168.000 196.000 L 140.000 196.000 L 140.000 179.130 C 181.299 173.117 211.944 137.734 212.000 96.000 ZM 68.000 96.000 C 68.000 62.863 94.863 36.000 128.000 36.000 C 161.137 36.000 188.000 62.863 188.000 96.000 C 188.000 129.137 161.137 156.000 128.000 156.000 C 94.879 155.961 68.039 129.121 68.000 96.000 Z"),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
