package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorRegularIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(87.24f, 52.59f),
                    PathNode.CurveTo(85.92117f, 49.784386f, 83.10013f, 47.993294f, 80.0f, 47.993294f),
                    PathNode.CurveTo(76.89987f, 47.993294f, 74.07883f, 49.784386f, 72.76f, 52.59f),
                    PathNode.LineTo(8.76f, 188.59f),
                    PathNode.CurveTo(6.879471f, 192.58855f, 8.596458f, 197.35448f, 12.595f, 199.235f),
                    PathNode.CurveTo(16.593542f, 201.11552f, 21.35947f, 199.39854f, 23.24f, 195.4f),
                    PathNode.LineTo(39.9f, 160.0f),
                    PathNode.LineTo(120.1f, 160.0f),
                    PathNode.LineTo(136.76f, 195.4f),
                    PathNode.CurveTo(138.64053f, 199.39854f, 143.40646f, 201.11552f, 147.405f, 199.235f),
                    PathNode.CurveTo(151.40355f, 197.35448f, 153.12053f, 192.58855f, 151.24f, 188.59f),
                    PathNode.Close,
                    PathNode.MoveTo(47.43f, 144.0f),
                    PathNode.LineTo(80.0f, 74.79f),
                    PathNode.LineTo(112.57f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 96.0f),
                    PathNode.CurveTo(187.24f, 96.0f, 177.27f, 99.47f, 170.37f, 106.32f),
                    PathNode.CurveTo(167.36586f, 109.45178f, 167.40645f, 114.40761f, 170.46147f, 117.48977f),
                    PathNode.CurveTo(173.51651f, 120.57193f, 178.47179f, 120.656334f, 181.63f, 117.68f),
                    PathNode.CurveTo(185.43f, 113.91f, 191.63f, 112.0f, 200.0f, 112.0f),
                    PathNode.CurveTo(213.23f, 112.0f, 224.0f, 121.0f, 224.0f, 132.0f),
                    PathNode.LineTo(224.0f, 135.22f),
                    PathNode.CurveTo(216.90068f, 130.47025f, 208.54156f, 127.95554f, 200.0f, 128.0f),
                    PathNode.CurveTo(177.94f, 128.0f, 160.0f, 144.15f, 160.0f, 164.0f),
                    PathNode.CurveTo(160.0f, 183.85f, 177.94f, 200.0f, 200.0f, 200.0f),
                    PathNode.CurveTo(208.54495f, 200.03743f, 216.90488f, 197.51204f, 224.0f, 192.75f),
                    PathNode.CurveTo(224.2071f, 197.16827f, 227.95673f, 200.5821f, 232.37502f, 200.37502f),
                    PathNode.CurveTo(236.79327f, 200.1679f, 240.2071f, 196.41827f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 132.0f),
                    PathNode.CurveTo(240.0f, 112.15f, 222.06f, 96.0f, 200.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 184.0f),
                    PathNode.CurveTo(186.77f, 184.0f, 176.0f, 175.0f, 176.0f, 164.0f),
                    PathNode.CurveTo(176.0f, 153.0f, 186.77f, 144.0f, 200.0f, 144.0f),
                    PathNode.CurveTo(213.23f, 144.0f, 224.0f, 153.0f, 224.0f, 164.0f),
                    PathNode.CurveTo(224.0f, 175.0f, 213.23f, 184.0f, 200.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textAa!!
    }

private var _textAa: ImageVector? = null
