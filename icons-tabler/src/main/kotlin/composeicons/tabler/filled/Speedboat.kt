package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Speedboat: ImageVector
    get() {
        if (_speedboat != null) return _speedboat!!
        _speedboat = tablerFilledIcon(
            name = "Speedboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.334278f, 6.99995f, 14.646476f, 7.16693f, 14.832f, 7.445f),
                    PathNode.LineTo(16.534f, 10.0f),
                    PathNode.LineTo(22.0f, 10.0f),
                    PathNode.CurveTo(22.36873f, 9.999822f, 22.707642f, 10.202573f, 22.881845f, 10.527558f),
                    PathNode.CurveTo(23.05605f, 10.852544f, 23.037277f, 11.247025f, 22.833f, 11.554f),
                    PathNode.LineTo(19.733f, 16.214f),
                    PathNode.CurveTo(18.991297f, 17.330038f, 17.740025f, 18.000538f, 16.4f, 18.0f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(1.67211f, 17.999876f, 1.365112f, 17.839018f, 1.17838f, 17.569494f),
                    PathNode.CurveTo(0.991649f, 17.29997f, 0.948911f, 16.956028f, 1.064f, 16.649f),
                    PathNode.LineTo(2.564f, 12.649f),
                    PathNode.CurveTo(2.710281f, 12.25876f, 3.083245f, 12.000156f, 3.5f, 12.0f),
                    PathNode.LineTo(5.256f, 12.0f),
                    PathNode.LineTo(6.156f, 9.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.CurveTo(5.493026f, 8.999933f, 5.066316f, 8.620493f, 5.007f, 8.117f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 7.447716f, 5.447716f, 7.0f, 6.0f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.343f, 12.0f),
                    PathNode.LineTo(9.23f, 12.0f),
                    PathNode.CurveTo(9.613f, 12.0f, 9.992f, 11.926f, 10.35f, 11.781f),
                    PathNode.LineTo(13.907f, 10.363f),
                    PathNode.QuadTo(14.093f, 10.288f, 14.284f, 10.228f),
                    PathNode.LineTo(13.464f, 9.0f),
                    PathNode.LineTo(8.244001f, 9.0f),
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
        return _speedboat!!
    }

private var _speedboat: ImageVector? = null
