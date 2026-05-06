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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 96C212.005 51.167 176.8 14.232 132.018 12.088 87.236 9.943 48.663 43.345 44.384 87.974c-4.279 44.628 27.243 84.752 71.616 91.156v16.87h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-28v-16.87C181.299 173.117 211.944 137.734 212 96ZM68 96C68 62.863 94.863 36 128 36c33.137 0 60 26.863 60 60 0 33.137-26.863 60-60 60C94.879 155.961 68.039 129.121 68 96Z"),
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
