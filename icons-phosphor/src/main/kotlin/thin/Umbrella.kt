package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorThinIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 127.0f),
                    PathNode.CurveTo(232.41039f, 85.79931f, 205.6985f, 50.227608f, 167.1331f, 35.291325f),
                    PathNode.CurveTo(128.5677f, 20.355042f, 84.86439f, 28.655098f, 54.46f, 56.69f),
                    PathNode.CurveTo(34.545303f, 74.96302f, 22.242231f, 100.06544f, 20.0f, 127.0f),
                    PathNode.CurveTo(19.719671f, 130.352f, 20.85908f, 133.66777f, 23.140614f, 136.13943f),
                    PathNode.CurveTo(25.422148f, 138.6111f, 28.636316f, 140.0117f, 32.0f, 140.0f),
                    PathNode.LineTo(124.0f, 140.0f),
                    PathNode.LineTo(124.0f, 200.0f),
                    PathNode.CurveTo(124.0f, 215.46397f, 136.53603f, 228.0f, 152.0f, 228.0f),
                    PathNode.CurveTo(167.46397f, 228.0f, 180.0f, 215.46397f, 180.0f, 200.0f),
                    PathNode.CurveTo(180.0f, 197.79086f, 178.20914f, 196.0f, 176.0f, 196.0f),
                    PathNode.CurveTo(173.79086f, 196.0f, 172.0f, 197.79086f, 172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 211.0457f, 163.0457f, 220.0f, 152.0f, 220.0f),
                    PathNode.CurveTo(140.9543f, 220.0f, 132.0f, 211.0457f, 132.0f, 200.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.LineTo(224.0f, 140.0f),
                    PathNode.CurveTo(227.36368f, 140.0117f, 230.57785f, 138.6111f, 232.85939f, 136.13943f),
                    PathNode.CurveTo(235.14091f, 133.66777f, 236.28033f, 130.352f, 236.0f, 127.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 132.0f),
                    PathNode.CurveTo(30.86989f, 132.00511f, 29.790352f, 131.53194f, 29.028255f, 130.69743f),
                    PathNode.CurveTo(28.26616f, 129.86295f, 27.892628f, 128.74501f, 28.0f, 127.62f),
                    PathNode.CurveTo(32.133236f, 79.63865f, 69.816246f, 41.384495f, 117.73f, 36.53f),
                    PathNode.CurveTo(106.0f, 49.76f, 85.08f, 80.45f, 84.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 132.0f),
                    PathNode.CurveTo(93.21f, 76.0f, 119.6f, 45.63f, 127.94f, 37.43f),
                    PathNode.CurveTo(136.35f, 45.64f, 162.73f, 76.0f, 163.94f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.87f, 130.7f),
                    PathNode.CurveTo(226.10085f, 131.54091f, 225.00952f, 132.01381f, 223.87f, 132.0f),
                    PathNode.LineTo(172.0f, 132.0f),
                    PathNode.CurveTo(171.0f, 80.45f, 150.0f, 49.76f, 138.3f, 36.53f),
                    PathNode.CurveTo(186.20203f, 41.398f, 223.86913f, 79.64878f, 228.0f, 127.62f),
                    PathNode.CurveTo(228.09695f, 128.75204f, 227.70792f, 129.87189f, 226.93f, 130.7f),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
