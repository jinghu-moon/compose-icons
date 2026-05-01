package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorDuotoneIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 56.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.LineTo(96.0f, 56.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 211.58173f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 211.58173f, 224.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.34f, 173.66f),
                    PathNode.CurveTo(72.83778f, 172.15945f, 71.993706f, 170.12328f, 71.993706f, 168.0f),
                    PathNode.CurveTo(71.993706f, 165.87672f, 72.83778f, 163.84055f, 74.34f, 162.34f),
                    PathNode.LineTo(132.69f, 104.0f),
                    PathNode.LineTo(90.34f, 61.66f),
                    PathNode.CurveTo(88.04936f, 59.371906f, 87.36368f, 55.928738f, 88.60302f, 52.93768f),
                    PathNode.CurveTo(89.84236f, 49.94662f, 92.762344f, 47.99745f, 96.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(196.41827f, 48.0f, 200.0f, 51.581722f, 200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 152.0f),
                    PathNode.CurveTo(200.00255f, 155.23764f, 198.05338f, 158.15764f, 195.06232f, 159.39697f),
                    PathNode.CurveTo(192.07126f, 160.63632f, 188.6281f, 159.95064f, 186.34f, 157.66f),
                    PathNode.LineTo(144.0f, 115.31f),
                    PathNode.LineTo(85.66f, 173.66f),
                    PathNode.CurveTo(84.159454f, 175.16223f, 82.123276f, 176.00629f, 80.0f, 176.00629f),
                    PathNode.CurveTo(77.876724f, 176.00629f, 75.840546f, 175.16223f, 74.34f, 173.66f),
                    PathNode.Close,
                    PathNode.MoveTo(115.31f, 64.0f),
                    PathNode.LineTo(149.66f, 98.34f),
                    PathNode.LineTo(149.66f, 98.34f),
                    PathNode.LineTo(184.0f, 132.69f),
                    PathNode.LineTo(184.0f, 64.0f),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
