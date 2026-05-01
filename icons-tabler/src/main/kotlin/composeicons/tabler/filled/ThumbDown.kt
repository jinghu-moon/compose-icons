package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) return _thumbDown!!
        _thumbDown = tablerFilledIcon(
            name = "ThumbDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 21.008f),
                    PathNode.CurveTo(14.588194f, 21.00812f, 15.901297f, 19.770428f, 15.995f, 18.185f),
                    PathNode.LineTo(16.0f, 18.008f),
                    PathNode.LineTo(16.0f, 14.008f),
                    PathNode.LineTo(18.0f, 14.008f),
                    PathNode.CurveTo(19.521645f, 14.008246f, 20.802473f, 12.869254f, 20.98f, 11.358f),
                    PathNode.LineTo(20.995f, 11.185f),
                    PathNode.LineTo(21.0f, 11.008f),
                    PathNode.LineTo(20.98f, 10.812f),
                    PathNode.LineTo(19.974f, 5.78f),
                    PathNode.CurveTo(19.593f, 4.155f, 18.472f, 2.984f, 17.164f, 3.0f),
                    PathNode.LineTo(17.0f, 3.008f),
                    PathNode.LineTo(9.0f, 3.008f),
                    PathNode.CurveTo(8.492685f, 3.008127f, 8.065849f, 3.388111f, 8.007f, 3.892f),
                    PathNode.LineTo(8.0f, 4.008f),
                    PathNode.LineTo(8.001001f, 13.544f),
                    PathNode.CurveTo(8.001009f, 13.901257f, 8.191607f, 14.231372f, 8.501f, 14.41f),
                    PathNode.CurveTo(9.366708f, 14.909955f, 9.926253f, 15.808528f, 9.993f, 16.806f),
                    PathNode.LineTo(10.0f, 17.008f),
                    PathNode.LineTo(10.0f, 18.008f),
                    PathNode.CurveTo(10.0f, 19.664854f, 11.343145f, 21.008f, 13.0f, 21.008f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 14.008f),
                    PathNode.CurveTo(5.506975f, 14.007933f, 5.933684f, 13.628493f, 5.993f, 13.125f),
                    PathNode.LineTo(6.0f, 13.008f),
                    PathNode.LineTo(6.0f, 4.008f),
                    PathNode.CurveTo(5.999933f, 3.501025f, 5.620493f, 3.074316f, 5.117f, 3.015f),
                    PathNode.LineTo(5.0f, 3.008f),
                    PathNode.LineTo(4.0f, 3.008f),
                    PathNode.CurveTo(2.952661f, 3.007747f, 2.082503f, 3.815533f, 2.005f, 4.86f),
                    PathNode.LineTo(2.0f, 5.01f),
                    PathNode.LineTo(2.0f, 12.01f),
                    PathNode.CurveTo(2.000192f, 13.05624f, 2.806707f, 13.925532f, 3.85f, 14.004f),
                    PathNode.LineTo(4.0f, 14.009f),
                    PathNode.LineTo(5.0f, 14.009f),
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
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
