package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterY: ImageVector
    get() {
        if (_squareLetterY != null) return _squareLetterY!!
        _squareLetterY = tablerFilledIcon(
            name = "SquareLetterY",
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
                    PathNode.MoveTo(14.371f, 7.072f),
                    PathNode.CurveTo(14.124748f, 6.973455f, 13.849433f, 6.976778f, 13.605632f, 7.081238f),
                    PathNode.CurveTo(13.36183f, 7.185697f, 13.169515f, 7.382736f, 13.071f, 7.629f),
                    PathNode.LineTo(12.0f, 10.307f),
                    PathNode.LineTo(10.928f, 7.629f),
                    PathNode.CurveTo(10.710898f, 7.13572f, 10.141939f, 6.903218f, 9.641506f, 7.103284f),
                    PathNode.CurveTo(9.141073f, 7.303349f, 8.889206f, 7.864003f, 9.072f, 8.371001f),
                    PathNode.LineTo(11.0f, 13.194f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.CurveTo(11.000067f, 16.506975f, 11.379507f, 16.933683f, 11.883f, 16.993f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.CurveTo(12.552285f, 17.0f, 13.0f, 16.552284f, 13.0f, 16.0f),
                    PathNode.LineTo(13.0f, 13.191f),
                    PathNode.LineTo(14.928f, 8.371001f),
                    PathNode.CurveTo(15.116445f, 7.900502f, 14.923097f, 7.363423f, 14.478f, 7.121f),
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
        }
        return _squareLetterY!!
    }

private var _squareLetterY: ImageVector? = null
