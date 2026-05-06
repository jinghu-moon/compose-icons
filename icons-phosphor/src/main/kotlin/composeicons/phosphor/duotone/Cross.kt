package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorDuotoneIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88v32c0 4.418-3.582 8-8 8h-48v96c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8v-96h-48c-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8h48v-48c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8v48h48c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M200 72h-40v-40c0-8.837-7.163-16-16-16h-32c-8.837 0-16 7.163-16 16v40h-40C47.163 72 40 79.163 40 88v32c0 8.837 7.163 16 16 16h40v88c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-88h40c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16ZM200 120h-48c-4.418 0-8 3.582-8 8v96h-32v-96c0-4.418-3.582-8-8-8h-48v-32h48c4.418 0 8-3.582 8-8v-48h32v48c0 4.418 3.582 8 8 8h48Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
