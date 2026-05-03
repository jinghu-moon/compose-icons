package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorDuotoneIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(224.0f, 188.41827f, 220.41827f, 192.0f, 216.0f, 192.0f),
                    PathNode.LineTo(150.93f, 192.0f),
                    PathNode.LineTo(134.93f, 220.0f),
                    PathNode.CurveTo(133.50676f, 222.4966f, 130.85378f, 224.038f, 127.98f, 224.038f),
                    PathNode.CurveTo(125.106224f, 224.038f, 122.45324f, 222.4966f, 121.03f, 220.0f),
                    PathNode.LineTo(105.03f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.CurveTo(35.581722f, 192.0f, 32.0f, 188.41827f, 32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(220.41827f, 48.0f, 224.0f, 51.581722f, 224.0f, 56.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(150.92f, 184.0f),
                    PathNode.CurveTo(148.03625f, 183.97418f, 145.36182f, 185.50244f, 143.92f, 188.0f),
                    PathNode.LineTo(127.92f, 216.0f),
                    PathNode.LineTo(111.92f, 188.0f),
                    PathNode.CurveTo(110.47819f, 185.50244f, 107.80374f, 183.97418f, 104.92f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(51.73f, 56.0f),
                    PathNode.LineTo(168.1f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 186.0f),
                    PathNode.CurveTo(232.0f, 190.41827f, 228.41827f, 194.0f, 224.0f, 194.0f),
                    PathNode.CurveTo(219.58173f, 194.0f, 216.0f, 190.41827f, 216.0f, 186.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(98.52f, 56.0f),
                    PathNode.CurveTo(94.10172f, 56.0f, 90.52f, 52.418278f, 90.52f, 48.0f),
                    PathNode.CurveTo(90.52f, 43.581722f, 94.10172f, 40.0f, 98.52f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
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
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
