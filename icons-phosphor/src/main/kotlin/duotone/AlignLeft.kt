package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorDuotoneIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 104.0f),
                    PathNode.LineTo(72.0f, 64.0f),
                    PathNode.CurveTo(72.0f, 59.581722f, 75.58172f, 56.0f, 80.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(180.41827f, 56.0f, 184.0f, 59.581722f, 184.0f, 64.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 108.41828f, 180.41827f, 112.0f, 176.0f, 112.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.CurveTo(75.58172f, 112.0f, 72.0f, 108.41828f, 72.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 144.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.CurveTo(75.58172f, 144.0f, 72.0f, 147.58173f, 72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(72.0f, 196.41827f, 75.58172f, 200.0f, 80.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 147.58173f, 220.41827f, 144.0f, 216.0f, 144.0f),
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
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.CurveTo(71.163445f, 136.0f, 64.0f, 143.16344f, 64.0f, 152.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.CurveTo(64.0f, 200.83656f, 71.163445f, 208.0f, 80.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 152.0f),
                    PathNode.CurveTo(232.0f, 143.16344f, 224.83656f, 136.0f, 216.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 220.41827f, 44.418278f, 224.0f, 40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(32.0f, 35.581722f, 35.581722f, 32.0f, 40.0f, 32.0f),
                    PathNode.CurveTo(44.418278f, 32.0f, 48.0f, 35.581722f, 48.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.CurveTo(184.83656f, 120.0f, 192.0f, 112.836555f, 192.0f, 104.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.CurveTo(192.0f, 55.163445f, 184.83656f, 48.0f, 176.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(71.163445f, 48.0f, 64.0f, 55.163445f, 64.0f, 64.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 112.836555f, 71.163445f, 120.0f, 80.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
