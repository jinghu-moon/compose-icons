package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorLightIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.69437f, 26.066126f, 26.066126f, 71.69437f, 26.0f, 128.0f),
                    PathNode.LineTo(26.0f, 184.0f),
                    PathNode.CurveTo(26.003103f, 192.28668f, 30.66235f, 199.86864f, 38.0538f, 203.61504f),
                    PathNode.CurveTo(45.445248f, 207.36145f, 54.31482f, 206.63667f, 61.0f, 201.74f),
                    PathNode.CurveTo(73.38f, 192.74f, 95.06f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(160.94f, 182.0f, 182.61f, 192.73f, 195.0f, 201.73f),
                    PathNode.CurveTo(201.68373f, 206.62561f, 210.55106f, 207.35123f, 217.94174f, 203.6073f),
                    PathNode.CurveTo(225.33244f, 199.86339f, 229.99313f, 192.28488f, 230.0f, 184.0f),
                    PathNode.LineTo(230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.LineTo(218.0f, 140.5f),
                    PathNode.CurveTo(204.1699f, 131.52365f, 189.06737f, 124.68032f, 173.2f, 120.2f),
                    PathNode.CurveTo(170.15576f, 90.80044f, 159.27357f, 62.75751f, 141.69f, 39.0f),
                    PathNode.CurveTo(185.5775f, 45.818504f, 217.95995f, 83.586006f, 218.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.79f, 117.22f),
                    PathNode.CurveTo(139.14082f, 112.92656f, 116.859184f, 112.92656f, 95.21f, 117.22f),
                    PathNode.CurveTo(100.21f, 78.84f, 119.37f, 51.63f, 128.0f, 41.08f),
                    PathNode.CurveTo(136.63f, 51.65f, 155.8f, 78.85f, 160.79f, 117.23f),
                    PathNode.Close,
                    PathNode.MoveTo(114.31f, 39.0f),
                    PathNode.CurveTo(96.72476f, 62.760365f, 85.8425f, 90.80696f, 82.8f, 120.21f),
                    PathNode.CurveTo(66.93264f, 124.690315f, 51.8301f, 131.53366f, 38.0f, 140.51f),
                    PathNode.LineTo(38.0f, 128.0f),
                    PathNode.CurveTo(38.040054f, 83.586006f, 70.4225f, 45.818504f, 114.31f, 39.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.57f, 192.85f),
                    PathNode.CurveTo(209.17714f, 194.62663f, 205.06535f, 194.29597f, 202.0f, 192.0f),
                    PathNode.CurveTo(188.18f, 182.0f, 164.12f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(91.88f, 170.0f, 67.78f, 182.0f, 54.0f, 192.0f),
                    PathNode.CurveTo(50.94531f, 194.28418f, 46.851517f, 194.61464f, 43.47f, 192.85f),
                    PathNode.CurveTo(40.100327f, 191.19313f, 37.975227f, 187.7549f, 38.0f, 184.0f),
                    PathNode.LineTo(38.0f, 155.0f),
                    PathNode.CurveTo(91.75489f, 116.28533f, 164.2451f, 116.28533f, 218.0f, 155.0f),
                    PathNode.LineTo(218.0f, 184.0f),
                    PathNode.CurveTo(218.04767f, 187.76028f, 215.93721f, 191.21552f, 212.57f, 192.89f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
