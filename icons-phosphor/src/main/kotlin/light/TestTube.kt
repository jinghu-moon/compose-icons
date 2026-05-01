package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorLightIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 87.76f),
                    PathNode.LineTo(176.24f, 27.76f),
                    PathNode.CurveTo(173.89746f, 25.420374f, 170.10254f, 25.420374f, 167.76f, 27.76f),
                    PathNode.LineTo(38.53f, 157.0f),
                    PathNode.CurveTo(27.31108f, 167.71565f, 22.774553f, 183.66637f, 26.675213f, 198.68217f),
                    PathNode.CurveTo(30.57587f, 213.69798f, 42.30202f, 225.42413f, 57.317825f, 229.32478f),
                    PathNode.CurveTo(72.33363f, 233.22545f, 88.28433f, 228.68892f, 99.0f, 217.47f),
                    PathNode.LineTo(211.24f, 105.24f),
                    PathNode.LineTo(233.9f, 97.69f),
                    PathNode.CurveTo(235.87001f, 97.03044f, 237.35866f, 95.39872f, 237.83517f, 93.37661f),
                    PathNode.CurveTo(238.31168f, 91.35449f, 237.70824f, 89.22978f, 236.24f, 87.76f),
                    PathNode.Close,
                    PathNode.MoveTo(90.53f, 209.0f),
                    PathNode.CurveTo(78.50952f, 221.02048f, 59.020477f, 221.02048f, 47.0f, 209.0f),
                    PathNode.CurveTo(34.979523f, 196.97952f, 34.979523f, 177.49048f, 47.0f, 165.47f),
                    PathNode.LineTo(76.13f, 136.35f),
                    PathNode.CurveTo(84.97f, 133.21f, 98.97f, 131.79f, 117.21f, 141.35f),
                    PathNode.CurveTo(129.49f, 147.76f, 140.34f, 150.01f, 149.48f, 150.06f),
                    PathNode.Close,
                    PathNode.MoveTo(206.1f, 94.31f),
                    PathNode.CurveTo(205.21817f, 94.605446f, 204.41708f, 95.101845f, 203.76f, 95.76f),
                    PathNode.LineTo(163.86f, 135.65f),
                    PathNode.CurveTo(155.02f, 138.79f, 141.02f, 140.21f, 122.78f, 130.65f),
                    PathNode.CurveTo(110.5f, 124.27f, 99.65f, 122.0f, 90.51f, 122.0f),
                    PathNode.LineTo(172.0f, 40.49f),
                    PathNode.LineTo(220.89f, 89.38f),
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
        return _testTube!!
    }

private var _testTube: ImageVector? = null
