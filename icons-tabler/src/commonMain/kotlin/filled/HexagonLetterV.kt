package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterV: ImageVector
    get() {
        if (_hexagonLetterV != null) return _hexagonLetterV!!
        _hexagonLetterV = tablerFilledIcon(
            name = "HexagonLetterV",
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
                    PathNode.MoveTo(14.243f, 7.029f),
                    PathNode.CurveTo(13.985602f, 6.964591f, 13.71316f, 7.005119f, 13.485654f, 7.14166f),
                    PathNode.CurveTo(13.258149f, 7.2782f, 13.094234f, 7.499559f, 13.03f, 7.757f),
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
        return _hexagonLetterV!!
    }

private var _hexagonLetterV: ImageVector? = null
