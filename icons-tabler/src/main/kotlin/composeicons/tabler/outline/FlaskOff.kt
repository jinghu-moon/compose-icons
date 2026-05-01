package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlaskOff: ImageVector
    get() {
        if (_flaskOff != null) return _flaskOff!!
        _flaskOff = tablerOutlineIcon(
            name = "FlaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f)
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
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(14.0f, 9.0f)
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
                    PathNode.MoveTo(10.0f, 3.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.MoveTo(9.732f, 9.736f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(5.902183f, 20.196783f, 5.902453f, 20.428082f, 6.00073f, 20.624636f),
                    PathNode.CurveTo(6.099007f, 20.82119f, 6.283883f, 20.960184f, 6.5f, 21.0f),
                    PathNode.LineTo(17.5f, 21.0f),
                    PathNode.CurveTo(17.716118f, 20.960184f, 17.900993f, 20.82119f, 17.99927f, 20.624636f),
                    PathNode.CurveTo(18.097548f, 20.428082f, 18.097818f, 20.196783f, 18.0f, 20.0f),
                    PathNode.LineTo(16.857f, 16.858f),
                    PathNode.MoveTo(14.569f, 10.564f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 3.0f)
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
        return _flaskOff!!
    }

private var _flaskOff: ImageVector? = null
