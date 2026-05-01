package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorFillIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 128.0f),
                    PathNode.CurveTo(252.00087f, 129.33783f, 251.33287f, 130.58751f, 250.22f, 131.33f),
                    PathNode.LineTo(202.22f, 163.33f),
                    PathNode.CurveTo(200.99225f, 164.14912f, 199.41322f, 164.22563f, 198.11206f, 163.52902f),
                    PathNode.CurveTo(196.81088f, 162.83241f, 195.99904f, 161.4759f, 196.0f, 160.0f),
                    PathNode.LineTo(196.0f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(108.0f, 184.0f),
                    PathNode.LineTo(108.0f, 176.0f),
                    PathNode.CurveTo(108.0f, 169.37259f, 113.37258f, 164.0f, 120.0f, 164.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(158.62741f, 164.0f, 164.0f, 169.37259f, 164.0f, 176.0f),
                    PathNode.LineTo(164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 214.62741f, 158.62741f, 220.0f, 152.0f, 220.0f),
                    PathNode.LineTo(120.0f, 220.0f),
                    PathNode.CurveTo(113.37258f, 220.0f, 108.0f, 214.62741f, 108.0f, 208.0f),
                    PathNode.LineTo(108.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(63.163445f, 200.0f, 56.0f, 192.83656f, 56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(8.0f, 136.0f),
                    PathNode.CurveTo(3.581722f, 136.0f, 0f, 132.41827f, 0f, 128.0f),
                    PathNode.CurveTo(0f, 123.58172f, 3.581722f, 120.0f, 8.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.CurveTo(56.0f, 63.163445f, 63.163445f, 56.0f, 72.0f, 56.0f),
                    PathNode.LineTo(109.17f, 56.0f),
                    PathNode.CurveTo(113.14216f, 42.676987f, 126.28826f, 34.28623f, 140.04517f, 36.29333f),
                    PathNode.CurveTo(153.80206f, 38.300434f, 164.00282f, 50.097458f, 164.00282f, 64.0f),
                    PathNode.CurveTo(164.00282f, 77.90254f, 153.80206f, 89.69956f, 140.04517f, 91.706665f),
                    PathNode.CurveTo(126.28826f, 93.713776f, 113.14216f, 85.32301f, 109.17f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.LineTo(196.0f, 120.0f),
                    PathNode.LineTo(196.0f, 96.0f),
                    PathNode.CurveTo(195.99904f, 94.52409f, 196.81088f, 93.16758f, 198.11206f, 92.47098f),
                    PathNode.CurveTo(199.41322f, 91.77437f, 200.99225f, 91.85087f, 202.22f, 92.67f),
                    PathNode.LineTo(250.22f, 124.67f),
                    PathNode.CurveTo(251.33287f, 125.41249f, 252.00087f, 126.66218f, 252.0f, 128.0f),
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
        return _usb!!
    }

private var _usb: ImageVector? = null
