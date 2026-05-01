package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorLightIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.93f, 154.37f),
                    PathNode.LineTo(190.64f, 104.0f),
                    PathNode.LineTo(53.93f, 53.63f),
                    PathNode.CurveTo(50.820637f, 52.48401f, 49.229008f, 49.034363f, 50.375f, 45.925f),
                    PathNode.CurveTo(51.520992f, 42.815636f, 54.97064f, 41.22401f, 58.08f, 42.37f),
                    PathNode.LineTo(210.08f, 98.37f),
                    PathNode.CurveTo(212.43869f, 99.23907f, 214.00562f, 101.4863f, 214.00562f, 104.0f),
                    PathNode.CurveTo(214.00562f, 106.5137f, 212.43869f, 108.76093f, 210.08f, 109.63f),
                    PathNode.LineTo(58.08f, 165.63f),
                    PathNode.CurveTo(57.413517f, 165.87357f, 56.709595f, 165.9988f, 56.0f, 166.0f),
                    PathNode.CurveTo(53.09354f, 165.99788f, 50.606537f, 163.91289f, 50.097225f, 161.0514f),
                    PathNode.CurveTo(49.587917f, 158.18991f, 51.20277f, 155.37485f, 53.93f, 154.37f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 194.0f),
                    PathNode.LineTo(56.0f, 194.0f),
                    PathNode.CurveTo(52.68629f, 194.0f, 50.0f, 196.6863f, 50.0f, 200.0f),
                    PathNode.CurveTo(50.0f, 203.3137f, 52.68629f, 206.0f, 56.0f, 206.0f),
                    PathNode.LineTo(208.0f, 206.0f),
                    PathNode.CurveTo(211.3137f, 206.0f, 214.0f, 203.3137f, 214.0f, 200.0f),
                    PathNode.CurveTo(214.0f, 196.6863f, 211.3137f, 194.0f, 208.0f, 194.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
