package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorRegularIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.LineTo(176.0f, 16.0f),
                    PathNode.CurveTo(176.0f, 11.581722f, 172.41827f, 8.0f, 168.0f, 8.0f),
                    PathNode.CurveTo(163.58173f, 8.0f, 160.0f, 11.581722f, 160.0f, 16.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.LineTo(96.0f, 16.0f),
                    PathNode.CurveTo(96.0f, 11.581722f, 92.41828f, 8.0f, 88.0f, 8.0f),
                    PathNode.CurveTo(83.58172f, 8.0f, 80.0f, 11.581722f, 80.0f, 16.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.LineTo(32.55f, 56.0f),
                    PathNode.CurveTo(26.28f, 56.0f, 24.0f, 60.78f, 24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 68.41828f, 27.581722f, 72.0f, 32.0f, 72.0f),
                    PathNode.LineTo(48.0f, 72.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.CurveTo(48.0f, 182.09138f, 65.90861f, 200.0f, 88.0f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.CurveTo(190.09138f, 200.0f, 208.0f, 182.09138f, 208.0f, 160.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(228.41827f, 72.0f, 232.0f, 68.41828f, 232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 59.581722f, 228.41827f, 56.0f, 224.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 184.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.CurveTo(74.74516f, 184.0f, 64.0f, 173.25484f, 64.0f, 160.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(192.0f, 173.25484f, 181.25484f, 184.0f, 168.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.58f, 123.44f),
                    PathNode.CurveTo(152.07422f, 125.59854f, 152.4143f, 128.35283f, 151.49f, 130.81f),
                    PathNode.LineTo(139.49f, 162.81f),
                    PathNode.CurveTo(137.93808f, 166.95213f, 133.32213f, 169.05193f, 129.18f, 167.5f),
                    PathNode.CurveTo(125.037865f, 165.94807f, 122.93808f, 161.33214f, 124.49f, 157.19f),
                    PathNode.LineTo(132.49f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(109.376015f, 135.99992f, 106.918884f, 134.71306f, 105.42447f, 132.55621f),
                    PathNode.CurveTo(103.93004f, 130.39937f, 103.588326f, 127.64679f, 104.51f, 125.19f),
                    PathNode.LineTo(116.51f, 93.19f),
                    PathNode.CurveTo(118.06192f, 89.04787f, 122.677864f, 86.94808f, 126.82f, 88.5f),
                    PathNode.CurveTo(130.96214f, 90.05192f, 133.06192f, 94.66786f, 131.51f, 98.81f),
                    PathNode.LineTo(123.51f, 120.0f),
                    PathNode.LineTo(144.0f, 120.0f),
                    PathNode.CurveTo(146.62486f, 119.99776f, 149.08382f, 121.283295f, 150.58f, 123.44f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
