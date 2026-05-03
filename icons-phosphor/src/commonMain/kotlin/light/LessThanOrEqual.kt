package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorLightIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(42.0f, 104.0f),
                    PathNode.CurveTo(42.00068f, 101.485176f, 43.56958f, 99.23762f, 45.93f, 98.37f),
                    PathNode.LineTo(197.93f, 42.37f),
                    PathNode.CurveTo(201.03935f, 41.22401f, 204.48901f, 42.815636f, 205.635f, 45.925f),
                    PathNode.CurveTo(206.78099f, 49.034363f, 205.18936f, 52.48401f, 202.08f, 53.63f),
                    PathNode.LineTo(65.36f, 104.0f),
                    PathNode.LineTo(202.07f, 154.37f),
                    PathNode.CurveTo(204.79723f, 155.37485f, 206.41208f, 158.18991f, 205.90277f, 161.0514f),
                    PathNode.CurveTo(205.39346f, 163.91289f, 202.90646f, 165.99788f, 200.0f, 166.0f),
                    PathNode.CurveTo(199.2904f, 165.9988f, 198.58649f, 165.87357f, 197.92f, 165.63f),
                    PathNode.LineTo(45.92f, 109.63f),
                    PathNode.CurveTo(43.56352f, 108.75908f, 41.999138f, 106.512276f, 42.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 194.0f),
                    PathNode.LineTo(48.0f, 194.0f),
                    PathNode.CurveTo(44.68629f, 194.0f, 42.0f, 196.6863f, 42.0f, 200.0f),
                    PathNode.CurveTo(42.0f, 203.3137f, 44.68629f, 206.0f, 48.0f, 206.0f),
                    PathNode.LineTo(200.0f, 206.0f),
                    PathNode.CurveTo(203.3137f, 206.0f, 206.0f, 203.3137f, 206.0f, 200.0f),
                    PathNode.CurveTo(206.0f, 196.6863f, 203.3137f, 194.0f, 200.0f, 194.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
