package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ScanHeart: ImageVector
    get() {
        if (_scanHeart != null) return _scanHeart!!
        _scanHeart = lucideOutlineIcon(
            name = "ScanHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 7.0f)
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
                    PathNode.MoveTo(21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(7.0f, 3.0f)
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
                    PathNode.MoveTo(7.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 17.0f)
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
                    PathNode.MoveTo(7.828f, 13.07f),
                    PathNode.CurveTo(6.713961f, 11.904678f, 6.720108f, 10.067243f, 7.841919f, 8.9094f),
                    PathNode.CurveTo(8.96373f, 7.751558f, 10.800053f, 7.687345f, 12.0f, 8.764f),
                    PathNode.CurveTo(13.199947f, 7.687345f, 15.03627f, 7.751558f, 16.158081f, 8.9094f),
                    PathNode.CurveTo(17.279892f, 10.067243f, 17.28604f, 11.904678f, 16.172f, 13.07f),
                    PathNode.LineTo(12.725f, 16.69f),
                    PathNode.CurveTo(12.536236f, 16.88841f, 12.27436f, 17.000725f, 12.0005f, 17.000725f),
                    PathNode.CurveTo(11.726641f, 17.000725f, 11.464765f, 16.88841f, 11.276f, 16.69f),
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
        return _scanHeart!!
    }

private var _scanHeart: ImageVector? = null
