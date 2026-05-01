package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorLightIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 26.0f),
                    PathNode.LineTo(96.0f, 26.0f),
                    PathNode.CurveTo(88.26801f, 26.0f, 82.0f, 32.268013f, 82.0f, 40.0f),
                    PathNode.LineTo(82.0f, 58.0f),
                    PathNode.LineTo(64.0f, 58.0f),
                    PathNode.CurveTo(56.268013f, 58.0f, 50.0f, 64.26801f, 50.0f, 72.0f),
                    PathNode.LineTo(50.0f, 224.0f),
                    PathNode.CurveTo(50.00021f, 226.24799f, 51.257004f, 228.30728f, 53.256165f, 229.3353f),
                    PathNode.CurveTo(55.255325f, 230.36331f, 57.661423f, 230.18759f, 59.49f, 228.88f),
                    PathNode.LineTo(112.0f, 191.37f),
                    PathNode.LineTo(164.52f, 228.88f),
                    PathNode.CurveTo(166.3484f, 230.18181f, 168.7505f, 230.35426f, 170.74612f, 229.32698f),
                    PathNode.CurveTo(172.74174f, 228.2997f, 173.99712f, 226.2445f, 174.0f, 224.0f),
                    PathNode.LineTo(174.0f, 180.8f),
                    PathNode.LineTo(196.51f, 196.88f),
                    PathNode.CurveTo(198.33858f, 198.18759f, 200.74467f, 198.36331f, 202.74384f, 197.3353f),
                    PathNode.CurveTo(204.743f, 196.30728f, 205.99979f, 194.24799f, 206.0f, 192.0f),
                    PathNode.LineTo(206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 32.268013f, 199.73198f, 26.0f, 192.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 212.34f),
                    PathNode.LineTo(115.48f, 179.12f),
                    PathNode.CurveTo(113.38843f, 177.61786f, 110.57157f, 177.61786f, 108.48f, 179.12f),
                    PathNode.LineTo(62.0f, 212.34f),
                    PathNode.LineTo(62.0f, 72.0f),
                    PathNode.CurveTo(62.0f, 70.89543f, 62.89543f, 70.0f, 64.0f, 70.0f),
                    PathNode.LineTo(160.0f, 70.0f),
                    PathNode.CurveTo(161.10457f, 70.0f, 162.0f, 70.89543f, 162.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 180.34f),
                    PathNode.LineTo(174.0f, 166.06f),
                    PathNode.LineTo(174.0f, 72.0f),
                    PathNode.CurveTo(174.0f, 64.26801f, 167.73198f, 58.0f, 160.0f, 58.0f),
                    PathNode.LineTo(94.0f, 58.0f),
                    PathNode.LineTo(94.0f, 40.0f),
                    PathNode.CurveTo(94.0f, 38.89543f, 94.89543f, 38.0f, 96.0f, 38.0f),
                    PathNode.LineTo(192.0f, 38.0f),
                    PathNode.CurveTo(193.10457f, 38.0f, 194.0f, 38.89543f, 194.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
