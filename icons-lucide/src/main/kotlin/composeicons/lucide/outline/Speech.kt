package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Speech: ImageVector
    get() {
        if (_speech != null) return _speech!!
        _speech = lucideOutlineIcon(
            name = "Speech",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.8f, 20.0f),
                    PathNode.LineTo(8.8f, 15.9f),
                    PathNode.LineTo(10.7f, 16.1f),
                    PathNode.CurveTo(11.843594f, 16.03646f, 12.766168f, 15.141171f, 12.864f, 14.0f),
                    PathNode.LineTo(12.864f, 8.3f),
                    PathNode.CurveTo(12.877807f, 5.299989f, 10.45701f, 2.856807f, 7.457f, 2.843f),
                    PathNode.CurveTo(4.45699f, 2.829193f, 2.013807f, 5.24999f, 2.0f, 8.25f),
                    PathNode.CurveTo(2.0f, 11.05f, 2.656f, 11.304f, 3.0f, 12.8f),
                    PathNode.CurveTo(3.232484f, 13.703471f, 3.242435f, 14.64984f, 3.029f, 15.558f),
                    PathNode.LineTo(2.0f, 20.0f)
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
                    PathNode.MoveTo(19.8f, 17.8f),
                    PathNode.CurveTo(22.72736f, 14.872309f, 22.728703f, 10.126348f, 19.803f, 7.197f)
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
                    PathNode.MoveTo(17.0f, 15.0f),
                    PathNode.CurveTo(17.660843f, 14.339292f, 18.030031f, 13.441751f, 18.025335f, 12.507285f),
                    PathNode.CurveTo(18.02064f, 11.572819f, 17.64245f, 10.679033f, 16.975f, 10.025f)
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
        return _speech!!
    }

private var _speech: ImageVector? = null
