package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorFillIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 112.0f),
                    PathNode.LineTo(232.0f, 144.0f),
                    PathNode.CurveTo(232.0f, 148.41827f, 228.41827f, 152.0f, 224.0f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(148.41827f, 168.0f, 152.0f, 171.58173f, 152.0f, 176.0f),
                    PathNode.LineTo(152.0f, 200.0f),
                    PathNode.CurveTo(152.0f, 204.41827f, 148.41827f, 208.0f, 144.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 220.41827f, 52.418278f, 224.0f, 48.0f, 224.0f),
                    PathNode.CurveTo(43.581722f, 224.0f, 40.0f, 220.41827f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 35.581722f, 43.581722f, 32.0f, 48.0f, 32.0f),
                    PathNode.CurveTo(52.418278f, 32.0f, 56.0f, 35.581722f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(180.41827f, 48.0f, 184.0f, 51.581722f, 184.0f, 56.0f),
                    PathNode.LineTo(184.0f, 80.0f),
                    PathNode.CurveTo(184.0f, 84.41828f, 180.41827f, 88.0f, 176.0f, 88.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.CurveTo(228.41827f, 104.0f, 232.0f, 107.58172f, 232.0f, 112.0f),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
