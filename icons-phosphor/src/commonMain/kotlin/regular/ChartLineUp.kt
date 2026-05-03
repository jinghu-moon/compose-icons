package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorRegularIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(27.581722f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.LineTo(24.0f, 48.0f),
                    PathNode.CurveTo(24.0f, 43.581722f, 27.581722f, 40.0f, 32.0f, 40.0f),
                    PathNode.CurveTo(36.418278f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 156.69f),
                    PathNode.LineTo(90.34f, 106.34f),
                    PathNode.CurveTo(91.840546f, 104.83778f, 93.876724f, 103.993706f, 96.0f, 103.993706f),
                    PathNode.CurveTo(98.123276f, 103.993706f, 100.159454f, 104.83778f, 101.66f, 106.34f),
                    PathNode.LineTo(128.0f, 132.69f),
                    PathNode.LineTo(180.69f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(155.58173f, 80.0f, 152.0f, 76.41828f, 152.0f, 72.0f),
                    PathNode.CurveTo(152.0f, 67.58172f, 155.58173f, 64.0f, 160.0f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(204.41827f, 64.0f, 208.0f, 67.58172f, 208.0f, 72.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 116.41828f, 204.41827f, 120.0f, 200.0f, 120.0f),
                    PathNode.CurveTo(195.58173f, 120.0f, 192.0f, 116.41828f, 192.0f, 112.0f),
                    PathNode.LineTo(192.0f, 91.31f),
                    PathNode.LineTo(133.66f, 149.66f),
                    PathNode.CurveTo(132.15945f, 151.16223f, 130.12328f, 152.00629f, 128.0f, 152.00629f),
                    PathNode.CurveTo(125.876724f, 152.00629f, 123.840546f, 151.16223f, 122.34f, 149.66f),
                    PathNode.LineTo(96.0f, 123.31f),
                    PathNode.LineTo(40.0f, 179.31f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
