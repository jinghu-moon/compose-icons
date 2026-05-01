package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorLightIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 81.44f),
                    PathNode.CurveTo(228.31445f, 76.71021f, 222.3092f, 74.00075f, 216.0f, 74.0f),
                    PathNode.LineTo(158.0f, 74.0f),
                    PathNode.LineTo(158.0f, 56.0f),
                    PathNode.CurveTo(158.0f, 35.01318f, 140.98682f, 18.0f, 120.0f, 18.0f),
                    PathNode.CurveTo(117.725395f, 17.99932f, 115.64599f, 19.284912f, 114.63f, 21.32f),
                    PathNode.LineTo(76.29f, 98.0f),
                    PathNode.LineTo(32.0f, 98.0f),
                    PathNode.CurveTo(24.268015f, 98.0f, 18.0f, 104.26801f, 18.0f, 112.0f),
                    PathNode.LineTo(18.0f, 200.0f),
                    PathNode.CurveTo(18.0f, 207.73198f, 24.268015f, 214.0f, 32.0f, 214.0f),
                    PathNode.LineTo(204.0f, 214.0f),
                    PathNode.CurveTo(215.09465f, 214.00002f, 224.45325f, 205.7389f, 225.83f, 194.73f),
                    PathNode.LineTo(237.83f, 98.73f),
                    PathNode.CurveTo(238.6124f, 92.467514f, 236.6676f, 86.17059f, 232.49f, 81.44f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 200.0f),
                    PathNode.LineTo(30.0f, 112.0f),
                    PathNode.CurveTo(30.0f, 110.89543f, 30.89543f, 110.0f, 32.0f, 110.0f),
                    PathNode.LineTo(74.0f, 110.0f),
                    PathNode.LineTo(74.0f, 202.0f),
                    PathNode.LineTo(32.0f, 202.0f),
                    PathNode.CurveTo(30.89543f, 202.0f, 30.0f, 201.10457f, 30.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(225.92f, 97.24f),
                    PathNode.LineTo(213.92f, 193.24f),
                    PathNode.CurveTo(213.29475f, 198.24338f, 209.0423f, 201.99858f, 204.0f, 202.0f),
                    PathNode.LineTo(86.0f, 202.0f),
                    PathNode.LineTo(86.0f, 105.42f),
                    PathNode.LineTo(123.58f, 30.25f),
                    PathNode.CurveTo(136.43163f, 32.036587f, 145.99883f, 43.024788f, 146.0f, 56.0f),
                    PathNode.LineTo(146.0f, 80.0f),
                    PathNode.CurveTo(146.0f, 83.313705f, 148.6863f, 86.0f, 152.0f, 86.0f),
                    PathNode.LineTo(216.0f, 86.0f),
                    PathNode.CurveTo(218.86777f, 86.00081f, 221.59715f, 87.23277f, 223.49478f, 89.382904f),
                    PathNode.CurveTo(225.3924f, 91.53303f, 226.2756f, 94.39438f, 225.92f, 97.24f),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
