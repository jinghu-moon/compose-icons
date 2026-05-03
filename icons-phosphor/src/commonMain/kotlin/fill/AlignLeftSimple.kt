package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorFillIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 204.41827f, 36.418278f, 208.0f, 32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 204.41827f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 51.581722f, 27.581722f, 48.0f, 32.0f, 48.0f),
                    PathNode.CurveTo(36.418278f, 48.0f, 40.0f, 51.581722f, 40.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.CurveTo(63.163445f, 80.0f, 56.0f, 87.163445f, 56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.CurveTo(56.0f, 168.83656f, 63.163445f, 176.0f, 72.0f, 176.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(232.83656f, 176.0f, 240.0f, 168.83656f, 240.0f, 160.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 87.163445f, 232.83656f, 80.0f, 224.0f, 80.0f),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
