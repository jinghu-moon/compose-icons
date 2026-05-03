package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorFillIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 32.0f),
                    PathNode.CurveTo(183.22066f, 31.997944f, 182.4454f, 32.112545f, 181.7f, 32.34f),
                    PathNode.LineTo(21.7f, 80.34f),
                    PathNode.LineTo(21.7f, 80.34f),
                    PathNode.CurveTo(18.317535f, 81.35532f, 16.000992f, 84.46844f, 16.0f, 88.0f),
                    PathNode.LineTo(16.0f, 104.0f),
                    PathNode.CurveTo(16.0f, 108.41828f, 19.581722f, 112.0f, 24.0f, 112.0f),
                    PathNode.LineTo(31.46f, 112.0f),
                    PathNode.CurveTo(44.91f, 112.0f, 56.25f, 123.0f, 56.0f, 136.46f),
                    PathNode.CurveTo(55.74935f, 149.53485f, 45.07725f, 160.0024f, 32.0f, 160.0f),
                    PathNode.LineTo(24.0f, 160.0f),
                    PathNode.CurveTo(19.581722f, 160.0f, 16.0f, 163.58173f, 16.0f, 168.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 196.41827f, 19.581722f, 200.0f, 24.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(232.83656f, 200.0f, 240.0f, 192.83656f, 240.0f, 184.0f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(239.96693f, 57.085766f, 214.91423f, 32.03307f, 184.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 184.0f),
                    PathNode.CurveTo(80.0f, 166.32689f, 94.32689f, 152.0f, 112.0f, 152.0f),
                    PathNode.CurveTo(129.67311f, 152.0f, 144.0f, 166.32689f, 144.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 136.0f),
                    PathNode.CurveTo(158.09998f, 136.00499f, 148.75507f, 131.42744f, 142.69058f, 123.602295f),
                    PathNode.CurveTo(136.6261f, 115.77715f, 134.525f, 105.58567f, 137.0f, 96.0f),
                    PathNode.LineTo(199.0f, 96.0f),
                    PathNode.CurveTo(201.475f, 105.58567f, 199.3739f, 115.77715f, 193.30942f, 123.602295f),
                    PathNode.CurveTo(187.24493f, 131.42744f, 177.90002f, 136.00499f, 168.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.51f, 80.0f),
                    PathNode.LineTo(185.12f, 48.0f),
                    PathNode.CurveTo(203.69638f, 48.544785f, 219.45885f, 61.794037f, 223.19f, 80.0f),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
