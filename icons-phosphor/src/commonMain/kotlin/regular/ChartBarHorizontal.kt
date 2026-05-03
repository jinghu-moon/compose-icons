package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorRegularIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 96.0f),
                    PathNode.LineTo(184.0f, 96.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 51.581722f, 180.41827f, 48.0f, 176.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(56.0f, 35.581722f, 52.418278f, 32.0f, 48.0f, 32.0f),
                    PathNode.CurveTo(43.581722f, 32.0f, 40.0f, 35.581722f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 220.41827f, 43.581722f, 224.0f, 48.0f, 224.0f),
                    PathNode.CurveTo(52.418278f, 224.0f, 56.0f, 220.41827f, 56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(148.41827f, 208.0f, 152.0f, 204.41827f, 152.0f, 200.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(228.41827f, 160.0f, 232.0f, 156.41827f, 232.0f, 152.0f),
                    PathNode.LineTo(232.0f, 104.0f),
                    PathNode.CurveTo(232.0f, 99.58172f, 228.41827f, 96.0f, 224.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 64.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 192.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 144.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.LineTo(216.0f, 112.0f),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
