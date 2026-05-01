package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorThinIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(86.77f, 88.6f),
                    PathNode.LineTo(45.08f, 133.27f),
                    PathNode.CurveTo(44.17085f, 134.24641f, 43.808353f, 135.61182f, 44.113476f, 136.91061f),
                    PathNode.CurveTo(44.4186f, 138.2094f, 45.351173f, 139.27055f, 46.6f, 139.74f),
                    PathNode.LineTo(107.41f, 162.55f),
                    PathNode.LineTo(92.08f, 239.22f),
                    PathNode.CurveTo(91.73637f, 240.9697f, 92.59237f, 242.73555f, 94.1788f, 243.54964f),
                    PathNode.CurveTo(95.76523f, 244.36374f, 97.698944f, 244.02943f, 98.92f, 242.73f),
                    PathNode.LineTo(163.75f, 173.27f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(102.68f, 227.0f),
                    PathNode.LineTo(115.92f, 160.8f),
                    PathNode.CurveTo(116.30444f, 158.87636f, 115.23716f, 156.95778f, 113.4f, 156.27f),
                    PathNode.LineTo(55.0f, 134.36f),
                    PathNode.LineTo(92.17f, 94.54f),
                    PathNode.LineTo(158.35f, 167.33f),
                    PathNode.Close,
                    PathNode.MoveTo(111.39f, 68.1f),
                    PathNode.CurveTo(109.77584f, 66.594444f, 109.68633f, 64.065926f, 111.19f, 62.45f),
                    PathNode.LineTo(157.08f, 13.29f),
                    PathNode.CurveTo(158.30106f, 11.990561f, 160.23477f, 11.656267f, 161.8212f, 12.470357f),
                    PathNode.CurveTo(163.40764f, 13.284448f, 164.26364f, 15.050306f, 163.92f, 16.8f),
                    PathNode.LineTo(148.59f, 93.45f),
                    PathNode.LineTo(209.4f, 116.25f),
                    PathNode.CurveTo(210.65283f, 116.72053f, 211.58734f, 117.7864f, 211.89f, 119.09f),
                    PathNode.CurveTo(212.18616f, 120.39421f, 211.8109f, 121.76014f, 210.89f, 122.73f),
                    PathNode.LineTo(188.59f, 146.62f),
                    PathNode.CurveTo(187.06734f, 148.14615f, 184.60913f, 148.19106f, 183.03174f, 146.72153f),
                    PathNode.CurveTo(181.45436f, 145.252f, 181.32533f, 142.79677f, 182.74f, 141.17f),
                    PathNode.LineTo(201.0f, 121.64f),
                    PathNode.LineTo(142.6f, 99.74f),
                    PathNode.CurveTo(140.76724f, 99.05283f, 139.70096f, 97.1403f, 140.08f, 95.22f),
                    PathNode.LineTo(153.32f, 29.0f),
                    PathNode.LineTo(117.0f, 67.89f),
                    PathNode.CurveTo(115.49581f, 69.475044f, 112.99798f, 69.55965f, 111.39f, 68.08f),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
