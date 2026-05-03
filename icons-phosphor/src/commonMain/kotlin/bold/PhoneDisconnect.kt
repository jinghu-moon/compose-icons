package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorBoldIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.39f, 87.29f),
                    PathNode.CurveTo(176.72f, 29.57f, 79.28f, 29.57f, 21.61f, 87.29f),
                    PathNode.CurveTo(0.16f, 108.76f, -1.91f, 140.42f, 16.61f, 164.29f),
                    PathNode.CurveTo(22.01959f, 171.22003f, 31.320341f, 173.80493f, 39.53f, 170.66f),
                    PathNode.LineTo(88.4f, 153.29f),
                    PathNode.LineTo(88.85f, 153.13f),
                    PathNode.CurveTo(95.115524f, 150.6083f, 99.68511f, 145.09471f, 101.0f, 138.47f),
                    PathNode.LineTo(106.44f, 111.23f),
                    PathNode.CurveTo(120.359955f, 106.90059f, 135.26195f, 106.86922f, 149.2f, 111.14f),
                    PathNode.LineTo(155.0f, 138.62f),
                    PathNode.CurveTo(156.36469f, 145.17828f, 160.92206f, 150.61786f, 167.14f, 153.11f),
                    PathNode.LineTo(167.59f, 153.28f),
                    PathNode.LineTo(216.53f, 170.65f),
                    PathNode.CurveTo(224.73682f, 173.78996f, 234.03185f, 171.20554f, 239.44f, 164.28f),
                    PathNode.CurveTo(257.91f, 140.42f, 255.84f, 108.76f, 234.39f, 87.29f),
                    PathNode.Close,
                    PathNode.MoveTo(222.16f, 147.19f),
                    PathNode.LineTo(178.0f, 131.5f),
                    PathNode.LineTo(172.24f, 104.0f),
                    PathNode.CurveTo(170.80504f, 97.12671f, 165.87085f, 91.50932f, 159.24f, 89.2f),
                    PathNode.CurveTo(138.83409f, 82.21042f, 116.67462f, 82.259705f, 96.3f, 89.34f),
                    PathNode.CurveTo(89.68148f, 91.69624f, 84.78458f, 97.35235f, 83.4f, 104.24f),
                    PathNode.LineTo(78.0f, 131.53f),
                    PathNode.LineTo(33.84f, 147.19f),
                    PathNode.CurveTo(24.68f, 133.34f, 26.43f, 116.42f, 38.57f, 104.27f),
                    PathNode.CurveTo(62.81f, 80.0f, 95.41f, 67.88f, 128.0f, 67.88f),
                    PathNode.CurveTo(160.59f, 67.88f, 193.19f, 80.0f, 217.43f, 104.27f),
                    PathNode.CurveTo(229.57f, 116.42f, 231.32f, 133.35f, 222.16f, 147.19f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 206.62741f, 222.62741f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(33.37258f, 212.0f, 28.0f, 206.62741f, 28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 193.37259f, 33.37258f, 188.0f, 40.0f, 188.0f),
                    PathNode.LineTo(216.0f, 188.0f),
                    PathNode.CurveTo(222.62741f, 188.0f, 228.0f, 193.37259f, 228.0f, 200.0f),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
