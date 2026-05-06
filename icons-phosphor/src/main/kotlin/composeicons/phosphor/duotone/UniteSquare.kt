package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UniteSquare: ImageVector
    get() {
        if (_uniteSquare != null) return _uniteSquare!!
        _uniteSquare = phosphorDuotoneIcon(
            name = "UniteSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 96v120h-120v-56h-56v-120h120v56Z"),
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
                pathData = parseSvgPathData("M216 88h-48v-48c0-4.418-3.582-8-8-8h-120c-4.418 0-8 3.582-8 8v120c0 4.418 3.582 8 8 8h48v48c0 4.418 3.582 8 8 8h120c4.418 0 8-3.582 8-8v-120c0-4.418-3.582-8-8-8ZM208 208h-104v-48c0-4.418-3.582-8-8-8h-48v-104h104v48c0 4.418 3.582 8 8 8h48Z"),
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
        return _uniteSquare!!
    }

private var _uniteSquare: ImageVector? = null
