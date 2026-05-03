package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterN: ImageVector
    get() {
        if (_squareLetterN != null) return _squareLetterN!!
        _squareLetterN = tablerFilledIcon(
            name = "SquareLetterN",
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
                    PathNode.MoveTo(10.894f, 7.553f),
                    PathNode.CurveTo(10.423f, 6.609f, 9.0f, 6.945f, 9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 16.552284f, 9.447715f, 17.0f, 10.0f, 17.0f),
                    PathNode.LineTo(10.117f, 16.993f),
                    PathNode.CurveTo(10.620493f, 16.933683f, 10.999933f, 16.506975f, 11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 12.236f),
                    PathNode.LineTo(13.106f, 16.447f),
                    PathNode.CurveTo(13.577f, 17.391f, 15.0f, 17.055f, 15.0f, 16.0f),
                    PathNode.LineTo(15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 7.447716f, 14.552285f, 7.0f, 14.0f, 7.0f),
                    PathNode.LineTo(13.883f, 7.007f),
                    PathNode.CurveTo(13.379507f, 7.066316f, 13.000067f, 7.493026f, 13.0f, 8.0f),
                    PathNode.LineTo(13.0f, 11.764f),
                    PathNode.Close
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
        return _squareLetterN!!
    }

private var _squareLetterN: ImageVector? = null
