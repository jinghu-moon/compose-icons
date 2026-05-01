package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SelectionInverse: ImageVector
    get() {
        if (_selectionInverse != null) return _selectionInverse!!
        _selectionInverse = phosphorDuotoneIcon(
            name = "SelectionInverse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(216.00166f, 210.12238f, 215.15993f, 212.15842f, 213.66f, 213.66f),
                    PathNode.LineTo(42.34f, 42.34f),
                    PathNode.CurveTo(43.841576f, 40.84009f, 45.87763f, 39.998333f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 216.0f),
                    PathNode.CurveTo(152.0f, 220.41827f, 148.41827f, 224.0f, 144.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.CurveTo(107.58172f, 224.0f, 104.0f, 220.41827f, 104.0f, 216.0f),
                    PathNode.CurveTo(104.0f, 211.58173f, 107.58172f, 208.0f, 112.0f, 208.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(148.41827f, 208.0f, 152.0f, 211.58173f, 152.0f, 216.0f),
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
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(184.0f, 224.0f),
                    PathNode.CurveTo(179.58173f, 224.0f, 176.0f, 220.41827f, 176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 211.58173f, 179.58173f, 208.0f, 184.0f, 208.0f),
                    PathNode.LineTo(196.69f, 208.0f),
                    PathNode.LineTo(48.0f, 59.31f),
                    PathNode.LineTo(48.0f, 72.0f),
                    PathNode.CurveTo(48.0f, 76.41828f, 44.418278f, 80.0f, 40.0f, 80.0f),
                    PathNode.CurveTo(35.581722f, 80.0f, 32.0f, 76.41828f, 32.0f, 72.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(59.31f, 48.0f),
                    PathNode.LineTo(208.0f, 196.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _selectionInverse!!
    }

private var _selectionInverse: ImageVector? = null
