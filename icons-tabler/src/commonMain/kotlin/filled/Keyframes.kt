package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Keyframes: ImageVector
    get() {
        if (_keyframes != null) return _keyframes!!
        _keyframes = tablerFilledIcon(
            name = "Keyframes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.CurveTo(7.223882f, 4.004372f, 6.490332f, 4.355376f, 6.0f, 4.957f),
                    PathNode.LineTo(1.645f, 10.197f),
                    PathNode.CurveTo(0.789071f, 11.242685f, 0.786146f, 12.745992f, 1.638f, 13.795f),
                    PathNode.LineTo(6.006f, 19.051f),
                    PathNode.CurveTo(6.505f, 19.651f, 7.23f, 20.0f, 8.0f, 20.0f),
                    PathNode.CurveTo(8.776117f, 19.995628f, 9.509667f, 19.644625f, 10.0f, 19.043f),
                    PathNode.LineTo(14.355f, 13.803f),
                    PathNode.CurveTo(15.210929f, 12.757315f, 15.213854f, 11.254008f, 14.362f, 10.205f),
                    PathNode.LineTo(9.994f, 4.949f),
                    PathNode.CurveTo(9.503983f, 4.351302f, 8.772883f, 4.003351f, 8.0f, 4.0f),
                    PathNode.Close
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.382f, 4.214f),
                    PathNode.CurveTo(16.777876f, 3.902809f, 17.343386f, 3.934512f, 17.702f, 4.288f),
                    PathNode.LineTo(17.786f, 4.382f),
                    PathNode.LineTo(22.362f, 10.205f),
                    PathNode.CurveTo(23.17f, 11.198f, 23.21f, 12.601f, 22.492f, 13.624f),
                    PathNode.LineTo(22.372f, 13.782f),
                    PathNode.LineTo(17.786f, 19.618f),
                    PathNode.CurveTo(17.459879f, 20.033054f, 16.86732f, 20.12316f, 16.432564f, 19.823803f),
                    PathNode.CurveTo(15.997809f, 19.524446f, 15.870595f, 18.938732f, 16.142f, 18.486f),
                    PathNode.LineTo(16.214f, 18.382f),
                    PathNode.LineTo(20.81f, 12.532f),
                    PathNode.CurveTo(21.03626f, 12.252054f, 21.060345f, 11.859505f, 20.87f, 11.554f),
                    PathNode.LineTo(20.8f, 11.454f),
                    PathNode.LineTo(16.214f, 5.618f),
                    PathNode.CurveTo(15.872768f, 5.183882f, 15.947977f, 4.555353f, 16.382f, 4.214f),
                    PathNode.Close
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.382f, 4.214f),
                    PathNode.CurveTo(12.777876f, 3.902809f, 13.343387f, 3.934512f, 13.702f, 4.288f),
                    PathNode.LineTo(13.786f, 4.382f),
                    PathNode.LineTo(18.362f, 10.205f),
                    PathNode.CurveTo(19.17f, 11.198f, 19.21f, 12.601f, 18.492f, 13.624f),
                    PathNode.LineTo(18.372f, 13.782f),
                    PathNode.LineTo(13.786f, 19.618f),
                    PathNode.CurveTo(13.459878f, 20.033054f, 12.867319f, 20.12316f, 12.432565f, 19.823803f),
                    PathNode.CurveTo(11.997809f, 19.524446f, 11.870595f, 18.938732f, 12.142f, 18.486f),
                    PathNode.LineTo(12.214f, 18.382f),
                    PathNode.LineTo(16.81f, 12.532f),
                    PathNode.CurveTo(17.03626f, 12.252054f, 17.060345f, 11.859505f, 16.87f, 11.554f),
                    PathNode.LineTo(16.8f, 11.454f),
                    PathNode.LineTo(12.214f, 5.618f),
                    PathNode.CurveTo(11.872768f, 5.183882f, 11.947977f, 4.555353f, 12.382f, 4.214f),
                    PathNode.Close
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
        return _keyframes!!
    }

private var _keyframes: ImageVector? = null
