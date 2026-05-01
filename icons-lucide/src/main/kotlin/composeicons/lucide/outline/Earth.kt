package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Earth: ImageVector
    get() {
        if (_earth != null) return _earth!!
        _earth = lucideOutlineIcon(
            name = "Earth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.54f, 15.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.CurveTo(15.895431f, 15.0f, 15.0f, 15.895431f, 15.0f, 17.0f),
                    PathNode.LineTo(15.0f, 21.54f)
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
                    PathNode.MoveTo(7.0f, 3.34f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 6.656854f, 8.343146f, 8.0f, 10.0f, 8.0f),
                    PathNode.CurveTo(11.104569f, 8.0f, 12.0f, 8.895431f, 12.0f, 10.0f),
                    PathNode.CurveTo(12.0f, 11.1f, 12.9f, 12.0f, 14.0f, 12.0f),
                    PathNode.CurveTo(15.104569f, 12.0f, 16.0f, 11.104569f, 16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 8.9f, 16.9f, 8.0f, 18.0f, 8.0f),
                    PathNode.LineTo(21.17f, 8.0f)
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
                    PathNode.MoveTo(11.0f, 21.95f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 16.89543f, 10.104569f, 16.0f, 9.0f, 16.0f),
                    PathNode.CurveTo(7.895431f, 16.0f, 7.0f, 15.104569f, 7.0f, 14.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(7.0f, 11.895431f, 6.10457f, 11.0f, 5.0f, 11.0f),
                    PathNode.LineTo(2.05f, 11.0f)
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
        }
        return _earth!!
    }

private var _earth: ImageVector? = null
