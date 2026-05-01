package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorBoldIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 112.0f),
                    PathNode.CurveTo(156.0f, 118.62742f, 150.62741f, 124.0f, 144.0f, 124.0f),
                    PathNode.LineTo(80.0f, 124.0f),
                    PathNode.CurveTo(73.37258f, 124.0f, 68.0f, 118.62742f, 68.0f, 112.0f),
                    PathNode.CurveTo(68.0f, 105.37258f, 73.37258f, 100.0f, 80.0f, 100.0f),
                    PathNode.LineTo(144.0f, 100.0f),
                    PathNode.CurveTo(150.62741f, 100.0f, 156.0f, 105.37258f, 156.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.49f, 232.49f),
                    PathNode.CurveTo(230.23837f, 234.74945f, 227.17982f, 236.01947f, 223.99f, 236.01947f),
                    PathNode.CurveTo(220.80019f, 236.01947f, 217.74162f, 234.74945f, 215.49f, 232.49f),
                    PathNode.LineTo(168.0f, 185.0f),
                    PathNode.CurveTo(129.49312f, 214.54955f, 74.66399f, 209.15083f, 42.65989f, 172.65846f),
                    PathNode.CurveTo(10.655792f, 136.16609f, 12.457935f, 81.101295f, 46.779613f, 46.779613f),
                    PathNode.CurveTo(81.101295f, 12.457935f, 136.16609f, 10.655792f, 172.65846f, 42.65989f),
                    PathNode.CurveTo(209.15083f, 74.66399f, 214.54955f, 129.49312f, 185.0f, 168.0f),
                    PathNode.LineTo(232.54f, 215.53f),
                    PathNode.CurveTo(237.20547f, 220.22887f, 237.18309f, 227.81873f, 232.49f, 232.49f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 180.0f),
                    PathNode.CurveTo(149.55536f, 180.0f, 180.0f, 149.55536f, 180.0f, 112.0f),
                    PathNode.CurveTo(180.0f, 74.44463f, 149.55536f, 44.0f, 112.0f, 44.0f),
                    PathNode.CurveTo(74.44463f, 44.0f, 44.0f, 74.44463f, 44.0f, 112.0f),
                    PathNode.CurveTo(44.044083f, 149.5371f, 74.46291f, 179.95592f, 112.0f, 180.0f),
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
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
