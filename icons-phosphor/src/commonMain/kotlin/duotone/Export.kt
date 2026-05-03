package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorDuotoneIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 104.0f),
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
                    PathNode.MoveTo(216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(216.0f, 216.83656f, 208.83656f, 224.0f, 200.0f, 224.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(47.163445f, 224.0f, 40.0f, 216.83656f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 103.163445f, 47.163445f, 96.0f, 56.0f, 96.0f),
                    PathNode.LineTo(80.0f, 96.0f),
                    PathNode.CurveTo(84.41828f, 96.0f, 88.0f, 99.58172f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 108.41828f, 84.41828f, 112.0f, 80.0f, 112.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.CurveTo(171.58173f, 112.0f, 168.0f, 108.41828f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 99.58172f, 171.58173f, 96.0f, 176.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.CurveTo(208.83656f, 96.0f, 216.0f, 103.163445f, 216.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(93.66f, 69.66f),
                    PathNode.LineTo(120.0f, 43.31f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.CurveTo(120.0f, 140.41827f, 123.58172f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(132.41827f, 144.0f, 136.0f, 140.41827f, 136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 43.31f),
                    PathNode.LineTo(162.34f, 69.66f),
                    PathNode.CurveTo(165.46593f, 72.785934f, 170.53407f, 72.785934f, 173.66f, 69.66f),
                    PathNode.CurveTo(176.78593f, 66.534065f, 176.78593f, 61.46593f, 173.66f, 58.34f),
                    PathNode.LineTo(133.66f, 18.34f),
                    PathNode.CurveTo(132.15945f, 16.837784f, 130.12328f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(125.876724f, 15.993707f, 123.840546f, 16.837784f, 122.34f, 18.34f),
                    PathNode.LineTo(82.34f, 58.34f),
                    PathNode.CurveTo(79.214066f, 61.46593f, 79.214066f, 66.534065f, 82.34f, 69.66f),
                    PathNode.CurveTo(85.465935f, 72.785934f, 90.534065f, 72.785934f, 93.66f, 69.66f),
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
        return _export!!
    }

private var _export: ImageVector? = null
