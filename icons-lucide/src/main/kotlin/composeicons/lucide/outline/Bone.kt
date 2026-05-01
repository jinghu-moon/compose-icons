package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = lucideOutlineIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.7f, 9.3f, 18.69f, 10.0f, 19.5f, 10.0f),
                    PathNode.CurveTo(20.880713f, 10.0f, 22.0f, 8.880712f, 22.0f, 7.5f),
                    PathNode.CurveTo(22.0f, 6.119288f, 20.880713f, 5.0f, 19.5f, 5.0f),
                    PathNode.CurveTo(19.223858f, 5.0f, 19.0f, 4.776143f, 19.0f, 4.5f),
                    PathNode.CurveTo(19.0f, 3.119288f, 17.880713f, 2.0f, 16.5f, 2.0f),
                    PathNode.CurveTo(15.119288f, 2.0f, 14.0f, 3.119288f, 14.0f, 4.5f),
                    PathNode.CurveTo(14.0f, 5.31f, 14.7f, 6.3f, 14.0f, 7.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.CurveTo(6.3f, 14.7f, 5.31f, 14.0f, 4.5f, 14.0f),
                    PathNode.CurveTo(3.119288f, 14.0f, 2.0f, 15.119288f, 2.0f, 16.5f),
                    PathNode.CurveTo(2.0f, 17.880713f, 3.119288f, 19.0f, 4.5f, 19.0f),
                    PathNode.CurveTo(4.78f, 19.0f, 5.0f, 19.22f, 5.0f, 19.5f),
                    PathNode.CurveTo(5.0f, 20.880713f, 6.119288f, 22.0f, 7.5f, 22.0f),
                    PathNode.CurveTo(8.880712f, 22.0f, 10.0f, 20.880713f, 10.0f, 19.5f),
                    PathNode.CurveTo(10.0f, 18.69f, 9.3f, 17.7f, 10.0f, 17.0f),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
