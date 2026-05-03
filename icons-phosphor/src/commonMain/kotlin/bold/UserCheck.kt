package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorBoldIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.5f, 156.54f),
                    PathNode.CurveTo(176.62616f, 137.57211f, 186.07729f, 105.39627f, 176.04161f, 76.393906f),
                    PathNode.CurveTo(166.00594f, 47.39154f, 138.6896f, 27.938322f, 108.0f, 27.938322f),
                    PathNode.CurveTo(77.310394f, 27.938322f, 49.994072f, 47.39154f, 39.958393f, 76.393906f),
                    PathNode.CurveTo(29.922712f, 105.39627f, 39.373844f, 137.57211f, 63.5f, 156.54f),
                    PathNode.CurveTo(44.572296f, 164.25806f, 27.846134f, 176.53561f, 14.81f, 192.28f),
                    PathNode.CurveTo(10.546362f, 197.3555f, 11.204503f, 204.92636f, 16.28f, 209.19f),
                    PathNode.CurveTo(21.355497f, 213.45364f, 28.926361f, 212.7955f, 33.19f, 207.72f),
                    PathNode.CurveTo(46.88f, 191.42f, 71.0f, 172.0f, 108.0f, 172.0f),
                    PathNode.CurveTo(145.0f, 172.0f, 169.12f, 191.42f, 182.81f, 207.72f),
                    PathNode.CurveTo(187.07364f, 212.7955f, 194.6445f, 213.45364f, 199.72f, 209.19f),
                    PathNode.CurveTo(204.7955f, 204.92636f, 205.45364f, 197.3555f, 201.19f, 192.28f),
                    PathNode.CurveTo(188.15701f, 176.53227f, 171.42995f, 164.25407f, 152.5f, 156.54f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 100.0f),
                    PathNode.CurveTo(60.0f, 73.49033f, 81.49033f, 52.0f, 108.0f, 52.0f),
                    PathNode.CurveTo(134.50967f, 52.0f, 156.0f, 73.49033f, 156.0f, 100.0f),
                    PathNode.CurveTo(156.0f, 126.50967f, 134.50967f, 148.0f, 108.0f, 148.0f),
                    PathNode.CurveTo(81.501755f, 147.97244f, 60.02756f, 126.498245f, 60.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.49f, 136.49f),
                    PathNode.LineTo(220.49f, 168.49f),
                    PathNode.CurveTo(218.23837f, 170.74945f, 215.17982f, 172.01947f, 211.99f, 172.01947f),
                    PathNode.CurveTo(208.80019f, 172.01947f, 205.74162f, 170.74945f, 203.49f, 168.49f),
                    PathNode.LineTo(187.49f, 152.49f),
                    PathNode.CurveTo(182.79558f, 147.79558f, 182.79558f, 140.18442f, 187.49f, 135.49f),
                    PathNode.CurveTo(192.18442f, 130.79558f, 199.79558f, 130.79558f, 204.49f, 135.49f),
                    PathNode.LineTo(212.0f, 143.0f),
                    PathNode.LineTo(235.51f, 119.48f),
                    PathNode.CurveTo(240.20442f, 114.785576f, 247.81558f, 114.785576f, 252.51f, 119.48f),
                    PathNode.CurveTo(257.2044f, 124.17442f, 257.2044f, 131.78558f, 252.51f, 136.48f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
