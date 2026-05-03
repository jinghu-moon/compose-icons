package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorRegularIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 120.0f),
                    PathNode.CurveTo(247.97244f, 93.501755f, 226.49825f, 72.02756f, 200.0f, 72.0f),
                    PathNode.LineTo(160.2f, 72.0f),
                    PathNode.CurveTo(157.29f, 71.83f, 106.58f, 68.26f, 58.29f, 27.76f),
                    PathNode.CurveTo(53.529133f, 23.761578f, 46.883068f, 22.883085f, 41.24682f, 25.50719f),
                    PathNode.CurveTo(35.61057f, 28.131294f, 32.00473f, 33.78283f, 32.0f, 40.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.000847f, 206.21898f, 35.60522f, 211.87407f, 41.24229f, 214.5007f),
                    PathNode.CurveTo(46.879356f, 217.12732f, 53.52775f, 216.24959f, 58.29f, 212.25f),
                    PathNode.CurveTo(96.06f, 180.57f, 135.29f, 171.49f, 152.0f, 168.95f),
                    PathNode.LineTo(152.0f, 200.67f),
                    PathNode.CurveTo(151.99318f, 206.02483f, 154.66557f, 211.02808f, 159.12f, 214.0f),
                    PathNode.LineTo(170.12f, 221.33f),
                    PathNode.CurveTo(174.43423f, 224.20953f, 179.87668f, 224.81902f, 184.72101f, 222.96515f),
                    PathNode.CurveTo(189.56534f, 221.11127f, 193.21039f, 217.02408f, 194.5f, 212.0f),
                    PathNode.LineTo(206.27f, 167.64f),
                    PathNode.CurveTo(230.15353f, 164.46222f, 247.99495f, 144.09401f, 248.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 199.93f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(90.81f, 75.91f, 134.63f, 85.0f, 152.0f, 87.24f),
                    PathNode.LineTo(152.0f, 152.72f),
                    PathNode.CurveTo(134.65f, 155.0f, 90.84f, 164.07f, 48.0f, 199.93f),
                    PathNode.Close,
                    PathNode.MoveTo(179.0f, 207.93f),
                    PathNode.LineTo(179.0f, 208.04f),
                    PathNode.LineTo(168.0f, 200.71f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(189.6f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(217.67311f, 88.0f, 232.0f, 102.32689f, 232.0f, 120.0f),
                    PathNode.CurveTo(232.0f, 137.67311f, 217.67311f, 152.0f, 200.0f, 152.0f),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
