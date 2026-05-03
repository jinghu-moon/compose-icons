package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorThinIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 108.0f),
                    PathNode.LineTo(211.9f, 108.0f),
                    PathNode.CurveTo(209.71468f, 63.254276f, 172.79906f, 28.09756f, 128.0f, 28.09756f),
                    PathNode.CurveTo(83.20094f, 28.09756f, 46.28532f, 63.254276f, 44.1f, 108.0f),
                    PathNode.LineTo(32.0f, 108.0f),
                    PathNode.CurveTo(29.790861f, 108.0f, 28.0f, 109.79086f, 28.0f, 112.0f),
                    PathNode.CurveTo(28.068148f, 150.15286f, 49.7722f, 184.96461f, 84.0f, 201.82f),
                    PathNode.LineTo(84.0f, 208.0f),
                    PathNode.CurveTo(84.0f, 214.62741f, 89.37258f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(166.62741f, 220.0f, 172.0f, 214.62741f, 172.0f, 208.0f),
                    PathNode.LineTo(172.0f, 201.82f),
                    PathNode.CurveTo(206.2278f, 184.96461f, 227.93185f, 150.15286f, 228.0f, 112.0f),
                    PathNode.CurveTo(228.0f, 109.79086f, 226.20914f, 108.0f, 224.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(203.89f, 108.0f),
                    PathNode.LineTo(141.05f, 108.0f),
                    PathNode.CurveTo(151.45538f, 88.62055f, 169.75435f, 74.70663f, 191.21f, 69.86f),
                    PathNode.CurveTo(198.80743f, 81.192986f, 203.18959f, 94.37403f, 203.89f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 62.93f),
                    PathNode.CurveTo(162.29884f, 69.342026f, 142.59464f, 85.81214f, 132.08f, 108.0f),
                    PathNode.LineTo(94.68f, 108.0f),
                    PathNode.CurveTo(103.76463f, 74.9818f, 133.75491f, 52.075974f, 168.0f, 52.0f),
                    PathNode.CurveTo(170.33f, 52.0f, 172.68f, 52.13f, 175.0f, 52.34f),
                    PathNode.CurveTo(179.00931f, 55.49588f, 182.69418f, 59.043407f, 186.0f, 62.93f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(139.92125f, 35.98961f, 151.67543f, 38.803074f, 162.3f, 44.21f),
                    PathNode.CurveTo(125.84723f, 46.767525f, 95.197945f, 72.53006f, 86.41f, 108.0f),
                    PathNode.LineTo(52.11f, 108.0f),
                    PathNode.CurveTo(54.281525f, 67.65906f, 87.600685f, 36.047787f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.33f, 195.66f),
                    PathNode.CurveTo(164.90828f, 196.31322f, 163.99792f, 197.7354f, 164.0f, 199.3f),
                    PathNode.LineTo(164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 210.20914f, 162.20914f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(93.79086f, 212.0f, 92.0f, 210.20914f, 92.0f, 208.0f),
                    PathNode.LineTo(92.0f, 199.3f),
                    PathNode.CurveTo(92.00207f, 197.7354f, 91.09172f, 196.31322f, 89.67f, 195.66f),
                    PathNode.CurveTo(58.323994f, 181.20926f, 37.65595f, 150.48105f, 36.09f, 116.0f),
                    PathNode.LineTo(219.91f, 116.0f),
                    PathNode.CurveTo(218.34406f, 150.48105f, 197.67601f, 181.20926f, 166.33f, 195.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
