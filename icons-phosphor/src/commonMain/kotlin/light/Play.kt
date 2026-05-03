package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorLightIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.36f, 116.19f),
                    PathNode.LineTo(87.28f, 28.06f),
                    PathNode.CurveTo(82.95198f, 25.40538f, 77.52593f, 25.302061f, 73.1f, 27.79f),
                    PathNode.CurveTo(68.69583f, 30.208612f, 65.970505f, 34.845505f, 66.0f, 39.87f),
                    PathNode.LineTo(66.0f, 216.13f),
                    PathNode.CurveTo(65.970505f, 221.1545f, 68.69583f, 225.79138f, 73.1f, 228.21f),
                    PathNode.CurveTo(77.52593f, 230.69794f, 82.95198f, 230.59462f, 87.28f, 227.94f),
                    PathNode.LineTo(231.36f, 139.81f),
                    PathNode.CurveTo(235.48453f, 137.30333f, 238.00252f, 132.82649f, 238.00252f, 128.0f),
                    PathNode.CurveTo(238.00252f, 123.17351f, 235.48453f, 118.69666f, 231.36f, 116.19f),
                    PathNode.Close,
                    PathNode.MoveTo(225.1f, 129.57f),
                    PathNode.LineTo(81.0f, 217.7f),
                    PathNode.CurveTo(80.366135f, 218.08083f, 79.57387f, 218.08083f, 78.94f, 217.7f),
                    PathNode.CurveTo(78.32491f, 217.40016f, 77.93616f, 216.77426f, 77.94f, 216.09f),
                    PathNode.LineTo(77.94f, 39.87f),
                    PathNode.CurveTo(77.93616f, 39.185734f, 78.32491f, 38.55984f, 78.94f, 38.26f),
                    PathNode.CurveTo(79.26353f, 38.079605f, 79.629715f, 37.989788f, 80.0f, 38.0f),
                    PathNode.CurveTo(80.35494f, 38.012707f, 80.7001f, 38.119705f, 81.0f, 38.31f),
                    PathNode.LineTo(225.1f, 126.43f),
                    PathNode.CurveTo(225.65714f, 126.75668f, 225.9994f, 127.35416f, 225.9994f, 128.0f),
                    PathNode.CurveTo(225.9994f, 128.64584f, 225.65714f, 129.24332f, 225.1f, 129.57f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _play!!
    }

private var _play: ImageVector? = null
