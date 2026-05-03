package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorBoldIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 204.0f),
                    PathNode.LineTo(228.0f, 204.0f),
                    PathNode.LineTo(228.0f, 144.0f),
                    PathNode.CurveTo(233.27815f, 145.85461f, 239.13759f, 143.8159f, 242.12457f, 139.08553f),
                    PathNode.CurveTo(245.11154f, 134.35513f, 244.43346f, 128.18832f, 240.49f, 124.22f),
                    PathNode.LineTo(142.14f, 25.85f),
                    PathNode.CurveTo(134.33f, 18.04236f, 121.67f, 18.04236f, 113.86f, 25.85f),
                    PathNode.LineTo(15.51f, 124.2f),
                    PathNode.CurveTo(11.54206f, 128.16406f, 10.849301f, 134.34795f, 13.841731f, 139.09175f),
                    PathNode.CurveTo(16.834162f, 143.83556f, 22.713469f, 145.87373f, 28.0f, 144.0f),
                    PathNode.LineTo(28.0f, 204.0f),
                    PathNode.LineTo(16.0f, 204.0f),
                    PathNode.CurveTo(9.372583f, 204.0f, 4.0f, 209.37259f, 4.0f, 216.0f),
                    PathNode.CurveTo(4.0f, 222.62741f, 9.372583f, 228.0f, 16.0f, 228.0f),
                    PathNode.LineTo(240.0f, 228.0f),
                    PathNode.CurveTo(246.62741f, 228.0f, 252.0f, 222.62741f, 252.0f, 216.0f),
                    PathNode.CurveTo(252.0f, 209.37259f, 246.62741f, 204.0f, 240.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 121.65f),
                    PathNode.LineTo(128.0f, 45.65f),
                    PathNode.LineTo(204.0f, 121.65f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.LineTo(164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 145.37259f, 158.62741f, 140.0f, 152.0f, 140.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.CurveTo(97.37258f, 140.0f, 92.0f, 145.37259f, 92.0f, 152.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 204.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(140.0f, 164.0f),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
