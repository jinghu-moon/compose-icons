package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorBoldIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.84f, 120.46f),
                    PathNode.CurveTo(185.6928f, 118.09851f, 182.34695f, 116.01405f, 178.84f, 114.23f),
                    PathNode.CurveTo(175.12f, 92.55f, 162.43f, 76.82f, 143.32f, 71.03f),
                    PathNode.CurveTo(121.94f, 64.55f, 97.29f, 72.42f, 86.0f, 89.34f),
                    PathNode.CurveTo(82.321785f, 94.86285f, 83.817154f, 102.321785f, 89.34f, 106.0f),
                    PathNode.CurveTo(94.86285f, 109.678215f, 102.321785f, 108.182846f, 106.0f, 102.66f),
                    PathNode.CurveTo(111.47f, 94.46f, 125.11f, 90.58f, 136.41f, 94.0f),
                    PathNode.CurveTo(142.82132f, 95.899536f, 148.18962f, 100.3154f, 151.29f, 106.24f),
                    PathNode.CurveTo(148.34628f, 105.93896f, 145.38907f, 105.78876f, 142.43f, 105.79f),
                    PathNode.CurveTo(108.56f, 105.79f, 84.0f, 125.22f, 84.0f, 152.0f),
                    PathNode.CurveTo(84.0f, 174.9f, 101.54f, 191.52f, 125.71f, 191.52f),
                    PathNode.CurveTo(139.773f, 191.44046f, 153.20415f, 185.66827f, 162.94f, 175.52f),
                    PathNode.CurveTo(168.94f, 169.29f, 175.82f, 159.06f, 178.66f, 143.45f),
                    PathNode.CurveTo(184.86f, 149.87f, 188.0f, 158.12f, 188.0f, 168.04f),
                    PathNode.CurveTo(188.0f, 185.78f, 168.93f, 212.04f, 128.0f, 212.04f),
                    PathNode.CurveTo(82.24f, 212.04f, 60.0f, 184.56f, 60.0f, 128.04f),
                    PathNode.CurveTo(60.0f, 71.52f, 82.24f, 44.04f, 128.0f, 44.04f),
                    PathNode.CurveTo(159.08f, 44.04f, 179.0f, 56.46f, 188.8f, 82.04f),
                    PathNode.CurveTo(191.18034f, 88.225586f, 198.1244f, 91.31035f, 204.31f, 88.93f),
                    PathNode.CurveTo(210.49559f, 86.54966f, 213.58035f, 79.60559f, 211.2f, 73.42f),
                    PathNode.CurveTo(197.77f, 38.44f, 169.0f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(68.67f, 20.0f, 36.0f, 58.35f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 197.65f, 68.67f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(159.36f, 236.0f, 179.08f, 223.95f, 190.11f, 213.85f),
                    PathNode.CurveTo(203.81f, 201.28f, 212.0f, 184.14f, 212.0f, 168.0f),
                    PathNode.CurveTo(212.0f, 148.36f, 204.0f, 131.92f, 188.84f, 120.46f),
                    PathNode.Close,
                    PathNode.MoveTo(145.64f, 158.85f),
                    PathNode.CurveTo(140.44171f, 164.31516f, 133.25215f, 167.44276f, 125.71f, 167.52f),
                    PathNode.CurveTo(117.54f, 167.52f, 108.0f, 163.46f, 108.0f, 152.0f),
                    PathNode.CurveTo(108.0f, 136.74f, 125.84f, 129.79f, 142.41f, 129.79f),
                    PathNode.CurveTo(146.95627f, 129.78516f, 151.48846f, 130.29507f, 155.92f, 131.31f),
                    PathNode.CurveTo(155.36f, 142.93f, 151.84f, 152.41f, 145.64f, 158.85f),
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
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
