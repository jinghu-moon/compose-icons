package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorFillIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 192.0f),
                    PathNode.CurveTo(110.706184f, 192.0221f, 98.12009f, 186.01225f, 89.78f, 175.66f),
                    PathNode.CurveTo(87.07139f, 172.22057f, 87.63049f, 167.24277f, 91.03462f, 164.48991f),
                    PathNode.CurveTo(94.43875f, 161.73706f, 99.423355f, 162.23175f, 102.22f, 165.6f),
                    PathNode.CurveTo(110.26081f, 175.54744f, 124.02046f, 178.78137f, 135.65056f, 173.45717f),
                    PathNode.CurveTo(147.28065f, 168.13298f, 153.8243f, 155.60432f, 151.54901f, 143.01744f),
                    PathNode.CurveTo(149.27374f, 130.43057f, 138.75806f, 120.98566f, 126.0f, 120.07f),
                    PathNode.CurveTo(123.006035f, 119.8573f, 120.38303f, 117.98662f, 119.20679f, 115.22518f),
                    PathNode.CurveTo(118.030556f, 112.46375f, 118.49899f, 109.27625f, 120.42f, 106.97f),
                    PathNode.LineTo(142.9f, 79.97f),
                    PathNode.LineTo(96.0f, 79.97f),
                    PathNode.CurveTo(91.58172f, 79.97f, 88.0f, 76.388275f, 88.0f, 71.97f),
                    PathNode.CurveTo(88.0f, 67.55172f, 91.58172f, 63.97f, 96.0f, 63.97f),
                    PathNode.LineTo(160.0f, 63.97f),
                    PathNode.CurveTo(163.10434f, 63.96883f, 165.9291f, 65.76368f, 167.24667f, 68.57453f),
                    PathNode.CurveTo(168.56425f, 71.385376f, 168.13678f, 74.704704f, 166.15f, 77.09f),
                    PathNode.LineTo(140.92f, 107.36f),
                    PathNode.CurveTo(160.31325f, 115.407326f, 171.31844f, 136.036f, 167.20255f, 156.62523f),
                    PathNode.CurveTo(163.08664f, 177.21446f, 144.99658f, 192.02682f, 124.0f, 192.0f),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
