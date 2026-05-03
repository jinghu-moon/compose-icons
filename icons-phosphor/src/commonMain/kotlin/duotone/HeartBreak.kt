package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorDuotoneIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 102.0f),
                    PathNode.CurveTo(232.0f, 168.0f, 128.0f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(128.0f, 224.0f, 24.0f, 168.0f, 24.0f, 102.0f),
                    PathNode.CurveTo(24.003046f, 80.16138f, 37.159687f, 60.47448f, 57.336113f, 52.117615f),
                    PathNode.CurveTo(77.51254f, 43.76075f, 100.73624f, 48.379284f, 116.18f, 63.82f),
                    PathNode.LineTo(128.0f, 75.63f),
                    PathNode.LineTo(139.82f, 63.82f),
                    PathNode.CurveTo(155.26376f, 48.379284f, 178.48746f, 43.76075f, 198.66388f, 52.117615f),
                    PathNode.CurveTo(218.84032f, 60.47448f, 231.99695f, 80.16138f, 232.0f, 102.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 40.0f),
                    PathNode.CurveTo(161.54791f, 39.956055f, 145.7619f, 46.495155f, 134.16f, 58.16f),
                    PathNode.LineTo(128.0f, 64.32f),
                    PathNode.LineTo(121.84f, 58.16f),
                    PathNode.CurveTo(104.10815f, 40.42865f, 77.44128f, 35.124435f, 54.273796f, 44.720646f),
                    PathNode.CurveTo(31.106312f, 54.31685f, 16.000502f, 76.92373f, 16.0f, 102.0f),
                    PathNode.CurveTo(16.0f, 172.0f, 119.79f, 228.67f, 124.21f, 231.0f),
                    PathNode.CurveTo(126.57634f, 232.27296f, 129.42366f, 232.27296f, 131.79f, 231.0f),
                    PathNode.CurveTo(136.21f, 228.67f, 240.0f, 172.0f, 240.0f, 102.0f),
                    PathNode.CurveTo(239.96143f, 67.77434f, 212.22566f, 40.03858f, 178.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 214.8f),
                    PathNode.CurveTo(109.74f, 204.16f, 32.0f, 155.69f, 32.0f, 102.0f),
                    PathNode.CurveTo(31.997501f, 83.392815f, 43.20507f, 66.61671f, 60.395725f, 59.495712f),
                    PathNode.CurveTo(77.58639f, 52.374714f, 97.373985f, 56.311485f, 110.53f, 69.47f),
                    PathNode.LineTo(116.69f, 75.63f),
                    PathNode.LineTo(106.34f, 86.0f),
                    PathNode.CurveTo(103.21828f, 89.12377f, 103.21828f, 94.18623f, 106.34f, 97.31f),
                    PathNode.LineTo(130.87f, 121.84f),
                    PathNode.LineTo(114.34f, 138.36f),
                    PathNode.CurveTo(111.214066f, 141.48593f, 111.214066f, 146.55406f, 114.34f, 149.68f),
                    PathNode.CurveTo(117.465935f, 152.80594f, 122.534065f, 152.80594f, 125.66f, 149.68f),
                    PathNode.LineTo(147.84f, 127.49f),
                    PathNode.CurveTo(150.96172f, 124.366234f, 150.96172f, 119.303764f, 147.84f, 116.18f),
                    PathNode.LineTo(123.31f, 91.63f),
                    PathNode.LineTo(145.47f, 69.47f),
                    PathNode.CurveTo(158.62602f, 56.311485f, 178.41362f, 52.374714f, 195.60428f, 59.495712f),
                    PathNode.CurveTo(212.79492f, 66.61671f, 224.0025f, 83.392815f, 224.0f, 102.0f),
                    PathNode.CurveTo(224.0f, 155.61f, 146.24f, 204.15f, 128.0f, 214.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
