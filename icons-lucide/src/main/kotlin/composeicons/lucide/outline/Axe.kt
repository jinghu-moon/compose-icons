package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = lucideOutlineIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(5.619f, 20.38f),
                    PathNode.CurveTo(4.790573f, 21.208704f, 3.447204f, 21.208927f, 2.6185f, 20.3805f),
                    PathNode.CurveTo(1.789797f, 19.552073f, 1.789573f, 18.208704f, 2.618f, 17.38f),
                    PathNode.LineTo(11.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 15.5f),
                    PathNode.CurveTo(15.0f, 15.776142f, 15.223858f, 16.0f, 15.5f, 16.0f),
                    PathNode.CurveTo(19.089851f, 16.0f, 22.0f, 13.08985f, 22.0f, 9.5f),
                    PathNode.CurveTo(22.0f, 9.223858f, 21.776142f, 9.0f, 21.5f, 9.0f),
                    PathNode.LineTo(19.828f, 9.0f),
                    PathNode.CurveTo(19.297611f, 8.999887f, 18.788986f, 8.789099f, 18.414f, 8.414f),
                    PathNode.LineTo(13.352f, 3.352f),
                    PathNode.CurveTo(12.881433f, 2.881503f, 12.118567f, 2.881503f, 11.648f, 3.352f),
                    PathNode.LineTo(9.352f, 5.648f),
                    PathNode.CurveTo(8.881503f, 6.118567f, 8.881503f, 6.881433f, 9.352f, 7.352f),
                    PathNode.LineTo(14.414f, 12.414f),
                    PathNode.CurveTo(14.789099f, 12.788985f, 14.999887f, 13.29761f, 15.0f, 13.828f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _axe!!
    }

private var _axe: ImageVector? = null
