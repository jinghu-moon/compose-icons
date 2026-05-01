package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterY: ImageVector
    get() {
        if (_hexagonLetterY != null) return _hexagonLetterY!!
        _hexagonLetterY = tablerFilledIcon(
            name = "HexagonLetterY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.666f, 1.429f),
                    PathNode.LineTo(20.416f, 5.409f),
                    PathNode.LineTo(20.512f, 5.472f),
                    PathNode.LineTo(20.605f, 5.55f),
                    PathNode.LineTo(20.711f, 5.624f),
                    PathNode.CurveTo(21.470114f, 6.192674f, 21.939894f, 7.067106f, 21.995f, 8.014f),
                    PathNode.LineTo(22.0f, 8.218001f),
                    PathNode.LineTo(22.0f, 15.502f),
                    PathNode.CurveTo(22.0f, 16.677f, 21.357f, 17.758f, 20.377f, 18.295f),
                    PathNode.LineTo(13.573f, 22.597f),
                    PathNode.CurveTo(12.593f, 23.135f, 11.407f, 23.135f, 10.373f, 22.565f),
                    PathNode.LineTo(3.678f, 18.328f),
                    PathNode.CurveTo(2.645394f, 17.76225f, 2.002444f, 16.67943f, 2.0f, 15.502f),
                    PathNode.LineTo(2.0f, 8.217f),
                    PathNode.CurveTo(2.0f, 7.111f, 2.57f, 6.089f, 3.476f, 5.512f),
                    PathNode.LineTo(10.426f, 1.414f),
                    PathNode.CurveTo(11.426f, 0.862f, 12.64f, 0.862f, 13.666f, 1.429f),
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
        return _hexagonLetterY!!
    }

private var _hexagonLetterY: ImageVector? = null
