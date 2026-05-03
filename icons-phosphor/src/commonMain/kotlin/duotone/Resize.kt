package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorDuotoneIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 120.0f),
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
                    PathNode.MoveTo(136.0f, 112.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.CurveTo(43.581722f, 112.0f, 40.0f, 115.58172f, 40.0f, 120.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(140.41827f, 216.0f, 144.0f, 212.41827f, 144.0f, 208.0f),
                    PathNode.LineTo(144.0f, 120.0f),
                    PathNode.CurveTo(144.0f, 115.58172f, 140.41827f, 112.0f, 136.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 208.83656f, 208.83656f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.CurveTo(171.58173f, 216.0f, 168.0f, 212.41827f, 168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 203.58173f, 171.58173f, 200.0f, 176.0f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.CurveTo(200.0f, 179.58173f, 203.58173f, 176.0f, 208.0f, 176.0f),
                    PathNode.CurveTo(212.41827f, 176.0f, 216.0f, 179.58173f, 216.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 148.41827f, 212.41827f, 152.0f, 208.0f, 152.0f),
                    PathNode.CurveTo(203.58173f, 152.0f, 200.0f, 148.41827f, 200.0f, 144.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 107.58172f, 203.58173f, 104.0f, 208.0f, 104.0f),
                    PathNode.CurveTo(212.41827f, 104.0f, 216.0f, 107.58172f, 216.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(216.0f, 76.41828f, 212.41827f, 80.0f, 208.0f, 80.0f),
                    PathNode.CurveTo(203.58173f, 80.0f, 200.0f, 76.41828f, 200.0f, 72.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(179.58173f, 56.0f, 176.0f, 52.418278f, 176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 43.581722f, 179.58173f, 40.0f, 184.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(208.83656f, 40.0f, 216.0f, 47.163445f, 216.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 52.418278f, 148.41827f, 56.0f, 144.0f, 56.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(107.58172f, 56.0f, 104.0f, 52.418278f, 104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 43.581722f, 107.58172f, 40.0f, 112.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.CurveTo(148.41827f, 40.0f, 152.0f, 43.581722f, 152.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 80.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 47.163445f, 47.163445f, 40.0f, 56.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(76.41828f, 40.0f, 80.0f, 43.581722f, 80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 52.418278f, 76.41828f, 56.0f, 72.0f, 56.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 84.41828f, 52.418278f, 88.0f, 48.0f, 88.0f),
                    PathNode.CurveTo(43.581722f, 88.0f, 40.0f, 84.41828f, 40.0f, 80.0f),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
