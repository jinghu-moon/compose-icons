package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorBoldIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.LineTo(180.0f, 16.0f),
                    PathNode.CurveTo(180.0f, 9.372583f, 174.62741f, 4.0f, 168.0f, 4.0f),
                    PathNode.CurveTo(161.37259f, 4.0f, 156.0f, 9.372583f, 156.0f, 16.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.LineTo(100.0f, 48.0f),
                    PathNode.LineTo(100.0f, 16.0f),
                    PathNode.CurveTo(100.0f, 9.372583f, 94.62742f, 4.0f, 88.0f, 4.0f),
                    PathNode.CurveTo(81.37258f, 4.0f, 76.0f, 9.372583f, 76.0f, 16.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.LineTo(32.55f, 48.0f),
                    PathNode.CurveTo(24.4f, 48.0f, 20.0f, 54.18f, 20.0f, 60.0f),
                    PathNode.CurveTo(20.0f, 66.62742f, 25.372583f, 72.0f, 32.0f, 72.0f),
                    PathNode.LineTo(44.0f, 72.0f),
                    PathNode.LineTo(44.0f, 164.0f),
                    PathNode.CurveTo(44.027554f, 188.28911f, 63.71089f, 207.97244f, 88.0f, 208.0f),
                    PathNode.LineTo(116.0f, 208.0f),
                    PathNode.LineTo(116.0f, 240.0f),
                    PathNode.CurveTo(116.0f, 246.62741f, 121.37258f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(134.62741f, 252.0f, 140.0f, 246.62741f, 140.0f, 240.0f),
                    PathNode.LineTo(140.0f, 208.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(192.28911f, 207.97244f, 211.97244f, 188.28911f, 212.0f, 164.0f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(230.62741f, 72.0f, 236.0f, 66.62742f, 236.0f, 60.0f),
                    PathNode.CurveTo(236.0f, 53.37258f, 230.62741f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 164.0f),
                    PathNode.CurveTo(188.0f, 175.0457f, 179.0457f, 184.0f, 168.0f, 184.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.CurveTo(76.95431f, 184.0f, 68.0f, 175.0457f, 68.0f, 164.0f),
                    PathNode.LineTo(68.0f, 72.0f),
                    PathNode.LineTo(188.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.14f, 134.83f),
                    PathNode.CurveTo(99.91234f, 131.60829f, 99.3972f, 127.502144f, 100.76f, 123.83f),
                    PathNode.LineTo(112.76f, 91.83f),
                    PathNode.CurveTo(115.08512f, 85.62232f, 122.00232f, 82.47489f, 128.21f, 84.8f),
                    PathNode.CurveTo(134.41768f, 87.12512f, 137.56512f, 94.04232f, 135.24f, 100.25f),
                    PathNode.LineTo(129.32f, 116.0f),
                    PathNode.LineTo(144.0f, 116.0f),
                    PathNode.CurveTo(147.93558f, 115.9991f, 151.62146f, 117.928055f, 153.86401f, 121.16221f),
                    PathNode.CurveTo(156.10657f, 124.396355f, 156.62073f, 128.52457f, 155.24f, 132.21f),
                    PathNode.LineTo(143.24f, 164.21f),
                    PathNode.CurveTo(140.91489f, 170.41768f, 133.99768f, 173.56512f, 127.79f, 171.24f),
                    PathNode.CurveTo(121.58232f, 168.91489f, 118.43488f, 161.99768f, 120.76f, 155.79f),
                    PathNode.LineTo(126.68f, 140.0f),
                    PathNode.LineTo(112.0f, 140.0f),
                    PathNode.CurveTo(108.06439f, 139.99782f, 104.38001f, 138.06595f, 102.14f, 134.83f),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
