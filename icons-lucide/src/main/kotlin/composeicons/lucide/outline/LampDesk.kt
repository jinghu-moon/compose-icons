package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampDesk: ImageVector
    get() {
        if (_lampDesk != null) return _lampDesk!!
        _lampDesk = lucideOutlineIcon(
            name = "LampDesk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.293f, 2.293f),
                    PathNode.CurveTo(10.6835f, 1.902618f, 11.3165f, 1.902618f, 11.707f, 2.293f),
                    PathNode.LineTo(14.207f, 4.793f),
                    PathNode.LineTo(20.201f, 6.02f),
                    PathNode.CurveTo(20.5615f, 6.093909f, 20.85228f, 6.359844f, 20.958004f, 6.712329f),
                    PathNode.CurveTo(21.063728f, 7.064814f, 20.967314f, 7.446884f, 20.707f, 7.707f),
                    PathNode.LineTo(13.707f, 14.707f),
                    PathNode.CurveTo(13.446884f, 14.967314f, 13.064814f, 15.063728f, 12.712329f, 14.958004f),
                    PathNode.CurveTo(12.359843f, 14.85228f, 12.093908f, 14.561502f, 12.02f, 14.201f),
                    PathNode.LineTo(10.793f, 8.207f),
                    PathNode.LineTo(8.293f, 5.707f),
                    PathNode.CurveTo(7.902618f, 5.3165f, 7.902618f, 4.6835f, 8.293f, 4.293f),
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
                    PathNode.MoveTo(14.207f, 4.793f),
                    PathNode.LineTo(10.793f, 8.207f)
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
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.CurveTo(3.0f, 18.89543f, 3.895431f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(10.104569f, 18.0f, 11.0f, 18.89543f, 11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 21.0f),
                    PathNode.CurveTo(11.0f, 21.552284f, 10.552285f, 22.0f, 10.0f, 22.0f),
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(3.447715f, 22.0f, 3.0f, 21.552284f, 3.0f, 21.0f),
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
                    PathNode.MoveTo(9.086f, 6.5f),
                    PathNode.LineTo(4.293f, 11.293f),
                    PathNode.CurveTo(3.983817f, 11.601785f, 3.910929f, 12.075561f, 4.113f, 12.463f),
                    PathNode.LineTo(7.0f, 18.0f)
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
        return _lampDesk!!
    }

private var _lampDesk: ImageVector? = null
