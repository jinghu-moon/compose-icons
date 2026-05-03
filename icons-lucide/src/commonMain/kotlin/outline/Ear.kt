package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = lucideOutlineIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 8.5f),
                    PathNode.CurveTo(6.0f, 4.910149f, 8.91015f, 2.0f, 12.5f, 2.0f),
                    PathNode.CurveTo(16.089851f, 2.0f, 19.0f, 4.910149f, 19.0f, 8.5f),
                    PathNode.CurveTo(19.0f, 14.5f, 13.0f, 14.5f, 13.0f, 18.5f),
                    PathNode.CurveTo(13.0f, 20.432997f, 11.432997f, 22.0f, 9.5f, 22.0f),
                    PathNode.CurveTo(7.567004f, 22.0f, 6.0f, 20.432997f, 6.0f, 18.5f)
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
                    PathNode.MoveTo(15.0f, 8.5f),
                    PathNode.CurveTo(15.0f, 7.119288f, 13.880712f, 6.0f, 12.5f, 6.0f),
                    PathNode.CurveTo(11.119288f, 6.0f, 10.0f, 7.119288f, 10.0f, 8.5f),
                    PathNode.LineTo(10.0f, 9.5f),
                    PathNode.CurveTo(11.104569f, 9.5f, 12.0f, 10.395431f, 12.0f, 11.5f),
                    PathNode.CurveTo(12.0f, 12.604569f, 11.104569f, 13.5f, 10.0f, 13.5f)
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
        return _ear!!
    }

private var _ear: ImageVector? = null
