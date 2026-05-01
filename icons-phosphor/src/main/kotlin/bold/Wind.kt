package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorBoldIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 104.0f),
                    PathNode.CurveTo(17.372583f, 104.0f, 12.0f, 98.62742f, 12.0f, 92.0f),
                    PathNode.CurveTo(12.0f, 85.37258f, 17.372583f, 80.0f, 24.0f, 80.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(126.62742f, 80.0f, 132.0f, 74.62742f, 132.0f, 68.0f),
                    PathNode.CurveTo(132.0f, 61.37258f, 126.62742f, 56.0f, 120.0f, 56.0f),
                    PathNode.CurveTo(116.135826f, 56.11246f, 112.46265f, 57.705605f, 109.74f, 60.45f),
                    PathNode.CurveTo(105.01165f, 64.76051f, 97.73297f, 64.6031f, 93.19539f, 60.092213f),
                    PathNode.CurveTo(88.65781f, 55.58132f, 88.45746f, 48.3037f, 92.74f, 43.55f),
                    PathNode.CurveTo(99.97606f, 36.297283f, 109.75603f, 32.15353f, 120.0f, 32.0f),
                    PathNode.CurveTo(139.88223f, 32.0f, 156.0f, 48.11775f, 156.0f, 68.0f),
                    PathNode.CurveTo(156.0f, 87.88225f, 139.88223f, 104.0f, 120.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 68.0f),
                    PathNode.CurveTo(197.74211f, 68.14315f, 187.94594f, 72.2877f, 180.7f, 79.55f),
                    PathNode.CurveTo(176.41747f, 84.3037f, 176.6178f, 91.58132f, 181.15538f, 96.09222f),
                    PathNode.CurveTo(185.69298f, 100.6031f, 192.97165f, 100.76051f, 197.7f, 96.45f),
                    PathNode.CurveTo(200.43257f, 93.69619f, 204.12187f, 92.10227f, 208.0f, 92.0f),
                    PathNode.CurveTo(214.62741f, 92.0f, 220.0f, 97.37258f, 220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 110.62742f, 214.62741f, 116.0f, 208.0f, 116.0f),
                    PathNode.LineTo(32.0f, 116.0f),
                    PathNode.CurveTo(25.372583f, 116.0f, 20.0f, 121.37258f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 134.62741f, 25.372583f, 140.0f, 32.0f, 140.0f),
                    PathNode.LineTo(208.0f, 140.0f),
                    PathNode.CurveTo(227.88223f, 140.0f, 244.0f, 123.88225f, 244.0f, 104.0f),
                    PathNode.CurveTo(244.0f, 84.11775f, 227.88223f, 68.0f, 208.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 152.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(33.37258f, 152.0f, 28.0f, 157.37259f, 28.0f, 164.0f),
                    PathNode.CurveTo(28.0f, 170.62741f, 33.37258f, 176.0f, 40.0f, 176.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(158.62741f, 176.0f, 164.0f, 181.37259f, 164.0f, 188.0f),
                    PathNode.CurveTo(164.0f, 194.62741f, 158.62741f, 200.0f, 152.0f, 200.0f),
                    PathNode.CurveTo(148.13322f, 199.88602f, 144.45747f, 198.2933f, 141.73f, 195.55f),
                    PathNode.CurveTo(138.76624f, 192.26018f, 134.23164f, 190.86981f, 129.93321f, 191.93295f),
                    PathNode.CurveTo(125.63477f, 192.99611f, 122.27111f, 196.33998f, 121.18262f, 200.63206f),
                    PathNode.CurveTo(120.09413f, 204.92416f, 121.45772f, 209.46689f, 124.73f, 212.45f),
                    PathNode.CurveTo(131.96854f, 219.70511f, 141.75255f, 223.84906f, 152.0f, 224.0f),
                    PathNode.CurveTo(171.88223f, 224.0f, 188.0f, 207.88223f, 188.0f, 188.0f),
                    PathNode.CurveTo(188.0f, 168.11777f, 171.88223f, 152.0f, 152.0f, 152.0f),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
