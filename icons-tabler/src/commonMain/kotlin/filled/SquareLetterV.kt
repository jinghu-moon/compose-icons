package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterV: ImageVector
    get() {
        if (_squareLetterV != null) return _squareLetterV!!
        _squareLetterV = tablerFilledIcon(
            name = "SquareLetterV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _squareLetterV!!
    }

private var _squareLetterV: ImageVector? = null
