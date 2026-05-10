package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorFillIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM128 160c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-40v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h40v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM168 184c-7.874 .001-15.472-2.9-21.34-8.15-3.292-2.949-3.569-8.008-.62-11.3 2.949-3.292 8.008-3.569 11.3-.62 5.317 4.752 13.137 5.411 19.175 1.617 6.038-3.794 8.836-11.126 6.862-17.978C181.402 140.717 175.131 135.999 168 136c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378L176 104h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c3.03 0 5.8 1.712 7.155 4.422 1.355 2.71 1.063 5.954-.755 8.378l-16.71 22.28c13.526 6.407 20.805 21.333 17.523 35.936C195.932 173.619 182.967 183.996 168 184Z"),
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
