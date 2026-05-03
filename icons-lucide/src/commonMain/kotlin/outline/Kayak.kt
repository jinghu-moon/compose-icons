package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Kayak: ImageVector
    get() {
        if (_kayak != null) return _kayak!!
        _kayak = lucideOutlineIcon(
            name = "Kayak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 17.0f),
                    PathNode.CurveTo(17.447716f, 17.0f, 17.0f, 17.447716f, 17.0f, 18.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 20.10457f, 17.89543f, 21.0f, 19.0f, 21.0f),
                    PathNode.CurveTo(20.10457f, 21.0f, 21.0f, 20.10457f, 21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 17.89543f, 20.10457f, 17.0f, 19.0f, 17.0f),
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
                    PathNode.MoveTo(20.97f, 3.61f),
                    PathNode.CurveTo(21.032509f, 3.444549f, 20.992304f, 3.257823f, 20.86724f, 3.13276f),
                    PathNode.CurveTo(20.742178f, 3.007697f, 20.55545f, 2.967491f, 20.39f, 3.03f),
                    PathNode.CurveTo(10.2f, 6.6f, 6.6f, 10.2f, 3.03f, 20.39f),
                    PathNode.CurveTo(2.967491f, 20.55545f, 3.007697f, 20.742178f, 3.13276f, 20.86724f),
                    PathNode.CurveTo(3.257823f, 20.992304f, 3.444549f, 21.032509f, 3.61f, 20.97f),
                    PathNode.CurveTo(13.8f, 17.4f, 17.4f, 13.8f, 20.97f, 3.61f)
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
                    PathNode.MoveTo(6.707f, 6.707f),
                    PathNode.LineTo(17.293f, 17.293f)
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
                    PathNode.MoveTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 3.895431f, 6.10457f, 3.0f, 5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 6.10457f, 3.895431f, 7.0f, 5.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(6.552285f, 7.0f, 7.0f, 6.552285f, 7.0f, 6.0f),
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
        }
        return _kayak!!
    }

private var _kayak: ImageVector? = null
