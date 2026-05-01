package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterC: ImageVector
    get() {
        if (_hexagonLetterC != null) return _hexagonLetterC!!
        _hexagonLetterC = tablerFilledIcon(
            name = "HexagonLetterC",
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(10.343145f, 7.0f, 9.0f, 8.343146f, 9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 15.656855f, 10.343145f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(13.656855f, 17.0f, 15.0f, 15.656855f, 15.0f, 14.0f),
                    PathNode.CurveTo(14.999413f, 13.470906f, 14.586789f, 13.033835f, 14.058605f, 13.002828f),
                    PathNode.CurveTo(13.530421f, 12.971821f, 13.06949f, 13.35761f, 13.007f, 13.883f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.CurveTo(13.0f, 14.552285f, 12.552285f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(11.447715f, 15.0f, 11.0f, 14.552285f, 11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.CurveTo(11.000587f, 9.470906f, 11.413211f, 9.033835f, 11.941395f, 9.002828f),
                    PathNode.CurveTo(12.469579f, 8.971821f, 12.93051f, 9.35761f, 12.993f, 9.883f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 10.552285f, 13.447715f, 11.0f, 14.0f, 11.0f),
                    PathNode.CurveTo(14.552285f, 11.0f, 15.0f, 10.552285f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 8.343146f, 13.656855f, 7.0f, 12.0f, 7.0f)
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
        return _hexagonLetterC!!
    }

private var _hexagonLetterC: ImageVector? = null
