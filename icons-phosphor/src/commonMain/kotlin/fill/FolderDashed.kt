package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) return _folderDashed!!
        _folderDashed = phosphorFillIcon(
            name = "FolderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 208.0f),
                    PathNode.CurveTo(96.0f, 212.41827f, 92.41828f, 216.0f, 88.0f, 216.0f),
                    PathNode.LineTo(39.38f, 216.0f),
                    PathNode.CurveTo(30.890429f, 215.98898f, 24.011019f, 209.10957f, 24.0f, 200.62f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 187.58173f, 27.581722f, 184.0f, 32.0f, 184.0f),
                    PathNode.CurveTo(36.418278f, 184.0f, 40.0f, 187.58173f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.CurveTo(92.41828f, 200.0f, 96.0f, 203.58173f, 96.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 200.0f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.CurveTo(123.58172f, 200.0f, 120.0f, 203.58173f, 120.0f, 208.0f),
                    PathNode.CurveTo(120.0f, 212.41827f, 123.58172f, 216.0f, 128.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 212.41827f, 168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 203.58173f, 164.41827f, 200.0f, 160.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.CurveTo(219.58173f, 144.0f, 216.0f, 147.58173f, 216.0f, 152.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(195.58173f, 200.0f, 192.0f, 203.58173f, 192.0f, 208.0f),
                    PathNode.CurveTo(192.0f, 212.41827f, 195.58173f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(216.89f, 216.0f),
                    PathNode.CurveTo(225.23045f, 215.98898f, 231.98898f, 209.23045f, 232.0f, 200.89f),
                    PathNode.LineTo(232.0f, 152.0f),
                    PathNode.CurveTo(232.0f, 147.58173f, 228.41827f, 144.0f, 224.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.CurveTo(163.58173f, 72.0f, 160.0f, 75.58172f, 160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 84.41828f, 163.58173f, 88.0f, 168.0f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 116.41828f, 219.58173f, 120.0f, 224.0f, 120.0f),
                    PathNode.CurveTo(228.41827f, 120.0f, 232.0f, 116.41828f, 232.0f, 112.0f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 79.163445f, 224.83656f, 72.0f, 216.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 88.0f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.CurveTo(131.23766f, 88.00255f, 134.15764f, 86.05338f, 135.39697f, 83.062325f),
                    PathNode.CurveTo(136.63632f, 80.07126f, 135.95064f, 76.62809f, 133.66f, 74.34f),
                    PathNode.LineTo(104.0f, 44.69f),
                    PathNode.CurveTo(101.00975f, 41.67581f, 96.93579f, 39.986435f, 92.69f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 84.41828f, 27.581722f, 88.0f, 32.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 160.0f),
                    PathNode.CurveTo(36.418278f, 160.0f, 40.0f, 156.41827f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(40.0f, 115.58172f, 36.418278f, 112.0f, 32.0f, 112.0f),
                    PathNode.CurveTo(27.581722f, 112.0f, 24.0f, 115.58172f, 24.0f, 120.0f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 156.41827f, 27.581722f, 160.0f, 32.0f, 160.0f),
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
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
