package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorDuotoneIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40v128h-48v-80h-80v-48Z"),
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
                pathData = parseSvgPathData("M216 32h-128c-4.418 0-8 3.582-8 8v40h-40c-4.418 0-8 3.582-8 8v128c0 4.418 3.582 8 8 8h128c4.418 0 8-3.582 8-8v-40h40c4.418 0 8-3.582 8-8v-128c0-4.418-3.582-8-8-8ZM160 208h-112v-112h112ZM208 160h-32v-72c0-4.418-3.582-8-8-8h-72v-32h112Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
