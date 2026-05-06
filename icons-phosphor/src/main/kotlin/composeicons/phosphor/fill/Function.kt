package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorFillIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM176 72h-16.08c-7.685-.007-14.289 5.451-15.73 13l-6.55 35h30.36c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-33.36l-7.11 37.9C124.691 189.033 111.477 199.999 96.08 200h-16.08c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16.08c7.685 .007 14.289-5.451 15.73-13l6.55-35h-30.36c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h33.36l7.11-37.9C131.309 66.967 144.523 56.001 159.92 56h16.08c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
