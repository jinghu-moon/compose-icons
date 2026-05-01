package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorBoldIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.5f, 164.53f),
                    PathNode.CurveTo(176.62616f, 145.56212f, 186.07729f, 113.38627f, 176.04161f, 84.3839f),
                    PathNode.CurveTo(166.00594f, 55.381542f, 138.6896f, 35.92832f, 108.0f, 35.92832f),
                    PathNode.CurveTo(77.310394f, 35.92832f, 49.994072f, 55.381542f, 39.958393f, 84.3839f),
                    PathNode.CurveTo(29.922712f, 113.38627f, 39.373844f, 145.56212f, 63.5f, 164.53f),
                    PathNode.CurveTo(44.572853f, 172.25383f, 27.847252f, 184.53438f, 14.81f, 200.28f),
                    PathNode.CurveTo(10.546362f, 205.3555f, 11.204503f, 212.92636f, 16.28f, 217.19f),
                    PathNode.CurveTo(21.355497f, 221.45364f, 28.926361f, 220.7955f, 33.19f, 215.72f),
                    PathNode.CurveTo(46.88f, 199.42f, 71.0f, 180.0f, 108.0f, 180.0f),
                    PathNode.CurveTo(145.0f, 180.0f, 169.12f, 199.42f, 182.81f, 215.72f),
                    PathNode.CurveTo(187.07364f, 220.7955f, 194.6445f, 221.45364f, 199.72f, 217.19f),
                    PathNode.CurveTo(204.7955f, 212.92636f, 205.45364f, 205.3555f, 201.19f, 200.28f),
                    PathNode.CurveTo(188.15504f, 184.53195f, 171.42877f, 172.25092f, 152.5f, 164.53f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 108.0f),
                    PathNode.CurveTo(60.0f, 81.49033f, 81.49033f, 60.0f, 108.0f, 60.0f),
                    PathNode.CurveTo(134.50967f, 60.0f, 156.0f, 81.49033f, 156.0f, 108.0f),
                    PathNode.CurveTo(156.0f, 134.50967f, 134.50967f, 156.0f, 108.0f, 156.0f),
                    PathNode.CurveTo(81.501755f, 155.97244f, 60.02756f, 134.49825f, 60.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 108.0f),
                    PathNode.CurveTo(252.0367f, 127.503624f, 248.08582f, 146.80885f, 240.39f, 164.73f),
                    PathNode.CurveTo(238.8969f, 168.95015f, 235.17892f, 171.98839f, 230.74593f, 172.6109f),
                    PathNode.CurveTo(226.31291f, 173.2334f, 221.90195f, 171.33669f, 219.30428f, 167.691f),
                    PathNode.CurveTo(216.70659f, 164.0453f, 216.35413f, 159.25674f, 218.39f, 155.27f),
                    PathNode.CurveTo(231.27057f, 125.072845f, 231.27057f, 90.927155f, 218.39f, 60.73f),
                    PathNode.CurveTo(216.35413f, 56.743237f, 216.70659f, 51.954716f, 219.30428f, 48.309013f),
                    PathNode.CurveTo(221.90195f, 44.66331f, 226.31291f, 42.76659f, 230.74593f, 43.389103f),
                    PathNode.CurveTo(235.17892f, 44.011616f, 238.8969f, 47.049843f, 240.39f, 51.27f),
                    PathNode.CurveTo(248.08582f, 69.19114f, 252.0367f, 88.496376f, 252.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.0f, 64.76f),
                    PathNode.CurveTo(219.01355f, 92.335f, 219.01355f, 123.665f, 207.0f, 151.24f),
                    PathNode.CurveTo(204.3435f, 157.31512f, 197.26514f, 160.08649f, 191.19f, 157.43f),
                    PathNode.CurveTo(185.11487f, 154.77351f, 182.3435f, 147.69513f, 185.0f, 141.62f),
                    PathNode.CurveTo(194.31958f, 120.17545f, 194.31958f, 95.82455f, 185.0f, 74.38f),
                    PathNode.CurveTo(182.3435f, 68.30487f, 185.11487f, 61.226494f, 191.19f, 58.57f),
                    PathNode.CurveTo(197.26514f, 55.91351f, 204.3435f, 58.684868f, 207.0f, 64.76f),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
