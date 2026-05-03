package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BalloonOff: ImageVector
    get() {
        if (_balloonOff != null) return _balloonOff!!
        _balloonOff = tablerOutlineIcon(
            name = "BalloonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 8.0f),
                    PathNode.CurveTo(14.0f, 6.895431f, 13.104569f, 6.0f, 12.0f, 6.0f)
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
                    PathNode.MoveTo(7.762f, 3.753f),
                    PathNode.CurveTo(9.478982f, 2.039768f, 12.058592f, 1.528819f, 14.299003f, 2.458202f),
                    PathNode.CurveTo(16.539413f, 3.387585f, 17.999887f, 5.574471f, 18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 9.847f, 17.63f, 11.564f, 16.993f, 12.993f),
                    PathNode.MoveTo(15.403f, 15.413f),
                    PathNode.CurveTo(14.436f, 16.413f, 13.263f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(8.686f, 17.0f, 6.0f, 12.97f, 6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 7.407f, 6.086f, 6.834f, 6.246f, 6.293f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.CurveTo(12.0f, 19.10457f, 11.104569f, 20.0f, 10.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(5.895431f, 20.0f, 5.0f, 20.89543f, 5.0f, 22.0f)
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
        return _balloonOff!!
    }

private var _balloonOff: ImageVector? = null
