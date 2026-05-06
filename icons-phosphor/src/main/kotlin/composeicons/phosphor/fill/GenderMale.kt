package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorFillIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 140c0 19.882-16.118 36-36 36C96.118 176 80 159.882 80 140c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36ZM216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16ZM192 72c0-4.418-3.582-8-8-8h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h12.69l-18 18C124.752 81.913 94.127 85.421 76.396 106.053c-17.732 20.632-16.596 51.436 2.606 70.706 19.203 19.271 50.002 20.515 70.697 2.856 20.695-17.659 24.311-48.27 8.301-70.266l18-18v12.65c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8Z"),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
