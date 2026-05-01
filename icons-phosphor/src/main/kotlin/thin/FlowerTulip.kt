package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorThinIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 52.0f),
                    PathNode.CurveTo(195.16817f, 51.992184f, 182.50716f, 54.941853f, 171.0f, 60.62f),
                    PathNode.CurveTo(156.8f, 34.16f, 131.0f, 20.99f, 129.81f, 20.42f),
                    PathNode.CurveTo(128.68326f, 19.85618f, 127.356735f, 19.85618f, 126.23f, 20.42f),
                    PathNode.CurveTo(125.09f, 20.99f, 99.23f, 34.16f, 85.04f, 60.62f),
                    PathNode.CurveTo(73.52073f, 54.935863f, 60.845345f, 51.98603f, 48.0f, 52.0f),
                    PathNode.CurveTo(45.79086f, 52.0f, 44.0f, 53.79086f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 96.0f),
                    PathNode.CurveTo(44.053288f, 140.81467f, 79.238594f, 177.71524f, 124.0f, 179.9f),
                    PathNode.LineTo(124.0f, 225.53f),
                    PathNode.LineTo(81.79f, 204.42f),
                    PathNode.CurveTo(79.81282f, 203.43141f, 77.40859f, 204.23282f, 76.42f, 206.21f),
                    PathNode.CurveTo(75.43141f, 208.18718f, 76.23282f, 210.59142f, 78.21f, 211.58f),
                    PathNode.LineTo(126.21f, 235.58f),
                    PathNode.CurveTo(127.33674f, 236.14381f, 128.66327f, 236.14381f, 129.79f, 235.58f),
                    PathNode.LineTo(177.79f, 211.58f),
                    PathNode.CurveTo(179.76718f, 210.59142f, 180.56859f, 208.18718f, 179.58f, 206.21f),
                    PathNode.CurveTo(178.59142f, 204.23282f, 176.18718f, 203.43141f, 174.21f, 204.42f),
                    PathNode.LineTo(132.0f, 225.53f),
                    PathNode.LineTo(132.0f, 179.9f),
                    PathNode.CurveTo(176.76141f, 177.71524f, 211.94672f, 140.81467f, 212.0f, 96.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 53.79086f, 210.20914f, 52.0f, 208.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 28.56f),
                    PathNode.CurveTo(133.91f, 31.93f, 153.0f, 44.01f, 164.0f, 64.49f),
                    PathNode.CurveTo(146.92584f, 75.033875f, 134.16373f, 91.31265f, 128.0f, 110.41f),
                    PathNode.CurveTo(121.836266f, 91.31265f, 109.074165f, 75.033875f, 92.0f, 64.49f),
                    PathNode.CurveTo(103.0f, 44.07f, 122.1f, 31.94f, 128.0f, 28.56f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 96.0f),
                    PathNode.LineTo(52.0f, 60.1f),
                    PathNode.CurveTo(92.340256f, 62.281555f, 123.94748f, 95.60083f, 124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 171.9f),
                    PathNode.CurveTo(83.659744f, 169.71844f, 52.052525f, 136.39917f, 52.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 96.0f),
                    PathNode.CurveTo(203.94748f, 136.39917f, 172.34026f, 169.71844f, 132.0f, 171.9f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.05252f, 95.60083f, 163.65974f, 62.281555f, 204.0f, 60.1f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
