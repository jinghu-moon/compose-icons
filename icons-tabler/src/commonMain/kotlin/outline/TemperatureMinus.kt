package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemperatureMinus: ImageVector
    get() {
        if (_temperatureMinus != null) return _temperatureMinus!!
        _temperatureMinus = tablerOutlineIcon(
            name = "TemperatureMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 13.5f),
                    PathNode.CurveTo(6.432128f, 14.405211f, 5.667725f, 16.250645f, 6.136297f, 17.999378f),
                    PathNode.CurveTo(6.604869f, 19.748112f, 8.189577f, 20.964102f, 10.0f, 20.964102f),
                    PathNode.CurveTo(11.810423f, 20.964102f, 13.395131f, 19.748112f, 13.863704f, 17.999378f),
                    PathNode.CurveTo(14.332275f, 16.250645f, 13.567872f, 14.405211f, 12.0f, 13.5f),
                    PathNode.LineTo(12.0f, 5.0f),
                    PathNode.CurveTo(12.0f, 3.895431f, 11.104569f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(8.895431f, 3.0f, 8.0f, 3.895431f, 8.0f, 5.0f),
                    PathNode.LineTo(8.0f, 13.5f)
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
                    PathNode.MoveTo(8.0f, 9.0f),
                    PathNode.LineTo(12.0f, 9.0f)
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
                    PathNode.MoveTo(16.0f, 9.0f),
                    PathNode.LineTo(22.0f, 9.0f)
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
        return _temperatureMinus!!
    }

private var _temperatureMinus: ImageVector? = null
