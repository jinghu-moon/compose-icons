package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorThinIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 216c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM80 172c1.061 .001 2.079-.42 2.83-1.17L188 65.66v86.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-96c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h86.34L77.17 165.17c-1.145 1.144-1.488 2.866-.868 4.361 .62 1.496 2.08 2.47 3.698 2.469Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
