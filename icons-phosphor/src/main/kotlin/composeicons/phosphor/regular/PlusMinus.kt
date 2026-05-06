package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorRegularIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.66 61.66 61.66 205.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L194.34 50.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32ZM64 112c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-32v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32ZM224 176h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
