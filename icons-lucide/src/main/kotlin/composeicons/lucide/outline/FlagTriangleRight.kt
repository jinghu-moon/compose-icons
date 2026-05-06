package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlagTriangleRight: ImageVector
    get() {
        if (_flagTriangleRight != null) return _flagTriangleRight!!
        _flagTriangleRight = lucideOutlineIcon(
            name = "FlagTriangleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 22v-19.2c-0-.28 .146-.539 .385-.685 .239-.145 .537-.155 .785-.025L18.55 7.78c.276 .134 .451 .413 .451 .72 0 .307-.175 .586-.451 .72L6 15.5"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _flagTriangleRight!!
    }

private var _flagTriangleRight: ImageVector? = null
