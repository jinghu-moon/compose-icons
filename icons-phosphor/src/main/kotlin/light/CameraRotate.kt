package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorLightIcon(
            name = "CameraRotate",
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
                    PathNode.MoveTo(174.0f, 96.0f),
                    PathNode.LineTo(174.0f, 120.0f),
                    PathNode.CurveTo(174.0f, 123.313705f, 171.3137f, 126.0f, 168.0f, 126.0f),
                    PathNode.LineTo(144.0f, 126.0f),
                    PathNode.CurveTo(140.6863f, 126.0f, 138.0f, 123.313705f, 138.0f, 120.0f),
                    PathNode.CurveTo(138.0f, 116.686295f, 140.6863f, 114.0f, 144.0f, 114.0f),
                    PathNode.LineTo(154.0f, 114.0f),
                    PathNode.LineTo(152.0f, 111.91f),
                    PathNode.CurveTo(140.01187f, 100.04233f, 121.15064f, 98.71635f, 107.62f, 108.79f),
                    PathNode.CurveTo(104.971794f, 110.783745f, 101.20874f, 110.253204f, 99.215f, 107.605f),
                    PathNode.CurveTo(97.22125f, 104.956795f, 97.75179f, 101.19375f, 100.4f, 99.2f),
                    PathNode.CurveTo(118.74102f, 85.54423f, 144.31238f, 87.35982f, 160.54f, 103.47f),
                    PathNode.CurveTo(160.5681f, 103.50819f, 160.6018f, 103.5419f, 160.64f, 103.57f),
                    PathNode.LineTo(162.0f, 105.0f),
                    PathNode.LineTo(162.0f, 96.0f),
                    PathNode.CurveTo(162.0f, 92.686295f, 164.6863f, 90.0f, 168.0f, 90.0f),
                    PathNode.CurveTo(171.3137f, 90.0f, 174.0f, 92.686295f, 174.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.8f, 156.4f),
                    PathNode.CurveTo(158.7904f, 159.04836f, 158.25769f, 162.80872f, 155.61f, 164.8f),
                    PathNode.CurveTo(137.27153f, 178.46451f, 111.693855f, 176.64847f, 95.47f, 160.53f),
                    PathNode.LineTo(95.37f, 160.43f),
                    PathNode.LineTo(94.0f, 159.0f),
                    PathNode.LineTo(94.0f, 168.0f),
                    PathNode.CurveTo(94.0f, 171.3137f, 91.313705f, 174.0f, 88.0f, 174.0f),
                    PathNode.CurveTo(84.686295f, 174.0f, 82.0f, 171.3137f, 82.0f, 168.0f),
                    PathNode.LineTo(82.0f, 144.0f),
                    PathNode.CurveTo(82.0f, 140.6863f, 84.686295f, 138.0f, 88.0f, 138.0f),
                    PathNode.LineTo(112.0f, 138.0f),
                    PathNode.CurveTo(115.313705f, 138.0f, 118.0f, 140.6863f, 118.0f, 144.0f),
                    PathNode.CurveTo(118.0f, 147.3137f, 115.313705f, 150.0f, 112.0f, 150.0f),
                    PathNode.LineTo(102.0f, 150.0f),
                    PathNode.LineTo(104.0f, 152.09f),
                    PathNode.CurveTo(115.98813f, 163.95769f, 134.84935f, 165.28365f, 148.38f, 155.21f),
                    PathNode.CurveTo(149.65312f, 154.24783f, 151.25711f, 153.83249f, 152.83722f, 154.0558f),
                    PathNode.CurveTo(154.41733f, 154.27913f, 155.84337f, 155.12271f, 156.8f, 156.4f),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
