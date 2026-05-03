package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorBoldIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.8f, 85.49f),
                    PathNode.LineTo(133.8f, 21.49f),
                    PathNode.CurveTo(130.19016f, 19.496983f, 125.809845f, 19.496983f, 122.2f, 21.49f),
                    PathNode.LineTo(6.2f, 85.49f),
                    PathNode.CurveTo(2.38021f, 87.603424f, 0.009475f, 91.62453f, 0.009475f, 95.99f),
                    PathNode.CurveTo(0.009475f, 100.35548f, 2.38021f, 104.37657f, 6.2f, 106.49f),
                    PathNode.LineTo(28.0f, 118.49f),
                    PathNode.LineTo(28.0f, 166.25f),
                    PathNode.CurveTo(27.992107f, 171.16649f, 29.805399f, 175.91168f, 33.09f, 179.57f),
                    PathNode.CurveTo(46.63f, 194.7f, 77.0f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(141.54439f, 220.07294f, 155.0246f, 218.13515f, 168.0f, 214.25f),
                    PathNode.LineTo(168.0f, 240.0f),
                    PathNode.CurveTo(168.0f, 246.62741f, 173.37259f, 252.0f, 180.0f, 252.0f),
                    PathNode.CurveTo(186.62741f, 252.0f, 192.0f, 246.62741f, 192.0f, 240.0f),
                    PathNode.LineTo(192.0f, 204.12f),
                    PathNode.CurveTo(203.58969f, 197.71832f, 214.03525f, 189.43555f, 222.91f, 179.61f),
                    PathNode.CurveTo(226.1946f, 175.95168f, 228.00789f, 171.20648f, 228.0f, 166.29f),
                    PathNode.LineTo(228.0f, 118.53f),
                    PathNode.LineTo(249.8f, 106.53f),
                    PathNode.CurveTo(253.6198f, 104.41657f, 255.99052f, 100.39548f, 255.99052f, 96.03f),
                    PathNode.CurveTo(255.99052f, 91.66453f, 253.6198f, 87.643425f, 249.8f, 85.53f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 45.71f),
                    PathNode.LineTo(219.16f, 96.0f),
                    PathNode.LineTo(186.0f, 114.3f),
                    PathNode.CurveTo(185.93774f, 114.26349f, 185.87762f, 114.22342f, 185.82f, 114.18f),
                    PathNode.LineTo(133.82f, 85.49f),
                    PathNode.CurveTo(128.0472f, 82.50639f, 120.94832f, 84.66001f, 117.806305f, 90.348145f),
                    PathNode.CurveTo(114.66428f, 96.036285f, 116.62087f, 103.19197f, 122.22f, 106.49f),
                    PathNode.LineTo(161.22f, 127.98f),
                    PathNode.LineTo(128.0f, 146.3f),
                    PathNode.LineTo(36.84f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(87.58f, 196.0f, 63.35f, 176.93f, 52.0f, 164.73f),
                    PathNode.LineTo(52.0f, 131.73f),
                    PathNode.LineTo(122.2f, 170.47f),
                    PathNode.CurveTo(125.809845f, 172.46301f, 130.19016f, 172.46301f, 133.8f, 170.47f),
                    PathNode.LineTo(168.0f, 151.64f),
                    PathNode.LineTo(168.0f, 188.87f),
                    PathNode.CurveTo(155.22223f, 193.69951f, 141.6595f, 196.11707f, 128.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 164.73f),
                    PathNode.CurveTo(200.32031f, 168.67374f, 196.30524f, 172.29066f, 192.0f, 175.54f),
                    PathNode.LineTo(192.0f, 138.39f),
                    PathNode.LineTo(204.0f, 131.77f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
