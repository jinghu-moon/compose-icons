package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IceCreamBowl: ImageVector
    get() {
        if (_iceCreamBowl != null) return _iceCreamBowl!!
        _iceCreamBowl = lucideOutlineIcon(
            name = "IceCreamBowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.CurveTo(17.0f, 17.0f, 20.0f, 14.31f, 20.0f, 11.0f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.CurveTo(4.0f, 14.31f, 7.0f, 17.0f, 12.0f, 17.0f),
                    PathNode.MoveTo(8.0f, 21.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.MoveTo(5.14f, 11.0f),
                    PathNode.CurveTo(4.714271f, 9.567357f, 5.245219f, 8.022455f, 6.461711f, 7.154205f),
                    PathNode.CurveTo(7.678203f, 6.285955f, 9.311797f, 6.285955f, 10.52829f, 7.154205f),
                    PathNode.CurveTo(11.744781f, 8.022455f, 12.275729f, 9.567357f, 11.85f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.14f, 11.0f),
                    PathNode.CurveTo(11.714272f, 9.567357f, 12.245218f, 8.022455f, 13.461711f, 7.154205f),
                    PathNode.CurveTo(14.678203f, 6.285955f, 16.311798f, 6.285955f, 17.52829f, 7.154205f),
                    PathNode.CurveTo(18.744781f, 8.022455f, 19.275728f, 9.567357f, 18.85f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.5f, 6.5f),
                    PathNode.CurveTo(15.5f, 4.567004f, 13.932997f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.067003f, 3.0f, 8.5f, 4.567004f, 8.5f, 6.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _iceCreamBowl!!
    }

private var _iceCreamBowl: ImageVector? = null
