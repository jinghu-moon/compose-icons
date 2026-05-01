package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorBoldIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 216.0f),
                    PathNode.CurveTo(256.0f, 222.62741f, 250.62741f, 228.0f, 244.0f, 228.0f),
                    PathNode.LineTo(104.0f, 228.0f),
                    PathNode.CurveTo(97.37258f, 228.0f, 92.0f, 222.62741f, 92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 209.37259f, 97.37258f, 204.0f, 104.0f, 204.0f),
                    PathNode.LineTo(244.0f, 204.0f),
                    PathNode.CurveTo(250.62741f, 204.0f, 256.0f, 209.37259f, 256.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.76f, 191.55f),
                    PathNode.LineTo(52.14f, 142.09f),
                    PathNode.CurveTo(33.164124f, 136.73283f, 20.044674f, 119.43753f, 20.0f, 99.72f),
                    PathNode.LineTo(20.0f, 48.0f),
                    PathNode.CurveTo(19.992018f, 41.567604f, 23.078321f, 35.52395f, 28.293774f, 31.758995f),
                    PathNode.CurveTo(33.509224f, 27.994041f, 40.2172f, 26.967356f, 46.32f, 29.0f),
                    PathNode.LineTo(51.8f, 30.83f),
                    PathNode.CurveTo(55.281536f, 31.990068f, 58.04088f, 34.679413f, 59.29f, 38.13f),
                    PathNode.LineTo(69.2f, 65.59f),
                    PathNode.LineTo(92.0f, 72.09f),
                    PathNode.LineTo(92.0f, 48.0f),
                    PathNode.CurveTo(91.99202f, 41.567604f, 95.07832f, 35.52395f, 100.29377f, 31.758995f),
                    PathNode.CurveTo(105.509224f, 27.994041f, 112.2172f, 26.967356f, 118.32f, 29.0f),
                    PathNode.LineTo(123.8f, 30.83f),
                    PathNode.CurveTo(127.081474f, 31.923878f, 129.73132f, 34.380547f, 131.07f, 37.57f),
                    PathNode.LineTo(152.82f, 89.42f),
                    PathNode.LineTo(211.82f, 105.91f),
                    PathNode.CurveTo(230.82799f, 111.25342f, 243.9715f, 128.57526f, 244.0f, 148.32f),
                    PathNode.LineTo(244.0f, 180.0f),
                    PathNode.CurveTo(243.99864f, 183.75438f, 242.24025f, 187.29173f, 239.24811f, 189.5594f),
                    PathNode.CurveTo(236.25595f, 191.82709f, 232.37494f, 192.56367f, 228.76f, 191.55f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 148.32f),
                    PathNode.CurveTo(219.98247f, 139.34091f, 213.99733f, 131.46829f, 205.35f, 129.05f),
                    PathNode.LineTo(140.77f, 111.0f),
                    PathNode.CurveTo(137.23827f, 110.01532f, 134.35048f, 107.470085f, 132.93f, 104.09f),
                    PathNode.LineTo(116.0f, 63.71f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(115.99994f, 91.76424f, 114.233574f, 95.31032f, 111.229034f, 97.57797f),
                    PathNode.CurveTo(108.224495f, 99.84562f, 104.33f, 100.57203f, 100.71f, 99.54f),
                    PathNode.LineTo(56.71f, 87.0f),
                    PathNode.CurveTo(52.999138f, 85.94399f, 50.022354f, 83.16814f, 48.71f, 79.54f),
                    PathNode.LineTo(44.0f, 66.48f),
                    PathNode.LineTo(44.0f, 99.72f),
                    PathNode.CurveTo(44.014767f, 108.689285f, 49.978985f, 116.55994f, 58.61f, 119.0f),
                    PathNode.LineTo(220.0f, 164.18f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
