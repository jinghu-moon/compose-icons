package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorBoldIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 215.51f),
                    PathNode.LineTo(185.0f, 168.0f),
                    PathNode.CurveTo(214.54955f, 129.49312f, 209.15083f, 74.66399f, 172.65846f, 42.65989f),
                    PathNode.CurveTo(136.16609f, 10.655792f, 81.101295f, 12.457935f, 46.779613f, 46.779613f),
                    PathNode.CurveTo(12.457935f, 81.101295f, 10.655792f, 136.16609f, 42.65989f, 172.65846f),
                    PathNode.CurveTo(74.66399f, 209.15083f, 129.49312f, 214.54955f, 168.0f, 185.0f),
                    PathNode.LineTo(215.53f, 232.54f),
                    PathNode.CurveTo(220.22443f, 237.23442f, 227.83559f, 237.23442f, 232.53f, 232.54f),
                    PathNode.CurveTo(237.22443f, 227.84558f, 237.22443f, 220.23442f, 232.53f, 215.54f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 74.44463f, 74.44463f, 44.0f, 112.0f, 44.0f),
                    PathNode.CurveTo(149.55536f, 44.0f, 180.0f, 74.44463f, 180.0f, 112.0f),
                    PathNode.CurveTo(180.0f, 149.55536f, 149.55536f, 180.0f, 112.0f, 180.0f),
                    PathNode.CurveTo(74.46063f, 179.96141f, 44.038586f, 149.53935f, 44.0f, 112.0f),
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
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
