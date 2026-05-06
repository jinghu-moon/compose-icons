package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorLightIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 82c-25.405 0-46 20.595-46 46 0 25.405 20.595 46 46 46 25.405 0 46-20.595 46-46C173.967 102.609 153.391 82.033 128 82ZM128 162C109.222 162 94 146.778 94 128c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34ZM176 26h-96C50.19 26.033 26.033 50.19 26 80v96c.033 29.81 24.19 53.967 54 54h96c29.81-.033 53.967-24.19 54-54v-96C229.967 50.19 205.81 26.033 176 26ZM218 176c0 23.196-18.804 42-42 42h-96C56.804 218 38 199.196 38 176v-96C38 56.804 56.804 38 80 38h96c23.196 0 42 18.804 42 42ZM190 76c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
