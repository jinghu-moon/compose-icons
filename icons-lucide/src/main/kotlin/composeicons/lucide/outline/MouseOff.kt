package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MouseOff: ImageVector
    get() {
        if (_mouseOff != null) return _mouseOff!!
        _mouseOff = lucideOutlineIcon(
            name = "MouseOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(12.0f, 6.343f)
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
                    PathNode.MoveTo(18.218f, 18.218f),
                    PathNode.CurveTo(16.734818f, 21.086529f, 13.481812f, 22.56818f, 10.344172f, 21.804302f),
                    PathNode.CurveTo(7.206534f, 21.040426f, 4.998634f, 18.229286f, 5.0f, 15.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.CurveTo(4.999527f, 7.880226f, 5.267698f, 6.776679f, 5.782f, 5.782f)
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
                    PathNode.MoveTo(19.0f, 13.343f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.CurveTo(19.00056f, 6.511197f, 17.679611f, 4.209254f, 15.530553f, 2.95399f),
                    PathNode.CurveTo(13.381494f, 1.698725f, 10.727543f, 1.678931f, 8.56f, 2.902f)
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
                    PathNode.MoveTo(22.0f, 22.0f),
                    PathNode.LineTo(2.0f, 2.0f)
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
        return _mouseOff!!
    }

private var _mouseOff: ImageVector? = null
