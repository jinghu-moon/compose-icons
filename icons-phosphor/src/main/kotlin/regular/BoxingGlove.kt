package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorRegularIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 16.0f),
                    PathNode.LineTo(120.0f, 16.0f),
                    PathNode.CurveTo(89.08576f, 16.03307f, 64.033066f, 41.085766f, 64.0f, 72.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.CurveTo(38.32689f, 72.0f, 24.0f, 86.32689f, 24.0f, 104.0f),
                    PathNode.LineTo(24.0f, 133.19f),
                    PathNode.CurveTo(24.007132f, 136.82407f, 25.244276f, 140.3487f, 27.51f, 143.19f),
                    PathNode.CurveTo(27.703146f, 143.4318f, 27.910162f, 143.66219f, 28.13f, 143.88f),
                    PathNode.LineTo(64.0f, 179.34f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(64.0f, 224.83656f, 71.163445f, 232.0f, 80.0f, 232.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(200.83656f, 232.0f, 208.0f, 224.83656f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 177.12f),
                    PathNode.LineTo(223.38f, 123.27f),
                    PathNode.CurveTo(223.7908f, 121.84283f, 223.9995f, 120.36512f, 224.0f, 118.88f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(223.96693f, 41.085766f, 198.91423f, 16.03307f, 168.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 118.88f),
                    PathNode.LineTo(192.31f, 173.8f),
                    PathNode.CurveTo(192.10289f, 174.51492f, 191.9985f, 175.25568f, 192.0f, 176.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.LineTo(80.0f, 216.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.CurveTo(79.99907f, 173.86147f, 79.14196f, 171.81232f, 77.62f, 170.31f),
                    PathNode.LineTo(40.0f, 133.12f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 95.163445f, 47.163445f, 88.0f, 56.0f, 88.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 108.41828f, 67.58172f, 112.0f, 72.0f, 112.0f),
                    PathNode.CurveTo(76.41828f, 112.0f, 80.0f, 108.41828f, 80.0f, 104.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.CurveTo(80.0f, 49.90861f, 97.90861f, 32.0f, 120.0f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(190.09138f, 32.0f, 208.0f, 49.90861f, 208.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.58f, 167.16f),
                    PathNode.LineTo(153.89f, 176.0f),
                    PathNode.LineTo(171.58f, 184.84f),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
