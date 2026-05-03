package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TestPipeOff: ImageVector
    get() {
        if (_testPipeOff != null) return _testPipeOff!!
        _testPipeOff = tablerOutlineIcon(
            name = "TestPipeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 8.04f),
                    PathNode.CurveTo(18.662048f, 9.355326f, 17.328707f, 10.675334f, 16.0f, 12.0f),
                    PathNode.MoveTo(14.0f, 14.0f),
                    PathNode.CurveTo(12.915f, 15.085f, 10.875f, 17.14f, 7.878f, 20.164f),
                    PathNode.CurveTo(6.762385f, 21.279892f, 4.953392f, 21.280115f, 3.8375f, 20.1645f),
                    PathNode.CurveTo(2.721609f, 19.048885f, 2.721385f, 17.239891f, 3.837f, 16.124f),
                    PathNode.CurveTo(6.855f, 13.124f, 8.91f, 11.087f, 10.0f, 10.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(12.872f, 7.128f, 14.191f, 5.795f, 15.959f, 4.0f)
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
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f)
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
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(20.5f, 16.6f),
                    PathNode.MoveTo(19.76f, 19.773f),
                    PathNode.CurveTo(19.013935f, 20.080187f, 18.156359f, 19.909004f, 17.585405f, 19.338926f),
                    PathNode.CurveTo(17.014454f, 18.768848f, 16.841957f, 17.911533f, 17.148f, 17.165f)
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
                    PathNode.MoveTo(15.0f, 3.0f),
                    PathNode.LineTo(21.0f, 9.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _testPipeOff!!
    }

private var _testPipeOff: ImageVector? = null
