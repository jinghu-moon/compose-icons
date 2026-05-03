package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WritingSignOff: ImageVector
    get() {
        if (_writingSignOff != null) return _writingSignOff!!
        _writingSignOff = tablerOutlineIcon(
            name = "WritingSignOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 19.0f),
                    PathNode.CurveTo(6.333f, 17.0f, 8.0f, 15.0f, 8.0f, 13.0f),
                    PathNode.CurveTo(8.0f, 10.0f, 7.0f, 10.0f, 6.0f, 10.0f),
                    PathNode.CurveTo(5.0f, 10.0f, 3.968f, 11.085f, 4.0f, 13.0f),
                    PathNode.CurveTo(4.034f, 15.048f, 5.658f, 15.877f, 6.5f, 17.0f),
                    PathNode.CurveTo(8.0f, 19.0f, 9.0f, 19.5f, 10.0f, 18.0f),
                    PathNode.CurveTo(10.667f, 17.0f, 11.167f, 16.167f, 11.5f, 15.5f),
                    PathNode.CurveTo(12.5f, 17.833f, 13.833f, 19.0f, 15.5f, 19.0f),
                    PathNode.LineTo(18.0f, 19.0f)
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
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.LineTo(18.5f, 18.5f),
                    PathNode.MoveTo(20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.CurveTo(20.0f, 3.879f, 19.121f, 3.0f, 18.0f, 3.0f),
                    PathNode.CurveTo(16.879f, 3.0f, 16.0f, 3.879f, 16.0f, 5.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
                    PathNode.MoveTo(16.0f, 7.0f),
                    PathNode.LineTo(20.0f, 7.0f)
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
        return _writingSignOff!!
    }

private var _writingSignOff: ImageVector? = null
