package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorFillIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.89f, 72.25f),
                    PathNode.LineTo(229.89f, 72.25f),
                    PathNode.LineTo(229.89f, 72.25f),
                    PathNode.CurveTo(228.42877f, 69.69835f, 226.28981f, 67.60092f, 223.71f, 66.19f),
                    PathNode.LineTo(135.68f, 18.0f),
                    PathNode.CurveTo(130.89761f, 15.370484f, 125.10239f, 15.370484f, 120.32f, 18.0f),
                    PathNode.LineTo(32.32f, 66.18f),
                    PathNode.CurveTo(29.74019f, 67.59092f, 27.601229f, 69.68835f, 26.14f, 72.24f),
                    PathNode.LineTo(26.14f, 72.24f),
                    PathNode.LineTo(26.14f, 72.24f),
                    PathNode.CurveTo(24.747095f, 74.65502f, 24.009398f, 77.39209f, 24.0f, 80.18f),
                    PathNode.LineTo(24.0f, 175.82f),
                    PathNode.CurveTo(24.013245f, 181.6546f, 27.201473f, 187.01941f, 32.32f, 189.82f),
                    PathNode.LineTo(120.32f, 237.99f),
                    PathNode.CurveTo(125.099464f, 240.63086f, 130.90053f, 240.63086f, 135.68f, 237.99f),
                    PathNode.LineTo(223.68f, 189.82f),
                    PathNode.CurveTo(228.79852f, 187.01941f, 231.98676f, 181.6546f, 232.0f, 175.82f),
                    PathNode.LineTo(232.0f, 80.18f),
                    PathNode.CurveTo(231.998f, 77.398186f, 231.27074f, 74.66496f, 229.89f, 72.25f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 219.61f),
                    PathNode.LineTo(88.0f, 202.09f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.CurveTo(87.99338f, 149.0827f, 86.39926f, 146.4003f, 83.84f, 145.0f),
                    PathNode.LineTo(40.0f, 121.0f),
                    PathNode.LineTo(40.0f, 89.0f),
                    PathNode.LineTo(120.0f, 132.8f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 118.88f),
                    PathNode.LineTo(48.66f, 75.44f),
                    PathNode.LineTo(83.14f, 56.57f),
                    PathNode.LineTo(124.14f, 79.02f),
                    PathNode.CurveTo(126.53263f, 80.32914f, 129.42737f, 80.32914f, 131.82f, 79.02f),
                    PathNode.LineTo(172.82f, 56.57f),
                    PathNode.LineTo(207.3f, 75.44f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 120.98f),
                    PathNode.LineTo(172.16f, 144.98f),
                    PathNode.CurveTo(169.60074f, 146.3803f, 168.00662f, 149.0627f, 168.0f, 151.98f),
                    PathNode.LineTo(168.0f, 202.07f),
                    PathNode.LineTo(136.0f, 219.59f),
                    PathNode.LineTo(136.0f, 132.74f),
                    PathNode.LineTo(216.0f, 88.94f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
