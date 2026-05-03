package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorFillIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 88.0f),
                    PathNode.CurveTo(168.0f, 92.41828f, 164.41827f, 96.0f, 160.0f, 96.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.CurveTo(91.58172f, 96.0f, 88.0f, 92.41828f, 88.0f, 88.0f),
                    PathNode.CurveTo(88.0f, 83.58172f, 91.58172f, 80.0f, 96.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(164.41827f, 80.0f, 168.0f, 83.58172f, 168.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.72f, 122.1f),
                    PathNode.LineTo(201.33f, 204.21f),
                    PathNode.CurveTo(199.43114f, 211.17229f, 193.10658f, 216.00172f, 185.89f, 216.0f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.LineTo(190.4f, 235.2f),
                    PathNode.CurveTo(193.05096f, 238.73462f, 192.33463f, 243.74904f, 188.8f, 246.4f),
                    PathNode.CurveTo(185.26538f, 249.05096f, 180.25096f, 248.33463f, 177.6f, 244.8f),
                    PathNode.LineTo(156.0f, 216.0f),
                    PathNode.LineTo(100.0f, 216.0f),
                    PathNode.LineTo(78.4f, 244.8f),
                    PathNode.CurveTo(75.74903f, 248.33463f, 70.73462f, 249.05096f, 67.2f, 246.4f),
                    PathNode.CurveTo(63.66538f, 243.74904f, 62.94903f, 238.73462f, 65.6f, 235.2f),
                    PathNode.LineTo(80.0f, 216.0f),
                    PathNode.LineTo(70.11f, 216.0f),
                    PathNode.CurveTo(62.893414f, 216.00172f, 56.568863f, 211.17229f, 54.67f, 204.21f),
                    PathNode.LineTo(32.28f, 122.1f),
                    PathNode.CurveTo(31.909777f, 120.72448f, 31.909777f, 119.27552f, 32.28f, 117.9f),
                    PathNode.LineTo(54.67f, 35.79f),
                    PathNode.CurveTo(56.568863f, 28.827715f, 62.893414f, 23.998281f, 70.11f, 24.0f),
                    PathNode.LineTo(185.89f, 24.0f),
                    PathNode.CurveTo(193.10658f, 23.998281f, 199.43114f, 28.827715f, 201.33f, 35.79f),
                    PathNode.LineTo(223.72f, 117.9f),
                    PathNode.CurveTo(224.09023f, 119.27552f, 224.09023f, 120.72448f, 223.72f, 122.1f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 152.0f),
                    PathNode.CurveTo(136.0f, 147.58173f, 132.41827f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(123.58172f, 144.0f, 120.0f, 147.58173f, 120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 196.41827f, 123.58172f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(132.41827f, 200.0f, 136.0f, 196.41827f, 136.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 113.69f),
                    PathNode.LineTo(185.89f, 40.0f),
                    PathNode.LineTo(70.11f, 40.0f),
                    PathNode.LineTo(50.0f, 113.69f),
                    PathNode.LineTo(128.0f, 127.87f),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
