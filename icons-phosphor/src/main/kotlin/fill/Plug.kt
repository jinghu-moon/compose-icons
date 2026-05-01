package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorFillIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 77.66f),
                    PathNode.LineTo(203.31f, 112.0f),
                    PathNode.LineTo(229.66f, 138.34f),
                    PathNode.CurveTo(232.78593f, 141.46593f, 232.78593f, 146.53407f, 229.66f, 149.66f),
                    PathNode.CurveTo(226.53407f, 152.78593f, 221.46593f, 152.78593f, 218.34f, 149.66f),
                    PathNode.LineTo(212.0f, 143.31f),
                    PathNode.LineTo(159.0f, 196.31f),
                    PathNode.CurveTo(151.49849f, 203.8119f, 141.32402f, 208.02646f, 130.715f, 208.02646f),
                    PathNode.CurveTo(120.10597f, 208.02646f, 109.93151f, 203.8119f, 102.43f, 196.31f),
                    PathNode.LineTo(86.75f, 180.57f),
                    PathNode.LineTo(37.66f, 229.66f),
                    PathNode.CurveTo(34.53407f, 232.78593f, 29.46593f, 232.78593f, 26.34f, 229.66f),
                    PathNode.CurveTo(23.21407f, 226.53407f, 23.214067f, 221.46593f, 26.34f, 218.34f),
                    PathNode.LineTo(75.43f, 169.25f),
                    PathNode.LineTo(59.72f, 153.54f),
                    PathNode.CurveTo(52.218098f, 146.03848f, 48.003544f, 135.86401f, 48.003544f, 125.255f),
                    PathNode.CurveTo(48.003544f, 114.64598f, 52.218098f, 104.47151f, 59.72f, 96.97f),
                    PathNode.LineTo(112.72f, 43.97f),
                    PathNode.LineTo(106.37f, 37.63f),
                    PathNode.CurveTo(103.24407f, 34.504066f, 103.24407f, 29.435932f, 106.37f, 26.31f),
                    PathNode.CurveTo(109.49593f, 23.184069f, 114.56407f, 23.184069f, 117.69f, 26.31f),
                    PathNode.LineTo(144.0f, 52.69f),
                    PathNode.LineTo(178.34f, 18.34f),
                    PathNode.CurveTo(181.46593f, 15.214068f, 186.53407f, 15.214068f, 189.66f, 18.34f),
                    PathNode.CurveTo(192.78593f, 21.46593f, 192.78593f, 26.53407f, 189.66f, 29.66f),
                    PathNode.LineTo(155.31f, 64.0f),
                    PathNode.LineTo(192.0f, 100.69f),
                    PathNode.LineTo(226.34f, 66.34f),
                    PathNode.CurveTo(229.46593f, 63.21407f, 234.53407f, 63.21407f, 237.66f, 66.34f),
                    PathNode.CurveTo(240.78593f, 69.465935f, 240.78593f, 74.534065f, 237.66f, 77.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _plug!!
    }

private var _plug: ImageVector? = null
