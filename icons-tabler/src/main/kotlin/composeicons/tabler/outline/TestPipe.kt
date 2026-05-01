package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TestPipe: ImageVector
    get() {
        if (_testPipe != null) return _testPipe!!
        _testPipe = tablerOutlineIcon(
            name = "TestPipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 8.04f),
                    PathNode.LineTo(7.878f, 20.164f),
                    PathNode.CurveTo(6.762385f, 21.279892f, 4.953392f, 21.280115f, 3.8375f, 20.1645f),
                    PathNode.CurveTo(2.721609f, 19.048885f, 2.721385f, 17.239891f, 3.837f, 16.124f),
                    PathNode.LineTo(15.959f, 4.0f)
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
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.LineTo(15.0f, 13.0f)
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
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(20.5f, 16.6f),
                    PathNode.CurveTo(21.209114f, 17.40406f, 21.15811f, 18.624243f, 20.384365f, 19.366318f),
                    PathNode.CurveTo(19.610624f, 20.108395f, 18.389376f, 20.108395f, 17.615635f, 19.366318f),
                    PathNode.CurveTo(16.84189f, 18.624243f, 16.790886f, 17.40406f, 17.5f, 16.6f),
                    PathNode.LineTo(19.0f, 15.0f)
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
                    PathNode.MoveTo(15.0f, 3.0f),
                    PathNode.LineTo(21.0f, 9.0f)
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
        return _testPipe!!
    }

private var _testPipe: ImageVector? = null
