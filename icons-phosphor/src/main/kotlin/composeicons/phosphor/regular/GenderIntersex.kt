package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorRegularIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 24h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h20.69L163.54 65.15C143.268 46.258 113.14 42.558 88.899 55.984 64.658 69.41 51.81 96.911 57.07 124.118c5.26 27.207 27.431 47.939 54.93 51.362v16.52h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-16.52c21.797-2.723 40.669-16.447 49.976-36.344 9.307-19.897 7.745-43.18-4.136-61.656L200 51.31v20.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8ZM120 160C93.49 160 72 138.51 72 112 72 85.49 93.49 64 120 64c26.51 0 48 21.49 48 48-.028 26.498-21.502 47.972-48 48Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
