package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorBoldIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.17f, 141.71f),
                    PathNode.LineTo(196.0f, 121.21f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.CurveTo(196.00992f, 99.70292f, 193.72139f, 95.72853f, 190.0f, 93.58f),
                    PathNode.LineTo(140.0f, 65.0f),
                    PathNode.LineTo(140.0f, 52.0f),
                    PathNode.LineTo(152.0f, 52.0f),
                    PathNode.CurveTo(158.62741f, 52.0f, 164.0f, 46.62742f, 164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 33.37258f, 158.62741f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(140.0f, 28.0f),
                    PathNode.LineTo(140.0f, 16.0f),
                    PathNode.CurveTo(140.0f, 9.372583f, 134.62741f, 4.0f, 128.0f, 4.0f),
                    PathNode.CurveTo(121.37258f, 4.0f, 116.0f, 9.372583f, 116.0f, 16.0f),
                    PathNode.LineTo(116.0f, 28.0f),
                    PathNode.LineTo(104.0f, 28.0f),
                    PathNode.CurveTo(97.37258f, 28.0f, 92.0f, 33.37258f, 92.0f, 40.0f),
                    PathNode.CurveTo(92.0f, 46.62742f, 97.37258f, 52.0f, 104.0f, 52.0f),
                    PathNode.LineTo(116.0f, 52.0f),
                    PathNode.LineTo(116.0f, 65.0f),
                    PathNode.LineTo(66.05f, 93.58f),
                    PathNode.CurveTo(62.309353f, 95.71577f, 60.000362f, 99.69257f, 60.0f, 104.0f),
                    PathNode.LineTo(60.0f, 121.21f),
                    PathNode.LineTo(25.83f, 141.71f),
                    PathNode.CurveTo(22.213993f, 143.87772f, 20.000801f, 147.78401f, 20.0f, 152.0f),
                    PathNode.LineTo(20.0f, 216.0f),
                    PathNode.CurveTo(20.0f, 222.62741f, 25.372583f, 228.0f, 32.0f, 228.0f),
                    PathNode.LineTo(108.0f, 228.0f),
                    PathNode.CurveTo(114.62742f, 228.0f, 120.0f, 222.62741f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 172.0f),
                    PathNode.CurveTo(120.0f, 167.58173f, 123.58172f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(132.41827f, 164.0f, 136.0f, 167.58173f, 136.0f, 172.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 222.62741f, 141.37259f, 228.0f, 148.0f, 228.0f),
                    PathNode.LineTo(224.0f, 228.0f),
                    PathNode.CurveTo(230.62741f, 228.0f, 236.0f, 222.62741f, 236.0f, 216.0f),
                    PathNode.LineTo(236.0f, 152.0f),
                    PathNode.CurveTo(235.99919f, 147.78401f, 233.78601f, 143.87772f, 230.17f, 141.71f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 158.79f),
                    PathNode.LineTo(60.0f, 149.19f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(44.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(110.32689f, 140.0f, 96.0f, 154.32689f, 96.0f, 172.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.LineTo(84.0f, 204.0f),
                    PathNode.LineTo(84.0f, 111.0f),
                    PathNode.LineTo(128.0f, 85.86f),
                    PathNode.LineTo(172.0f, 111.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.LineTo(160.0f, 204.0f),
                    PathNode.LineTo(160.0f, 172.0f),
                    PathNode.CurveTo(160.0f, 154.32689f, 145.67311f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 204.0f),
                    PathNode.LineTo(196.0f, 204.0f),
                    PathNode.LineTo(196.0f, 149.19f),
                    PathNode.LineTo(212.0f, 158.79f),
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
        return _church!!
    }

private var _church: ImageVector? = null
