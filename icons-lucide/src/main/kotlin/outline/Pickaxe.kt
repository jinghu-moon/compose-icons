package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) return _pickaxe!!
        _pickaxe = lucideOutlineIcon(
            name = "Pickaxe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 13.000 L 5.619 21.380 C 4.791 22.209 3.447 22.209 2.618 21.381 C 1.790 20.552 1.790 19.209 2.618 18.380 L 11.000 9.999"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 15.973 4.027 C 12.982 2.126 9.344 1.528 5.902 2.373 C 4.504 2.715 4.810 4.531 6.179 4.974 C 8.274 5.653 10.241 6.675 12.001 7.998"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.001 11.999 C 17.324 13.760 18.346 15.728 19.025 17.823 C 19.469 19.192 21.285 19.499 21.628 18.101 C 22.469 14.675 21.881 11.054 20.000 8.069"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 18.352 3.352 C 17.881 2.882 17.119 2.882 16.648 3.352 L 11.352 8.648 C 10.882 9.119 10.882 9.881 11.352 10.352 L 13.648 12.648 C 14.119 13.118 14.881 13.118 15.352 12.648 L 20.648 7.352 C 21.118 6.881 21.118 6.119 20.648 5.648 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
