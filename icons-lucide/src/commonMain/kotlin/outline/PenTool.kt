package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PenTool: ImageVector
    get() {
        if (_penTool != null) return _penTool!!
        _penTool = lucideOutlineIcon(
            name = "PenTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.707f, 21.293f),
                    PathNode.CurveTo(15.3165f, 21.683382f, 14.6835f, 21.683382f, 14.293f, 21.293f),
                    PathNode.LineTo(12.707f, 19.707f),
                    PathNode.CurveTo(12.316618f, 19.3165f, 12.316618f, 18.6835f, 12.707f, 18.293f),
                    PathNode.LineTo(18.293f, 12.707f),
                    PathNode.CurveTo(18.6835f, 12.316618f, 19.3165f, 12.316618f, 19.707f, 12.707f),
                    PathNode.LineTo(21.293f, 14.293f),
                    PathNode.CurveTo(21.683382f, 14.6835f, 21.683382f, 15.3165f, 21.293f, 15.707f),
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
                    PathNode.MoveTo(18.0f, 13.0f),
                    PathNode.LineTo(16.625f, 6.126f),
                    PathNode.CurveTo(16.548637f, 5.744146f, 16.25755f, 5.441351f, 15.879f, 5.35f),
                    PathNode.LineTo(3.235f, 2.028f),
                    PathNode.CurveTo(2.89626f, 1.9461f, 2.539314f, 2.04646f, 2.292887f, 2.292887f),
                    PathNode.CurveTo(2.04646f, 2.539314f, 1.9461f, 2.89626f, 2.028f, 3.235f),
                    PathNode.LineTo(5.35f, 15.879f),
                    PathNode.CurveTo(5.441351f, 16.25755f, 5.744146f, 16.548637f, 6.126f, 16.625f),
                    PathNode.LineTo(13.0f, 18.0f)
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
                    PathNode.MoveTo(2.3f, 2.3f),
                    PathNode.LineTo(9.586f, 9.586f)
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
                    PathNode.MoveTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 12.104569f, 12.104569f, 13.0f, 11.0f, 13.0f),
                    PathNode.CurveTo(9.895431f, 13.0f, 9.0f, 12.104569f, 9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 9.895431f, 9.895431f, 9.0f, 11.0f, 9.0f),
                    PathNode.CurveTo(12.104569f, 9.0f, 13.0f, 9.895431f, 13.0f, 11.0f),
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
        return _penTool!!
    }

private var _penTool: ImageVector? = null
