package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RepeatOff: ImageVector
    get() {
        if (_repeatOff != null) return _repeatOff!!
        _repeatOff = tablerOutlineIcon(
            name = "RepeatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.CurveTo(4.0f, 7.664f, 4.873f, 6.532f, 6.08f, 6.144f),
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.MoveTo(17.0f, 3.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.LineTo(17.0f, 9.0f)
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
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(20.000265f, 15.300325f, 19.95543f, 15.598989f, 19.867f, 15.886f),
                    PathNode.MoveTo(17.877f, 17.87f),
                    PathNode.CurveTo(17.592718f, 17.95653f, 17.29716f, 18.000341f, 17.0f, 18.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.MoveTo(7.0f, 21.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.LineTo(7.0f, 15.0f)
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
        return _repeatOff!!
    }

private var _repeatOff: ImageVector? = null
