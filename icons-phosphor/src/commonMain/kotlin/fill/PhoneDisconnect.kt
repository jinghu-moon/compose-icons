package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorFillIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.28f, 161.84f),
                    PathNode.CurveTo(231.93658f, 167.39088f, 224.47241f, 169.44577f, 217.9f, 166.9f),
                    PathNode.LineTo(168.9f, 149.51f),
                    PathNode.LineTo(168.61f, 149.4f),
                    PathNode.CurveTo(163.63307f, 147.40883f, 159.98395f, 143.05765f, 158.89f, 137.81f),
                    PathNode.LineTo(152.68f, 108.06f),
                    PathNode.LineTo(152.68f, 108.06f),
                    PathNode.CurveTo(136.56866f, 102.57029f, 119.08687f, 102.609f, 103.0f, 108.17f),
                    PathNode.LineTo(97.1f, 137.69f),
                    PathNode.CurveTo(96.04278f, 142.99722f, 92.374535f, 147.41042f, 87.35f, 149.42f),
                    PathNode.LineTo(87.06f, 149.53f),
                    PathNode.LineTo(38.06f, 166.9f),
                    PathNode.CurveTo(36.24111f, 167.61678f, 34.304996f, 167.98976f, 32.35f, 168.0f),
                    PathNode.CurveTo(27.418762f, 168.00899f, 22.758871f, 165.7436f, 19.72f, 161.86f),
                    PathNode.CurveTo(2.49f, 139.64f, 4.42f, 110.15f, 24.41f, 90.15f),
                    PathNode.CurveTo(80.56f, 33.98f, 175.41f, 33.98f, 231.59f, 90.15f),
                    PathNode.LineTo(231.59f, 90.15f),
                    PathNode.CurveTo(251.58f, 110.13f, 253.51f, 139.62f, 236.28f, 161.84f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.CurveTo(35.581722f, 192.0f, 32.0f, 195.58173f, 32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 204.41827f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 204.41827f, 224.0f, 200.0f),
                    PathNode.CurveTo(224.0f, 195.58173f, 220.41827f, 192.0f, 216.0f, 192.0f),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
