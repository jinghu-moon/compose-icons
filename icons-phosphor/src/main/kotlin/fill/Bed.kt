package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorFillIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 43.581722f, 28.418278f, 40.0f, 24.0f, 40.0f),
                    PathNode.CurveTo(19.581722f, 40.0f, 16.0f, 43.581722f, 16.0f, 48.0f),
                    PathNode.LineTo(16.0f, 208.0f),
                    PathNode.CurveTo(16.0f, 212.41827f, 19.581722f, 216.0f, 24.0f, 216.0f),
                    PathNode.CurveTo(28.418278f, 216.0f, 32.0f, 212.41827f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(240.0f, 212.41827f, 243.58173f, 216.0f, 248.0f, 216.0f),
                    PathNode.CurveTo(252.41827f, 216.0f, 256.0f, 212.41827f, 256.0f, 208.0f),
                    PathNode.LineTo(256.0f, 112.0f),
                    PathNode.CurveTo(256.0f, 89.90861f, 238.09138f, 72.0f, 216.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bed!!
    }

private var _bed: ImageVector? = null
