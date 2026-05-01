package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorRegularIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.15f, 116.29f),
                    PathNode.LineTo(139.71f, 12.85f),
                    PathNode.CurveTo(136.60437f, 9.744206f, 132.39214f, 7.999377f, 128.0f, 7.999377f),
                    PathNode.CurveTo(123.607864f, 7.999377f, 119.39563f, 9.744206f, 116.29f, 12.85f),
                    PathNode.LineTo(12.85f, 116.29f),
                    PathNode.CurveTo(9.744206f, 119.39563f, 7.999377f, 123.607864f, 7.999377f, 128.0f),
                    PathNode.CurveTo(7.999377f, 132.39214f, 9.744206f, 136.60437f, 12.85f, 139.71f),
                    PathNode.LineTo(116.29f, 243.15f),
                    PathNode.LineTo(116.29f, 243.15f),
                    PathNode.CurveTo(119.39563f, 246.2558f, 123.607864f, 248.00063f, 128.0f, 248.00063f),
                    PathNode.CurveTo(132.39214f, 248.00063f, 136.60437f, 246.2558f, 139.71f, 243.15f),
                    PathNode.LineTo(243.15f, 139.71f),
                    PathNode.CurveTo(246.2558f, 136.60437f, 248.00063f, 132.39214f, 248.00063f, 128.0f),
                    PathNode.CurveTo(248.00063f, 123.607864f, 246.2558f, 119.39563f, 243.15f, 116.29f),
                    PathNode.Close,
                    PathNode.MoveTo(231.84f, 128.39f),
                    PathNode.LineTo(128.4f, 231.84f),
                    PathNode.CurveTo(128.176f, 232.05333f, 127.824f, 232.05333f, 127.6f, 231.84f),
                    PathNode.LineTo(127.6f, 231.84f),
                    PathNode.LineTo(24.16f, 128.39f),
                    PathNode.CurveTo(23.949162f, 128.17274f, 23.949162f, 127.827255f, 24.16f, 127.61f),
                    PathNode.LineTo(127.6f, 24.16f),
                    PathNode.CurveTo(127.824f, 23.946667f, 128.176f, 23.946667f, 128.4f, 24.16f),
                    PathNode.LineTo(231.84f, 127.61f),
                    PathNode.CurveTo(232.05084f, 127.827255f, 232.05084f, 128.17274f, 231.84f, 128.39f),
                    PathNode.Close,
                    PathNode.MoveTo(173.66f, 114.39f),
                    PathNode.CurveTo(175.16223f, 115.89055f, 176.00629f, 117.92673f, 176.00629f, 120.05f),
                    PathNode.CurveTo(176.00629f, 122.17327f, 175.16223f, 124.20946f, 173.66f, 125.71f),
                    PathNode.LineTo(149.66f, 149.71f),
                    PathNode.CurveTo(146.53407f, 152.83594f, 141.46593f, 152.83594f, 138.34f, 149.71f),
                    PathNode.CurveTo(135.21407f, 146.58406f, 135.21407f, 141.51593f, 138.34f, 138.39f),
                    PathNode.LineTo(148.69f, 128.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.CurveTo(103.163445f, 128.0f, 96.0f, 135.16344f, 96.0f, 144.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 156.41827f, 92.41828f, 160.0f, 88.0f, 160.0f),
                    PathNode.CurveTo(83.58172f, 160.0f, 80.0f, 156.41827f, 80.0f, 152.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.CurveTo(80.0f, 126.32689f, 94.32689f, 112.0f, 112.0f, 112.0f),
                    PathNode.LineTo(148.69f, 112.0f),
                    PathNode.LineTo(138.34f, 101.66f),
                    PathNode.CurveTo(135.21407f, 98.534065f, 135.21407f, 93.465935f, 138.34f, 90.34f),
                    PathNode.CurveTo(141.46593f, 87.214066f, 146.53407f, 87.214066f, 149.66f, 90.34f),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
