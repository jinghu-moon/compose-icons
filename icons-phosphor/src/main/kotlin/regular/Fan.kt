package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorRegularIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.0f, 135.0f),
                    PathNode.CurveTo(228.08742f, 116.64991f, 214.77527f, 101.710175f, 197.11072f, 94.72281f),
                    PathNode.CurveTo(179.44618f, 87.735435f, 159.51624f, 89.525955f, 143.38f, 99.55f),
                    PathNode.LineTo(159.77f, 34.11f),
                    PathNode.CurveTo(160.60379f, 30.775976f, 159.21503f, 27.281946f, 156.32f, 25.43f),
                    PathNode.CurveTo(137.793f, 13.731156f, 114.362f, 13.062069f, 95.197586f, 23.684608f),
                    PathNode.CurveTo(76.033165f, 34.307148f, 64.1833f, 54.531864f, 64.285835f, 76.443115f),
                    PathNode.CurveTo(64.38837f, 98.35436f, 76.427f, 118.467285f, 95.69f, 128.91f),
                    PathNode.LineTo(30.82f, 147.44f),
                    PathNode.CurveTo(27.515253f, 148.38118f, 25.180662f, 151.3276f, 25.02f, 154.76f),
                    PathNode.CurveTo(23.751572f, 182.90025f, 42.229748f, 208.13406f, 69.44f, 215.42f),
                    PathNode.CurveTo(74.53422f, 216.78773f, 79.78538f, 217.48363f, 85.06f, 217.49f),
                    PathNode.CurveTo(101.29866f, 217.44702f, 116.82814f, 210.83144f, 128.10922f, 199.15097f),
                    PathNode.CurveTo(139.3903f, 187.47049f, 145.46179f, 171.72034f, 144.94f, 155.49f),
                    PathNode.LineTo(193.42f, 202.41f),
                    PathNode.CurveTo(195.89236f, 204.802f, 199.61711f, 205.34561f, 202.67f, 203.76f),
                    PathNode.CurveTo(227.65965f, 190.79417f, 240.27377f, 162.1972f, 233.0f, 135.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 119.163445f, 119.163445f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(136.83656f, 112.0f, 144.0f, 119.163445f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 136.83656f, 136.83656f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(119.163445f, 144.0f, 112.0f, 136.83656f, 112.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 76.0f),
                    PathNode.CurveTo(79.99486f, 60.93121f, 87.70139f, 46.907852f, 100.424614f, 38.83393f),
                    PathNode.CurveTo(113.147835f, 30.76001f, 129.11789f, 29.758638f, 142.75f, 36.18f),
                    PathNode.LineTo(127.77f, 96.0f),
                    PathNode.CurveTo(116.095505f, 96.08757f, 105.39521f, 102.526146f, 99.85f, 112.8f),
                    PathNode.CurveTo(87.43449f, 104.68072f, 79.96588f, 90.83464f, 80.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(107.0f, 195.57f),
                    PathNode.CurveTo(93.95309f, 203.10863f, 77.95584f, 203.44655f, 64.60222f, 196.4656f),
                    PathNode.CurveTo(51.248592f, 189.48465f, 42.39599f, 176.15584f, 41.14f, 161.14f),
                    PathNode.LineTo(100.45f, 144.2f),
                    PathNode.CurveTo(106.18748f, 153.97371f, 116.666695f, 159.98357f, 128.0f, 160.0f),
                    PathNode.LineTo(128.91f, 160.0f),
                    PathNode.CurveTo(128.09224f, 174.79906f, 119.84892f, 188.18176f, 107.0f, 195.57f),
                    PathNode.Close,
                    PathNode.MoveTo(213.17f, 172.57f),
                    PathNode.CurveTo(209.93303f, 178.18477f, 205.49353f, 183.01357f, 200.17f, 186.71f),
                    PathNode.LineTo(155.85f, 143.82f),
                    PathNode.CurveTo(161.62701f, 133.67305f, 161.40073f, 121.18107f, 155.26f, 111.25f),
                    PathNode.CurveTo(172.63704f, 102.47772f, 193.71294f, 106.166046f, 207.07816f, 120.31826f),
                    PathNode.CurveTo(220.44337f, 134.47047f, 222.9211f, 155.72273f, 213.17f, 172.57f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fan!!
    }

private var _fan: ImageVector? = null
