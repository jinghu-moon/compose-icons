package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterW: ImageVector
    get() {
        if (_hexagonLetterW != null) return _hexagonLetterW!!
        _hexagonLetterW = tablerFilledIcon(
            name = "HexagonLetterW",
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
                    PathNode.MoveTo(14.008f, 7.876f),
                    PathNode.LineTo(13.488f, 12.029f),
                    PathNode.LineTo(12.928f, 10.629f),
                    PathNode.CurveTo(12.609f, 9.83f, 11.518f, 9.792f, 11.125f, 10.515f),
                    PathNode.LineTo(11.072f, 10.629f),
                    PathNode.LineTo(10.511f, 12.029f),
                    PathNode.LineTo(9.992f, 7.876f),
                    PathNode.CurveTo(9.929111f, 7.372624f, 9.499274f, 6.996087f, 8.992f, 7.0f),
                    PathNode.LineTo(8.876f, 7.008f),
                    PathNode.CurveTo(8.328217f, 7.076629f, 7.939678f, 7.576178f, 8.008001f, 8.124f),
                    PathNode.LineTo(9.008f, 16.124f),
                    PathNode.CurveTo(9.136f, 17.149f, 10.545f, 17.331f, 10.928f, 16.371f),
                    PathNode.LineTo(12.0f, 13.693f),
                    PathNode.LineTo(13.072f, 16.371f),
                    PathNode.CurveTo(13.455f, 17.331f, 14.864f, 17.149f, 14.992f, 16.124f),
                    PathNode.LineTo(15.992f, 8.124f),
                    PathNode.CurveTo(16.046589f, 7.583686f, 15.659971f, 7.098563f, 15.121099f, 7.031204f),
                    PathNode.CurveTo(14.582229f, 6.963845f, 14.088092f, 7.338874f, 14.008f, 7.876f)
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
        return _hexagonLetterW!!
    }

private var _hexagonLetterW: ImageVector? = null
