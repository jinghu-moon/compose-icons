package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) return _flyingSaucer!!
        _flyingSaucer = phosphorFillIcon(
            name = "FlyingSaucer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.59f, 213.47f),
                    PathNode.CurveTo(184.98727f, 217.66183f, 182.72185f, 222.19272f, 178.53f, 223.59f),
                    PathNode.CurveTo(174.33817f, 224.98727f, 169.80728f, 222.72185f, 168.41f, 218.53f),
                    PathNode.LineTo(160.41f, 194.53f),
                    PathNode.CurveTo(159.01273f, 190.33817f, 161.27815f, 185.80728f, 165.47f, 184.41f),
                    PathNode.CurveTo(169.66183f, 183.01273f, 174.19272f, 185.27815f, 175.59f, 189.47f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(123.58172f, 184.0f, 120.0f, 187.58173f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.CurveTo(120.0f, 228.41827f, 123.58172f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(132.41827f, 232.0f, 136.0f, 228.41827f, 136.0f, 224.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 187.58173f, 132.41827f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.53f, 184.41f),
                    PathNode.CurveTo(88.51701f, 183.73885f, 86.31985f, 183.89491f, 84.421936f, 184.84387f),
                    PathNode.CurveTo(82.524025f, 185.79283f, 81.08087f, 187.45691f, 80.41f, 189.47f),
                    PathNode.LineTo(72.41f, 213.47f),
                    PathNode.CurveTo(71.01272f, 217.66183f, 73.27816f, 222.19272f, 77.47f, 223.59f),
                    PathNode.CurveTo(81.66184f, 224.98727f, 86.19272f, 222.72185f, 87.59f, 218.53f),
                    PathNode.LineTo(95.59f, 194.53f),
                    PathNode.CurveTo(96.261154f, 192.51701f, 96.10509f, 190.31984f, 95.15613f, 188.42194f),
                    PathNode.CurveTo(94.20718f, 186.52403f, 92.54308f, 185.08087f, 90.53f, 184.41f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 112.0f),
                    PathNode.CurveTo(248.0f, 128.22f, 234.63f, 142.89f, 210.35f, 153.29f),
                    PathNode.CurveTo(188.22f, 162.78f, 159.0f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(97.0f, 168.0f, 67.78f, 162.78f, 45.65f, 153.29f),
                    PathNode.CurveTo(21.37f, 142.89f, 8.0f, 128.22f, 8.0f, 112.0f),
                    PathNode.CurveTo(8.0f, 103.63f, 11.67f, 91.21f, 29.17f, 79.5f),
                    PathNode.CurveTo(40.54f, 71.89f, 56.11f, 65.74f, 74.35f, 61.65f),
                    PathNode.CurveTo(84.6529f, 45.326176f, 101.80798f, 34.56088f, 120.98805f, 32.383316f),
                    PathNode.CurveTo(140.16814f, 30.20575f, 159.29991f, 36.8513f, 173.0f, 50.45f),
                    PathNode.CurveTo(176.45003f, 53.863834f, 179.50583f, 57.654243f, 182.11f, 61.75f),
                    PathNode.CurveTo(223.43f, 71.09f, 248.0f, 89.74f, 248.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 96.0f),
                    PathNode.CurveTo(176.01582f, 87.825775f, 173.92897f, 79.78487f, 169.94f, 72.65f),
                    PathNode.LineTo(169.88f, 72.56f),
                    PathNode.CurveTo(161.2724f, 57.205795f, 144.96101f, 47.784172f, 127.36f, 48.0f),
                    PathNode.CurveTo(101.25f, 48.34f, 80.0f, 70.25f, 80.0f, 96.83f),
                    PathNode.LineTo(80.0f, 99.83f),
                    PathNode.CurveTo(79.97902f, 103.53129f, 82.524414f, 106.75352f, 86.13f, 107.59f),
                    PathNode.CurveTo(99.87785f, 110.621056f, 113.92234f, 112.1003f, 128.0f, 112.0f),
                    PathNode.CurveTo(142.06953f, 112.113205f, 156.10736f, 110.64737f, 169.85f, 107.63f),
                    PathNode.CurveTo(173.46143f, 106.798164f, 176.0151f, 103.57595f, 176.0f, 99.87f),
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
        return _flyingSaucer!!
    }

private var _flyingSaucer: ImageVector? = null
