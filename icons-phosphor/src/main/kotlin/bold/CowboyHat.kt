package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorBoldIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 116.0f),
                    PathNode.CurveTo(207.8611f, 115.99861f, 204.01363f, 118.13022f, 201.82f, 121.64f),
                    PathNode.QuadTo(199.34f, 125.64f, 196.82f, 129.21f),
                    PathNode.LineTo(182.25f, 52.33f),
                    PathNode.CurveTo(180.95499f, 45.42782f, 176.13481f, 39.710545f, 169.55087f, 37.26742f),
                    PathNode.CurveTo(162.96692f, 34.8243f, 155.584f, 36.013325f, 150.1f, 40.4f),
                    PathNode.LineTo(149.92f, 40.55f),
                    PathNode.LineTo(128.0f, 58.8f),
                    PathNode.LineTo(106.08f, 40.55f),
                    PathNode.LineTo(105.9f, 40.4f),
                    PathNode.CurveTo(100.4202f, 36.013855f, 93.04217f, 34.821323f, 86.45961f, 37.25779f),
                    PathNode.CurveTo(79.87705f, 39.69426f, 75.05349f, 45.403088f, 73.75f, 52.3f),
                    PathNode.LineTo(59.14f, 129.22f),
                    PathNode.QuadTo(56.65f, 125.61f, 54.14f, 121.65f),
                    PathNode.CurveTo(51.95633f, 118.14843f, 48.126644f, 116.014534f, 44.0f, 116.0f),
                    PathNode.CurveTo(19.69947f, 116.0f, 0f, 135.69948f, 0f, 160.0f),
                    PathNode.CurveTo(0f, 184.30052f, 19.69947f, 204.0f, 44.0f, 204.0f),
                    PathNode.LineTo(212.0f, 204.0f),
                    PathNode.CurveTo(236.30052f, 204.0f, 256.0f, 184.30052f, 256.0f, 160.0f),
                    PathNode.CurveTo(256.0f, 135.69948f, 236.30052f, 116.0f, 212.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.07f, 63.44f),
                    PathNode.LineTo(115.32f, 79.44f),
                    PathNode.LineTo(115.51f, 79.59f),
                    PathNode.CurveTo(122.80202f, 85.48156f, 133.21799f, 85.48156f, 140.51f, 79.59f),
                    PathNode.LineTo(140.7f, 79.44f),
                    PathNode.LineTo(159.95f, 63.44f),
                    PathNode.LineTo(171.44f, 124.0f),
                    PathNode.LineTo(84.56f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 180.0f),
                    PathNode.CurveTo(34.111305f, 180.0039f, 25.704214f, 172.78043f, 24.218983f, 163.0039f),
                    PathNode.CurveTo(22.733751f, 153.22737f, 28.616295f, 143.83304f, 38.06f, 140.9f),
                    PathNode.CurveTo(49.76f, 158.28f, 61.76f, 170.9f, 73.06f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(79.0f, 153.25f),
                    PathNode.LineTo(80.0f, 148.0f),
                    PathNode.LineTo(176.0f, 148.0f),
                    PathNode.LineTo(177.0f, 153.25f),
                    PathNode.CurveTo(151.67f, 178.25f, 130.29f, 179.9f, 128.0f, 180.0f),
                    PathNode.CurveTo(125.71f, 179.9f, 104.33f, 178.29f, 79.0f, 153.25f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 180.0f),
                    PathNode.LineTo(183.0f, 180.0f),
                    PathNode.CurveTo(194.28f, 170.88f, 206.28f, 158.28f, 218.0f, 140.9f),
                    PathNode.CurveTo(227.45476f, 143.83627f, 233.3385f, 153.24799f, 231.83685f, 163.03366f),
                    PathNode.CurveTo(230.33522f, 172.81932f, 221.90016f, 180.03378f, 212.0f, 180.0f),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
