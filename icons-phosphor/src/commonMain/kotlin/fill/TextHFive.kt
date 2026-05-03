package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorFillIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(128.0f, 164.41827f, 124.41828f, 168.0f, 120.0f, 168.0f),
                    PathNode.CurveTo(115.58172f, 168.0f, 112.0f, 164.41827f, 112.0f, 160.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.CurveTo(72.0f, 164.41827f, 68.41828f, 168.0f, 64.0f, 168.0f),
                    PathNode.CurveTo(59.581722f, 168.0f, 56.0f, 164.41827f, 56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 75.58172f, 59.581722f, 72.0f, 64.0f, 72.0f),
                    PathNode.CurveTo(68.41828f, 72.0f, 72.0f, 75.58172f, 72.0f, 80.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.LineTo(112.0f, 112.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 75.58172f, 115.58172f, 72.0f, 120.0f, 72.0f),
                    PathNode.CurveTo(124.41828f, 72.0f, 128.0f, 75.58172f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 120.0f),
                    PathNode.CurveTo(182.2626f, 120.00228f, 194.80197f, 129.44334f, 198.74664f, 143.14961f),
                    PathNode.CurveTo(202.69133f, 156.85587f, 197.08894f, 171.51816f, 185.00954f, 179.10168f),
                    PathNode.CurveTo(172.93015f, 186.68523f, 157.2901f, 185.3591f, 146.66f, 175.85f),
                    PathNode.CurveTo(143.45164f, 172.88487f, 143.21527f, 167.89424f, 146.12901f, 164.63914f),
                    PathNode.CurveTo(149.04274f, 161.38406f, 154.029f, 161.06837f, 157.33f, 163.93f),
                    PathNode.CurveTo(163.76248f, 169.60292f, 173.52394f, 169.19489f, 179.46056f, 163.00494f),
                    PathNode.CurveTo(185.39716f, 156.81499f, 185.39716f, 147.04501f, 179.46056f, 140.85506f),
                    PathNode.CurveTo(173.52394f, 134.66512f, 163.76248f, 134.2571f, 157.33f, 139.93f),
                    PathNode.CurveTo(154.75342f, 142.24232f, 150.98181f, 142.63493f, 147.98422f, 140.90283f),
                    PathNode.CurveTo(144.98665f, 139.17075f, 143.44333f, 135.70705f, 144.16f, 132.32f),
                    PathNode.LineTo(152.16f, 94.32f),
                    PathNode.CurveTo(152.95332f, 90.62647f, 156.22224f, 87.99132f, 160.0f, 88.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.CurveTo(196.41827f, 88.0f, 200.0f, 91.58172f, 200.0f, 96.0f),
                    PathNode.CurveTo(200.0f, 100.41828f, 196.41827f, 104.0f, 192.0f, 104.0f),
                    PathNode.LineTo(166.49f, 104.0f),
                    PathNode.LineTo(163.0f, 120.37f),
                    PathNode.CurveTo(164.65532f, 120.12407f, 166.3265f, 120.000404f, 168.0f, 120.0f),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
