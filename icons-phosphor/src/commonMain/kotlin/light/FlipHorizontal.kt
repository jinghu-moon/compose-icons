package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorLightIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(106.78f, 26.29f),
                    PathNode.CurveTo(100.246994f, 24.913923f, 93.6599f, 28.383915f, 91.1f, 34.55f),
                    PathNode.CurveTo(91.1f, 34.55f, 91.1f, 34.63f, 91.1f, 34.67f),
                    PathNode.LineTo(27.1f, 194.61f),
                    PathNode.CurveTo(25.298853f, 198.92767f, 25.773388f, 203.85966f, 28.364729f, 207.75471f),
                    PathNode.CurveTo(30.956068f, 211.64977f, 35.321712f, 213.99304f, 40.0f, 214.0f),
                    PathNode.LineTo(104.0f, 214.0f),
                    PathNode.CurveTo(111.73199f, 214.0f, 118.0f, 207.73198f, 118.0f, 200.0f),
                    PathNode.LineTo(118.0f, 40.0f),
                    PathNode.CurveTo(118.04593f, 33.325645f, 113.33159f, 27.565075f, 106.78f, 26.29f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 200.0f),
                    PathNode.CurveTo(106.0f, 201.10457f, 105.10457f, 202.0f, 104.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(39.327744f, 202.00282f, 38.69904f, 201.66771f, 38.3266f, 201.10803f),
                    PathNode.CurveTo(37.95416f, 200.54837f, 37.88781f, 199.83904f, 38.15f, 199.22f),
                    PathNode.LineTo(38.2f, 199.11f),
                    PathNode.LineTo(102.2f, 39.19f),
                    PathNode.CurveTo(102.6008f, 38.360268f, 103.51663f, 37.91177f, 104.41785f, 38.103867f),
                    PathNode.CurveTo(105.31906f, 38.29597f, 105.97239f, 39.07895f, 106.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.92f, 194.61f),
                    PathNode.LineTo(164.92f, 34.67f),
                    PathNode.CurveTo(164.92f, 34.67f, 164.92f, 34.59f, 164.92f, 34.55f),
                    PathNode.CurveTo(162.3462f, 28.38244f, 155.77208f, 24.89399f, 149.22191f, 26.220081f),
                    PathNode.CurveTo(142.67175f, 27.546173f, 137.97215f, 33.31701f, 138.0f, 40.0f),
                    PathNode.LineTo(138.0f, 200.0f),
                    PathNode.CurveTo(138.0f, 207.73198f, 144.26802f, 214.0f, 152.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(220.68361f, 214.00307f, 225.05849f, 211.66388f, 227.65694f, 207.7672f),
                    PathNode.CurveTo(230.2554f, 203.87051f, 230.73318f, 198.93257f, 228.93f, 194.61f),
                    PathNode.Close,
                    PathNode.MoveTo(217.66f, 201.1f),
                    PathNode.CurveTo(217.29936f, 201.67178f, 216.66586f, 202.01317f, 215.99f, 202.0f),
                    PathNode.LineTo(152.0f, 202.0f),
                    PathNode.CurveTo(150.89543f, 202.0f, 150.0f, 201.10457f, 150.0f, 200.0f),
                    PathNode.LineTo(150.0f, 40.0f),
                    PathNode.CurveTo(149.89462f, 39.007366f, 150.60844f, 38.115086f, 151.6f, 38.0f),
                    PathNode.CurveTo(151.77744f, 37.96134f, 151.9584f, 37.94123f, 152.14f, 37.94f),
                    PathNode.CurveTo(152.90411f, 37.9307f, 153.58691f, 38.41553f, 153.83f, 39.14f),
                    PathNode.LineTo(217.83f, 199.06f),
                    PathNode.LineTo(217.88f, 199.17f),
                    PathNode.CurveTo(218.14499f, 199.80812f, 218.0618f, 200.53786f, 217.66f, 201.1f),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
