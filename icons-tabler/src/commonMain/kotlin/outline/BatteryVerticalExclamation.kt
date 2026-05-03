package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVerticalExclamation: ImageVector
    get() {
        if (_batteryVerticalExclamation != null) return _batteryVerticalExclamation!!
        _batteryVerticalExclamation = tablerOutlineIcon(
            name = "BatteryVerticalExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 12.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.CurveTo(17.0f, 5.895f, 16.105f, 5.0f, 15.0f, 5.0f),
                    PathNode.LineTo(14.5f, 5.0f),
                    PathNode.CurveTo(14.224f, 5.0f, 14.0f, 4.776f, 14.0f, 4.5f),
                    PathNode.CurveTo(14.0f, 4.224f, 13.776f, 4.0f, 13.5f, 4.0f),
                    PathNode.LineTo(10.5f, 4.0f),
                    PathNode.CurveTo(10.224f, 4.0f, 10.0f, 4.224f, 10.0f, 4.5f),
                    PathNode.CurveTo(10.0f, 4.776f, 9.776f, 5.0f, 9.5f, 5.0f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.CurveTo(7.895f, 5.0f, 7.0f, 5.895f, 7.0f, 7.0f),
                    PathNode.LineTo(7.0f, 18.0f),
                    PathNode.CurveTo(7.0f, 19.105f, 7.895f, 20.0f, 9.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 19.0f)
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
                    PathNode.MoveTo(19.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.01f)
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
        return _batteryVerticalExclamation!!
    }

private var _batteryVerticalExclamation: ImageVector? = null
