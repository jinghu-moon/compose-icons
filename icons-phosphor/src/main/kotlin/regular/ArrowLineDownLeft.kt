package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorRegularIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 48.0f),
                    PathNode.CurveTo(232.0f, 52.418278f, 228.41827f, 56.0f, 224.0f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(43.581722f, 56.0f, 40.0f, 52.418278f, 40.0f, 48.0f),
                    PathNode.CurveTo(40.0f, 43.581722f, 43.581722f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(228.41827f, 40.0f, 232.0f, 43.581722f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.34f, 90.34f),
                    PathNode.LineTo(80.0f, 188.69f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.CurveTo(80.0f, 107.58172f, 76.41828f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(67.58172f, 104.0f, 64.0f, 107.58172f, 64.0f, 112.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.CurveTo(64.0f, 212.41827f, 67.58172f, 216.0f, 72.0f, 216.0f),
                    PathNode.LineTo(168.0f, 216.0f),
                    PathNode.CurveTo(172.41827f, 216.0f, 176.0f, 212.41827f, 176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 203.58173f, 172.41827f, 200.0f, 168.0f, 200.0f),
                    PathNode.LineTo(91.31f, 200.0f),
                    PathNode.LineTo(189.66f, 101.66f),
                    PathNode.CurveTo(192.78593f, 98.534065f, 192.78593f, 93.465935f, 189.66f, 90.34f),
                    PathNode.CurveTo(186.53407f, 87.214066f, 181.46593f, 87.214066f, 178.34f, 90.34f),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
