package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorRegularIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 211.58173f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 211.58173f, 224.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 176.0f),
                    PathNode.CurveTo(82.12237f, 176.00166f, 84.158424f, 175.15993f, 85.66f, 173.66f),
                    PathNode.LineTo(184.0f, 75.31f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.CurveTo(184.0f, 156.41827f, 187.58173f, 160.0f, 192.0f, 160.0f),
                    PathNode.CurveTo(196.41827f, 160.0f, 200.0f, 156.41827f, 200.0f, 152.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.CurveTo(200.0f, 51.581722f, 196.41827f, 48.0f, 192.0f, 48.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.CurveTo(91.58172f, 48.0f, 88.0f, 51.581722f, 88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 60.418278f, 91.58172f, 64.0f, 96.0f, 64.0f),
                    PathNode.LineTo(172.69f, 64.0f),
                    PathNode.LineTo(74.34f, 162.34f),
                    PathNode.CurveTo(72.04936f, 164.6281f, 71.36368f, 168.07126f, 72.60302f, 171.06232f),
                    PathNode.CurveTo(73.84236f, 174.05338f, 76.762344f, 176.00255f, 80.0f, 176.0f),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
