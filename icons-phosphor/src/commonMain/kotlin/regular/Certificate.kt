package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorRegularIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.CurveTo(128.0f, 140.41827f, 124.41828f, 144.0f, 120.0f, 144.0f),
                    PathNode.LineTo(72.0f, 144.0f),
                    PathNode.CurveTo(67.58172f, 144.0f, 64.0f, 140.41827f, 64.0f, 136.0f),
                    PathNode.CurveTo(64.0f, 131.58173f, 67.58172f, 128.0f, 72.0f, 128.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.CurveTo(124.41828f, 128.0f, 128.0f, 131.58173f, 128.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 96.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.CurveTo(67.58172f, 96.0f, 64.0f, 99.58172f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 108.41828f, 67.58172f, 112.0f, 72.0f, 112.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.CurveTo(124.41828f, 112.0f, 128.0f, 108.41828f, 128.0f, 104.0f),
                    PathNode.CurveTo(128.0f, 99.58172f, 124.41828f, 96.0f, 120.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 161.47f),
                    PathNode.LineTo(232.0f, 224.0f),
                    PathNode.CurveTo(232.02583f, 226.87094f, 230.51125f, 229.53557f, 228.0313f, 230.98221f),
                    PathNode.CurveTo(225.55133f, 232.42886f, 222.48634f, 232.43564f, 220.0f, 231.0f),
                    PathNode.LineTo(196.0f, 217.26f),
                    PathNode.LineTo(172.0f, 231.0f),
                    PathNode.CurveTo(169.51366f, 232.43564f, 166.44867f, 232.42886f, 163.9687f, 230.98221f),
                    PathNode.CurveTo(161.48875f, 229.53557f, 159.97417f, 226.87094f, 160.0f, 224.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(31.163445f, 200.0f, 24.0f, 192.83656f, 24.0f, 184.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 86.53f),
                    PathNode.CurveTo(242.21898f, 96.31595f, 247.99779f, 109.85107f, 247.99779f, 124.0f),
                    PathNode.CurveTo(247.99779f, 138.14894f, 242.21898f, 151.68405f, 232.0f, 161.47f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 184.0f),
                    PathNode.LineTo(160.0f, 161.47f),
                    PathNode.CurveTo(142.0154f, 144.12535f, 138.90897f, 116.44158f, 152.60217f, 95.54232f),
                    PathNode.CurveTo(166.29538f, 74.64306f, 192.91684f, 66.43702f, 216.0f, 76.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 172.0f),
                    PathNode.CurveTo(203.20268f, 177.3467f, 188.79732f, 177.3467f, 176.0f, 172.0f),
                    PathNode.LineTo(176.0f, 210.22f),
                    PathNode.LineTo(192.0f, 201.06f),
                    PathNode.CurveTo(194.45992f, 199.65392f, 197.48009f, 199.65392f, 199.94f, 201.06f),
                    PathNode.LineTo(215.94f, 210.22f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 124.0f),
                    PathNode.CurveTo(232.0f, 104.11775f, 215.88223f, 88.0f, 196.0f, 88.0f),
                    PathNode.CurveTo(176.11777f, 88.0f, 160.0f, 104.11775f, 160.0f, 124.0f),
                    PathNode.CurveTo(160.0f, 143.88223f, 176.11777f, 160.0f, 196.0f, 160.0f),
                    PathNode.CurveTo(215.88223f, 160.0f, 232.0f, 143.88223f, 232.0f, 124.0f),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
