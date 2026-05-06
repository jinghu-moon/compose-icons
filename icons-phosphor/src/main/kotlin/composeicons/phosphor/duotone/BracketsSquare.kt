package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorDuotoneIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40v176h-176v-176Z"),
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
                pathData = parseSvgPathData("M48 48v160h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8v-176c0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM216 32h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v160h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-176c0-4.418-3.582-8-8-8Z"),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
