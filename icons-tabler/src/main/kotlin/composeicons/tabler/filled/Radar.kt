package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Radar: ImageVector
    get() {
        if (_radar != null) return _radar!!
        _radar = tablerFilledIcon(
            name = "Radar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(12.677534f, 9.999838f, 13.309083f, 10.34271f, 13.678f, 10.911f),
                    PathNode.LineTo(13.731f, 11.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.LineTo(21.117f, 11.007f),
                    PathNode.CurveTo(21.620493f, 11.066316f, 21.999933f, 11.493025f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(11.447715f, 22.0f, 11.0f, 21.552284f, 11.0f, 21.0f),
                    PathNode.LineTo(11.0f, 13.731f),
                    PathNode.LineTo(10.911f, 13.678f),
                    PathNode.CurveTo(10.386696f, 13.33788f, 10.051521f, 12.772227f, 10.005f, 12.149f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 10.895431f, 10.895431f, 10.0f, 12.0f, 10.0f),
                    PathNode.MoveTo(21.428f, 8.666f),
                    PathNode.CurveTo(21.59148f, 9.180126f, 21.317675f, 9.731248f, 20.809198f, 9.911535f),
                    PathNode.CurveTo(20.300722f, 10.091823f, 19.7409f, 9.836276f, 19.544f, 9.334f),
                    PathNode.CurveTo(18.298155f, 5.823949f, 14.794802f, 3.638043f, 11.094406f, 4.061903f),
                    PathNode.CurveTo(7.39401f, 4.485764f, 4.47568f, 7.40724f, 4.055805f, 11.108089f),
                    PathNode.CurveTo(3.635931f, 14.80894f, 5.825609f, 18.309937f, 9.337f, 19.552f),
                    PathNode.CurveTo(9.857804f, 19.73591f, 10.130911f, 20.307196f, 9.947f, 20.828f),
                    PathNode.CurveTo(9.763089f, 21.348804f, 9.191805f, 21.62191f, 8.671f, 21.438f),
                    PathNode.CurveTo(4.280965f, 19.886293f, 1.542794f, 15.51001f, 2.067178f, 10.883431f),
                    PathNode.CurveTo(2.591561f, 6.256853f, 6.23972f, 2.604405f, 10.865679f, 2.074585f),
                    PathNode.CurveTo(15.491637f, 1.544765f, 19.871136f, 4.277791f, 21.428f, 8.666f),
                    PathNode.MoveTo(16.8f, 8.4f),
                    PathNode.CurveTo(17.13137f, 8.841827f, 17.041828f, 9.468629f, 16.6f, 9.8f),
                    PathNode.CurveTo(16.158173f, 10.131371f, 15.531371f, 10.041828f, 15.2f, 9.6f),
                    PathNode.CurveTo(14.260918f, 8.347891f, 12.677831f, 7.758515f, 11.148562f, 8.091668f),
                    PathNode.CurveTo(9.619295f, 8.424823f, 8.424823f, 9.619295f, 8.091668f, 11.148562f),
                    PathNode.CurveTo(7.758515f, 12.677831f, 8.347891f, 14.260918f, 9.6f, 15.2f),
                    PathNode.CurveTo(10.041828f, 15.531371f, 10.131371f, 16.158173f, 9.8f, 16.6f),
                    PathNode.CurveTo(9.468629f, 17.041828f, 8.841827f, 17.13137f, 8.4f, 16.8f),
                    PathNode.CurveTo(6.521837f, 15.391377f, 5.637772f, 13.016747f, 6.137503f, 10.722844f),
                    PathNode.CurveTo(6.637234f, 8.428943f, 8.428943f, 6.637234f, 10.722844f, 6.137503f),
                    PathNode.CurveTo(13.016747f, 5.637772f, 15.391377f, 6.521837f, 16.8f, 8.4f)
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
        return _radar!!
    }

private var _radar: ImageVector? = null
