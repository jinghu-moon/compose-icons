package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryEco: ImageVector
    get() {
        if (_batteryEco != null) return _batteryEco!!
        _batteryEco = tablerOutlineIcon(
            name = "BatteryEco",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 9.0f),
                    PathNode.CurveTo(4.0f, 7.895431f, 4.895431f, 7.0f, 6.0f, 7.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.CurveTo(18.10457f, 7.0f, 19.0f, 7.895431f, 19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.5f),
                    PathNode.CurveTo(19.0f, 9.776142f, 19.223858f, 10.0f, 19.5f, 10.0f),
                    PathNode.CurveTo(19.776142f, 10.0f, 20.0f, 10.223858f, 20.0f, 10.5f),
                    PathNode.LineTo(20.0f, 13.5f),
                    PathNode.CurveTo(20.0f, 13.776142f, 19.776142f, 14.0f, 19.5f, 14.0f),
                    PathNode.CurveTo(19.223858f, 14.0f, 19.0f, 14.223858f, 19.0f, 14.5f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(19.0f, 16.10457f, 18.10457f, 17.0f, 17.0f, 17.0f),
                    PathNode.LineTo(11.5f, 17.0f)
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
                    PathNode.MoveTo(3.0f, 16.143f),
                    PathNode.CurveTo(3.0f, 13.303f, 5.09f, 11.0f, 7.667f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.857f),
                    PathNode.CurveTo(10.0f, 14.697f, 7.91f, 17.0f, 5.333f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 16.143f)
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
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 17.0f)
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
        return _batteryEco!!
    }

private var _batteryEco: ImageVector? = null
