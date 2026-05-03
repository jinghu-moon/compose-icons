package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterK: ImageVector
    get() {
        if (_hexagonLetterK != null) return _hexagonLetterK!!
        _hexagonLetterK = tablerFilledIcon(
            name = "HexagonLetterK",
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
                    PathNode.MoveTo(14.53f, 7.152f),
                    PathNode.CurveTo(14.305097f, 7.011435f, 14.033566f, 6.96597f, 13.77514f, 7.025606f),
                    PathNode.CurveTo(13.516714f, 7.085243f, 13.292564f, 7.245096f, 13.152f, 7.47f),
                    PathNode.LineTo(11.0f, 10.912f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.CurveTo(10.999933f, 7.493026f, 10.620493f, 7.066316f, 10.117f, 7.007f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(9.447715f, 7.0f, 9.0f, 7.447716f, 9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 16.552284f, 9.447715f, 17.0f, 10.0f, 17.0f),
                    PathNode.CurveTo(10.552285f, 17.0f, 11.0f, 16.552284f, 11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 13.086f),
                    PathNode.LineTo(13.152f, 16.53f),
                    PathNode.CurveTo(13.420845f, 16.960344f, 13.96938f, 17.121122f, 14.428f, 16.904f),
                    PathNode.LineTo(14.53f, 16.848f),
                    PathNode.LineTo(14.625f, 16.78f),
                    PathNode.CurveTo(15.020666f, 16.463f, 15.116494f, 15.900061f, 14.848f, 15.47f),
                    PathNode.LineTo(12.678f, 12.0f),
                    PathNode.LineTo(14.848f, 8.53f),
                    PathNode.CurveTo(14.988565f, 8.305097f, 15.034031f, 8.033566f, 14.974394f, 7.77514f),
                    PathNode.CurveTo(14.914758f, 7.516715f, 14.754904f, 7.292565f, 14.53f, 7.152f)
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
        return _hexagonLetterK!!
    }

private var _hexagonLetterK: ImageVector? = null
