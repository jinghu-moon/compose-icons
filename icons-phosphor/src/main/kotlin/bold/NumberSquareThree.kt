package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorBoldIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 80.0f),
                    PathNode.CurveTo(92.0f, 73.37258f, 97.37258f, 68.0f, 104.0f, 68.0f),
                    PathNode.LineTo(152.0f, 68.0f),
                    PathNode.CurveTo(156.47383f, 68.000694f, 160.5758f, 70.490074f, 162.64188f, 74.45827f),
                    PathNode.CurveTo(164.70793f, 78.42645f, 164.395f, 83.21449f, 161.83f, 86.88f),
                    PathNode.LineTo(143.49f, 113.08f),
                    PathNode.CurveTo(157.17612f, 120.70958f, 165.14719f, 135.62767f, 163.88278f, 151.24565f),
                    PathNode.CurveTo(162.61838f, 166.86365f, 152.35135f, 180.30519f, 137.61615f, 185.63383f),
                    PathNode.CurveTo(122.88097f, 190.96248f, 106.39136f, 187.19682f, 95.43f, 176.0f),
                    PathNode.CurveTo(92.31096f, 172.96175f, 91.082436f, 168.47232f, 92.219925f, 164.26929f),
                    PathNode.CurveTo(93.35741f, 160.06625f, 96.68239f, 156.80916f, 100.908005f, 155.75862f),
                    PathNode.CurveTo(105.13361f, 154.70808f, 109.59673f, 156.02895f, 112.57f, 159.21f),
                    PathNode.CurveTo(117.65521f, 164.38887f, 125.58943f, 165.49602f, 131.89812f, 161.90704f),
                    PathNode.CurveTo(138.20679f, 158.31807f, 141.30936f, 150.93216f, 139.45612f, 143.91464f),
                    PathNode.CurveTo(137.60286f, 136.89711f, 131.2581f, 132.00613f, 124.0f, 132.0f),
                    PathNode.CurveTo(119.52617f, 131.9993f, 115.424194f, 129.50993f, 113.35813f, 125.54173f),
                    PathNode.CurveTo(111.29206f, 121.57355f, 111.605f, 116.78551f, 114.17f, 113.12f),
                    PathNode.LineTo(129.0f, 92.0f),
                    PathNode.LineTo(104.0f, 92.0f),
                    PathNode.CurveTo(97.37258f, 92.0f, 92.0f, 86.62742f, 92.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
