package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorFillIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 32.0f),
                    PathNode.CurveTo(232.0f, 27.581722f, 228.41827f, 24.0f, 224.0f, 24.0f),
                    PathNode.CurveTo(179.92f, 24.0f, 134.69f, 73.71f, 109.57f, 106.63f),
                    PathNode.CurveTo(91.37714f, 101.05828f, 71.61985f, 104.445854f, 56.3222f, 115.75984f),
                    PathNode.CurveTo(41.02455f, 127.07383f, 31.999937f, 144.97307f, 32.0f, 164.0f),
                    PathNode.CurveTo(32.0f, 194.88f, 12.46f, 208.73f, 11.53f, 209.37f),
                    PathNode.CurveTo(8.616696f, 211.33722f, 7.328918f, 214.97574f, 8.356095f, 218.33762f),
                    PathNode.CurveTo(9.383271f, 221.6995f, 12.484705f, 223.99695f, 16.0f, 224.0f),
                    PathNode.LineTo(92.0f, 224.0f),
                    PathNode.CurveTo(111.02694f, 224.00006f, 128.92616f, 214.97545f, 140.24016f, 199.6778f),
                    PathNode.CurveTo(151.55415f, 184.38016f, 154.94173f, 164.62286f, 149.37f, 146.43f),
                    PathNode.CurveTo(182.3f, 121.31f, 232.0f, 76.08f, 232.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.42f, 113.55f),
                    PathNode.QuadTo(129.56f, 106.89f, 134.51f, 101.0f),
                    PathNode.CurveTo(142.58727f, 106.45709f, 149.54291f, 113.41274f, 155.0f, 121.49f),
                    PathNode.QuadTo(149.1f, 126.43f, 142.45f, 131.58f),
                    PathNode.CurveTo(137.78815f, 124.358154f, 131.64185f, 118.211845f, 124.42f, 113.55f),
                    PathNode.Close,
                    PathNode.MoveTo(167.12f, 110.87f),
                    PathNode.CurveTo(161.08037f, 102.348f, 153.642f, 94.90962f, 145.12f, 88.87f),
                    PathNode.CurveTo(176.9f, 54.34f, 200.87f, 43.87f, 215.02f, 40.96f),
                    PathNode.CurveTo(212.17f, 55.12f, 201.65f, 79.09f, 167.12f, 110.87f),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
