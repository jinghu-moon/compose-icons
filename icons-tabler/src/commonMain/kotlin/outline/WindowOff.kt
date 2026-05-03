package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WindowOff: ImageVector
    get() {
        if (_windowOff != null) return _windowOff!!
        _windowOff = tablerOutlineIcon(
            name = "WindowOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.166f, 6.19f),
                    PathNode.CurveTo(5.411291f, 7.317786f, 5.005728f, 8.642999f, 5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(5.0f, 20.552284f, 5.447716f, 21.0f, 6.0f, 21.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.CurveTo(18.552284f, 21.0f, 19.0f, 20.552284f, 19.0f, 20.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(19.0f, 6.272f, 15.866f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.645483f, 3.001982f, 9.321868f, 3.404912f, 8.196f, 4.158f)
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
                    PathNode.MoveTo(5.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.MoveTo(17.0f, 13.0f),
                    PathNode.LineTo(19.0f, 13.0f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
        }
        return _windowOff!!
    }

private var _windowOff: ImageVector? = null
