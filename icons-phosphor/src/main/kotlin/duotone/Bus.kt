package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorDuotoneIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(48.0f, 184.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.CurveTo(88.0f, 212.41827f, 84.41828f, 216.0f, 80.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(51.581722f, 216.0f, 48.0f, 212.41827f, 48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 212.41827f, 171.58173f, 216.0f, 176.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(204.41827f, 216.0f, 208.0f, 212.41827f, 208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 72.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.LineTo(208.0f, 72.0f),
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
                    PathNode.MoveTo(184.0f, 32.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.CurveTo(54.32689f, 32.0f, 40.0f, 46.32689f, 40.0f, 64.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 216.83656f, 47.163445f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(88.836555f, 224.0f, 96.0f, 216.83656f, 96.0f, 208.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(160.0f, 216.83656f, 167.16344f, 224.0f, 176.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(208.83656f, 224.0f, 216.0f, 216.83656f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.CurveTo(216.0f, 46.32689f, 201.67311f, 32.0f, 184.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 176.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 80.0f),
                    PathNode.LineTo(200.0f, 80.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 48.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.CurveTo(192.83656f, 48.0f, 200.0f, 55.163445f, 200.0f, 64.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 55.163445f, 63.163445f, 48.0f, 72.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.LineTo(200.0f, 192.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 148.0f),
                    PathNode.CurveTo(104.0f, 154.62741f, 98.62742f, 160.0f, 92.0f, 160.0f),
                    PathNode.CurveTo(85.37258f, 160.0f, 80.0f, 154.62741f, 80.0f, 148.0f),
                    PathNode.CurveTo(80.0f, 141.37259f, 85.37258f, 136.0f, 92.0f, 136.0f),
                    PathNode.CurveTo(98.62742f, 136.0f, 104.0f, 141.37259f, 104.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 148.0f),
                    PathNode.CurveTo(176.0f, 154.62741f, 170.62741f, 160.0f, 164.0f, 160.0f),
                    PathNode.CurveTo(157.37259f, 160.0f, 152.0f, 154.62741f, 152.0f, 148.0f),
                    PathNode.CurveTo(152.0f, 141.37259f, 157.37259f, 136.0f, 164.0f, 136.0f),
                    PathNode.CurveTo(170.62741f, 136.0f, 176.0f, 141.37259f, 176.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 80.0f),
                    PathNode.LineTo(248.0f, 104.0f),
                    PathNode.CurveTo(248.0f, 108.41828f, 244.41827f, 112.0f, 240.0f, 112.0f),
                    PathNode.CurveTo(235.58173f, 112.0f, 232.0f, 108.41828f, 232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 75.58172f, 235.58173f, 72.0f, 240.0f, 72.0f),
                    PathNode.CurveTo(244.41827f, 72.0f, 248.0f, 75.58172f, 248.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 104.0f),
                    PathNode.CurveTo(24.0f, 108.41828f, 20.418278f, 112.0f, 16.0f, 112.0f),
                    PathNode.CurveTo(11.581722f, 112.0f, 8.0f, 108.41828f, 8.0f, 104.0f),
                    PathNode.LineTo(8.0f, 80.0f),
                    PathNode.CurveTo(8.0f, 75.58172f, 11.581722f, 72.0f, 16.0f, 72.0f),
                    PathNode.CurveTo(20.418278f, 72.0f, 24.0f, 75.58172f, 24.0f, 80.0f),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
