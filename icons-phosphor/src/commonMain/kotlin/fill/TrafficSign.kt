package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorFillIcon(
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
                    PathNode.MoveTo(173.66f, 125.66f),
                    PathNode.LineTo(149.66f, 149.66f),
                    PathNode.CurveTo(146.53407f, 152.78593f, 141.46593f, 152.78593f, 138.34f, 149.66f),
                    PathNode.CurveTo(135.21407f, 146.53407f, 135.21407f, 141.46593f, 138.34f, 138.34f),
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
                    PathNode.LineTo(173.66f, 114.34f),
                    PathNode.CurveTo(175.16223f, 115.840546f, 176.00629f, 117.876724f, 176.00629f, 120.0f),
                    PathNode.CurveTo(176.00629f, 122.123276f, 175.16223f, 124.159454f, 173.66f, 125.66f),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
