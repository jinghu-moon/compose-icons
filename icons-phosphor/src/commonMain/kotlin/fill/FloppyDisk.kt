package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorFillIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.31f, 72.0f),
                    PathNode.LineTo(184.0f, 36.69f),
                    PathNode.CurveTo(181.00975f, 33.67581f, 176.93579f, 31.986435f, 172.69f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 83.31f),
                    PathNode.CurveTo(224.01357f, 79.06421f, 222.32419f, 74.99025f, 219.31f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.CurveTo(184.0f, 143.16344f, 176.83656f, 136.0f, 168.0f, 136.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(79.163445f, 136.0f, 72.0f, 143.16344f, 72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(172.69f, 48.0f),
                    PathNode.LineTo(208.0f, 83.31f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 72.0f),
                    PathNode.CurveTo(160.0f, 76.41828f, 156.41827f, 80.0f, 152.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.CurveTo(91.58172f, 80.0f, 88.0f, 76.41828f, 88.0f, 72.0f),
                    PathNode.CurveTo(88.0f, 67.58172f, 91.58172f, 64.0f, 96.0f, 64.0f),
                    PathNode.LineTo(152.0f, 64.0f),
                    PathNode.CurveTo(156.41827f, 64.0f, 160.0f, 67.58172f, 160.0f, 72.0f),
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
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
