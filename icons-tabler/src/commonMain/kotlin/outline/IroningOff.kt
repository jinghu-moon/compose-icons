package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IroningOff: ImageVector
    get() {
        if (_ironingOff != null) return _ironingOff!!
        _ironingOff = tablerOutlineIcon(
            name = "IroningOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(16.459f, 6.0f),
                    PathNode.CurveTo(17.925512f, 6.000105f, 19.177004f, 7.060426f, 19.418f, 8.507f),
                    PathNode.LineTo(19.995f, 11.971f),
                    PathNode.LineTo(20.799f, 16.792f),
                    PathNode.LineTo(20.806f, 16.836f),
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.CurveTo(3.0f, 14.134007f, 6.134007f, 11.0f, 10.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(19.8f, 11.0f)
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
        return _ironingOff!!
    }

private var _ironingOff: ImageVector? = null
