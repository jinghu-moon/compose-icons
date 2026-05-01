package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorLightIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 68.0f),
                    PathNode.CurveTo(174.0f, 73.52285f, 169.52284f, 78.0f, 164.0f, 78.0f),
                    PathNode.CurveTo(158.47716f, 78.0f, 154.0f, 73.52285f, 154.0f, 68.0f),
                    PathNode.CurveTo(154.0f, 62.477154f, 158.47716f, 58.0f, 164.0f, 58.0f),
                    PathNode.CurveTo(169.52284f, 58.0f, 174.0f, 62.477154f, 174.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 80.0f),
                    PathNode.CurveTo(238.00298f, 82.00851f, 237.00078f, 83.885284f, 235.33f, 85.0f),
                    PathNode.LineTo(214.0f, 99.21f),
                    PathNode.LineTo(214.0f, 120.0f),
                    PathNode.CurveTo(213.93387f, 176.30563f, 168.30563f, 221.93387f, 112.0f, 222.0f),
                    PathNode.LineTo(24.0f, 222.0f),
                    PathNode.CurveTo(18.617117f, 222.0005f, 13.710664f, 218.9147f, 11.379588f, 214.06276f),
                    PathNode.CurveTo(9.048513f, 209.21078f, 9.705696f, 203.45201f, 13.07f, 199.25f),
                    PathNode.LineTo(13.14f, 199.16f),
                    PathNode.LineTo(98.0f, 97.35f),
                    PathNode.LineTo(98.0f, 76.89f),
                    PathNode.CurveTo(98.0f, 44.57f, 123.89f, 18.15f, 155.72f, 18.0f),
                    PathNode.LineTo(156.0f, 18.0f),
                    PathNode.CurveTo(181.54106f, 17.992237f, 204.08107f, 34.693207f, 211.51f, 59.13f),
                    PathNode.LineTo(235.33f, 75.0f),
                    PathNode.CurveTo(237.00078f, 76.114716f, 238.00298f, 77.99149f, 238.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.18f, 80.0f),
                    PathNode.LineTo(203.0f, 67.88f),
                    PathNode.CurveTo(201.77426f, 67.06367f, 200.89157f, 65.82504f, 200.52f, 64.4f),
                    PathNode.CurveTo(195.2395f, 44.136806f, 176.93993f, 29.99698f, 156.0f, 30.0f),
                    PathNode.LineTo(155.77f, 30.0f),
                    PathNode.CurveTo(130.53f, 30.12f, 110.0f, 51.16f, 110.0f, 76.89f),
                    PathNode.LineTo(110.0f, 99.52f),
                    PathNode.CurveTo(110.00227f, 100.92659f, 109.5103f, 102.28927f, 108.61f, 103.37f),
                    PathNode.LineTo(22.43f, 206.78f),
                    PathNode.CurveTo(21.966732f, 207.38174f, 21.88424f, 208.19397f, 22.217064f, 208.87657f),
                    PathNode.CurveTo(22.549887f, 209.55917f, 23.240599f, 209.9944f, 24.0f, 210.0f),
                    PathNode.LineTo(51.86f, 210.0f),
                    PathNode.LineTo(123.39f, 124.16f),
                    PathNode.CurveTo(125.519035f, 121.6452f, 129.2777f, 121.31784f, 131.80943f, 123.426704f),
                    PathNode.CurveTo(134.34117f, 125.53557f, 134.69856f, 129.29149f, 132.61f, 131.84f),
                    PathNode.LineTo(67.48f, 210.0f),
                    PathNode.LineTo(112.0f, 210.0f),
                    PathNode.CurveTo(161.68279f, 209.94489f, 201.94489f, 169.68279f, 202.0f, 120.0f),
                    PathNode.LineTo(202.0f, 96.0f),
                    PathNode.CurveTo(201.99702f, 93.99149f, 202.99922f, 92.114716f, 204.67f, 91.0f),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
