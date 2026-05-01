package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorLightIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 58.0f),
                    PathNode.LineTo(179.21f, 58.0f),
                    PathNode.LineTo(165.0f, 36.67f),
                    PathNode.CurveTo(163.88528f, 34.99922f, 162.0085f, 33.997025f, 160.0f, 34.0f),
                    PathNode.LineTo(96.0f, 34.0f),
                    PathNode.CurveTo(93.99149f, 33.997025f, 92.114716f, 34.99922f, 91.0f, 36.67f),
                    PathNode.LineTo(76.78f, 58.0f),
                    PathNode.LineTo(48.0f, 58.0f),
                    PathNode.CurveTo(35.849735f, 58.0f, 26.0f, 67.84974f, 26.0f, 80.0f),
                    PathNode.LineTo(26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 204.15027f, 35.849735f, 214.0f, 48.0f, 214.0f),
                    PathNode.LineTo(208.0f, 214.0f),
                    PathNode.CurveTo(220.15027f, 214.0f, 230.0f, 204.15027f, 230.0f, 192.0f),
                    PathNode.LineTo(230.0f, 80.0f),
                    PathNode.CurveTo(230.0f, 67.84974f, 220.15027f, 58.0f, 208.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 192.0f),
                    PathNode.CurveTo(218.0f, 197.52284f, 213.52284f, 202.0f, 208.0f, 202.0f),
                    PathNode.LineTo(48.0f, 202.0f),
                    PathNode.CurveTo(42.477154f, 202.0f, 38.0f, 197.52284f, 38.0f, 192.0f),
                    PathNode.LineTo(38.0f, 80.0f),
                    PathNode.CurveTo(38.0f, 74.47715f, 42.477154f, 70.0f, 48.0f, 70.0f),
                    PathNode.LineTo(80.0f, 70.0f),
                    PathNode.CurveTo(82.00851f, 70.002975f, 83.885284f, 69.00078f, 85.0f, 67.33f),
                    PathNode.LineTo(99.21f, 46.0f),
                    PathNode.LineTo(156.78f, 46.0f),
                    PathNode.LineTo(171.0f, 67.33f),
                    PathNode.CurveTo(172.11472f, 69.00078f, 173.9915f, 70.002975f, 176.0f, 70.0f),
                    PathNode.LineTo(208.0f, 70.0f),
                    PathNode.CurveTo(213.52284f, 70.0f, 218.0f, 74.47715f, 218.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 90.0f),
                    PathNode.CurveTo(104.80404f, 90.0f, 86.0f, 108.80404f, 86.0f, 132.0f),
                    PathNode.CurveTo(86.0f, 155.19595f, 104.80404f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(151.19595f, 174.0f, 170.0f, 155.19595f, 170.0f, 132.0f),
                    PathNode.CurveTo(170.0f, 108.80404f, 151.19595f, 90.0f, 128.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 162.0f),
                    PathNode.CurveTo(111.43146f, 162.0f, 98.0f, 148.56854f, 98.0f, 132.0f),
                    PathNode.CurveTo(98.0f, 115.43146f, 111.43146f, 102.0f, 128.0f, 102.0f),
                    PathNode.CurveTo(144.56854f, 102.0f, 158.0f, 115.43146f, 158.0f, 132.0f),
                    PathNode.CurveTo(158.0f, 148.56854f, 144.56854f, 162.0f, 128.0f, 162.0f),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
