package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorFillIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.MoveTo(195.06f, 96.61f),
                    PathNode.CurveTo(192.07097f, 95.369934f, 188.62924f, 96.05276f, 186.34f, 98.34f),
                    PathNode.LineTo(144.0f, 140.69f),
                    PathNode.LineTo(85.66f, 82.34f),
                    PathNode.CurveTo(82.534065f, 79.214066f, 77.465935f, 79.214066f, 74.34f, 82.34f),
                    PathNode.CurveTo(71.214066f, 85.465935f, 71.214066f, 90.534065f, 74.34f, 93.66f),
                    PathNode.LineTo(132.69f, 152.0f),
                    PathNode.LineTo(90.34f, 194.34f),
                    PathNode.CurveTo(88.04936f, 196.6281f, 87.36368f, 200.07126f, 88.60302f, 203.06232f),
                    PathNode.CurveTo(89.84236f, 206.05338f, 92.762344f, 208.00255f, 96.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(196.41827f, 208.0f, 200.0f, 204.41827f, 200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.CurveTo(199.99933f, 100.76432f, 198.04962f, 97.84765f, 195.06f, 96.61f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
