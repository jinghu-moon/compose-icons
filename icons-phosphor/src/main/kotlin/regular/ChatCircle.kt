package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorRegularIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(91.476974f, 23.992031f, 57.626514f, 43.143078f, 38.82172f, 74.452995f),
                    PathNode.CurveTo(20.016926f, 105.76292f, 19.014177f, 144.64235f, 36.18f, 176.88f),
                    PathNode.LineTo(24.83f, 210.93f),
                    PathNode.CurveTo(22.912483f, 216.67986f, 24.408623f, 223.0196f, 28.694513f, 227.30548f),
                    PathNode.CurveTo(32.980404f, 231.59138f, 39.320145f, 233.08752f, 45.07f, 231.17f),
                    PathNode.LineTo(79.12f, 219.82f),
                    PathNode.CurveTo(117.32672f, 240.14143f, 164.12462f, 234.68008f, 196.6253f, 206.10704f),
                    PathNode.CurveTo(229.126f, 177.53398f, 240.53671f, 131.82114f, 225.27657f, 91.326164f),
                    PathNode.CurveTo(210.01642f, 50.8312f, 171.27486f, 24.01775f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(112.52978f, 216.01053f, 97.33097f, 211.93658f, 83.94f, 204.19f),
                    PathNode.CurveTo(81.95672f, 203.03987f, 79.575294f, 202.7959f, 77.4f, 203.52f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(52.47f, 178.6f),
                    PathNode.CurveTo(53.19712f, 176.42612f, 52.956802f, 174.04477f, 51.81f, 172.06f),
                    PathNode.CurveTo(31.865643f, 137.5781f, 37.5715f, 93.99888f, 65.72088f, 65.81392f),
                    PathNode.CurveTo(93.870255f, 37.62896f, 137.44223f, 31.868057f, 171.9493f, 51.76884f),
                    PathNode.CurveTo(206.45638f, 71.669624f, 223.29192f, 112.26852f, 212.99432f, 150.74889f),
                    PathNode.CurveTo(202.69673f, 189.22925f, 167.8344f, 215.99347f, 128.0f, 216.0f),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
