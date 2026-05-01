package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorLightIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.65f, 74.08f),
                    PathNode.CurveTo(185.07684f, 53.464787f, 157.12447f, 41.916656f, 128.0f, 42.0f),
                    PathNode.LineTo(127.61f, 42.0f),
                    PathNode.CurveTo(67.17f, 42.21f, 18.0f, 92.06f, 18.0f, 153.13f),
                    PathNode.LineTo(18.0f, 176.0f),
                    PathNode.CurveTo(18.0f, 183.73198f, 24.268015f, 190.0f, 32.0f, 190.0f),
                    PathNode.LineTo(224.0f, 190.0f),
                    PathNode.CurveTo(231.73198f, 190.0f, 238.0f, 183.73198f, 238.0f, 176.0f),
                    PathNode.LineTo(238.0f, 152.0f),
                    PathNode.CurveTo(238.07964f, 122.74388f, 226.42714f, 94.677025f, 205.65f, 74.08f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 176.0f),
                    PathNode.CurveTo(226.0f, 177.10457f, 225.10457f, 178.0f, 224.0f, 178.0f),
                    PathNode.LineTo(115.78f, 178.0f),
                    PathNode.LineTo(172.85f, 99.53f),
                    PathNode.CurveTo(174.71336f, 96.85076f, 174.0936f, 93.17352f, 171.455f, 91.25305f),
                    PathNode.CurveTo(168.81639f, 89.33258f, 165.12668f, 89.873245f, 163.15f, 92.47f),
                    PathNode.LineTo(100.94f, 178.0f),
                    PathNode.LineTo(32.0f, 178.0f),
                    PathNode.CurveTo(30.89543f, 178.0f, 30.0f, 177.10457f, 30.0f, 176.0f),
                    PathNode.LineTo(30.0f, 153.13f),
                    PathNode.CurveTo(30.004349f, 149.4115f, 30.211323f, 145.69598f, 30.62f, 142.0f),
                    PathNode.LineTo(56.0f, 142.0f),
                    PathNode.CurveTo(59.31371f, 142.0f, 62.0f, 139.3137f, 62.0f, 136.0f),
                    PathNode.CurveTo(62.0f, 132.6863f, 59.31371f, 130.0f, 56.0f, 130.0f),
                    PathNode.LineTo(32.71f, 130.0f),
                    PathNode.CurveTo(42.6f, 88.4f, 78.53f, 56.86f, 122.0f, 54.19f),
                    PathNode.LineTo(122.0f, 80.0f),
                    PathNode.CurveTo(122.0f, 83.313705f, 124.686295f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(131.3137f, 86.0f, 134.0f, 83.313705f, 134.0f, 80.0f),
                    PathNode.LineTo(134.0f, 54.19f),
                    PathNode.CurveTo(177.33662f, 56.85006f, 213.76332f, 87.69456f, 223.53f, 130.0f),
                    PathNode.LineTo(200.0f, 130.0f),
                    PathNode.CurveTo(196.6863f, 130.0f, 194.0f, 132.6863f, 194.0f, 136.0f),
                    PathNode.CurveTo(194.0f, 139.3137f, 196.6863f, 142.0f, 200.0f, 142.0f),
                    PathNode.LineTo(225.5f, 142.0f),
                    PathNode.CurveTo(225.83f, 145.3f, 226.0f, 148.64f, 226.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gauge!!
    }

private var _gauge: ImageVector? = null
