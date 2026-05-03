package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorFillIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 32.0f),
                    PathNode.LineTo(248.0f, 32.0f),
                    PathNode.CurveTo(243.58173f, 32.0f, 240.0f, 35.581722f, 240.0f, 40.0f),
                    PathNode.CurveTo(239.8027f, 45.95693f, 238.59555f, 51.837135f, 236.43f, 57.39f),
                    PathNode.CurveTo(232.38f, 67.22f, 225.7f, 72.0f, 216.0f, 72.0f),
                    PathNode.CurveTo(204.94f, 72.0f, 197.15f, 62.24f, 186.51f, 47.35f),
                    PathNode.CurveTo(176.0f, 32.66f, 164.12f, 16.0f, 144.0f, 16.0f),
                    PathNode.CurveTo(127.61f, 16.0f, 115.0f, 24.89f, 108.57f, 41.0f),
                    PathNode.CurveTo(106.68601f, 45.829678f, 105.377014f, 50.86431f, 104.67f, 56.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(79.163445f, 56.0f, 72.0f, 63.163445f, 72.0f, 72.0f),
                    PathNode.LineTo(72.0f, 81.59f),
                    PathNode.CurveTo(35.737247f, 100.06515f, 16.87381f, 140.99599f, 26.385447f, 180.56679f),
                    PathNode.CurveTo(35.897083f, 220.13757f, 71.30212f, 248.0239f, 112.0f, 248.0f),
                    PathNode.LineTo(113.59f, 248.0f),
                    PathNode.CurveTo(153.99535f, 247.30528f, 188.73413f, 219.18044f, 197.82272f, 179.8044f),
                    PathNode.CurveTo(206.91133f, 140.42838f, 188.01338f, 99.92335f, 152.0f, 81.59f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(152.0f, 63.163445f, 144.83656f, 56.0f, 136.0f, 56.0f),
                    PathNode.LineTo(120.88f, 56.0f),
                    PathNode.CurveTo(121.447754f, 52.791473f, 122.34932f, 49.651077f, 123.57f, 46.63f),
                    PathNode.CurveTo(127.62f, 36.78f, 134.3f, 32.0f, 144.0f, 32.0f),
                    PathNode.CurveTo(155.06f, 32.0f, 162.85f, 41.76f, 173.49f, 56.65f),
                    PathNode.CurveTo(184.0f, 71.34f, 195.88f, 88.0f, 216.0f, 88.0f),
                    PathNode.CurveTo(232.39f, 88.0f, 245.0f, 79.11f, 251.43f, 63.0f),
                    PathNode.CurveTo(254.26036f, 55.651947f, 255.80624f, 47.871937f, 256.0f, 40.0f),
                    PathNode.CurveTo(256.0f, 35.581722f, 252.41827f, 32.0f, 248.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(111.89f, 209.32f),
                    PathNode.CurveTo(111.245056f, 213.17517f, 107.90874f, 215.99985f, 104.0f, 216.0f),
                    PathNode.CurveTo(103.554474f, 215.99817f, 103.10977f, 215.96138f, 102.67f, 215.89f),
                    PathNode.CurveTo(78.91349f, 211.67473f, 60.315266f, 193.0765f, 56.1f, 169.32f),
                    PathNode.CurveTo(55.5992f, 166.48814f, 56.65689f, 163.6054f, 58.87034f, 161.76941f),
                    PathNode.CurveTo(61.08379f, 159.93341f, 64.11236f, 159.42673f, 66.80287f, 160.44229f),
                    PathNode.CurveTo(69.493385f, 161.45784f, 71.431786f, 163.83934f, 71.88f, 166.68f),
                    PathNode.CurveTo(74.909706f, 183.73149f, 88.258514f, 197.08029f, 105.31f, 200.11f),
                    PathNode.CurveTo(107.40435f, 200.45782f, 109.27456f, 201.62387f, 110.50872f, 203.35133f),
                    PathNode.CurveTo(111.74289f, 205.0788f, 112.2398f, 207.22598f, 111.89f, 209.32f),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
