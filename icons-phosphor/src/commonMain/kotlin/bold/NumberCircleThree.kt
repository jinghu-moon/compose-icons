package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorBoldIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 152.0f),
                    PathNode.CurveTo(164.00177f, 168.25323f, 154.16862f, 182.89162f, 139.12155f, 189.03596f),
                    PathNode.CurveTo(124.07447f, 195.18031f, 106.80549f, 191.60887f, 95.43f, 180.0f),
                    PathNode.CurveTo(92.31096f, 176.96175f, 91.082436f, 172.47232f, 92.219925f, 168.26929f),
                    PathNode.CurveTo(93.35741f, 164.06625f, 96.68239f, 160.80916f, 100.908005f, 159.75862f),
                    PathNode.CurveTo(105.13361f, 158.70808f, 109.59673f, 160.02895f, 112.57f, 163.21f),
                    PathNode.CurveTo(117.65521f, 168.38887f, 125.58943f, 169.49602f, 131.89812f, 165.90704f),
                    PathNode.CurveTo(138.20679f, 162.31807f, 141.30936f, 154.93216f, 139.45612f, 147.91464f),
                    PathNode.CurveTo(137.60286f, 140.89711f, 131.2581f, 136.00613f, 124.0f, 136.0f),
                    PathNode.CurveTo(119.52617f, 135.9993f, 115.424194f, 133.50993f, 113.35813f, 129.54173f),
                    PathNode.CurveTo(111.29206f, 125.57355f, 111.605f, 120.78551f, 114.17f, 117.12f),
                    PathNode.LineTo(129.0f, 96.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.CurveTo(97.37258f, 96.0f, 92.0f, 90.62742f, 92.0f, 84.0f),
                    PathNode.CurveTo(92.0f, 77.37258f, 97.37258f, 72.0f, 104.0f, 72.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(156.47383f, 72.000694f, 160.5758f, 74.490074f, 162.64188f, 78.45827f),
                    PathNode.CurveTo(164.70793f, 82.42645f, 164.395f, 87.21449f, 161.83f, 90.88f),
                    PathNode.LineTo(143.49f, 117.08f),
                    PathNode.CurveTo(156.14932f, 124.14346f, 163.9962f, 137.50342f, 164.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
