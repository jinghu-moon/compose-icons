package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorRegularIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 136.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 208.83656f, 232.83656f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(23.163445f, 216.0f, 16.0f, 208.83656f, 16.0f, 200.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(16.0f, 127.163445f, 23.163445f, 120.0f, 32.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(84.41828f, 120.0f, 88.0f, 123.58172f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 132.41827f, 84.41828f, 136.0f, 80.0f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(171.58173f, 136.0f, 168.0f, 132.41827f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 123.58172f, 171.58173f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(232.83656f, 120.0f, 240.0f, 127.163445f, 240.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.66f, 77.66f),
                    PathNode.LineTo(120.0f, 43.31f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 132.41827f, 123.58172f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(132.41827f, 136.0f, 136.0f, 132.41827f, 136.0f, 128.0f),
                    PathNode.LineTo(136.0f, 43.31f),
                    PathNode.LineTo(170.34f, 77.66f),
                    PathNode.CurveTo(173.46593f, 80.785934f, 178.53407f, 80.785934f, 181.66f, 77.66f),
                    PathNode.CurveTo(184.78593f, 74.534065f, 184.78593f, 69.465935f, 181.66f, 66.34f),
                    PathNode.LineTo(133.66f, 18.34f),
                    PathNode.CurveTo(132.15945f, 16.837784f, 130.12328f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(125.876724f, 15.993707f, 123.840546f, 16.837784f, 122.34f, 18.34f),
                    PathNode.LineTo(74.34f, 66.34f),
                    PathNode.CurveTo(71.214066f, 69.465935f, 71.214066f, 74.534065f, 74.34f, 77.66f),
                    PathNode.CurveTo(77.465935f, 80.785934f, 82.534065f, 80.785934f, 85.66f, 77.66f),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
