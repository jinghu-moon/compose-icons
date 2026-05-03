package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorLightIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.0f, 72.0f),
                    PathNode.LineTo(186.0f, 54.0f),
                    PathNode.LineTo(76.48f, 54.0f),
                    PathNode.LineTo(132.69f, 124.25f),
                    PathNode.CurveTo(134.445f, 126.44199f, 134.445f, 129.558f, 132.69f, 131.75f),
                    PathNode.LineTo(76.48f, 202.0f),
                    PathNode.LineTo(186.0f, 202.0f),
                    PathNode.LineTo(186.0f, 184.0f),
                    PathNode.CurveTo(186.0f, 180.6863f, 188.6863f, 178.0f, 192.0f, 178.0f),
                    PathNode.CurveTo(195.3137f, 178.0f, 198.0f, 180.6863f, 198.0f, 184.0f),
                    PathNode.LineTo(198.0f, 208.0f),
                    PathNode.CurveTo(198.0f, 211.3137f, 195.3137f, 214.0f, 192.0f, 214.0f),
                    PathNode.LineTo(64.0f, 214.0f),
                    PathNode.CurveTo(61.692017f, 214.00241f, 59.587242f, 212.68077f, 58.586773f, 210.60089f),
                    PathNode.CurveTo(57.586304f, 208.52103f, 57.867508f, 206.05167f, 59.31f, 204.25f),
                    PathNode.LineTo(120.31f, 128.0f),
                    PathNode.LineTo(59.31f, 51.75f),
                    PathNode.CurveTo(57.867508f, 49.948326f, 57.586304f, 47.478973f, 58.586773f, 45.399105f),
                    PathNode.CurveTo(59.587242f, 43.319237f, 61.692017f, 41.997593f, 64.0f, 42.0f),
                    PathNode.LineTo(192.0f, 42.0f),
                    PathNode.CurveTo(195.3137f, 42.0f, 198.0f, 44.68629f, 198.0f, 48.0f),
                    PathNode.LineTo(198.0f, 72.0f),
                    PathNode.CurveTo(198.0f, 75.313705f, 195.3137f, 78.0f, 192.0f, 78.0f),
                    PathNode.CurveTo(188.6863f, 78.0f, 186.0f, 75.313705f, 186.0f, 72.0f),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
