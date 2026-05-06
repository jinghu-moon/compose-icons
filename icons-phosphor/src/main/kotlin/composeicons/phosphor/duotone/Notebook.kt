package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = phosphorDuotoneIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 40v176h-32c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8Z"),
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
                pathData = parseSvgPathData("M184 112c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM176 136h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM48 208h24v-160h-24ZM208 208v-160h-120v160h120Z"),
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
        return _notebook!!
    }

private var _notebook: ImageVector? = null
