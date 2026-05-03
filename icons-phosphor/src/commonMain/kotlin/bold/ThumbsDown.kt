package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorBoldIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.78f, 156.53f),
                    PathNode.LineTo(231.78f, 60.53f),
                    PathNode.CurveTo(230.03006f, 46.51824f, 218.1206f, 36.002094f, 204.0f, 36.0f),
                    PathNode.LineTo(32.0f, 36.0f),
                    PathNode.CurveTo(20.954306f, 36.0f, 12.0f, 44.954304f, 12.0f, 56.0f),
                    PathNode.LineTo(12.0f, 144.0f),
                    PathNode.CurveTo(12.0f, 155.0457f, 20.954306f, 164.0f, 32.0f, 164.0f),
                    PathNode.LineTo(72.58f, 164.0f),
                    PathNode.LineTo(109.27f, 237.37f),
                    PathNode.CurveTo(111.30316f, 241.43306f, 115.45663f, 243.99947f, 120.0f, 244.0f),
                    PathNode.CurveTo(144.28911f, 243.97244f, 163.97244f, 224.28911f, 164.0f, 200.0f),
                    PathNode.LineTo(164.0f, 188.0f),
                    PathNode.LineTo(216.0f, 188.0f),
                    PathNode.CurveTo(224.03001f, 187.99881f, 231.67305f, 184.55008f, 236.98721f, 178.53004f),
                    PathNode.CurveTo(242.30138f, 172.51f, 244.77515f, 164.49812f, 243.78f, 156.53f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 140.0f),
                    PathNode.LineTo(36.0f, 140.0f),
                    PathNode.LineTo(36.0f, 60.0f),
                    PathNode.LineTo(68.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(219.0f, 162.65f),
                    PathNode.CurveTo(218.2399f, 163.50943f, 217.14734f, 164.00108f, 216.0f, 164.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(145.37259f, 164.0f, 140.0f, 169.37259f, 140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 200.0f),
                    PathNode.CurveTo(139.99947f, 208.41547f, 134.73105f, 215.93034f, 126.82f, 218.8f),
                    PathNode.LineTo(92.0f, 149.17f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.LineTo(204.0f, 60.0f),
                    PathNode.CurveTo(206.02776f, 59.984104f, 207.74658f, 61.488083f, 208.0f, 63.5f),
                    PathNode.LineTo(220.0f, 159.5f),
                    PathNode.CurveTo(220.13629f, 160.64505f, 219.7718f, 161.79323f, 219.0f, 162.65f),
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
