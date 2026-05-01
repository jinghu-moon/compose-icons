package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SelectionForeground: ImageVector
    get() {
        if (_selectionForeground != null) return _selectionForeground!!
        _selectionForeground = phosphorDuotoneIcon(
            name = "SelectionForeground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 96.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 212.41827f, 164.41827f, 216.0f, 160.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(40.0f, 91.58172f, 43.581722f, 88.0f, 48.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(164.41827f, 88.0f, 168.0f, 91.58172f, 168.0f, 96.0f),
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
                    PathNode.MoveTo(64.0f, 216.0f),
                    PathNode.CurveTo(64.0f, 220.41827f, 60.418278f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 195.58173f, 35.581722f, 192.0f, 40.0f, 192.0f),
                    PathNode.CurveTo(44.418278f, 192.0f, 48.0f, 195.58173f, 48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(60.418278f, 208.0f, 64.0f, 211.58173f, 64.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(91.58172f, 208.0f, 88.0f, 211.58173f, 88.0f, 216.0f),
                    PathNode.CurveTo(88.0f, 220.41827f, 91.58172f, 224.0f, 96.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.CurveTo(116.41828f, 224.0f, 120.0f, 220.41827f, 120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 211.58173f, 116.41828f, 208.0f, 112.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 168.0f),
                    PathNode.CurveTo(44.418278f, 168.0f, 48.0f, 164.41827f, 48.0f, 160.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 139.58173f, 44.418278f, 136.0f, 40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 139.58173f, 32.0f, 144.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.CurveTo(32.0f, 164.41827f, 35.581722f, 168.0f, 40.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 192.0f),
                    PathNode.CurveTo(163.58173f, 192.0f, 160.0f, 195.58173f, 160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.CurveTo(147.58173f, 208.0f, 144.0f, 211.58173f, 144.0f, 216.0f),
                    PathNode.CurveTo(144.0f, 220.41827f, 147.58173f, 224.0f, 152.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(168.83656f, 224.0f, 176.0f, 216.83656f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 195.58173f, 172.41827f, 192.0f, 168.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 112.0f),
                    PathNode.CurveTo(172.41827f, 112.0f, 176.0f, 108.41828f, 176.0f, 104.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 87.163445f, 168.83656f, 80.0f, 160.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(147.58173f, 80.0f, 144.0f, 83.58172f, 144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 92.41828f, 147.58173f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 108.41828f, 163.58173f, 112.0f, 168.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(39.163445f, 80.0f, 32.0f, 87.163445f, 32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 108.41828f, 35.581722f, 112.0f, 40.0f, 112.0f),
                    PathNode.CurveTo(44.418278f, 112.0f, 48.0f, 108.41828f, 48.0f, 104.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(60.418278f, 96.0f, 64.0f, 92.41828f, 64.0f, 88.0f),
                    PathNode.CurveTo(64.0f, 83.58172f, 60.418278f, 80.0f, 56.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(96.0f, 32.0f),
                    PathNode.CurveTo(87.163445f, 32.0f, 80.0f, 39.163445f, 80.0f, 48.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.CurveTo(79.98863f, 88.18316f, 79.98863f, 88.36685f, 80.0f, 88.55f),
                    PathNode.CurveTo(80.28957f, 92.75215f, 83.787895f, 96.00996f, 88.0f, 96.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.CurveTo(116.41828f, 96.0f, 120.0f, 92.41828f, 120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 83.58172f, 116.41828f, 80.0f, 112.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.CurveTo(176.0f, 139.58173f, 172.41827f, 136.0f, 168.0f, 136.0f),
                    PathNode.CurveTo(163.58173f, 136.0f, 160.0f, 139.58173f, 160.0f, 144.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 172.41827f, 163.58173f, 176.0f, 168.0f, 176.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(216.83656f, 176.0f, 224.0f, 168.83656f, 224.0f, 160.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
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
        return _selectionForeground!!
    }

private var _selectionForeground: ImageVector? = null
