package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorLightIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.83f, 157.27f),
                    PathNode.LineTo(225.83f, 61.27f),
                    PathNode.CurveTo(224.45325f, 50.2611f, 215.09465f, 41.99998f, 204.0f, 42.0f),
                    PathNode.LineTo(32.0f, 42.0f),
                    PathNode.CurveTo(24.268015f, 42.0f, 18.0f, 48.268013f, 18.0f, 56.0f),
                    PathNode.LineTo(18.0f, 144.0f),
                    PathNode.CurveTo(18.0f, 151.73198f, 24.268015f, 158.0f, 32.0f, 158.0f),
                    PathNode.LineTo(76.29f, 158.0f),
                    PathNode.LineTo(114.63f, 234.68f),
                    PathNode.CurveTo(115.64599f, 236.71509f, 117.725395f, 238.00069f, 120.0f, 238.0f),
                    PathNode.CurveTo(140.98682f, 238.0f, 158.0f, 220.98682f, 158.0f, 200.0f),
                    PathNode.LineTo(158.0f, 182.0f),
                    PathNode.LineTo(216.0f, 182.0f),
                    PathNode.CurveTo(222.3105f, 182.00002f, 228.31718f, 179.29016f, 232.49336f, 174.5592f),
                    PathNode.CurveTo(236.66954f, 169.82825f, 238.61308f, 163.53172f, 237.83f, 157.27f),
                    PathNode.Close,
                    PathNode.MoveTo(74.0f, 146.0f),
                    PathNode.LineTo(32.0f, 146.0f),
                    PathNode.CurveTo(30.89543f, 146.0f, 30.0f, 145.10457f, 30.0f, 144.0f),
                    PathNode.LineTo(30.0f, 56.0f),
                    PathNode.CurveTo(30.0f, 54.89543f, 30.89543f, 54.0f, 32.0f, 54.0f),
                    PathNode.LineTo(74.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.5f, 166.62f),
                    PathNode.CurveTo(221.60942f, 168.78229f, 218.87221f, 170.01585f, 216.0f, 170.0f),
                    PathNode.LineTo(152.0f, 170.0f),
                    PathNode.CurveTo(148.6863f, 170.0f, 146.0f, 172.6863f, 146.0f, 176.0f),
                    PathNode.LineTo(146.0f, 200.0f),
                    PathNode.CurveTo(145.99883f, 212.97522f, 136.43163f, 223.96341f, 123.58f, 225.75f),
                    PathNode.LineTo(86.0f, 150.58f),
                    PathNode.LineTo(86.0f, 54.0f),
                    PathNode.LineTo(204.0f, 54.0f),
                    PathNode.CurveTo(209.0423f, 54.001423f, 213.29475f, 57.756626f, 213.92f, 62.76f),
                    PathNode.LineTo(225.92f, 158.76f),
                    PathNode.CurveTo(226.29257f, 161.60707f, 225.40941f, 164.47552f, 223.5f, 166.62f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
