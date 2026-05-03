package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorBoldIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 41.37258f, 206.62741f, 36.0f, 200.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(49.37258f, 36.0f, 44.0f, 41.37258f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(24.0f, 60.0f),
                    PathNode.CurveTo(12.954305f, 60.0f, 4.0f, 68.95431f, 4.0f, 80.0f),
                    PathNode.LineTo(4.0f, 96.0f),
                    PathNode.CurveTo(4.027555f, 120.28911f, 23.710894f, 139.97244f, 48.0f, 140.0f),
                    PathNode.LineTo(48.77f, 140.0f),
                    PathNode.CurveTo(59.215244f, 169.43077f, 85.09503f, 190.66043f, 116.0f, 195.15f),
                    PathNode.LineTo(116.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(89.37258f, 212.0f, 84.0f, 217.37259f, 84.0f, 224.0f),
                    PathNode.CurveTo(84.0f, 230.62741f, 89.37258f, 236.0f, 96.0f, 236.0f),
                    PathNode.LineTo(160.0f, 236.0f),
                    PathNode.CurveTo(166.62741f, 236.0f, 172.0f, 230.62741f, 172.0f, 224.0f),
                    PathNode.CurveTo(172.0f, 217.37259f, 166.62741f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(140.0f, 212.0f),
                    PathNode.LineTo(140.0f, 195.11f),
                    PathNode.CurveTo(170.94f, 190.6f, 196.53f, 168.91f, 207.0f, 140.0f),
                    PathNode.LineTo(208.0f, 140.0f),
                    PathNode.CurveTo(232.28911f, 139.97244f, 251.97244f, 120.28911f, 252.0f, 96.0f),
                    PathNode.LineTo(252.0f, 80.0f),
                    PathNode.CurveTo(252.0f, 68.95431f, 243.0457f, 60.0f, 232.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 84.0f),
                    PathNode.LineTo(44.0f, 84.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 113.21f, 44.0f, 114.41f, 44.09f, 115.61f),
                    PathNode.CurveTo(34.737213f, 113.74555f, 28.001944f, 105.536804f, 28.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 111.1f),
                    PathNode.CurveTo(188.0f, 144.43f, 161.29f, 171.75f, 128.46f, 172.0f),
                    PathNode.CurveTo(112.46746f, 172.12262f, 97.08778f, 165.85538f, 85.73592f, 154.58987f),
                    PathNode.CurveTo(74.38405f, 143.32437f, 67.99953f, 127.99301f, 68.0f, 112.0f),
                    PathNode.LineTo(68.0f, 60.0f),
                    PathNode.LineTo(188.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 96.0f),
                    PathNode.CurveTo(227.99998f, 105.549835f, 221.2484f, 113.767334f, 211.88f, 115.62f),
                    PathNode.CurveTo(211.96f, 114.12f, 212.0f, 112.62f, 212.0f, 111.1f),
                    PathNode.LineTo(212.0f, 84.0f),
                    PathNode.LineTo(228.0f, 84.0f),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
