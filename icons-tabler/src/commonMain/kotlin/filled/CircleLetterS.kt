package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterS: ImageVector
    get() {
        if (_circleLetterS != null) return _circleLetterS!!
        _circleLetterS = tablerFilledIcon(
            name = "CircleLetterS",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.CurveTo(9.895431f, 7.0f, 9.0f, 7.895431f, 9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 12.104569f, 9.895431f, 13.0f, 11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.CurveTo(11.0f, 14.447715f, 10.552285f, 14.0f, 10.0f, 14.0f),
                    PathNode.CurveTo(9.447715f, 14.0f, 9.0f, 14.447715f, 9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 16.10457f, 9.895431f, 17.0f, 11.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(14.104569f, 17.0f, 15.0f, 16.10457f, 15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 11.895431f, 14.104569f, 11.0f, 13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(13.007f, 9.117f),
                    PathNode.CurveTo(13.06949f, 9.64239f, 13.530421f, 10.028179f, 14.058605f, 9.997172f),
                    PathNode.CurveTo(14.586789f, 9.966165f, 14.999413f, 9.529094f, 15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 7.895431f, 14.104569f, 7.0f, 13.0f, 7.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _circleLetterS!!
    }

private var _circleLetterS: ImageVector? = null
