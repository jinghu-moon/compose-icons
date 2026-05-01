package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = tablerFilledIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 3.0f),
                    PathNode.CurveTo(11.000115f, 2.643616f, 11.189889f, 2.314226f, 11.498143f, 2.135372f),
                    PathNode.CurveTo(11.806398f, 1.956518f, 12.186543f, 1.955234f, 12.496f, 2.132f),
                    PathNode.LineTo(19.496f, 6.132f),
                    PathNode.CurveTo(19.807335f, 6.310109f, 19.999435f, 6.641319f, 19.999435f, 7.0f),
                    PathNode.CurveTo(19.999435f, 7.358682f, 19.807335f, 7.689892f, 19.496f, 7.868f),
                    PathNode.LineTo(13.0f, 11.58f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.CurveTo(12.999933f, 18.506975f, 12.620493f, 18.933683f, 12.117f, 18.993f),
                    PathNode.LineTo(12.0f, 19.0f),
                    PathNode.CurveTo(11.447715f, 19.0f, 11.0f, 18.552284f, 11.0f, 18.0f),
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
                    PathNode.MoveTo(14.135f, 17.168f),
                    PathNode.CurveTo(14.268117f, 16.938564f, 14.486937f, 16.771418f, 14.743308f, 16.703339f),
                    PathNode.CurveTo(14.99968f, 16.635262f, 15.272595f, 16.671831f, 15.502f, 16.805f),
                    PathNode.CurveTo(16.418f, 17.337f, 17.0f, 18.096f, 17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 20.84f, 14.681f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(9.319f, 22.0f, 7.0f, 20.84f, 7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 18.089f, 7.577f, 17.34f, 8.498f, 16.805f),
                    PathNode.CurveTo(8.975726f, 16.527754f, 9.587753f, 16.690273f, 9.865f, 17.168f),
                    PathNode.CurveTo(10.142247f, 17.645727f, 9.979726f, 18.257753f, 9.502f, 18.535f),
                    PathNode.CurveTo(9.137f, 18.747f, 9.0f, 18.925f, 9.0f, 19.0f),
                    PathNode.CurveTo(9.0f, 19.086f, 9.179f, 19.296f, 9.622f, 19.518f),
                    PathNode.CurveTo(10.222f, 19.818f, 11.078f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(12.922f, 20.0f, 13.777f, 19.818f, 14.378f, 19.518f),
                    PathNode.CurveTo(14.821f, 19.296f, 15.0f, 19.086f, 15.0f, 19.0f),
                    PathNode.CurveTo(15.0f, 18.93f, 14.858f, 18.744f, 14.498f, 18.535f),
                    PathNode.CurveTo(14.268564f, 18.401882f, 14.101418f, 18.183064f, 14.03334f, 17.926691f),
                    PathNode.CurveTo(13.965261f, 17.67032f, 14.00183f, 17.397406f, 14.135f, 17.168f)
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
        return _golf!!
    }

private var _golf: ImageVector? = null
