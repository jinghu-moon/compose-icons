package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = lucideOutlineIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(2.895431f, 16.0f, 2.0f, 15.104569f, 2.0f, 14.0f),
                    PathNode.CurveTo(2.0f, 12.895431f, 2.895431f, 12.0f, 4.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f),
                    PathNode.CurveTo(21.10457f, 12.0f, 22.0f, 12.895431f, 22.0f, 14.0f),
                    PathNode.CurveTo(22.0f, 15.104569f, 21.10457f, 16.0f, 20.0f, 16.0f),
                    PathNode.LineTo(15.75f, 16.0f)
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.CurveTo(3.895431f, 12.0f, 3.0f, 11.104569f, 3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 6.134007f, 7.029437f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(16.970562f, 3.0f, 21.0f, 6.134007f, 21.0f, 10.0f),
                    PathNode.CurveTo(21.0f, 11.104569f, 20.10457f, 12.0f, 19.0f, 12.0f)
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
                    PathNode.MoveTo(5.0f, 16.0f),
                    PathNode.CurveTo(3.895431f, 16.0f, 3.0f, 16.89543f, 3.0f, 18.0f),
                    PathNode.CurveTo(3.0f, 19.656855f, 4.343146f, 21.0f, 6.0f, 21.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.CurveTo(19.656855f, 21.0f, 21.0f, 19.656855f, 21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 16.89543f, 20.10457f, 16.0f, 19.0f, 16.0f),
                    PathNode.QuadTo(19.0f, 16.0f, 19.0f, 16.0f)
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
                    PathNode.MoveTo(6.67f, 12.0f),
                    PathNode.LineTo(12.8f, 16.6f),
                    PathNode.CurveTo(13.683656f, 17.262741f, 14.937259f, 17.083656f, 15.6f, 16.2f),
                    PathNode.LineTo(18.75f, 12.0f)
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
