package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Stone: ImageVector
    get() {
        if (_stone != null) return _stone!!
        _stone = lucideOutlineIcon(
            name = "Stone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.264f, 2.205f),
                    PathNode.CurveTo(9.375107f, 1.574743f, 7.310273f, 2.429834f, 6.42f, 4.211f),
                    PathNode.LineTo(2.42f, 12.211f),
                    PathNode.CurveTo(1.51789f, 14.01533f, 2.100507f, 16.20904f, 3.779f, 17.328f),
                    PathNode.LineTo(9.779f, 21.328f),
                    PathNode.CurveTo(11.122689f, 22.22391f, 12.873311f, 22.22391f, 14.217f, 21.328f),
                    PathNode.LineTo(20.217f, 17.328f),
                    PathNode.CurveTo(21.71738f, 16.327585f, 22.362835f, 14.446924f, 21.793f, 12.736f),
                    PathNode.LineTo(19.793f, 6.736f),
                    PathNode.CurveTo(19.39487f, 5.541472f, 18.457527f, 4.60413f, 17.263f, 4.206f),
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
                    PathNode.MoveTo(11.99f, 22.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.LineTo(21.822f, 15.184f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(8.47f, 2.302f)
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
        return _stone!!
    }

private var _stone: ImageVector? = null
