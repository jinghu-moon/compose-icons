package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CreativeCommons: ImageVector
    get() {
        if (_creativeCommons != null) return _creativeCommons!!
        _creativeCommons = lucideOutlineIcon(
            name = "CreativeCommons",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477153f, 6.477153f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(17.522848f, 2.0f, 22.0f, 6.477153f, 22.0f, 12.0f),
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
                    PathNode.MoveTo(10.0f, 9.3f),
                    PathNode.CurveTo(8.746254f, 8.726071f, 7.261294f, 9.150346f, 6.5f, 10.3f),
                    PathNode.CurveTo(5.823062f, 11.33225f, 5.823062f, 12.66775f, 6.5f, 13.7f),
                    PathNode.CurveTo(7.23283f, 14.887873f, 8.750231f, 15.321416f, 10.0f, 14.7f)
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
                    PathNode.MoveTo(17.0f, 9.3f),
                    PathNode.CurveTo(15.746254f, 8.726071f, 14.261293f, 9.150346f, 13.5f, 10.3f),
                    PathNode.CurveTo(12.823062f, 11.33225f, 12.823062f, 12.66775f, 13.5f, 13.7f),
                    PathNode.CurveTo(14.23283f, 14.887873f, 15.750231f, 15.321416f, 17.0f, 14.7f)
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
        return _creativeCommons!!
    }

private var _creativeCommons: ImageVector? = null
