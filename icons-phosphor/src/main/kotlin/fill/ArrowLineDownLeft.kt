package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorFillIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(189.66f, 90.34f),
                    PathNode.CurveTo(191.16223f, 91.840546f, 192.00629f, 93.876724f, 192.00629f, 96.0f),
                    PathNode.CurveTo(192.00629f, 98.123276f, 191.16223f, 100.159454f, 189.66f, 101.66f),
                    PathNode.LineTo(131.31f, 160.0f),
                    PathNode.LineTo(173.66f, 202.34f),
                    PathNode.CurveTo(175.95064f, 204.6281f, 176.63632f, 208.07126f, 175.39697f, 211.06232f),
                    PathNode.CurveTo(174.15764f, 214.05338f, 171.23764f, 216.00255f, 168.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(67.58172f, 216.0f, 64.0f, 212.41827f, 64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.CurveTo(63.99745f, 108.762344f, 65.94662f, 105.84236f, 68.937675f, 104.60302f),
                    PathNode.CurveTo(71.92874f, 103.36368f, 75.37191f, 104.04936f, 77.66f, 106.34f),
                    PathNode.LineTo(120.0f, 148.69f),
                    PathNode.LineTo(178.34f, 90.34f),
                    PathNode.CurveTo(179.84055f, 88.83778f, 181.87672f, 87.993706f, 184.0f, 87.993706f),
                    PathNode.CurveTo(186.12328f, 87.993706f, 188.15945f, 88.83778f, 189.66f, 90.34f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(43.581722f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.CurveTo(40.0f, 52.418278f, 43.581722f, 56.0f, 48.0f, 56.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(228.41827f, 56.0f, 232.0f, 52.418278f, 232.0f, 48.0f),
                    PathNode.CurveTo(232.0f, 43.581722f, 228.41827f, 40.0f, 224.0f, 40.0f),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
