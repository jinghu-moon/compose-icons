package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) return _chatCircleDots!!
        _chatCircleDots = phosphorDuotoneIcon(
            name = "ChatCircleDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.00429f, 162.31409f, 205.6932f, 194.02127f, 175.9702f, 211.16766f),
                    PathNode.CurveTo(146.24718f, 228.31404f, 109.63241f, 228.29207f, 79.93f, 211.11f),
                    PathNode.LineTo(79.93f, 211.11f),
                    PathNode.LineTo(42.54f, 223.58f),
                    PathNode.CurveTo(39.665073f, 224.53876f, 36.4952f, 223.7907f, 34.352257f, 221.64775f),
                    PathNode.CurveTo(32.209312f, 219.50479f, 31.46124f, 216.33493f, 32.42f, 213.46f),
                    PathNode.LineTo(44.89f, 176.07f),
                    PathNode.LineTo(44.89f, 176.07f),
                    PathNode.CurveTo(24.68798f, 141.12688f, 28.50076f, 97.279205f, 54.43093f, 66.34751f),
                    PathNode.CurveTo(80.36111f, 35.415817f, 122.86991f, 24.007196f, 160.80312f, 37.799076f),
                    PathNode.CurveTo(198.73631f, 51.590954f, 223.99126f, 87.63735f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.CurveTo(82.72464f, 203.48499f, 81.34504f, 203.11247f, 79.94f, 203.11f),
                    PathNode.CurveTo(79.079346f, 203.11037f, 78.22461f, 203.25226f, 77.41f, 203.53f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(52.47f, 178.6f),
                    PathNode.CurveTo(53.19712f, 176.42612f, 52.956802f, 174.04477f, 51.81f, 172.06f),
                    PathNode.CurveTo(31.865643f, 137.5781f, 37.5715f, 93.99888f, 65.72088f, 65.81392f),
                    PathNode.CurveTo(93.870255f, 37.62896f, 137.44223f, 31.868057f, 171.9493f, 51.76884f),
                    PathNode.CurveTo(206.45638f, 71.669624f, 223.29192f, 112.26852f, 212.99432f, 150.74889f),
                    PathNode.CurveTo(202.69673f, 189.22925f, 167.8344f, 215.99347f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 134.62741f, 90.62742f, 140.0f, 84.0f, 140.0f),
                    PathNode.CurveTo(77.37258f, 140.0f, 72.0f, 134.62741f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 121.37258f, 77.37258f, 116.0f, 84.0f, 116.0f),
                    PathNode.CurveTo(90.62742f, 116.0f, 96.0f, 121.37258f, 96.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 134.62741f, 178.62741f, 140.0f, 172.0f, 140.0f),
                    PathNode.CurveTo(165.37259f, 140.0f, 160.0f, 134.62741f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 121.37258f, 165.37259f, 116.0f, 172.0f, 116.0f),
                    PathNode.CurveTo(178.62741f, 116.0f, 184.0f, 121.37258f, 184.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
