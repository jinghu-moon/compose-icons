package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) return _alignBottom!!
        _alignBottom = phosphorDuotoneIcon(
            name = "AlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 80v96c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM104 32h-40c-4.418 0-8 3.582-8 8v136c0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-136c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M64 192h40c8.837 0 16-7.163 16-16v-136c0-8.837-7.163-16-16-16h-40C55.163 24 48 31.163 48 40v136c0 8.837 7.163 16 16 16ZM64 40h40v136h-40ZM224 216c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8ZM152 192h40c8.837 0 16-7.163 16-16v-96c0-8.837-7.163-16-16-16h-40c-8.837 0-16 7.163-16 16v96c0 8.837 7.163 16 16 16ZM152 80h40v96h-40Z"),
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
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
