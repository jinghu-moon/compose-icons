package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorFillIcon(
            name = "NumberCircleNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(145.33f, 118.0f),
                    PathNode.LineTo(145.33f, 118.0f),
                    PathNode.CurveTo(139.80981f, 127.56697f, 127.57942f, 130.8478f, 118.01219f, 125.32806f),
                    PathNode.CurveTo(108.44497f, 119.80831f, 105.163574f, 107.57807f, 110.68288f, 98.01059f),
                    PathNode.CurveTo(116.20217f, 88.44311f, 128.43227f, 85.161156f, 138.0f, 90.68f),
                    PathNode.CurveTo(147.56174f, 96.20644f, 150.83426f, 108.43701f, 145.31f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 76.82f),
                    PathNode.CurveTo(132.89954f, 69.2595f, 116.47022f, 70.694275f, 104.87859f, 80.41113f),
                    PathNode.CurveTo(93.28698f, 90.128f, 89.00548f, 106.05439f, 94.16233f, 120.27374f),
                    PathNode.CurveTo(99.31918f, 134.4931f, 112.814445f, 143.97249f, 127.94f, 144.0f),
                    PathNode.QuadTo(128.88f, 144.0f, 129.83f, 143.94f),
                    PathNode.LineTo(113.13f, 171.94f),
                    PathNode.CurveTo(112.03295f, 173.76462f, 111.70846f, 175.95125f, 112.228355f, 178.01582f),
                    PathNode.CurveTo(112.748245f, 180.08038f, 114.06965f, 181.85255f, 115.9f, 182.94f),
                    PathNode.CurveTo(117.72461f, 184.03706f, 119.911255f, 184.36154f, 121.97582f, 183.84164f),
                    PathNode.CurveTo(124.04038f, 183.32175f, 125.81256f, 182.00035f, 126.9f, 180.17f),
                    PathNode.LineTo(159.18f, 126.0f),
                    PathNode.CurveTo(169.09314f, 108.776085f, 163.19785f, 86.778305f, 146.0f, 76.82f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
