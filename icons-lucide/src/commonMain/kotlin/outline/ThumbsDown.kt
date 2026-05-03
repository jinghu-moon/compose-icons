package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = lucideOutlineIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 18.12f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.LineTo(4.17f, 14.0f),
                    PathNode.CurveTo(3.540486f, 14.0f, 2.947709f, 13.703611f, 2.57f, 13.2f),
                    PathNode.CurveTo(2.192291f, 12.696388f, 2.073736f, 12.044334f, 2.25f, 11.44f),
                    PathNode.LineTo(4.58f, 3.44f),
                    PathNode.CurveTo(4.828889f, 2.586667f, 5.611111f, 2.0f, 6.5f, 2.0f),
                    PathNode.LineTo(20.0f, 2.0f),
                    PathNode.CurveTo(21.10457f, 2.0f, 22.0f, 2.895431f, 22.0f, 4.0f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 13.104569f, 21.10457f, 14.0f, 20.0f, 14.0f),
                    PathNode.LineTo(17.24f, 14.0f),
                    PathNode.CurveTo(16.481056f, 14.000402f, 15.78773f, 14.430343f, 15.45f, 15.11f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.CurveTo(11.044645f, 21.98817f, 10.147012f, 21.540642f, 9.562595f, 20.784798f),
                    PathNode.CurveTo(8.97818f, 20.028954f, 8.77099f, 19.047573f, 9.0f, 18.12f),
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
                    PathNode.MoveTo(17.0f, 14.0f),
                    PathNode.LineTo(17.0f, 2.0f)
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
