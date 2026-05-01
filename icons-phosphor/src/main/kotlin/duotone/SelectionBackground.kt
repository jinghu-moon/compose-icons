package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorDuotoneIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.CurveTo(216.0f, 164.41827f, 212.41827f, 168.0f, 208.0f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(168.0f, 91.58172f, 164.41827f, 88.0f, 160.0f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.CurveTo(88.0f, 43.581722f, 91.58172f, 40.0f, 96.0f, 40.0f),
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
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(39.163445f, 80.0f, 32.0f, 87.163445f, 32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(168.83656f, 224.0f, 176.0f, 216.83656f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 87.163445f, 168.83656f, 80.0f, 160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 35.581722f, 139.58173f, 32.0f, 144.0f, 32.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(164.41827f, 32.0f, 168.0f, 35.581722f, 168.0f, 40.0f),
                    PathNode.CurveTo(168.0f, 44.418278f, 164.41827f, 48.0f, 160.0f, 48.0f),
                    PathNode.LineTo(144.0f, 48.0f),
                    PathNode.CurveTo(139.58173f, 48.0f, 136.0f, 44.418278f, 136.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 60.418278f, 220.41827f, 64.0f, 216.0f, 64.0f),
                    PathNode.CurveTo(211.58173f, 64.0f, 208.0f, 60.418278f, 208.0f, 56.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.CurveTo(195.58173f, 48.0f, 192.0f, 44.418278f, 192.0f, 40.0f),
                    PathNode.CurveTo(192.0f, 35.581722f, 195.58173f, 32.0f, 200.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 96.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 116.41828f, 220.41827f, 120.0f, 216.0f, 120.0f),
                    PathNode.CurveTo(211.58173f, 120.0f, 208.0f, 116.41828f, 208.0f, 112.0f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.CurveTo(208.0f, 91.58172f, 211.58173f, 88.0f, 216.0f, 88.0f),
                    PathNode.CurveTo(220.41827f, 88.0f, 224.0f, 91.58172f, 224.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 168.83656f, 216.83656f, 176.0f, 208.0f, 176.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.CurveTo(195.58173f, 176.0f, 192.0f, 172.41827f, 192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 163.58173f, 195.58173f, 160.0f, 200.0f, 160.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.CurveTo(208.0f, 147.58173f, 211.58173f, 144.0f, 216.0f, 144.0f),
                    PathNode.CurveTo(220.41827f, 144.0f, 224.0f, 147.58173f, 224.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 39.163445f, 87.163445f, 32.0f, 96.0f, 32.0f),
                    PathNode.LineTo(104.0f, 32.0f),
                    PathNode.CurveTo(108.41828f, 32.0f, 112.0f, 35.581722f, 112.0f, 40.0f),
                    PathNode.CurveTo(112.0f, 44.418278f, 108.41828f, 48.0f, 104.0f, 48.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 60.418278f, 92.41828f, 64.0f, 88.0f, 64.0f),
                    PathNode.CurveTo(83.58172f, 64.0f, 80.0f, 60.418278f, 80.0f, 56.0f),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
