package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AirBalloon: ImageVector
    get() {
        if (_airBalloon != null) return _airBalloon!!
        _airBalloon = tablerFilledIcon(
            name = "AirBalloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 18.0f),
                    PathNode.CurveTo(14.104569f, 18.0f, 15.0f, 18.89543f, 15.0f, 20.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(15.0f, 22.10457f, 14.104569f, 23.0f, 13.0f, 23.0f),
                    PathNode.LineTo(11.0f, 23.0f),
                    PathNode.CurveTo(9.895431f, 23.0f, 9.0f, 22.10457f, 9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.CurveTo(9.0f, 18.89543f, 9.895431f, 18.0f, 11.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(15.865993f, 1.0f, 19.0f, 4.134007f, 19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 12.185f, 15.703f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(8.297f, 17.0f, 5.0f, 12.185f, 5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 4.134007f, 8.134007f, 1.0f, 12.0f, 1.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _airBalloon!!
    }

private var _airBalloon: ImageVector? = null
