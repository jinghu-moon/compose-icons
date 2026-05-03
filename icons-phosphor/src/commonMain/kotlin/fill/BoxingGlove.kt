package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorFillIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 16.0f),
                    PathNode.LineTo(120.0f, 16.0f),
                    PathNode.CurveTo(89.07206f, 16.0f, 64.0f, 41.072056f, 64.0f, 72.0f),
                    PathNode.LineTo(64.0f, 103.73f),
                    PathNode.CurveTo(64.06826f, 108.02065f, 60.80546f, 111.63287f, 56.53f, 112.0f),
                    PathNode.CurveTo(54.31803f, 112.14687f, 52.144287f, 111.36931f, 50.527313f, 109.852806f),
                    PathNode.CurveTo(48.910343f, 108.3363f, 47.99513f, 106.216835f, 48.0f, 104.0f),
                    PathNode.LineTo(48.0f, 78.7f),
                    PathNode.CurveTo(47.999046f, 77.34541f, 47.31259f, 76.08334f, 46.175972f, 75.34646f),
                    PathNode.CurveTo(45.039352f, 74.60957f, 43.607018f, 74.49801f, 42.37f, 75.05f),
                    PathNode.CurveTo(31.157368f, 80.32866f, 24.000807f, 91.60697f, 24.0f, 104.0f),
                    PathNode.LineTo(24.0f, 133.19f),
                    PathNode.CurveTo(24.008211f, 136.8222f, 25.241348f, 140.34546f, 27.5f, 143.19f),
                    PathNode.QuadTo(27.8f, 143.55f, 28.13f, 143.88f),
                    PathNode.LineTo(64.0f, 179.34f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(64.0f, 224.83656f, 71.163445f, 232.0f, 80.0f, 232.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(200.83656f, 232.0f, 208.0f, 224.83656f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 177.12f),
                    PathNode.LineTo(223.38f, 123.28f),
                    PathNode.CurveTo(223.79031f, 121.84931f, 223.999f, 120.36836f, 224.0f, 118.88f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(224.0f, 41.072056f, 198.92795f, 16.0f, 168.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.58f, 184.84f),
                    PathNode.CurveTo(175.53436f, 186.81718f, 177.13718f, 191.62564f, 175.16f, 195.58f),
                    PathNode.CurveTo(173.18282f, 199.53436f, 168.37436f, 201.13718f, 164.42f, 199.16f),
                    PathNode.LineTo(136.0f, 184.94f),
                    PathNode.LineTo(107.58f, 199.16f),
                    PathNode.CurveTo(103.62564f, 201.13718f, 98.81718f, 199.53436f, 96.84f, 195.58f),
                    PathNode.CurveTo(94.86282f, 191.62564f, 96.465645f, 186.81718f, 100.42f, 184.84f),
                    PathNode.LineTo(118.11f, 176.0f),
                    PathNode.LineTo(100.42f, 167.16f),
                    PathNode.CurveTo(96.465645f, 165.18282f, 94.86282f, 160.37436f, 96.84f, 156.42f),
                    PathNode.CurveTo(98.81718f, 152.46564f, 103.62564f, 150.86282f, 107.58f, 152.84f),
                    PathNode.LineTo(136.0f, 167.06f),
                    PathNode.LineTo(164.42f, 152.84f),
                    PathNode.CurveTo(168.37436f, 150.86282f, 173.18282f, 152.46564f, 175.16f, 156.42f),
                    PathNode.CurveTo(177.13718f, 160.37436f, 175.53436f, 165.18282f, 171.58f, 167.16f),
                    PathNode.LineTo(153.89f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
