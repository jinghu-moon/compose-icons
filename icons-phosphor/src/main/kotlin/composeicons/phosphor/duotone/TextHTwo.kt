package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorDuotoneIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 72v136h-184c-8.837 0-16-7.163-16-16v-136h184c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M248 208c0 4.418-3.582 8-8 8h-48c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378l43.16-57.56c3.575-4.554 4.411-10.683 2.186-16.028-2.225-5.345-7.163-9.071-12.913-9.743-5.75-.672-11.415 1.814-14.813 6.501-.985 1.308-1.767 2.758-2.32 4.3-.917 2.742-3.243 4.776-6.083 5.319-2.84 .543-5.752-.488-7.617-2.697-1.865-2.21-2.393-5.253-1.38-7.962 4.208-11.879 14.996-20.181 27.557-21.208 12.56-1.026 24.553 5.414 30.634 16.452 6.081 11.038 5.118 24.617-2.461 34.685L208 200h32c4.418 0 8 3.582 8 8ZM144 48c-4.418 0-8 3.582-8 8v52h-88v-52c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v120c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-52h88v52c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-120c0-4.418-3.582-8-8-8Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
