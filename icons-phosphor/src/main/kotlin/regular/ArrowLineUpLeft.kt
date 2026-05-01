package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorRegularIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 203.58173f, 43.581722f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 152.0f),
                    PathNode.CurveTo(76.41828f, 152.0f, 80.0f, 148.41827f, 80.0f, 144.0f),
                    PathNode.LineTo(80.0f, 67.31f),
                    PathNode.LineTo(178.34f, 165.66f),
                    PathNode.CurveTo(181.46593f, 168.78593f, 186.53407f, 168.78593f, 189.66f, 165.66f),
                    PathNode.CurveTo(192.78593f, 162.53407f, 192.78593f, 157.46593f, 189.66f, 154.34f),
                    PathNode.LineTo(91.31f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(172.41827f, 56.0f, 176.0f, 52.418278f, 176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 43.581722f, 172.41827f, 40.0f, 168.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(67.58172f, 40.0f, 64.0f, 43.581722f, 64.0f, 48.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(64.0f, 148.41827f, 67.58172f, 152.0f, 72.0f, 152.0f),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
