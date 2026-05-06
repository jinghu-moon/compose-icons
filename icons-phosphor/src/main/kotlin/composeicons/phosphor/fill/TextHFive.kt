package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorFillIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM128 160c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-40v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h40v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM168 120c14.263 .002 26.802 9.443 30.747 23.15 3.945 13.706-1.658 28.369-13.737 35.952-12.079 7.584-27.719 6.257-38.35-3.252-3.208-2.965-3.445-7.956-.531-11.211 2.914-3.255 7.9-3.571 11.201-.709 6.432 5.673 16.194 5.265 22.131-.925 5.937-6.19 5.937-15.96 0-22.15-5.937-6.19-15.698-6.598-22.131-.925-2.577 2.312-6.348 2.705-9.346 .973-2.998-1.732-4.541-5.196-3.824-8.583l8-38c.793-3.694 4.062-6.329 7.84-6.32h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-25.51L163 120.37c1.655-.246 3.327-.37 5-.37Z"),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
