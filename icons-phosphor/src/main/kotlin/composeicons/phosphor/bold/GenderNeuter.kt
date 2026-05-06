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
                pathData = parseSvgPathData("M212 104C212.005 59.167 176.8 22.232 132.018 20.088 87.236 17.943 48.663 51.345 44.384 95.974c-4.279 44.628 27.243 84.752 71.616 91.156v44.87c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-44.87c41.299-6.013 71.944-41.396 72-83.13ZM128 164C94.863 164 68 137.137 68 104 68 70.863 94.863 44 128 44c33.137 0 60 26.863 60 60-.039 33.121-26.879 59.961-60 60Z"),
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
