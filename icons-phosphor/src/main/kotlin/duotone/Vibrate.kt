package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorDuotoneIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 56.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 208.83656f, 168.83656f, 216.0f, 160.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(87.163445f, 216.0f, 80.0f, 208.83656f, 80.0f, 200.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(80.0f, 47.163445f, 87.163445f, 40.0f, 96.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(168.83656f, 40.0f, 176.0f, 47.163445f, 176.0f, 56.0f),
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
                    PathNode.MoveTo(160.0f, 32.0f),
                    PathNode.LineTo(96.0f, 32.0f),
                    PathNode.CurveTo(82.74516f, 32.0f, 72.0f, 42.745167f, 72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(72.0f, 213.25484f, 82.74516f, 224.0f, 96.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(173.25484f, 224.0f, 184.0f, 213.25484f, 184.0f, 200.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 42.745167f, 173.25484f, 32.0f, 160.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 200.0f),
                    PathNode.CurveTo(168.0f, 204.41827f, 164.41827f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(91.58172f, 208.0f, 88.0f, 204.41827f, 88.0f, 200.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 51.581722f, 91.58172f, 48.0f, 96.0f, 48.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(164.41827f, 48.0f, 168.0f, 51.581722f, 168.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(216.0f, 172.41827f, 212.41827f, 176.0f, 208.0f, 176.0f),
                    PathNode.CurveTo(203.58173f, 176.0f, 200.0f, 172.41827f, 200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(200.0f, 83.58172f, 203.58173f, 80.0f, 208.0f, 80.0f),
                    PathNode.CurveTo(212.41827f, 80.0f, 216.0f, 83.58172f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 104.0f),
                    PathNode.LineTo(248.0f, 152.0f),
                    PathNode.CurveTo(248.0f, 156.41827f, 244.41827f, 160.0f, 240.0f, 160.0f),
                    PathNode.CurveTo(235.58173f, 160.0f, 232.0f, 156.41827f, 232.0f, 152.0f),
                    PathNode.LineTo(232.0f, 104.0f),
                    PathNode.CurveTo(232.0f, 99.58172f, 235.58173f, 96.0f, 240.0f, 96.0f),
                    PathNode.CurveTo(244.41827f, 96.0f, 248.0f, 99.58172f, 248.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 88.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 172.41827f, 52.418278f, 176.0f, 48.0f, 176.0f),
                    PathNode.CurveTo(43.581722f, 176.0f, 40.0f, 172.41827f, 40.0f, 168.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.CurveTo(40.0f, 83.58172f, 43.581722f, 80.0f, 48.0f, 80.0f),
                    PathNode.CurveTo(52.418278f, 80.0f, 56.0f, 83.58172f, 56.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 104.0f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 156.41827f, 20.418278f, 160.0f, 16.0f, 160.0f),
                    PathNode.CurveTo(11.581722f, 160.0f, 8.0f, 156.41827f, 8.0f, 152.0f),
                    PathNode.LineTo(8.0f, 104.0f),
                    PathNode.CurveTo(8.0f, 99.58172f, 11.581722f, 96.0f, 16.0f, 96.0f),
                    PathNode.CurveTo(20.418278f, 96.0f, 24.0f, 99.58172f, 24.0f, 104.0f),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
