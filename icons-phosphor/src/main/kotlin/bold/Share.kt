package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorBoldIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 112.49f),
                    PathNode.LineTo(184.49f, 160.49f),
                    PathNode.CurveTo(179.79558f, 165.18442f, 172.18442f, 165.18442f, 167.49f, 160.49f),
                    PathNode.CurveTo(162.79558f, 155.79558f, 162.79558f, 148.18442f, 167.49f, 143.49f),
                    PathNode.LineTo(195.0f, 116.0f),
                    PathNode.LineTo(165.0f, 116.0f),
                    PathNode.CurveTo(126.68596f, 115.987526f, 93.218506f, 141.90259f, 83.64f, 179.0f),
                    PathNode.CurveTo(81.98315f, 185.41754f, 75.437546f, 189.27686f, 69.02f, 187.62f),
                    PathNode.CurveTo(62.60245f, 185.96315f, 58.743145f, 179.41754f, 60.4f, 173.0f),
                    PathNode.CurveTo(72.69596f, 125.29306f, 115.73397f, 91.96535f, 165.0f, 92.0f),
                    PathNode.LineTo(195.0f, 92.0f),
                    PathNode.LineTo(167.51f, 64.48f),
                    PathNode.CurveTo(162.81558f, 59.78558f, 162.81558f, 52.17442f, 167.51f, 47.48f),
                    PathNode.CurveTo(172.20442f, 42.78558f, 179.81558f, 42.78558f, 184.51f, 47.48f),
                    PathNode.LineTo(232.51f, 95.48f),
                    PathNode.CurveTo(234.76988f, 97.73468f, 236.03824f, 100.79688f, 236.03448f, 103.98916f),
                    PathNode.CurveTo(236.03073f, 107.18143f, 234.75517f, 110.24064f, 232.49f, 112.49f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 204.0f),
                    PathNode.LineTo(44.0f, 204.0f),
                    PathNode.LineTo(44.0f, 88.0f),
                    PathNode.CurveTo(44.0f, 81.37258f, 38.62742f, 76.0f, 32.0f, 76.0f),
                    PathNode.CurveTo(25.372583f, 76.0f, 20.0f, 81.37258f, 20.0f, 88.0f),
                    PathNode.LineTo(20.0f, 216.0f),
                    PathNode.CurveTo(20.0f, 222.62741f, 25.372583f, 228.0f, 32.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(198.62741f, 228.0f, 204.0f, 222.62741f, 204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 209.37259f, 198.62741f, 204.0f, 192.0f, 204.0f),
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
        return _share!!
    }

private var _share: ImageVector? = null
