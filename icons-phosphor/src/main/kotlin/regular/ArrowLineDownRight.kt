package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorRegularIcon(
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
                    PathNode.MoveTo(192.0f, 96.0f),
                    PathNode.CurveTo(187.58173f, 96.0f, 184.0f, 99.58172f, 184.0f, 104.0f),
                    PathNode.LineTo(184.0f, 180.69f),
                    PathNode.LineTo(85.66f, 82.34f),
                    PathNode.CurveTo(82.534065f, 79.214066f, 77.465935f, 79.214066f, 74.34f, 82.34f),
                    PathNode.CurveTo(71.214066f, 85.465935f, 71.214066f, 90.534065f, 74.34f, 93.66f),
                    PathNode.LineTo(172.69f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(91.58172f, 192.0f, 88.0f, 195.58173f, 88.0f, 200.0f),
                    PathNode.CurveTo(88.0f, 204.41827f, 91.58172f, 208.0f, 96.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(196.41827f, 208.0f, 200.0f, 204.41827f, 200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 99.58172f, 196.41827f, 96.0f, 192.0f, 96.0f),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
