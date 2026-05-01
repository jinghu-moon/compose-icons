package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorRegularIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.68f, 66.15f),
                    PathNode.LineTo(135.68f, 18.0f),
                    PathNode.CurveTo(130.89761f, 15.370484f, 125.10239f, 15.370484f, 120.32f, 18.0f),
                    PathNode.LineTo(32.32f, 66.18f),
                    PathNode.CurveTo(27.201473f, 68.9806f, 24.013245f, 74.345406f, 24.0f, 80.18f),
                    PathNode.LineTo(24.0f, 175.82f),
                    PathNode.CurveTo(24.013245f, 181.6546f, 27.201473f, 187.01941f, 32.32f, 189.82f),
                    PathNode.LineTo(120.32f, 237.99f),
                    PathNode.CurveTo(125.099464f, 240.63086f, 130.90053f, 240.63086f, 135.68f, 237.99f),
                    PathNode.LineTo(223.68f, 189.82f),
                    PathNode.CurveTo(228.79852f, 187.01941f, 231.98676f, 181.6546f, 232.0f, 175.82f),
                    PathNode.LineTo(232.0f, 80.18f),
                    PathNode.CurveTo(231.9977f, 74.33465f, 228.80794f, 68.955765f, 223.68f, 66.15f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 152.0f),
                    PathNode.LineTo(168.0f, 202.09f),
                    PathNode.LineTo(136.0f, 219.61f),
                    PathNode.LineTo(136.0f, 132.74f),
                    PathNode.LineTo(216.0f, 88.94f),
                    PathNode.LineTo(216.0f, 120.94f),
                    PathNode.LineTo(172.16f, 144.94f),
                    PathNode.CurveTo(169.58183f, 146.3506f, 167.98465f, 149.0612f, 168.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.84f, 145.0f),
                    PathNode.LineTo(40.0f, 121.0f),
                    PathNode.LineTo(40.0f, 89.0f),
                    PathNode.LineTo(120.0f, 132.8f),
                    PathNode.LineTo(120.0f, 219.67f),
                    PathNode.LineTo(88.0f, 202.09f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.CurveTo(87.99338f, 149.0827f, 86.39926f, 146.4003f, 83.84f, 145.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.14f, 56.59f),
                    PathNode.LineTo(124.14f, 79.04f),
                    PathNode.CurveTo(126.53263f, 80.34914f, 129.42737f, 80.34914f, 131.82f, 79.04f),
                    PathNode.LineTo(172.82f, 56.59f),
                    PathNode.LineTo(207.3f, 75.46f),
                    PathNode.LineTo(128.0f, 118.88f),
                    PathNode.LineTo(48.66f, 75.44f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.LineTo(156.2f, 47.44f),
                    PathNode.LineTo(128.0f, 62.89f),
                    PathNode.LineTo(99.8f, 47.45f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 139.22f),
                    PathNode.LineTo(72.0f, 156.74f),
                    PathNode.LineTo(72.0f, 193.33f),
                    PathNode.LineTo(40.0f, 175.82f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 193.33f),
                    PathNode.LineTo(184.0f, 156.74f),
                    PathNode.LineTo(216.0f, 139.22f),
                    PathNode.LineTo(216.0f, 175.82f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
