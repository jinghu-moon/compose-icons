package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Badge: ImageVector
    get() {
        if (_badge != null) return _badge!!
        _badge = lucideOutlineIcon(
            name = "Badge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.85f, 8.62f),
                    PathNode.CurveTo(3.553353f, 7.283745f, 3.960577f, 5.888586f, 4.929469f, 4.921722f),
                    PathNode.CurveTo(5.898361f, 3.954857f, 7.294369f, 3.550555f, 8.63f, 3.85f),
                    PathNode.CurveTo(9.365068f, 2.700381f, 10.635468f, 2.004785f, 12.0f, 2.004785f),
                    PathNode.CurveTo(13.364532f, 2.004785f, 14.634932f, 2.700381f, 15.37f, 3.85f),
                    PathNode.CurveTo(16.707739f, 3.549236f, 18.10631f, 3.954617f, 19.075846f, 4.924154f),
                    PathNode.CurveTo(20.045383f, 5.89369f, 20.450764f, 7.292262f, 20.15f, 8.63f),
                    PathNode.CurveTo(21.29962f, 9.365068f, 21.995214f, 10.635468f, 21.995214f, 12.0f),
                    PathNode.CurveTo(21.995214f, 13.364532f, 21.29962f, 14.634932f, 20.15f, 15.37f),
                    PathNode.CurveTo(20.449446f, 16.705631f, 20.045143f, 18.101639f, 19.07828f, 19.070532f),
                    PathNode.CurveTo(18.111414f, 20.039421f, 16.716255f, 20.446648f, 15.38f, 20.15f),
                    PathNode.CurveTo(14.645833f, 21.304111f, 13.372836f, 22.003054f, 12.005f, 22.003054f),
                    PathNode.CurveTo(10.637164f, 22.003054f, 9.364167f, 21.304111f, 8.63f, 20.15f),
                    PathNode.CurveTo(7.294369f, 20.449446f, 5.898361f, 20.045143f, 4.929469f, 19.07828f),
                    PathNode.CurveTo(3.960577f, 18.111414f, 3.553353f, 16.716255f, 3.85f, 15.38f),
                    PathNode.CurveTo(2.691377f, 14.646754f, 1.989065f, 13.371152f, 1.989065f, 12.0f),
                    PathNode.CurveTo(1.989065f, 10.628848f, 2.691377f, 9.353246f, 3.85f, 8.62f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _badge!!
    }

private var _badge: ImageVector? = null
