package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorFillIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 216.0f),
                    PathNode.CurveTo(256.0f, 220.41827f, 252.41827f, 224.0f, 248.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(99.58172f, 224.0f, 96.0f, 220.41827f, 96.0f, 216.0f),
                    PathNode.CurveTo(96.0f, 211.58173f, 99.58172f, 208.0f, 104.0f, 208.0f),
                    PathNode.LineTo(248.0f, 208.0f),
                    PathNode.CurveTo(252.41827f, 208.0f, 256.0f, 211.58173f, 256.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.CurveTo(236.41827f, 192.0f, 240.0f, 188.41827f, 240.0f, 184.0f),
                    PathNode.LineTo(240.0f, 148.32f),
                    PathNode.CurveTo(239.95732f, 130.37086f, 228.0007f, 114.6329f, 210.72f, 109.78f),
                    PathNode.LineTo(149.88f, 92.78f),
                    PathNode.LineTo(127.38f, 39.15f),
                    PathNode.CurveTo(126.48838f, 37.02045f, 124.720245f, 35.379917f, 122.53f, 34.65f),
                    PathNode.LineTo(117.06f, 32.83f),
                    PathNode.CurveTo(112.18228f, 31.203966f, 106.82031f, 32.0211f, 102.64836f, 35.026253f),
                    PathNode.CurveTo(98.47641f, 38.031406f, 96.00283f, 42.858395f, 96.0f, 48.0f),
                    PathNode.LineTo(96.0f, 77.39f),
                    PathNode.LineTo(66.13f, 68.88f),
                    PathNode.LineTo(55.52f, 39.51f),
                    PathNode.CurveTo(54.6867f, 37.206863f, 52.844284f, 35.412354f, 50.52f, 34.64f),
                    PathNode.LineTo(45.05f, 32.82f),
                    PathNode.CurveTo(40.17186f, 31.197395f, 34.811165f, 32.017616f, 30.641382f, 35.024616f),
                    PathNode.CurveTo(26.471601f, 38.031612f, 24.000689f, 42.859074f, 24.0f, 48.0f),
                    PathNode.LineTo(24.0f, 103.72f),
                    PathNode.CurveTo(24.039375f, 121.6432f, 35.962166f, 137.36612f, 53.21f, 142.24f),
                    PathNode.LineTo(229.84f, 191.7f),
                    PathNode.CurveTo(230.54294f, 191.89812f, 231.26968f, 191.99907f, 232.0f, 192.0f),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
