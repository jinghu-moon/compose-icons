package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorDuotoneIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 192.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.LineTo(64.0f, 88.0f),
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
                    PathNode.MoveTo(197.66f, 58.34f),
                    PathNode.CurveTo(196.15945f, 56.837784f, 194.12328f, 55.993706f, 192.0f, 55.993706f),
                    PathNode.CurveTo(189.87672f, 55.993706f, 187.84055f, 56.837784f, 186.34f, 58.34f),
                    PathNode.LineTo(116.0f, 128.69f),
                    PathNode.LineTo(69.66f, 82.34f),
                    PathNode.CurveTo(67.37191f, 80.04936f, 63.928738f, 79.36368f, 60.93768f, 80.60302f),
                    PathNode.CurveTo(57.94662f, 81.84236f, 55.99745f, 84.762344f, 56.0f, 88.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.CurveTo(56.0f, 196.41827f, 59.581722f, 200.0f, 64.0f, 200.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.CurveTo(171.23764f, 200.00255f, 174.15764f, 198.05338f, 175.39697f, 195.06232f),
                    PathNode.CurveTo(176.63632f, 192.07126f, 175.95064f, 188.6281f, 173.66f, 186.34f),
                    PathNode.LineTo(127.31f, 140.0f),
                    PathNode.LineTo(197.66f, 69.66f),
                    PathNode.CurveTo(199.16223f, 68.159454f, 200.00629f, 66.123276f, 200.00629f, 64.0f),
                    PathNode.CurveTo(200.00629f, 61.876724f, 199.16223f, 59.840546f, 197.66f, 58.34f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 184.0f),
                    PathNode.LineTo(72.0f, 107.31f),
                    PathNode.LineTo(110.34f, 145.65f),
                    PathNode.LineTo(110.34f, 145.65f),
                    PathNode.LineTo(148.69f, 184.0f),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
