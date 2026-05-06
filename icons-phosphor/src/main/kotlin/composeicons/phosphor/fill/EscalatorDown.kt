package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorFillIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170.34 85.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L192 84.69v-36.69c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v36.69L218.34 74.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-24 24c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346ZM224 144h-36.5L93.88 42.57C92.365 40.93 90.233 39.999 88 40h-56C23.163 40 16 47.163 16 56v40c0 8.837 7.163 16 16 16h36.5l93.62 101.43c1.515 1.64 3.647 2.571 5.88 2.57h56c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16Z"),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
