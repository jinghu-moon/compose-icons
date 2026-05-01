package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Photo: ImageVector
    get() {
        if (_photo != null) return _photo!!
        _photo = tablerFilledIcon(
            name = "Photo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.813f, 11.612f),
                    PathNode.CurveTo(9.27f, 11.232f, 9.731f, 11.232f, 10.199f, 11.623f),
                    PathNode.LineTo(10.307f, 11.721f),
                    PathNode.LineTo(15.293f, 16.707f),
                    PathNode.LineTo(15.387f, 16.79f),
                    PathNode.CurveTo(15.785102f, 17.098577f, 16.350574f, 17.0629f, 16.706738f, 16.706738f),
                    PathNode.CurveTo(17.0629f, 16.350574f, 17.098577f, 15.785102f, 16.79f, 15.387f),
                    PathNode.LineTo(16.707f, 15.293f),
                    PathNode.LineTo(15.415f, 14.0f),
                    PathNode.LineTo(15.707f, 13.707f),
                    PathNode.LineTo(15.813f, 13.612f),
                    PathNode.CurveTo(16.27f, 13.232f, 16.731f, 13.232f, 17.199f, 13.623f),
                    PathNode.LineTo(17.307f, 13.721f),
                    PathNode.LineTo(21.981f, 18.396f),
                    PathNode.CurveTo(21.785353f, 20.363905f, 20.180996f, 21.893461f, 18.206f, 21.995f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(3.9447f, 21.999872f, 2.223989f, 20.442152f, 2.02f, 18.397f),
                    PathNode.LineTo(8.707f, 11.707f),
                    PathNode.LineTo(8.813f, 11.612f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(20.131401f, 1.999998f, 21.88843f, 3.671265f, 21.995f, 5.8f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.LineTo(22.0f, 15.585f),
                    PathNode.LineTo(18.707f, 12.293f),
                    PathNode.LineTo(18.557f, 12.156f),
                    PathNode.CurveTo(17.301f, 11.061f, 15.707f, 11.059f, 14.461f, 12.139f),
                    PathNode.LineTo(14.307f, 12.279f),
                    PathNode.LineTo(14.0f, 12.585f),
                    PathNode.LineTo(11.707f, 10.293f),
                    PathNode.LineTo(11.557f, 10.156f),
                    PathNode.CurveTo(10.301f, 9.061f, 8.707f, 9.059f, 7.461f, 10.139f),
                    PathNode.LineTo(7.307f, 10.279f),
                    PathNode.LineTo(2.0f, 15.585f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(1.999998f, 3.868599f, 3.671265f, 2.11157f, 5.8f, 2.005f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.LineTo(18.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.01f, 7.0f),
                    PathNode.LineTo(14.883f, 7.007f),
                    PathNode.CurveTo(14.37995f, 7.066837f, 14.001114f, 7.493403f, 14.001114f, 8.0f),
                    PathNode.CurveTo(14.001114f, 8.506598f, 14.37995f, 8.933164f, 14.883f, 8.993f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(15.127f, 8.993f),
                    PathNode.CurveTo(15.630051f, 8.933164f, 16.008886f, 8.506598f, 16.008886f, 8.0f),
                    PathNode.CurveTo(16.008886f, 7.493403f, 15.630051f, 7.066837f, 15.127f, 7.007f),
                    PathNode.LineTo(15.01f, 7.0f),
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
        return _photo!!
    }

private var _photo: ImageVector? = null
