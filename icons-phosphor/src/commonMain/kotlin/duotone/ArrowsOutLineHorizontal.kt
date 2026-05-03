package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorDuotoneIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 56.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 208.83656f, 232.83656f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(23.163445f, 216.0f, 16.0f, 208.83656f, 16.0f, 200.0f),
                    PathNode.LineTo(16.0f, 56.0f),
                    PathNode.CurveTo(16.0f, 47.163445f, 23.163445f, 40.0f, 32.0f, 40.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(232.83656f, 40.0f, 240.0f, 47.163445f, 240.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 220.41827f, 132.41827f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(123.58172f, 224.0f, 120.0f, 220.41827f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.CurveTo(120.0f, 35.581722f, 123.58172f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(132.41827f, 32.0f, 136.0f, 35.581722f, 136.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.LineTo(35.31f, 120.0f),
                    PathNode.LineTo(53.66f, 101.66f),
                    PathNode.CurveTo(56.78593f, 98.534065f, 56.78593f, 93.465935f, 53.66f, 90.34f),
                    PathNode.CurveTo(50.53407f, 87.214066f, 45.46593f, 87.214066f, 42.34f, 90.34f),
                    PathNode.LineTo(10.34f, 122.34f),
                    PathNode.CurveTo(8.837784f, 123.840546f, 7.993707f, 125.876724f, 7.993707f, 128.0f),
                    PathNode.CurveTo(7.993707f, 130.12328f, 8.837784f, 132.15945f, 10.34f, 133.66f),
                    PathNode.LineTo(42.34f, 165.66f),
                    PathNode.CurveTo(45.46593f, 168.78593f, 50.53407f, 168.78593f, 53.66f, 165.66f),
                    PathNode.CurveTo(56.78593f, 162.53407f, 56.78593f, 157.46593f, 53.66f, 154.34f),
                    PathNode.LineTo(35.31f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(100.41828f, 136.0f, 104.0f, 132.41827f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 123.58172f, 100.41828f, 120.0f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(245.66f, 122.34f),
                    PathNode.LineTo(213.66f, 90.34f),
                    PathNode.CurveTo(210.53407f, 87.214066f, 205.46593f, 87.214066f, 202.34f, 90.34f),
                    PathNode.CurveTo(199.21407f, 93.465935f, 199.21407f, 98.534065f, 202.34f, 101.66f),
                    PathNode.LineTo(220.69f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(155.58173f, 120.0f, 152.0f, 123.58172f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 132.41827f, 155.58173f, 136.0f, 160.0f, 136.0f),
                    PathNode.LineTo(220.69f, 136.0f),
                    PathNode.LineTo(202.34f, 154.34f),
                    PathNode.CurveTo(199.21407f, 157.46593f, 199.21407f, 162.53407f, 202.34f, 165.66f),
                    PathNode.CurveTo(205.46593f, 168.78593f, 210.53407f, 168.78593f, 213.66f, 165.66f),
                    PathNode.LineTo(245.66f, 133.66f),
                    PathNode.CurveTo(247.16223f, 132.15945f, 248.00629f, 130.12328f, 248.00629f, 128.0f),
                    PathNode.CurveTo(248.00629f, 125.876724f, 247.16223f, 123.840546f, 245.66f, 122.34f),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
