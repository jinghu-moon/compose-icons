package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorFillIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(232.00099f, 188.30128f, 230.26254f, 192.42017f, 227.18f, 195.42f),
                    PathNode.CurveTo(226.39607f, 196.14517f, 225.35472f, 196.52678f, 224.28786f, 196.47983f),
                    PathNode.CurveTo(223.22098f, 196.43286f, 222.21718f, 195.96124f, 221.5f, 195.17f),
                    PathNode.LineTo(86.52f, 46.69f),
                    PathNode.CurveTo(85.4504f, 45.513046f, 85.17965f, 43.81425f, 85.83038f, 42.36311f),
                    PathNode.CurveTo(86.48112f, 40.91197f, 87.92971f, 39.98418f, 89.52f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(51.69698f, 32.17424f, 48.198795f, 31.3473f, 45.11596f, 32.5388f),
                    PathNode.CurveTo(42.03312f, 33.730297f, 40.000355f, 36.69492f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 192.83656f, 31.163445f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(100.43f, 200.0f),
                    PathNode.LineTo(114.11f, 223.94f),
                    PathNode.CurveTo(116.9592f, 228.92334f, 122.25965f, 231.99847f, 128.0f, 231.99847f),
                    PathNode.CurveTo(133.74034f, 231.99847f, 139.0408f, 228.92334f, 141.89f, 223.94f),
                    PathNode.LineTo(155.57f, 200.0f),
                    PathNode.LineTo(182.64f, 200.0f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
