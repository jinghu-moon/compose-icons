package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorRegularIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.9f, 73.6f),
                    PathNode.CurveTo(224.46742f, 70.447044f, 216.7196f, 72.00071f, 212.0f, 77.39f),
                    PathNode.LineTo(178.33f, 113.68f),
                    PathNode.LineTo(142.53f, 33.39f),
                    PathNode.CurveTo(142.52834f, 33.356686f, 142.52834f, 33.32331f, 142.53f, 33.29f),
                    PathNode.CurveTo(139.91602f, 27.620481f, 134.2431f, 23.989187f, 128.0f, 23.989187f),
                    PathNode.CurveTo(121.7569f, 23.989187f, 116.083984f, 27.620481f, 113.47f, 33.29f),
                    PathNode.CurveTo(113.471664f, 33.32331f, 113.471664f, 33.356686f, 113.47f, 33.39f),
                    PathNode.LineTo(77.67f, 113.68f),
                    PathNode.LineTo(44.0f, 77.39f),
                    PathNode.CurveTo(39.251915f, 72.00163f, 31.49519f, 70.437195f, 25.029715f, 73.56392f),
                    PathNode.CurveTo(18.564238f, 76.69065f, 14.974316f, 83.74236f, 16.25f, 90.81f),
                    PathNode.CurveTo(16.25f, 90.92f, 16.25f, 91.02f, 16.32f, 91.13f),
                    PathNode.LineTo(39.0f, 195.0f),
                    PathNode.CurveTo(40.440216f, 202.54494f, 47.038837f, 208.0018f, 54.72f, 208.0f),
                    PathNode.LineTo(201.29f, 208.0f),
                    PathNode.CurveTo(208.96739f, 207.99701f, 215.56049f, 202.54123f, 217.0f, 195.0f),
                    PathNode.LineTo(239.68f, 91.13f),
                    PathNode.CurveTo(239.68f, 91.02f, 239.68f, 90.92f, 239.75f, 90.81f),
                    PathNode.CurveTo(241.0509f, 83.72917f, 237.41618f, 76.66101f, 230.9f, 73.6f),
                    PathNode.Close,
                    PathNode.MoveTo(201.35f, 191.68f),
                    PathNode.LineTo(201.29f, 192.0f),
                    PathNode.LineTo(54.71f, 192.0f),
                    PathNode.LineTo(54.65f, 191.68f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.LineTo(32.14f, 88.16f),
                    PathNode.LineTo(74.14f, 133.4f),
                    PathNode.CurveTo(75.96685f, 135.37405f, 78.663414f, 136.29799f, 81.317024f, 135.85907f),
                    PathNode.CurveTo(83.970634f, 135.42017f, 86.22608f, 133.67715f, 87.32f, 131.22f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.LineTo(168.69f, 131.25f),
                    PathNode.CurveTo(169.78392f, 133.70717f, 172.03935f, 135.45016f, 174.69298f, 135.88908f),
                    PathNode.CurveTo(177.34659f, 136.32799f, 180.04315f, 135.40407f, 181.87f, 133.43f),
                    PathNode.LineTo(223.87f, 88.19f),
                    PathNode.LineTo(224.0f, 88.0f),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
