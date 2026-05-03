package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Selection: ImageVector
    get() {
        if (_selection != null) return _selection!!
        _selection = phosphorRegularIcon(
            name = "Selection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 40.0f),
                    PathNode.CurveTo(152.0f, 44.418278f, 148.41827f, 48.0f, 144.0f, 48.0f),
                    PathNode.LineTo(112.0f, 48.0f),
                    PathNode.CurveTo(107.58172f, 48.0f, 104.0f, 44.418278f, 104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 35.581722f, 107.58172f, 32.0f, 112.0f, 32.0f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(148.41827f, 32.0f, 152.0f, 35.581722f, 152.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 208.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(107.58172f, 208.0f, 104.0f, 211.58173f, 104.0f, 216.0f),
                    PathNode.CurveTo(104.0f, 220.41827f, 107.58172f, 224.0f, 112.0f, 224.0f),
                    PathNode.LineTo(144.0f, 224.0f),
                    PathNode.CurveTo(148.41827f, 224.0f, 152.0f, 220.41827f, 152.0f, 216.0f),
                    PathNode.CurveTo(152.0f, 211.58173f, 148.41827f, 208.0f, 144.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.CurveTo(179.58173f, 32.0f, 176.0f, 35.581722f, 176.0f, 40.0f),
                    PathNode.CurveTo(176.0f, 44.418278f, 179.58173f, 48.0f, 184.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.CurveTo(208.0f, 76.41828f, 211.58173f, 80.0f, 216.0f, 80.0f),
                    PathNode.CurveTo(220.41827f, 80.0f, 224.0f, 76.41828f, 224.0f, 72.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.CurveTo(211.58173f, 104.0f, 208.0f, 107.58172f, 208.0f, 112.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 148.41827f, 211.58173f, 152.0f, 216.0f, 152.0f),
                    PathNode.CurveTo(220.41827f, 152.0f, 224.0f, 148.41827f, 224.0f, 144.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 107.58172f, 220.41827f, 104.0f, 216.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 176.0f),
                    PathNode.CurveTo(211.58173f, 176.0f, 208.0f, 179.58173f, 208.0f, 184.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(179.58173f, 208.0f, 176.0f, 211.58173f, 176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 220.41827f, 179.58173f, 224.0f, 184.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(224.0f, 179.58173f, 220.41827f, 176.0f, 216.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 152.0f),
                    PathNode.CurveTo(44.418278f, 152.0f, 48.0f, 148.41827f, 48.0f, 144.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.CurveTo(48.0f, 107.58172f, 44.418278f, 104.0f, 40.0f, 104.0f),
                    PathNode.CurveTo(35.581722f, 104.0f, 32.0f, 107.58172f, 32.0f, 112.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 148.41827f, 35.581722f, 152.0f, 40.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.CurveTo(48.0f, 179.58173f, 44.418278f, 176.0f, 40.0f, 176.0f),
                    PathNode.CurveTo(35.581722f, 176.0f, 32.0f, 179.58173f, 32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(72.0f, 224.0f),
                    PathNode.CurveTo(76.41828f, 224.0f, 80.0f, 220.41827f, 80.0f, 216.0f),
                    PathNode.CurveTo(80.0f, 211.58173f, 76.41828f, 208.0f, 72.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(32.0f, 76.41828f, 35.581722f, 80.0f, 40.0f, 80.0f),
                    PathNode.CurveTo(44.418278f, 80.0f, 48.0f, 76.41828f, 48.0f, 72.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(76.41828f, 48.0f, 80.0f, 44.418278f, 80.0f, 40.0f),
                    PathNode.CurveTo(80.0f, 35.581722f, 76.41828f, 32.0f, 72.0f, 32.0f),
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
        return _selection!!
    }

private var _selection: ImageVector? = null
