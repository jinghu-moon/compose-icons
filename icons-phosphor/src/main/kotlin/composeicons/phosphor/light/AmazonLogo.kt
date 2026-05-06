package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorLightIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 168v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-17.52l-5.66 5.66C225.6 191.15 188.86 230 128 230 66 230 29.08 189.73 27.54 188c-1.572-1.57-2.148-3.881-1.496-6.006 .652-2.124 2.425-3.714 4.608-4.132 2.183-.418 4.417 .405 5.808 2.138 .34 .37 35.09 38 91.54 38 56.45 0 91.2-37.64 91.55-38l.21-.22 5.76-5.76h-17.52c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.306-0 5.989 2.674 6 5.98ZM162 99.56v-15.56C162.01 66.426 149.968 51.137 132.88 47.03 115.792 42.924 98.117 51.07 90.14 66.73c-.937 1.975-2.874 3.284-5.056 3.417-2.182 .133-4.263-.931-5.433-2.778-1.17-1.847-1.243-4.183-.191-6.099C89.964 40.679 113.213 29.971 135.688 35.375 158.163 40.779 174.005 60.884 174 84v92c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-11.56c-13.591 15.94-35.678 21.719-55.334 14.477C87.01 171.675 73.952 152.948 73.952 132c0-20.948 13.058-39.675 32.714-46.917C126.322 77.841 148.409 83.62 162 99.56ZM162 132C162 111.013 144.987 94 124 94c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
