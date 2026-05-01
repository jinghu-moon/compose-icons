package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorBoldIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(255.14f, 187.54f),
                    PathNode.CurveTo(252.67665f, 181.3877f, 245.69244f, 178.39703f, 239.54f, 180.86f),
                    PathNode.LineTo(229.79f, 184.76f),
                    PathNode.LineTo(202.73f, 130.63f),
                    PathNode.CurveTo(200.69684f, 126.56693f, 196.54338f, 124.000534f, 192.0f, 124.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.LineTo(116.0f, 108.0f),
                    PathNode.LineTo(168.0f, 108.0f),
                    PathNode.CurveTo(174.62741f, 108.0f, 180.0f, 102.62742f, 180.0f, 96.0f),
                    PathNode.CurveTo(180.0f, 89.37258f, 174.62741f, 84.0f, 168.0f, 84.0f),
                    PathNode.LineTo(116.0f, 84.0f),
                    PathNode.LineTo(116.0f, 77.81f),
                    PathNode.CurveTo(131.36824f, 72.01284f, 140.39488f, 56.057987f, 137.44852f, 39.899128f),
                    PathNode.CurveTo(134.50215f, 23.740267f, 120.42528f, 11.998053f, 104.0f, 11.998053f),
                    PathNode.CurveTo(87.57472f, 11.998053f, 73.497856f, 23.740267f, 70.55148f, 39.899128f),
                    PathNode.CurveTo(67.60512f, 56.057987f, 76.63176f, 72.01284f, 92.0f, 77.81f),
                    PathNode.LineTo(92.0f, 86.69f),
                    PathNode.CurveTo(58.213757f, 95.91098f, 35.10309f, 127.02603f, 36.037197f, 162.03552f),
                    PathNode.CurveTo(36.971306f, 197.045f, 61.70831f, 226.88339f, 95.93819f, 234.28961f),
                    PathNode.CurveTo(130.16808f, 241.69583f, 165.02716f, 224.75203f, 180.35f, 193.26f),
                    PathNode.CurveTo(182.28363f, 189.39969f, 181.99445f, 184.79826f, 179.59274f, 181.21042f),
                    PathNode.CurveTo(177.19104f, 177.62257f, 173.04709f, 175.60152f, 168.74121f, 175.91797f),
                    PathNode.CurveTo(164.43533f, 176.23442f, 160.63138f, 178.8396f, 158.78f, 182.74f),
                    PathNode.CurveTo(148.66011f, 203.54195f, 126.01525f, 215.1575f, 103.21625f, 211.24112f),
                    PathNode.CurveTo(80.41724f, 207.32474f, 62.946705f, 188.8182f, 60.348755f, 165.83162f),
                    PathNode.CurveTo(57.75081f, 142.84502f, 70.65019f, 120.90609f, 92.0f, 112.0f),
                    PathNode.LineTo(92.0f, 136.0f),
                    PathNode.CurveTo(92.0f, 142.62741f, 97.37258f, 148.0f, 104.0f, 148.0f),
                    PathNode.LineTo(184.58f, 148.0f),
                    PathNode.LineTo(213.26f, 205.37f),
                    PathNode.CurveTo(216.0529f, 210.9503f, 222.6566f, 213.45876f, 228.45f, 211.14f),
                    PathNode.LineTo(248.45f, 203.14f),
                    PathNode.CurveTo(251.40627f, 201.95898f, 253.7721f, 199.65169f, 255.02678f, 196.72594f),
                    PathNode.CurveTo(256.2815f, 193.80019f, 256.3222f, 190.49579f, 255.14f, 187.54f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 36.0f),
                    PathNode.CurveTo(109.52285f, 36.0f, 114.0f, 40.477154f, 114.0f, 46.0f),
                    PathNode.CurveTo(114.0f, 51.522846f, 109.52285f, 56.0f, 104.0f, 56.0f),
                    PathNode.CurveTo(98.47715f, 56.0f, 94.0f, 51.522846f, 94.0f, 46.0f),
                    PathNode.CurveTo(94.0f, 40.477154f, 98.47715f, 36.0f, 104.0f, 36.0f),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
