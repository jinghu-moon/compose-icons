package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorRegularIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 115.05f),
                    PathNode.LineTo(172.42f, 96.84f),
                    PathNode.CurveTo(176.3716f, 94.86282f, 181.17783f, 96.4634f, 183.155f, 100.415f),
                    PathNode.CurveTo(185.13219f, 104.3666f, 183.5316f, 109.17282f, 179.58f, 111.15f),
                    PathNode.LineTo(131.58f, 135.15f),
                    PathNode.CurveTo(129.10077f, 136.39061f, 126.15595f, 136.25922f, 123.79706f, 134.80273f),
                    PathNode.CurveTo(121.43816f, 133.34625f, 120.00148f, 130.77232f, 120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 67.58172f, 123.58172f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(132.41827f, 64.0f, 136.0f, 67.58172f, 136.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 132.41827f, 219.58173f, 136.0f, 224.0f, 136.0f),
                    PathNode.CurveTo(228.41827f, 136.0f, 232.0f, 132.41827f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 70.562386f, 185.4376f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(132.41827f, 232.0f, 136.0f, 228.41827f, 136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 219.58173f, 132.41827f, 216.0f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(231.73f, 221.94f),
                    PathNode.CurveTo(232.52795f, 224.72298f, 231.76006f, 227.71992f, 229.72214f, 229.77628f),
                    PathNode.CurveTo(227.68422f, 231.83263f, 224.69432f, 232.62749f, 221.90427f, 231.85463f),
                    PathNode.CurveTo(219.11421f, 231.08179f, 216.95941f, 228.86182f, 216.27f, 226.05f),
                    PathNode.CurveTo(213.44f, 215.42f, 203.46f, 208.0f, 192.0f, 208.0f),
                    PathNode.CurveTo(180.54f, 208.0f, 170.56f, 215.42f, 167.73f, 226.05f),
                    PathNode.CurveTo(166.8004f, 229.55655f, 163.62769f, 231.99869f, 160.0f, 232.0f),
                    PathNode.CurveTo(159.30463f, 231.99825f, 158.61234f, 231.90752f, 157.94f, 231.73f),
                    PathNode.CurveTo(153.67091f, 230.5922f, 151.13242f, 226.20914f, 152.27f, 221.94f),
                    PathNode.CurveTo(154.86488f, 212.3046f, 160.96753f, 203.98701f, 169.38f, 198.62f),
                    PathNode.CurveTo(160.22078f, 189.47083f, 157.47656f, 175.7043f, 162.42749f, 163.74242f),
                    PathNode.CurveTo(167.37843f, 151.78052f, 179.04901f, 143.98018f, 191.995f, 143.98018f),
                    PathNode.CurveTo(204.941f, 143.98018f, 216.61157f, 151.78052f, 221.5625f, 163.74242f),
                    PathNode.CurveTo(226.51344f, 175.7043f, 223.76921f, 189.47083f, 214.61f, 198.62f),
                    PathNode.CurveTo(223.02625f, 203.98518f, 229.13263f, 212.303f, 231.73f, 221.94f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 184.83656f, 183.16344f, 192.0f, 192.0f, 192.0f),
                    PathNode.CurveTo(200.83656f, 192.0f, 208.0f, 184.83656f, 208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 167.16344f, 200.83656f, 160.0f, 192.0f, 160.0f),
                    PathNode.CurveTo(183.16344f, 160.0f, 176.0f, 167.16344f, 176.0f, 176.0f),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
