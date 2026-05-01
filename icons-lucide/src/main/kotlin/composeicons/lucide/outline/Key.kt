package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = lucideOutlineIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.5f, 7.5f),
                    PathNode.LineTo(17.8f, 9.8f),
                    PathNode.CurveTo(18.188843f, 10.181143f, 18.811157f, 10.181143f, 19.2f, 9.8f),
                    PathNode.LineTo(21.3f, 7.7f),
                    PathNode.CurveTo(21.681143f, 7.311157f, 21.681143f, 6.688844f, 21.3f, 6.3f),
                    PathNode.LineTo(19.0f, 4.0f)
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
                    PathNode.MoveTo(21.0f, 2.0f),
                    PathNode.LineTo(11.4f, 11.6f)
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
                    PathNode.MoveTo(13.0f, 15.5f),
                    PathNode.CurveTo(13.0f, 18.537565f, 10.537566f, 21.0f, 7.5f, 21.0f),
                    PathNode.CurveTo(4.462434f, 21.0f, 2.0f, 18.537565f, 2.0f, 15.5f),
                    PathNode.CurveTo(2.0f, 12.462434f, 4.462434f, 10.0f, 7.5f, 10.0f),
                    PathNode.CurveTo(10.537566f, 10.0f, 13.0f, 12.462434f, 13.0f, 15.5f),
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
        return _key!!
    }

private var _key: ImageVector? = null
