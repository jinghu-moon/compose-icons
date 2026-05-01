package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorFillIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.09f, 98.9f),
                    PathNode.CurveTo(168.89436f, 106.27505f, 169.2762f, 115.68829f, 165.08495f, 123.42824f),
                    PathNode.CurveTo(160.89369f, 131.16818f, 152.8019f, 135.99287f, 144.0f, 136.0f),
                    PathNode.LineTo(131.63f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.27f, 58.0f),
                    PathNode.CurveTo(187.6735f, 56.6021f, 185.587f, 55.895763f, 183.46965f, 56.036423f),
                    PathNode.CurveTo(181.3523f, 56.17708f, 179.37756f, 57.153206f, 177.98f, 58.75f),
                    PathNode.LineTo(162.42f, 76.51f),
                    PathNode.CurveTo(156.7328f, 73.5452f, 150.4136f, 71.997986f, 144.0f, 72.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.CurveTo(75.58172f, 72.0f, 72.0f, 75.58172f, 72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 84.41828f, 75.58172f, 88.0f, 80.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(146.49893f, 87.99902f, 148.98251f, 88.390465f, 151.36f, 89.16f),
                    PathNode.LineTo(110.36f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.CurveTo(75.58172f, 136.0f, 72.0f, 139.58173f, 72.0f, 144.0f),
                    PathNode.CurveTo(72.0f, 148.41827f, 75.58172f, 152.0f, 80.0f, 152.0f),
                    PathNode.LineTo(96.37f, 152.0f),
                    PathNode.LineTo(66.0f, 186.73f),
                    PathNode.CurveTo(63.400845f, 190.07132f, 63.85457f, 194.85905f, 67.03511f, 197.65262f),
                    PathNode.CurveTo(70.21565f, 200.4462f, 75.02193f, 200.2785f, 78.0f, 197.27f),
                    PathNode.LineTo(89.63f, 184.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.CurveTo(180.41827f, 184.0f, 184.0f, 180.41827f, 184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 171.58173f, 180.41827f, 168.0f, 176.0f, 168.0f),
                    PathNode.LineTo(103.63f, 168.0f),
                    PathNode.LineTo(117.63f, 152.0f),
                    PathNode.LineTo(144.0f, 152.0f),
                    PathNode.CurveTo(159.47037f, 151.9914f, 173.54875f, 143.06265f, 180.15155f, 129.0721f),
                    PathNode.CurveTo(186.75433f, 115.081535f, 184.69756f, 98.53787f, 174.87f, 86.59f),
                    PathNode.LineTo(190.0f, 69.27f),
                    PathNode.CurveTo(192.90253f, 65.95357f, 192.57611f, 60.914276f, 189.27f, 58.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
