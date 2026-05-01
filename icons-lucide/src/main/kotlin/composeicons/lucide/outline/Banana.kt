package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Banana: ImageVector
    get() {
        if (_banana != null) return _banana!!
        _banana = lucideOutlineIcon(
            name = "Banana",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 13.0f),
                    PathNode.CurveTo(7.5f, 11.0f, 12.0f, 11.0f, 14.0f, 15.0f),
                    PathNode.CurveTo(15.721143f, 14.121268f, 17.777185f, 14.210296f, 19.415932f, 15.23451f),
                    PathNode.CurveTo(21.054676f, 16.258726f, 22.035664f, 18.067842f, 22.0f, 20.0f)
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
                    PathNode.MoveTo(5.15f, 17.89f),
                    PathNode.CurveTo(10.67f, 16.37f, 13.8f, 11.0f, 12.15f, 5.89f),
                    PathNode.CurveTo(11.55f, 4.0f, 11.5f, 2.0f, 13.0f, 2.0f),
                    PathNode.CurveTo(16.22f, 2.0f, 18.0f, 7.5f, 18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 16.5f, 13.8f, 22.0f, 7.51f, 22.0f),
                    PathNode.CurveTo(5.11f, 22.0f, 2.0f, 22.0f, 2.0f, 20.0f),
                    PathNode.CurveTo(2.0f, 18.5f, 3.14f, 18.45f, 5.15f, 17.89f),
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
        return _banana!!
    }

private var _banana: ImageVector? = null
