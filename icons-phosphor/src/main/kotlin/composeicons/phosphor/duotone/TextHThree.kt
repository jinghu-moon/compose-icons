package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorDuotoneIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 72v120c0 8.837-7.163 16-16 16h-168c-8.837 0-16-7.163-16-16v-136h184c8.837 0 16 7.163 16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M152 56v120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-52h-88v52c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-120c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v52h88v-52c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM225.52 146.63l21-30c1.731-2.44 1.957-5.641 .585-8.3C245.732 105.672 242.992 104.002 240 104h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32.63l-19.18 27.41c-1.712 2.443-1.922 5.636-.545 8.282 1.377 2.646 4.112 4.307 7.095 4.308 9.076 .003 17.012 6.118 19.33 14.893 2.318 8.775-1.564 18.011-9.455 22.495-7.891 4.485-17.812 3.094-24.165-3.388-1.97-2.169-4.969-3.088-7.816-2.394-2.847 .694-5.087 2.889-5.839 5.721-.751 2.832 .106 5.849 2.235 7.863 10.237 10.445 25.775 13.658 39.315 8.131C239.145 207.794 247.996 194.625 248 180c-.017-14.658-8.902-27.847-22.48-33.37Z"),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
