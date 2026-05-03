package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileDashed: ImageVector
    get() {
        if (_fileDashed != null) return _fileDashed!!
        _fileDashed = phosphorDuotoneIcon(
            name = "FileDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 32.0f),
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
                    PathNode.MoveTo(80.0f, 224.0f),
                    PathNode.CurveTo(80.0f, 228.41827f, 76.41828f, 232.0f, 72.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(40.0f, 179.58173f, 43.581722f, 176.0f, 48.0f, 176.0f),
                    PathNode.CurveTo(52.418278f, 176.0f, 56.0f, 179.58173f, 56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(76.41828f, 216.0f, 80.0f, 219.58173f, 80.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(216.0f, 140.41827f, 212.41827f, 144.0f, 208.0f, 144.0f),
                    PathNode.CurveTo(203.58173f, 144.0f, 200.0f, 140.41827f, 200.0f, 136.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(147.58173f, 96.0f, 144.0f, 92.41828f, 144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.CurveTo(115.58172f, 40.0f, 112.0f, 36.418278f, 112.0f, 32.0f),
                    PathNode.CurveTo(112.0f, 27.581722f, 115.58172f, 24.0f, 120.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 51.31f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(40.0f, 68.41828f, 43.581722f, 72.0f, 48.0f, 72.0f),
                    PathNode.CurveTo(52.418278f, 72.0f, 56.0f, 68.41828f, 56.0f, 64.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(80.0f, 40.0f),
                    PathNode.CurveTo(84.41828f, 40.0f, 88.0f, 36.418278f, 88.0f, 32.0f),
                    PathNode.CurveTo(88.0f, 27.581722f, 84.41828f, 24.0f, 80.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 168.0f),
                    PathNode.CurveTo(203.58173f, 168.0f, 200.0f, 171.58173f, 200.0f, 176.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(187.58173f, 216.0f, 184.0f, 219.58173f, 184.0f, 224.0f),
                    PathNode.CurveTo(184.0f, 228.41827f, 187.58173f, 232.0f, 192.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 171.58173f, 212.41827f, 168.0f, 208.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 152.0f),
                    PathNode.CurveTo(52.418278f, 152.0f, 56.0f, 148.41827f, 56.0f, 144.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 99.58172f, 52.418278f, 96.0f, 48.0f, 96.0f),
                    PathNode.CurveTo(43.581722f, 96.0f, 40.0f, 99.58172f, 40.0f, 104.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 148.41827f, 43.581722f, 152.0f, 48.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 216.0f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.CurveTo(107.58172f, 216.0f, 104.0f, 219.58173f, 104.0f, 224.0f),
                    PathNode.CurveTo(104.0f, 228.41827f, 107.58172f, 232.0f, 112.0f, 232.0f),
                    PathNode.LineTo(152.0f, 232.0f),
                    PathNode.CurveTo(156.41827f, 232.0f, 160.0f, 228.41827f, 160.0f, 224.0f),
                    PathNode.CurveTo(160.0f, 219.58173f, 156.41827f, 216.0f, 152.0f, 216.0f),
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
        return _fileDashed!!
    }

private var _fileDashed: ImageVector? = null
