package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorLightIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 43.31371f, 203.3137f, 46.0f, 200.0f, 46.0f),
                    PathNode.LineTo(170.71f, 46.0f),
                    PathNode.CurveTo(158.14447f, 46.00039f, 147.37729f, 54.987064f, 145.13f, 67.35f),
                    PathNode.LineTo(135.19f, 122.0f),
                    PathNode.LineTo(184.0f, 122.0f),
                    PathNode.CurveTo(187.3137f, 122.0f, 190.0f, 124.686295f, 190.0f, 128.0f),
                    PathNode.CurveTo(190.0f, 131.3137f, 187.3137f, 134.0f, 184.0f, 134.0f),
                    PathNode.LineTo(133.0f, 134.0f),
                    PathNode.LineTo(122.67f, 190.8f),
                    PathNode.CurveTo(119.38426f, 208.8651f, 103.651474f, 221.9968f, 85.29f, 222.0f),
                    PathNode.LineTo(56.0f, 222.0f),
                    PathNode.CurveTo(52.68629f, 222.0f, 50.0f, 219.3137f, 50.0f, 216.0f),
                    PathNode.CurveTo(50.0f, 212.6863f, 52.68629f, 210.0f, 56.0f, 210.0f),
                    PathNode.LineTo(85.29f, 210.0f),
                    PathNode.CurveTo(97.85553f, 209.99962f, 108.6227f, 201.01294f, 110.87f, 188.65f),
                    PathNode.LineTo(120.81f, 134.0f),
                    PathNode.LineTo(72.0f, 134.0f),
                    PathNode.CurveTo(68.686295f, 134.0f, 66.0f, 131.3137f, 66.0f, 128.0f),
                    PathNode.CurveTo(66.0f, 124.686295f, 68.686295f, 122.0f, 72.0f, 122.0f),
                    PathNode.LineTo(123.0f, 122.0f),
                    PathNode.LineTo(133.33f, 65.2f),
                    PathNode.CurveTo(136.61574f, 47.134907f, 152.34853f, 34.003204f, 170.71f, 34.0f),
                    PathNode.LineTo(200.0f, 34.0f),
                    PathNode.CurveTo(203.3137f, 34.0f, 206.0f, 36.68629f, 206.0f, 40.0f),
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
        return _function!!
    }

private var _function: ImageVector? = null
