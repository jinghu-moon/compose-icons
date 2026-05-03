package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceNintendoOff: ImageVector
    get() {
        if (_deviceNintendoOff != null) return _deviceNintendoOff!!
        _deviceNintendoOff = tablerOutlineIcon(
            name = "DeviceNintendoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.713f, 4.718f),
                    PathNode.CurveTo(3.639627f, 5.466026f, 2.999906f, 6.691691f, 3.0f, 8.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 18.209139f, 4.790861f, 20.0f, 7.0f, 20.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f)
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
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 4.0f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.CurveTo(19.209139f, 4.0f, 21.0f, 5.790861f, 21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 16.308f, 20.965f, 16.608f, 20.9f, 16.896f),
                    PathNode.MoveTo(19.28f, 19.286f),
                    PathNode.CurveTo(18.610998f, 19.751762f, 17.815166f, 20.000984f, 17.0f, 20.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.LineTo(14.0f, 14.0f)
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
                    PathNode.MoveTo(5.5f, 8.5f),
                    PathNode.CurveTo(5.5f, 9.052285f, 5.947716f, 9.5f, 6.5f, 9.5f),
                    PathNode.CurveTo(7.052285f, 9.5f, 7.5f, 9.052285f, 7.5f, 8.5f),
                    PathNode.CurveTo(7.5f, 7.947716f, 7.052285f, 7.5f, 6.5f, 7.5f),
                    PathNode.CurveTo(5.947716f, 7.5f, 5.5f, 7.947716f, 5.5f, 8.5f)
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
        return _deviceNintendoOff!!
    }

private var _deviceNintendoOff: ImageVector? = null
