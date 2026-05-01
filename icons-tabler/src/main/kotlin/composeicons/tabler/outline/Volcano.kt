package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volcano: ImageVector
    get() {
        if (_volcano != null) return _volcano!!
        _volcano = tablerOutlineIcon(
            name = "Volcano",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.CurveTo(9.0f, 5.895431f, 8.10457f, 5.0f, 7.0f, 5.0f),
                    PathNode.CurveTo(5.895431f, 5.0f, 5.0f, 5.895431f, 5.0f, 7.0f)
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.CurveTo(15.0f, 5.895431f, 15.895431f, 5.0f, 17.0f, 5.0f),
                    PathNode.CurveTo(18.10457f, 5.0f, 19.0f, 5.895431f, 19.0f, 7.0f)
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
                    PathNode.MoveTo(4.0f, 20.0f),
                    PathNode.LineTo(7.472f, 12.188f),
                    PathNode.CurveTo(7.792976f, 11.46551f, 8.50942f, 10.9999f, 9.3f, 11.0f),
                    PathNode.LineTo(14.7f, 11.0f),
                    PathNode.CurveTo(15.49058f, 10.9999f, 16.207026f, 11.46551f, 16.528f, 12.188f),
                    PathNode.LineTo(20.0f, 20.0f)
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
                    PathNode.MoveTo(6.192f, 15.064f),
                    PathNode.CurveTo(6.347438f, 15.024947f, 6.50677f, 15.003479f, 6.667f, 15.0f),
                    PathNode.CurveTo(7.194f, 14.991f, 7.693f, 15.178f, 8.0f, 15.5f),
                    PathNode.CurveTo(8.307f, 15.82f, 8.806f, 16.007f, 9.333f, 16.0f),
                    PathNode.CurveTo(9.86f, 16.007f, 10.359f, 15.82f, 10.667f, 15.5f),
                    PathNode.CurveTo(10.974f, 15.178f, 11.473f, 14.991f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.527f, 14.991f, 13.026f, 15.178f, 13.333f, 15.5f),
                    PathNode.CurveTo(13.641f, 15.82f, 14.14f, 16.007f, 14.667f, 16.0f),
                    PathNode.CurveTo(15.194f, 16.007f, 15.693f, 15.82f, 16.0f, 15.5f),
                    PathNode.CurveTo(16.307f, 15.178f, 16.806f, 14.991f, 17.333f, 15.0f),
                    PathNode.CurveTo(17.494f, 15.003f, 17.653f, 15.025f, 17.805f, 15.064f)
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
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 4.0f)
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
        return _volcano!!
    }

private var _volcano: ImageVector? = null
