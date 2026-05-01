package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorRegularIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 56.0f),
                    PathNode.CurveTo(248.0f, 60.418278f, 244.41827f, 64.0f, 240.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 108.41828f, 188.41827f, 112.0f, 184.0f, 112.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.CurveTo(136.0f, 156.41827f, 132.41827f, 160.0f, 128.0f, 160.0f),
                    PathNode.LineTo(80.0f, 160.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.CurveTo(80.0f, 204.41827f, 76.41828f, 208.0f, 72.0f, 208.0f),
                    PathNode.LineTo(16.0f, 208.0f),
                    PathNode.CurveTo(11.581722f, 208.0f, 8.0f, 204.41827f, 8.0f, 200.0f),
                    PathNode.CurveTo(8.0f, 195.58173f, 11.581722f, 192.0f, 16.0f, 192.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.LineTo(64.0f, 152.0f),
                    PathNode.CurveTo(64.0f, 147.58173f, 67.58172f, 144.0f, 72.0f, 144.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 99.58172f, 123.58172f, 96.0f, 128.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(176.0f, 51.581722f, 179.58173f, 48.0f, 184.0f, 48.0f),
                    PathNode.LineTo(240.0f, 48.0f),
                    PathNode.CurveTo(244.41827f, 48.0f, 248.0f, 51.581722f, 248.0f, 56.0f),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
