package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorThinIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.0f, 101.37f),
                    PathNode.LineTo(187.0f, 37.37f),
                    PathNode.CurveTo(186.24356f, 36.503147f, 185.15048f, 36.00398f, 184.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(70.84951f, 36.00398f, 69.75645f, 36.503147f, 69.0f, 37.37f),
                    PathNode.LineTo(13.0f, 101.37f),
                    PathNode.CurveTo(11.651227f, 102.91545f, 11.690103f, 105.2307f, 13.09f, 106.73f),
                    PathNode.LineTo(125.09f, 226.73f),
                    PathNode.CurveTo(125.84629f, 227.5378f, 126.90342f, 227.9962f, 128.01f, 227.9962f),
                    PathNode.CurveTo(129.11658f, 227.9962f, 130.1737f, 227.5378f, 130.93f, 226.73f),
                    PathNode.LineTo(242.93f, 106.73f),
                    PathNode.CurveTo(244.32411f, 105.22553f, 244.35435f, 102.91036f, 243.0f, 101.37f),
                    PathNode.Close,
                    PathNode.MoveTo(77.29f, 108.0f),
                    PathNode.LineTo(116.36f, 205.66f),
                    PathNode.LineTo(25.2f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.09f, 108.0f),
                    PathNode.LineTo(128.0f, 213.23f),
                    PathNode.LineTo(85.91f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 100.0f),
                    PathNode.LineTo(128.0f, 46.67f),
                    PathNode.LineTo(168.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.71f, 108.0f),
                    PathNode.LineTo(230.8f, 108.0f),
                    PathNode.LineTo(139.64f, 205.66f),
                    PathNode.Close,
                    PathNode.MoveTo(231.18f, 100.0f),
                    PathNode.LineTo(178.0f, 100.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.LineTo(182.18f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(73.82f, 44.0f),
                    PathNode.LineTo(120.0f, 44.0f),
                    PathNode.LineTo(78.0f, 100.0f),
                    PathNode.LineTo(24.82f, 100.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
