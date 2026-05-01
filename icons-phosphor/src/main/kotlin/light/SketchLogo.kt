package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorLightIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.52f, 100.05f),
                    PathNode.LineTo(188.52f, 36.05f),
                    PathNode.CurveTo(187.37982f, 34.746338f, 185.73192f, 33.99895f, 184.0f, 34.0f),
                    PathNode.LineTo(72.0f, 34.0f),
                    PathNode.CurveTo(70.27596f, 33.986294f, 68.62934f, 34.71489f, 67.48f, 36.0f),
                    PathNode.LineTo(11.48f, 100.0f),
                    PathNode.CurveTo(9.479496f, 102.31058f, 9.535479f, 105.755646f, 11.61f, 108.0f),
                    PathNode.LineTo(123.61f, 228.0f),
                    PathNode.CurveTo(124.74494f, 229.2182f, 126.33504f, 229.91002f, 128.0f, 229.91002f),
                    PathNode.CurveTo(129.66496f, 229.91002f, 131.25507f, 229.2182f, 132.39f, 228.0f),
                    PathNode.LineTo(244.39f, 108.0f),
                    PathNode.CurveTo(246.43498f, 105.76316f, 246.49075f, 102.3525f, 244.52f, 100.05f),
                    PathNode.Close,
                    PathNode.MoveTo(75.94f, 110.0f),
                    PathNode.LineTo(110.54f, 196.49f),
                    PathNode.LineTo(29.81f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.14f, 110.0f),
                    PathNode.LineTo(128.0f, 207.84f),
                    PathNode.LineTo(88.86f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 98.0f),
                    PathNode.LineTo(128.0f, 50.0f),
                    PathNode.LineTo(164.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.06f, 110.0f),
                    PathNode.LineTo(226.19f, 110.0f),
                    PathNode.LineTo(145.46f, 196.49f),
                    PathNode.Close,
                    PathNode.MoveTo(226.78f, 98.0f),
                    PathNode.LineTo(179.0f, 98.0f),
                    PathNode.LineTo(140.0f, 46.0f),
                    PathNode.LineTo(181.28f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.72f, 46.0f),
                    PathNode.LineTo(116.0f, 46.0f),
                    PathNode.LineTo(77.0f, 98.0f),
                    PathNode.LineTo(29.22f, 98.0f),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
