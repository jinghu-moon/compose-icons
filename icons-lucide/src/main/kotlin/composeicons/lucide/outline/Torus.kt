package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Torus: ImageVector
    get() {
        if (_torus != null) return _torus!!
        _torus = lucideOutlineIcon(
            name = "Torus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 12.104569f, 13.656855f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(10.343145f, 13.0f, 9.0f, 12.104569f, 9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 9.895431f, 10.343145f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(13.656855f, 9.0f, 15.0f, 9.895431f, 15.0f, 11.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.5f),
                    PathNode.CurveTo(22.0f, 17.19442f, 17.522848f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(6.477153f, 21.0f, 2.0f, 17.19442f, 2.0f, 12.5f),
                    PathNode.CurveTo(2.0f, 7.80558f, 6.477153f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(17.522848f, 4.0f, 22.0f, 7.80558f, 22.0f, 12.5f),
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
        return _torus!!
    }

private var _torus: ImageVector? = null
