package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterV: ImageVector
    get() {
        if (_circleLetterV != null) return _circleLetterV!!
        _circleLetterV = tablerFilledIcon(
            name = "CircleLetterV",
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
                    PathNode.MoveTo(14.243f, 7.03f),
                    PathNode.CurveTo(13.707286f, 6.89581f, 13.164217f, 7.221293f, 13.03f, 7.757f),
                    PathNode.LineTo(12.0f, 11.875f),
                    PathNode.LineTo(10.97f, 7.757f),
                    PathNode.CurveTo(10.885258f, 7.408179f, 10.620051f, 7.131541f, 10.275116f, 7.03216f),
                    PathNode.CurveTo(9.93018f, 6.93278f, 9.558439f, 7.025906f, 9.301094f, 7.276168f),
                    PathNode.CurveTo(9.043749f, 7.526429f, 8.940285f, 7.895425f, 9.03f, 8.243f),
                    PathNode.LineTo(11.03f, 16.243f),
                    PathNode.CurveTo(11.282f, 17.253f, 12.718f, 17.253f, 12.97f, 16.243f),
                    PathNode.LineTo(14.97f, 8.243f),
                    PathNode.CurveTo(15.10419f, 7.707286f, 14.778708f, 7.164218f, 14.243f, 7.03f)
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
        return _circleLetterV!!
    }

private var _circleLetterV: ImageVector? = null
