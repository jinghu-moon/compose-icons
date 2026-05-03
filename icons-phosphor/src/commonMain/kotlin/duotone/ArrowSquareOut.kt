package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorDuotoneIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 80.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(184.0f, 212.41827f, 180.41827f, 216.0f, 176.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 75.58172f, 43.581722f, 72.0f, 48.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(180.41827f, 72.0f, 184.0f, 75.58172f, 184.0f, 80.0f),
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
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.CurveTo(224.0f, 108.41828f, 220.41827f, 112.0f, 216.0f, 112.0f),
                    PathNode.CurveTo(211.58173f, 112.0f, 208.0f, 108.41828f, 208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 59.32f),
                    PathNode.LineTo(141.67f, 125.66f),
                    PathNode.CurveTo(138.54407f, 128.78593f, 133.47594f, 128.78593f, 130.35f, 125.66f),
                    PathNode.CurveTo(127.22407f, 122.534065f, 127.22407f, 117.465935f, 130.35f, 114.34f),
                    PathNode.LineTo(196.68f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(147.58173f, 48.0f, 144.0f, 44.418278f, 144.0f, 40.0f),
                    PathNode.CurveTo(144.0f, 35.581722f, 147.58173f, 32.0f, 152.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.CurveTo(179.58173f, 128.0f, 176.0f, 131.58173f, 176.0f, 136.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(124.41828f, 80.0f, 128.0f, 76.41828f, 128.0f, 72.0f),
                    PathNode.CurveTo(128.0f, 67.58172f, 124.41828f, 64.0f, 120.0f, 64.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.CurveTo(39.163445f, 64.0f, 32.0f, 71.163445f, 32.0f, 80.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(176.0f, 224.0f),
                    PathNode.CurveTo(184.83656f, 224.0f, 192.0f, 216.83656f, 192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 131.58173f, 188.41827f, 128.0f, 184.0f, 128.0f),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
