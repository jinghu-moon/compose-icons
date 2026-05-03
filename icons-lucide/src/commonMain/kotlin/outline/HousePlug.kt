package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HousePlug: ImageVector
    get() {
        if (_housePlug != null) return _housePlug!!
        _housePlug = lucideOutlineIcon(
            name = "HousePlug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 8.964f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(14.0f, 8.964f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.552285f, 12.0f, 16.0f, 12.447715f, 16.0f, 13.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(16.0f, 16.10457f, 15.104569f, 17.0f, 14.0f, 17.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.CurveTo(8.895431f, 17.0f, 8.0f, 16.10457f, 8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.CurveTo(8.0f, 12.447715f, 8.447715f, 12.0f, 9.0f, 12.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.5f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.CurveTo(2.999859f, 9.411126f, 3.259242f, 8.852118f, 3.709f, 8.472f),
                    PathNode.LineTo(10.709f, 2.472f),
                    PathNode.CurveTo(11.454389f, 1.842027f, 12.545611f, 1.842027f, 13.291f, 2.472f),
                    PathNode.LineTo(20.291f, 8.472f),
                    PathNode.CurveTo(20.740759f, 8.852118f, 21.000141f, 9.411126f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(12.895431f, 21.0f, 12.0f, 20.10457f, 12.0f, 19.0f),
                    PathNode.LineTo(12.0f, 17.0f)
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
        return _housePlug!!
    }

private var _housePlug: ImageVector? = null
