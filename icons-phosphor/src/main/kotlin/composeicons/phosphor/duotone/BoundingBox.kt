package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) return _boundingBox!!
        _boundingBox = phosphorDuotoneIcon(
            name = "BoundingBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v32c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM80 40h-32c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8ZM208 168h-32c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8ZM80 168h-32c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M208 96c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-32c-8.837 0-16 7.163-16 16v8h-64v-8C96 39.163 88.837 32 80 32h-32C39.163 32 32 39.163 32 48v32c0 8.837 7.163 16 16 16h8v64h-8c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-8h64v8c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-8v-64ZM176 48h32v32h-32ZM48 48h32v15.9c-.013 .066-.013 .134 0 .2v15.9h-32ZM80 208h-32v-32h32v15.9c-.013 .066-.013 .134 0 .2v15.9ZM208 208h-32v-32h32ZM184 160h-8c-8.837 0-16 7.163-16 16v8h-64v-8c0-8.837-7.163-16-16-16h-8v-64h8c8.837 0 16-7.163 16-16v-8h64v8c0 8.837 7.163 16 16 16h8Z"),
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
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
