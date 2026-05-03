package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceSim2: ImageVector
    get() {
        if (_deviceSim2 != null) return _deviceSim2!!
        _deviceSim2 = tablerOutlineIcon(
            name = "DeviceSim2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 3.0f),
                    PathNode.LineTo(14.5f, 3.0f),
                    PathNode.LineTo(19.0f, 7.5f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(19.0f, 20.552284f, 18.552284f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(5.447716f, 21.0f, 5.0f, 20.552284f, 5.0f, 20.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(5.0f, 3.447715f, 5.447716f, 3.0f, 6.0f, 3.0f)
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
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.552285f, 9.0f, 14.0f, 9.447715f, 14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 12.552285f, 13.552285f, 13.0f, 13.0f, 13.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(10.447715f, 13.0f, 10.0f, 13.447715f, 10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 16.552284f, 10.447715f, 17.0f, 11.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f)
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
        return _deviceSim2!!
    }

private var _deviceSim2: ImageVector? = null
