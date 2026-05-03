package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorDuotoneIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 104.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
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
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 44.418278f, 220.41827f, 48.0f, 216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(35.581722f, 48.0f, 32.0f, 44.418278f, 32.0f, 40.0f),
                    PathNode.CurveTo(32.0f, 35.581722f, 35.581722f, 32.0f, 40.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 104.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(200.0f, 204.41827f, 196.41827f, 208.0f, 192.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(92.762344f, 208.00255f, 89.84236f, 206.05338f, 88.60302f, 203.06232f),
                    PathNode.CurveTo(87.36368f, 200.07126f, 88.04936f, 196.6281f, 90.34f, 194.34f),
                    PathNode.LineTo(132.69f, 152.0f),
                    PathNode.LineTo(74.34f, 93.66f),
                    PathNode.CurveTo(71.214066f, 90.534065f, 71.214066f, 85.465935f, 74.34f, 82.34f),
                    PathNode.CurveTo(77.465935f, 79.214066f, 82.534065f, 79.214066f, 85.66f, 82.34f),
                    PathNode.LineTo(144.0f, 140.69f),
                    PathNode.LineTo(186.34f, 98.34f),
                    PathNode.CurveTo(188.6281f, 96.04936f, 192.07126f, 95.36368f, 195.06232f, 96.60302f),
                    PathNode.CurveTo(198.05338f, 97.84236f, 200.00255f, 100.762344f, 200.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 123.31f),
                    PathNode.LineTo(149.66f, 157.66f),
                    PathNode.LineTo(149.66f, 157.66f),
                    PathNode.LineTo(115.31f, 192.0f),
                    PathNode.LineTo(184.0f, 192.0f),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
