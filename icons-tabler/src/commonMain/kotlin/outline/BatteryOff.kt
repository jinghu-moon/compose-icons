package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryOff: ImageVector
    get() {
        if (_batteryOff != null) return _batteryOff!!
        _batteryOff = tablerOutlineIcon(
            name = "BatteryOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.CurveTo(18.10457f, 7.0f, 19.0f, 7.895431f, 19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.5f),
                    PathNode.CurveTo(19.0f, 9.776142f, 19.223858f, 10.0f, 19.5f, 10.0f),
                    PathNode.CurveTo(19.776142f, 10.0f, 20.0f, 10.223858f, 20.0f, 10.5f),
                    PathNode.LineTo(20.0f, 13.5f),
                    PathNode.CurveTo(20.0f, 13.776142f, 19.776142f, 14.0f, 19.5f, 14.0f),
                    PathNode.CurveTo(19.223858f, 14.0f, 19.0f, 14.223858f, 19.0f, 14.5f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.CurveTo(4.895431f, 17.0f, 4.0f, 16.10457f, 4.0f, 15.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.CurveTo(4.0f, 7.895431f, 4.895431f, 7.0f, 6.0f, 7.0f),
                    PathNode.LineTo(7.0f, 7.0f)
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
        return _batteryOff!!
    }

private var _batteryOff: ImageVector? = null
