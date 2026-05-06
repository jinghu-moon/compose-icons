package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorDuotoneIcon(
            name = "TextHFive",
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
                pathData = parseSvgPathData("M152 56v120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-52h-88v52c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-120c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v52h88v-52c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM212 144c-3.171-.006-6.332 .377-9.41 1.14L206.78 120h33.22c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40c-3.909 0-7.245 2.825-7.89 6.68l-8 48c-.574 3.444 1.151 6.862 4.263 8.446 3.112 1.583 6.891 .966 9.337-1.526 3.812-3.719 8.966-5.738 14.29-5.6 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-5.324 .138-10.478-1.881-14.29-5.6-1.983-2.12-4.96-3-7.777-2.298-2.817 .702-5.033 2.875-5.79 5.678-.757 2.803 .065 5.796 2.146 7.82 6.808 6.805 16.085 10.558 25.71 10.4 19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36Z"),
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
