package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) return _rectangleDashed!!
        _rectangleDashed = phosphorRegularIcon(
            name = "RectangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 52.418278f, 76.41828f, 56.0f, 72.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(40.0f, 76.41828f, 36.418278f, 80.0f, 32.0f, 80.0f),
                    PathNode.CurveTo(27.581722f, 80.0f, 24.0f, 76.41828f, 24.0f, 72.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(76.41828f, 40.0f, 80.0f, 43.581722f, 80.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 152.0f),
                    PathNode.CurveTo(36.418278f, 152.0f, 40.0f, 148.41827f, 40.0f, 144.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 107.58172f, 36.418278f, 104.0f, 32.0f, 104.0f),
                    PathNode.CurveTo(27.581722f, 104.0f, 24.0f, 107.58172f, 24.0f, 112.0f),
                    PathNode.LineTo(24.0f, 144.0f),
                    PathNode.CurveTo(24.0f, 148.41827f, 27.581722f, 152.0f, 32.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(40.0f, 179.58173f, 36.418278f, 176.0f, 32.0f, 176.0f),
                    PathNode.CurveTo(27.581722f, 176.0f, 24.0f, 179.58173f, 24.0f, 184.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(76.41828f, 216.0f, 80.0f, 212.41827f, 80.0f, 208.0f),
                    PathNode.CurveTo(80.0f, 203.58173f, 76.41828f, 200.0f, 72.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 200.0f),
                    PathNode.LineTo(112.0f, 200.0f),
                    PathNode.CurveTo(107.58172f, 200.0f, 104.0f, 203.58173f, 104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 212.41827f, 107.58172f, 216.0f, 112.0f, 216.0f),
                    PathNode.LineTo(144.0f, 216.0f),
                    PathNode.CurveTo(148.41827f, 216.0f, 152.0f, 212.41827f, 152.0f, 208.0f),
                    PathNode.CurveTo(152.0f, 203.58173f, 148.41827f, 200.0f, 144.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 176.0f),
                    PathNode.CurveTo(219.58173f, 176.0f, 216.0f, 179.58173f, 216.0f, 184.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(179.58173f, 200.0f, 176.0f, 203.58173f, 176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 212.41827f, 179.58173f, 216.0f, 184.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 179.58173f, 228.41827f, 176.0f, 224.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.CurveTo(219.58173f, 104.0f, 216.0f, 107.58172f, 216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 148.41827f, 219.58173f, 152.0f, 224.0f, 152.0f),
                    PathNode.CurveTo(228.41827f, 152.0f, 232.0f, 148.41827f, 232.0f, 144.0f),
                    PathNode.LineTo(232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 107.58172f, 228.41827f, 104.0f, 224.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.CurveTo(179.58173f, 40.0f, 176.0f, 43.581722f, 176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 52.418278f, 179.58173f, 56.0f, 184.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(216.0f, 76.41828f, 219.58173f, 80.0f, 224.0f, 80.0f),
                    PathNode.CurveTo(228.41827f, 80.0f, 232.0f, 76.41828f, 232.0f, 72.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 40.0f),
                    PathNode.LineTo(112.0f, 40.0f),
                    PathNode.CurveTo(107.58172f, 40.0f, 104.0f, 43.581722f, 104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 52.418278f, 107.58172f, 56.0f, 112.0f, 56.0f),
                    PathNode.LineTo(144.0f, 56.0f),
                    PathNode.CurveTo(148.41827f, 56.0f, 152.0f, 52.418278f, 152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 43.581722f, 148.41827f, 40.0f, 144.0f, 40.0f),
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
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null
