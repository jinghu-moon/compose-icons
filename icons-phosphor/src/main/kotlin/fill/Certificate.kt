package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorFillIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 86.53f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 192.83656f, 31.163445f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(159.97417f, 226.87094f, 161.48875f, 229.53557f, 163.9687f, 230.98221f),
                    PathNode.CurveTo(166.44867f, 232.42886f, 169.51366f, 232.43564f, 172.0f, 231.0f),
                    PathNode.LineTo(196.0f, 217.26f),
                    PathNode.LineTo(220.0f, 231.0f),
                    PathNode.CurveTo(222.48634f, 232.43564f, 225.55133f, 232.42886f, 228.0313f, 230.98221f),
                    PathNode.CurveTo(230.51125f, 229.53557f, 232.02583f, 226.87094f, 232.0f, 224.0f),
                    PathNode.LineTo(232.0f, 161.47f),
                    PathNode.CurveTo(242.21898f, 151.68405f, 247.99779f, 138.14894f, 247.99779f, 124.0f),
                    PathNode.CurveTo(247.99779f, 109.85107f, 242.21898f, 96.31595f, 232.0f, 86.53f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.LineTo(72.0f, 144.0f),
                    PathNode.CurveTo(67.58172f, 144.0f, 64.0f, 140.41827f, 64.0f, 136.0f),
                    PathNode.CurveTo(64.0f, 131.58173f, 67.58172f, 128.0f, 72.0f, 128.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.CurveTo(132.41827f, 128.0f, 136.0f, 131.58173f, 136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 140.41827f, 132.41827f, 144.0f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.CurveTo(67.58172f, 112.0f, 64.0f, 108.41828f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 99.58172f, 67.58172f, 96.0f, 72.0f, 96.0f),
                    PathNode.LineTo(128.0f, 96.0f),
                    PathNode.CurveTo(132.41827f, 96.0f, 136.0f, 99.58172f, 136.0f, 104.0f),
                    PathNode.CurveTo(136.0f, 108.41828f, 132.41827f, 112.0f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 210.21f),
                    PathNode.LineTo(200.0f, 201.05f),
                    PathNode.CurveTo(197.54008f, 199.64392f, 194.51991f, 199.64392f, 192.06f, 201.05f),
                    PathNode.LineTo(176.06f, 210.21f),
                    PathNode.LineTo(176.06f, 172.0f),
                    PathNode.CurveTo(188.85733f, 177.3467f, 203.2627f, 177.3467f, 216.06f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 160.0f),
                    PathNode.CurveTo(176.11777f, 160.0f, 160.0f, 143.88223f, 160.0f, 124.0f),
                    PathNode.CurveTo(160.0f, 104.11775f, 176.11777f, 88.0f, 196.0f, 88.0f),
                    PathNode.CurveTo(215.88223f, 88.0f, 232.0f, 104.11775f, 232.0f, 124.0f),
                    PathNode.CurveTo(232.0f, 143.88223f, 215.88223f, 160.0f, 196.0f, 160.0f),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
