package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorDuotoneIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.52f, 88.48f),
                    PathNode.LineTo(88.52f, 215.48f),
                    PathNode.CurveTo(67.233185f, 205.82358f, 50.176422f, 188.76682f, 40.52f, 167.48f),
                    PathNode.LineTo(167.52f, 40.48f),
                    PathNode.CurveTo(188.80681f, 50.13642f, 205.86357f, 67.193184f, 215.52f, 88.48f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.28f, 60.41f),
                    PathNode.LineTo(60.4f, 184.28f),
                    PathNode.CurveTo(56.487396f, 179.5861f, 53.07244f, 174.49886f, 50.21f, 169.1f),
                    PathNode.LineTo(169.1f, 50.21f),
                    PathNode.CurveTo(174.50128f, 53.0723f, 179.58887f, 56.490837f, 184.28f, 60.41f),
                    PathNode.Close,
                    PathNode.MoveTo(195.59f, 71.72f),
                    PathNode.CurveTo(199.50916f, 76.41113f, 202.92769f, 81.498726f, 205.79f, 86.9f),
                    PathNode.LineTo(86.9f, 205.79f),
                    PathNode.CurveTo(81.498726f, 202.92769f, 76.41113f, 199.50916f, 71.72f, 195.59f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(136.48198f, 39.997116f, 144.91963f, 41.223186f, 153.05f, 43.64f),
                    PathNode.LineTo(43.64f, 153.05f),
                    PathNode.CurveTo(35.733887f, 126.42507f, 40.861065f, 97.63036f, 57.471527f, 75.37084f),
                    PathNode.CurveTo(74.081985f, 53.11133f, 100.22603f, 39.99979f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(119.534775f, 215.99806f, 111.11431f, 214.77203f, 103.0f, 212.36f),
                    PathNode.LineTo(212.36f, 103.0f),
                    PathNode.CurveTo(220.24698f, 129.6183f, 215.11061f, 158.39757f, 198.50249f, 180.64412f),
                    PathNode.CurveTo(181.89435f, 202.89066f, 155.76218f, 215.99553f, 128.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _boules!!
    }

private var _boules: ImageVector? = null
