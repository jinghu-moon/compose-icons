package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SquareSplitVertical: ImageVector
    get() {
        if (_squareSplitVertical != null) return _squareSplitVertical!!
        _squareSplitVertical = phosphorDuotoneIcon(
            name = "SquareSplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 56v144c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8v-144c0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M200 40h-144C47.163 40 40 47.163 40 56v144c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM200 56v64h-144v-64ZM200 200h-144v-64h144v64Z"),
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
        return _squareSplitVertical!!
    }

private var _squareSplitVertical: ImageVector? = null
