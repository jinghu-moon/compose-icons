package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionInverse: ImageVector
    get() {
        if (_selectionInverse != null) return _selectionInverse!!
        _selectionInverse = phosphorFillIcon(
            name = "SelectionInverse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(44.05965f, 31.999111f, 40.25988f, 33.464127f, 37.34f, 36.11f),
                    PathNode.CurveTo(36.884686f, 36.47203f, 36.47203f, 36.884686f, 36.11f, 37.34f),
                    PathNode.CurveTo(33.464127f, 40.25988f, 31.999111f, 44.05965f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(32.0f, 76.41828f, 35.581722f, 80.0f, 40.0f, 80.0f),
                    PathNode.CurveTo(44.418278f, 80.0f, 48.0f, 76.41828f, 48.0f, 72.0f),
                    PathNode.LineTo(48.0f, 59.31f),
                    PathNode.LineTo(196.69f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(179.58173f, 208.0f, 176.0f, 211.58173f, 176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 220.41827f, 179.58173f, 224.0f, 184.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(211.93831f, 223.99982f, 215.73659f, 222.53894f, 218.66f, 219.9f),
                    PathNode.CurveTo(218.88823f, 219.71646f, 219.10529f, 219.51944f, 219.31f, 219.31f),
                    PathNode.CurveTo(219.51883f, 219.10767f, 219.71268f, 218.89043f, 219.89f, 218.66f),
                    PathNode.CurveTo(222.53587f, 215.74011f, 224.00089f, 211.94035f, 224.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _selectionInverse!!
    }

private var _selectionInverse: ImageVector? = null
