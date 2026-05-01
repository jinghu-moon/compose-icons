package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MedicalCrossOff: ImageVector
    get() {
        if (_medicalCrossOff != null) return _medicalCrossOff!!
        _medicalCrossOff = tablerOutlineIcon(
            name = "MedicalCrossOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.928f, 17.733f),
                    PathNode.LineTo(17.354f, 17.402f),
                    PathNode.LineTo(14.0f, 15.464f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.CurveTo(14.0f, 20.552284f, 13.552285f, 21.0f, 13.0f, 21.0f),
                    PathNode.LineTo(11.0f, 21.0f),
                    PathNode.CurveTo(10.447715f, 21.0f, 10.0f, 20.552284f, 10.0f, 20.0f),
                    PathNode.LineTo(10.0f, 15.464f),
                    PathNode.LineTo(6.072f, 17.732f),
                    PathNode.CurveTo(5.59372f, 18.00813f, 4.982151f, 17.844269f, 4.706f, 17.366f),
                    PathNode.LineTo(3.706f, 15.634f),
                    PathNode.CurveTo(3.429871f, 15.15572f, 3.593732f, 14.54415f, 4.072f, 14.268f),
                    PathNode.LineTo(7.999f, 12.0f),
                    PathNode.LineTo(4.072f, 9.732f),
                    PathNode.CurveTo(3.593732f, 9.45585f, 3.429871f, 8.84428f, 3.706f, 8.366f),
                    PathNode.LineTo(4.706f, 6.634f),
                    PathNode.CurveTo(4.982151f, 6.155732f, 5.59372f, 5.991871f, 6.072f, 6.268f),
                    PathNode.LineTo(6.405f, 6.46f),
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(10.0f, 3.447715f, 10.447715f, 3.0f, 11.0f, 3.0f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.CurveTo(13.552285f, 3.0f, 14.0f, 3.447715f, 14.0f, 4.0f),
                    PathNode.LineTo(14.0f, 8.535f),
                    PathNode.LineTo(17.928f, 6.268f),
                    PathNode.CurveTo(18.40628f, 5.991871f, 19.017847f, 6.155732f, 19.294f, 6.634f),
                    PathNode.LineTo(20.294f, 8.366f),
                    PathNode.CurveTo(20.57013f, 8.84428f, 20.40627f, 9.45585f, 19.928f, 9.732f),
                    PathNode.LineTo(16.001f, 12.0f),
                    PathNode.LineTo(19.928f, 14.269f),
                    PathNode.CurveTo(20.40627f, 14.545151f, 20.57013f, 15.15672f, 20.294f, 15.635f),
                    PathNode.LineTo(20.054f, 16.051f)
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
        return _medicalCrossOff!!
    }

private var _medicalCrossOff: ImageVector? = null
