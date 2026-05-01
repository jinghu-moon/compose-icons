package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorBoldIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.0f, 138.0f),
                    PathNode.CurveTo(250.0f, 144.62741f, 244.62741f, 150.0f, 238.0f, 150.0f),
                    PathNode.CurveTo(231.37259f, 150.0f, 226.0f, 144.62741f, 226.0f, 138.0f),
                    PathNode.CurveTo(225.93938f, 86.11036f, 183.88963f, 44.060616f, 132.0f, 44.0f),
                    PathNode.CurveTo(85.62865f, 44.049603f, 48.049603f, 81.62865f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.04959f, 168.84851f, 81.15149f, 201.95041f, 122.0f, 202.0f),
                    PathNode.CurveTo(157.33023f, 201.96143f, 185.96143f, 173.33023f, 186.0f, 138.0f),
                    PathNode.CurveTo(185.96693f, 108.19033f, 161.80966f, 84.033066f, 132.0f, 84.0f),
                    PathNode.CurveTo(107.71089f, 84.02756f, 88.02756f, 103.71089f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 146.77768f, 103.22232f, 162.0f, 122.0f, 162.0f),
                    PathNode.CurveTo(135.25484f, 162.0f, 146.0f, 151.25484f, 146.0f, 138.0f),
                    PathNode.CurveTo(146.0f, 130.26802f, 139.73198f, 124.0f, 132.0f, 124.0f),
                    PathNode.CurveTo(130.94228f, 124.001816f, 129.92833f, 124.42249f, 129.18f, 125.17f),
                    PathNode.CurveTo(134.24194f, 127.58565f, 136.95534f, 133.18549f, 135.71428f, 138.65524f),
                    PathNode.CurveTo(134.47322f, 144.12502f, 129.6088f, 148.00548f, 124.0f, 148.0f),
                    PathNode.CurveTo(112.95431f, 148.0f, 104.0f, 139.0457f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 112.536026f, 116.536026f, 100.0f, 132.0f, 100.0f),
                    PathNode.CurveTo(152.98682f, 100.0f, 170.0f, 117.013176f, 170.0f, 138.0f),
                    PathNode.CurveTo(169.97244f, 164.49825f, 148.49825f, 185.97244f, 122.0f, 186.0f),
                    PathNode.CurveTo(89.983475f, 185.96143f, 64.038574f, 160.01653f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.03858f, 90.46063f, 94.46063f, 60.038586f, 132.0f, 60.0f),
                    PathNode.CurveTo(175.05765f, 60.049595f, 209.95041f, 94.94235f, 210.0f, 138.0f),
                    PathNode.CurveTo(209.94489f, 186.57822f, 170.57822f, 225.94489f, 122.0f, 226.0f),
                    PathNode.CurveTo(67.90122f, 225.93938f, 24.060621f, 182.09877f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.066133f, 68.38066f, 72.38066f, 20.066133f, 132.0f, 20.0f),
                    PathNode.CurveTo(197.13991f, 20.071646f, 249.92834f, 72.8601f, 250.0f, 138.0f),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
