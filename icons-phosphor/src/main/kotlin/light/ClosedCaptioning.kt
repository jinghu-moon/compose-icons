package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorLightIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(24.268015f, 50.0f, 18.0f, 56.268013f, 18.0f, 64.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 199.73198f, 24.268015f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(231.73198f, 206.0f, 238.0f, 199.73198f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 64.0f),
                    PathNode.CurveTo(238.0f, 56.268013f, 231.73198f, 50.0f, 224.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 193.10457f, 225.10457f, 194.0f, 224.0f, 194.0f),
                    PathNode.LineTo(32.0f, 194.0f),
                    PathNode.CurveTo(30.89543f, 194.0f, 30.0f, 193.10457f, 30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 64.0f),
                    PathNode.CurveTo(30.0f, 62.89543f, 30.89543f, 62.0f, 32.0f, 62.0f),
                    PathNode.LineTo(224.0f, 62.0f),
                    PathNode.CurveTo(225.10457f, 62.0f, 226.0f, 62.89543f, 226.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.19f, 152.71f),
                    PathNode.CurveTo(117.98738f, 154.0877f, 118.20461f, 155.72581f, 117.79388f, 157.26372f),
                    PathNode.CurveTo(117.38314f, 158.80164f, 116.378105f, 160.11331f, 115.0f, 160.91f),
                    PathNode.CurveTo(99.029434f, 170.12946f, 78.74482f, 166.55197f, 66.89166f, 152.42538f),
                    PathNode.CurveTo(55.0385f, 138.29884f, 55.0385f, 117.701164f, 66.89166f, 103.5746f),
                    PathNode.CurveTo(78.74482f, 89.44804f, 99.029434f, 85.87055f, 115.0f, 95.09f),
                    PathNode.CurveTo(116.95287f, 96.11157f, 118.18848f, 98.12157f, 118.21829f, 100.3253f),
                    PathNode.CurveTo(118.24813f, 102.52903f, 117.06738f, 104.57173f, 115.142876f, 105.64579f),
                    PathNode.CurveTo(113.21837f, 106.71985f, 110.859924f, 106.65236f, 109.0f, 105.47f),
                    PathNode.CurveTo(98.072395f, 99.170296f, 84.19942f, 101.6226f, 76.09373f, 111.28678f),
                    PathNode.CurveTo(67.98803f, 120.95097f, 67.98803f, 135.03902f, 76.09373f, 144.70322f),
                    PathNode.CurveTo(84.19942f, 154.3674f, 98.072395f, 156.8197f, 109.0f, 150.52f),
                    PathNode.CurveTo(111.866776f, 148.8663f, 115.531204f, 149.84616f, 117.19f, 152.71f),
                    PathNode.Close,
                    PathNode.MoveTo(197.19f, 152.71f),
                    PathNode.CurveTo(197.98738f, 154.0877f, 198.20462f, 155.72581f, 197.79388f, 157.26372f),
                    PathNode.CurveTo(197.38315f, 158.80164f, 196.37811f, 160.11331f, 195.0f, 160.91f),
                    PathNode.CurveTo(179.02943f, 170.12946f, 158.74481f, 166.55197f, 146.89166f, 152.42538f),
                    PathNode.CurveTo(135.0385f, 138.29884f, 135.0385f, 117.701164f, 146.89166f, 103.5746f),
                    PathNode.CurveTo(158.74481f, 89.44804f, 179.02943f, 85.87055f, 195.0f, 95.09f),
                    PathNode.CurveTo(196.95287f, 96.11157f, 198.18848f, 98.12157f, 198.2183f, 100.3253f),
                    PathNode.CurveTo(198.24814f, 102.52903f, 197.06738f, 104.57173f, 195.14288f, 105.64579f),
                    PathNode.CurveTo(193.21837f, 106.71985f, 190.85994f, 106.65236f, 189.0f, 105.47f),
                    PathNode.CurveTo(178.0724f, 99.170296f, 164.19942f, 101.6226f, 156.09372f, 111.28678f),
                    PathNode.CurveTo(147.98804f, 120.95097f, 147.98804f, 135.03902f, 156.09372f, 144.70322f),
                    PathNode.CurveTo(164.19942f, 154.3674f, 178.0724f, 156.8197f, 189.0f, 150.52f),
                    PathNode.CurveTo(191.86678f, 148.8663f, 195.53122f, 149.84616f, 197.19f, 152.71f),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
