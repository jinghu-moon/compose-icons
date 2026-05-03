package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorLightIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.49f, 28.0f),
                    PathNode.CurveTo(203.34761f, 26.722748f, 201.7136f, 25.994905f, 200.0f, 26.0f),
                    PathNode.LineTo(56.0f, 26.0f),
                    PathNode.CurveTo(54.277687f, 25.987894f, 52.633224f, 26.716526f, 51.485157f, 28.000446f),
                    PathNode.CurveTo(50.33709f, 29.284369f, 49.796146f, 30.99975f, 50.0f, 32.71f),
                    PathNode.LineTo(73.16f, 225.71f),
                    PathNode.CurveTo(74.02569f, 232.74475f, 80.01222f, 238.02269f, 87.1f, 238.0f),
                    PathNode.LineTo(168.9f, 238.0f),
                    PathNode.CurveTo(175.98604f, 237.99998f, 181.95474f, 232.70544f, 182.8f, 225.67f),
                    PathNode.LineTo(206.0f, 32.71f),
                    PathNode.CurveTo(206.1973f, 30.995916f, 205.64714f, 29.279858f, 204.49f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.24f, 38.0f),
                    PathNode.LineTo(189.88f, 66.0f),
                    PathNode.LineTo(66.12f, 66.0f),
                    PathNode.LineTo(62.76f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.89f, 224.24f),
                    PathNode.CurveTo(170.76796f, 225.24992f, 169.90726f, 226.00735f, 168.89f, 226.0f),
                    PathNode.LineTo(87.1f, 226.0f),
                    PathNode.CurveTo(86.08275f, 226.00735f, 85.222046f, 225.24992f, 85.1f, 224.24f),
                    PathNode.LineTo(67.56f, 78.0f),
                    PathNode.LineTo(188.44f, 78.0f),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
