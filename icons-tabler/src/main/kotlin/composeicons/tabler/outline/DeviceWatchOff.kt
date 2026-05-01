package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceWatchOff: ImageVector
    get() {
        if (_deviceWatchOff != null) return _deviceWatchOff!!
        _deviceWatchOff = tablerOutlineIcon(
            name = "DeviceWatchOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.CurveTo(16.656855f, 6.0f, 18.0f, 7.343146f, 18.0f, 9.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.MoveTo(17.11f, 17.132f),
                    PathNode.CurveTo(16.549044f, 17.688852f, 15.790416f, 18.000933f, 15.0f, 18.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(7.343146f, 18.0f, 6.0f, 16.656855f, 6.0f, 15.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.CurveTo(6.0f, 8.183f, 6.327f, 7.441f, 6.857f, 6.9f)
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.LineTo(15.0f, 18.0f)
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
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.LineTo(15.0f, 6.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _deviceWatchOff!!
    }

private var _deviceWatchOff: ImageVector? = null
