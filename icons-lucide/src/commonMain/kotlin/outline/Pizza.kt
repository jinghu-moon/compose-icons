package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = lucideOutlineIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 14.0f),
                    PathNode.LineTo(11.0f, 15.0f)
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
                    PathNode.MoveTo(13.75f, 18.25f),
                    PathNode.LineTo(12.5f, 19.67f)
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
                    PathNode.MoveTo(17.775f, 5.654f),
                    PathNode.CurveTo(11.688584f, 6.932665f, 6.933167f, 11.68769f, 5.654f, 17.774f)
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
                    PathNode.MoveTo(18.8f, 9.3f),
                    PathNode.CurveTo(16.673704f, 9.879899f, 15.420101f, 12.073704f, 16.0f, 14.2f),
                    PathNode.CurveTo(16.579899f, 16.326296f, 18.773705f, 17.579899f, 20.9f, 17.0f)
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
                    PathNode.MoveTo(21.964f, 20.732f),
                    PathNode.CurveTo(22.06103f, 21.079681f, 21.963154f, 21.45267f, 21.707912f, 21.707912f),
                    PathNode.CurveTo(21.45267f, 21.963154f, 21.079681f, 22.06103f, 20.732f, 21.964f),
                    PathNode.LineTo(2.732f, 16.964f),
                    PathNode.CurveTo(2.476432f, 16.89284f, 2.259614f, 16.723042f, 2.129268f, 16.491982f),
                    PathNode.CurveTo(1.998922f, 16.260923f, 1.965731f, 15.987537f, 2.037f, 15.732f),
                    PathNode.CurveTo(3.884391f, 9.08118f, 9.08118f, 3.884391f, 15.732f, 2.037f),
                    PathNode.CurveTo(15.987537f, 1.965731f, 16.260923f, 1.998922f, 16.491982f, 2.129268f),
                    PathNode.CurveTo(16.723042f, 2.259614f, 16.89284f, 2.476432f, 16.964f, 2.732f),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
