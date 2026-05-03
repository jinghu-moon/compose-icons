package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorDuotoneIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 136.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 204.41827f, 228.41827f, 208.0f, 224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 204.41827f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.CurveTo(24.0f, 131.58173f, 27.581722f, 128.0f, 32.0f, 128.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.CurveTo(228.41827f, 128.0f, 232.0f, 131.58173f, 232.0f, 136.0f),
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
                    PathNode.MoveTo(240.0f, 136.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 208.83656f, 232.83656f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(23.163445f, 216.0f, 16.0f, 208.83656f, 16.0f, 200.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(16.0f, 127.163445f, 23.163445f, 120.0f, 32.0f, 120.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.CurveTo(76.41828f, 120.0f, 80.0f, 123.58172f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 132.41827f, 76.41828f, 136.0f, 72.0f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.CurveTo(179.58173f, 136.0f, 176.0f, 132.41827f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 123.58172f, 179.58173f, 120.0f, 184.0f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(232.83656f, 120.0f, 240.0f, 127.163445f, 240.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.34f, 133.66f),
                    PathNode.CurveTo(123.840546f, 135.16223f, 125.876724f, 136.00629f, 128.0f, 136.00629f),
                    PathNode.CurveTo(130.12328f, 136.00629f, 132.15945f, 135.16223f, 133.66f, 133.66f),
                    PathNode.LineTo(181.66f, 85.66f),
                    PathNode.CurveTo(184.78593f, 82.534065f, 184.78593f, 77.465935f, 181.66f, 74.34f),
                    PathNode.CurveTo(178.53407f, 71.214066f, 173.46593f, 71.214066f, 170.34f, 74.34f),
                    PathNode.LineTo(136.0f, 108.69f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 108.69f),
                    PathNode.LineTo(85.66f, 74.34f),
                    PathNode.CurveTo(82.534065f, 71.214066f, 77.465935f, 71.214066f, 74.34f, 74.34f),
                    PathNode.CurveTo(71.214066f, 77.465935f, 71.214066f, 82.534065f, 74.34f, 85.66f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 161.37259f, 194.62741f, 156.0f, 188.0f, 156.0f),
                    PathNode.CurveTo(181.37259f, 156.0f, 176.0f, 161.37259f, 176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 174.62741f, 181.37259f, 180.0f, 188.0f, 180.0f),
                    PathNode.CurveTo(194.62741f, 180.0f, 200.0f, 174.62741f, 200.0f, 168.0f),
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
        return _download!!
    }

private var _download: ImageVector? = null
