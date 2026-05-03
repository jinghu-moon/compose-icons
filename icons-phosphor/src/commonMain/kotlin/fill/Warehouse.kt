package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorFillIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.LineTo(232.0f, 57.9f),
                    PathNode.LineTo(241.67f, 55.82f),
                    PathNode.CurveTo(244.52716f, 55.284145f, 246.8688f, 53.24058f, 247.78636f, 50.482204f),
                    PathNode.CurveTo(248.70393f, 47.723827f, 248.05298f, 44.684795f, 246.0861f, 42.54425f),
                    PathNode.CurveTo(244.11922f, 40.4037f, 241.14598f, 39.498554f, 238.32f, 40.18f),
                    PathNode.LineTo(14.32f, 88.18f),
                    PathNode.CurveTo(10.323591f, 89.04238f, 7.62046f, 92.779274f, 8.052199f, 96.84481f),
                    PathNode.CurveTo(8.483936f, 100.91035f, 11.911606f, 103.996185f, 16.0f, 104.0f),
                    PathNode.CurveTo(16.568064f, 103.998985f, 17.134468f, 103.93866f, 17.69f, 103.82f),
                    PathNode.LineTo(24.0f, 102.47f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.LineTo(16.0f, 184.0f),
                    PathNode.CurveTo(11.581722f, 184.0f, 8.0f, 187.58173f, 8.0f, 192.0f),
                    PathNode.CurveTo(8.0f, 196.41827f, 11.581722f, 200.0f, 16.0f, 200.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(244.41827f, 200.0f, 248.0f, 196.41827f, 248.0f, 192.0f),
                    PathNode.CurveTo(248.0f, 187.58173f, 244.41827f, 184.0f, 240.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 152.0f),
                    PathNode.LineTo(72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
