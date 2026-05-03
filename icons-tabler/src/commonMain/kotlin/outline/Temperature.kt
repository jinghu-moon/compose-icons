package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Temperature: ImageVector
    get() {
        if (_temperature != null) return _temperature!!
        _temperature = tablerOutlineIcon(
            name = "Temperature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 13.5f),
                    PathNode.CurveTo(8.432128f, 14.405211f, 7.667725f, 16.250645f, 8.136297f, 17.999378f),
                    PathNode.CurveTo(8.604869f, 19.748112f, 10.189577f, 20.964102f, 12.0f, 20.964102f),
                    PathNode.CurveTo(13.810423f, 20.964102f, 15.395131f, 19.748112f, 15.863704f, 17.999378f),
                    PathNode.CurveTo(16.332275f, 16.250645f, 15.567872f, 14.405211f, 14.0f, 13.5f),
                    PathNode.LineTo(14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 3.895431f, 13.104569f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.895431f, 3.0f, 10.0f, 3.895431f, 10.0f, 5.0f),
                    PathNode.LineTo(10.0f, 13.5f)
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
                    PathNode.LineTo(14.0f, 9.0f)
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
        return _temperature!!
    }

private var _temperature: ImageVector? = null
