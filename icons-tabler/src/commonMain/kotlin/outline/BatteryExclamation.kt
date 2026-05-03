package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryExclamation: ImageVector
    get() {
        if (_batteryExclamation != null) return _batteryExclamation!!
        _batteryExclamation = tablerOutlineIcon(
            name = "BatteryExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.CurveTo(18.105f, 17.0f, 19.0f, 16.105f, 19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 14.5f),
                    PathNode.CurveTo(19.0f, 14.224f, 19.224f, 14.0f, 19.5f, 14.0f),
                    PathNode.CurveTo(19.776f, 14.0f, 20.0f, 13.776f, 20.0f, 13.5f),
                    PathNode.LineTo(20.0f, 10.5f),
                    PathNode.CurveTo(20.0f, 10.224f, 19.776f, 10.0f, 19.5f, 10.0f),
                    PathNode.CurveTo(19.224f, 10.0f, 19.0f, 9.776f, 19.0f, 9.5f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.CurveTo(19.0f, 7.895f, 18.105f, 7.0f, 17.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(4.895f, 7.0f, 4.0f, 7.895f, 4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 12.0f)
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
                    PathNode.MoveTo(5.0f, 16.0f),
                    PathNode.LineTo(5.0f, 19.0f)
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
                    PathNode.MoveTo(5.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.01f)
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
        return _batteryExclamation!!
    }

private var _batteryExclamation: ImageVector? = null
