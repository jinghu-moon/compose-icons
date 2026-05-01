package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVertical: ImageVector
    get() {
        if (_batteryVertical != null) return _batteryVertical!!
        _batteryVertical = tablerOutlineIcon(
            name = "BatteryVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 18.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.CurveTo(7.0f, 5.895431f, 7.895431f, 5.0f, 9.0f, 5.0f),
                    PathNode.LineTo(9.5f, 5.0f),
                    PathNode.CurveTo(9.776142f, 5.0f, 10.0f, 4.776143f, 10.0f, 4.5f),
                    PathNode.CurveTo(10.0f, 4.223858f, 10.223858f, 4.0f, 10.5f, 4.0f),
                    PathNode.LineTo(13.5f, 4.0f),
                    PathNode.CurveTo(13.776142f, 4.0f, 14.0f, 4.223858f, 14.0f, 4.5f),
                    PathNode.CurveTo(14.0f, 4.776143f, 14.223858f, 5.0f, 14.5f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(16.10457f, 5.0f, 17.0f, 5.895431f, 17.0f, 7.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.CurveTo(17.0f, 19.10457f, 16.10457f, 20.0f, 15.0f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.CurveTo(7.895431f, 20.0f, 7.0f, 19.10457f, 7.0f, 18.0f)
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
        return _batteryVertical!!
    }

private var _batteryVertical: ImageVector? = null
