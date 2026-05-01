package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorFillIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.54f, 63.0f),
                    PathNode.CurveTo(238.54433f, 58.863323f, 235.93323f, 55.29781f, 232.29f, 53.1f),
                    PathNode.CurveTo(168.17273f, 14.31355f, 87.82727f, 14.31355f, 23.71f, 53.1f),
                    PathNode.CurveTo(20.0778f, 55.30286f, 17.470707f, 58.859715f, 16.463383f, 62.98655f),
                    PathNode.CurveTo(15.45606f, 67.113396f, 16.131207f, 71.471405f, 18.34f, 75.1f),
                    PathNode.LineTo(114.34f, 232.37f),
                    PathNode.CurveTo(117.240524f, 237.15175f, 122.42731f, 240.07195f, 128.02f, 240.07195f),
                    PathNode.CurveTo(133.61269f, 240.07195f, 138.79947f, 237.15175f, 141.7f, 232.37f),
                    PathNode.LineTo(237.7f, 75.1f),
                    PathNode.CurveTo(239.91187f, 71.476875f, 240.57487f, 67.11685f, 239.54f, 63.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.44f, 131.53f),
                    PathNode.CurveTo(166.03925f, 123.17807f, 144.29926f, 129.86183f, 133.76852f, 147.10847f),
                    PathNode.CurveTo(123.23782f, 164.35512f, 127.22422f, 186.74728f, 143.06f, 199.3f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.LineTo(96.5f, 172.43f),
                    PathNode.CurveTo(110.616875f, 166.0686f, 119.79433f, 152.1312f, 120.0606f, 136.6495f),
                    PathNode.CurveTo(120.326866f, 121.167816f, 111.63411f, 106.92305f, 97.74434f, 100.07998f),
                    PathNode.CurveTo(83.85456f, 93.2369f, 67.26298f, 95.02483f, 55.15f, 104.67f),
                    PathNode.LineTo(48.8f, 94.26f),
                    PathNode.CurveTo(97.42501f, 64.57838f, 158.56499f, 64.57838f, 207.19f, 94.26f),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
