package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = lucideOutlineIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.704f, 14.467f),
                    PathNode.CurveTo(0.85338f, 11.079967f, 1.648678f, 6.519046f, 5.549133f, 3.88542f),
                    PathNode.CurveTo(9.449587f, 1.251794f, 15.203322f, 1.390745f, 18.898102f, 4.207793f),
                    PathNode.CurveTo(22.592882f, 7.02484f, 23.042843f, 11.615834f, 19.942036f, 14.859142f),
                    PathNode.CurveTo(16.841228f, 18.102451f, 11.184875f, 18.957111f, 6.819f, 16.842f)
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
                    PathNode.MoveTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.742659f, 21.056995f, 5.001887f, 19.577675f, 5.0f, 18.006f)
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
                    PathNode.MoveTo(7.0f, 16.0f),
                    PathNode.CurveTo(7.0f, 17.10457f, 6.10457f, 18.0f, 5.0f, 18.0f),
                    PathNode.CurveTo(3.895431f, 18.0f, 3.0f, 17.10457f, 3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 14.895431f, 3.895431f, 14.0f, 5.0f, 14.0f),
                    PathNode.CurveTo(6.10457f, 14.0f, 7.0f, 14.895431f, 7.0f, 16.0f),
                    PathNode.Close
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
