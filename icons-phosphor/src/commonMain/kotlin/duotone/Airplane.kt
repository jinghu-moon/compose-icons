package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorDuotoneIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 152.0f),
                    PathNode.LineTo(152.0f, 184.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.LineTo(168.0f, 232.0f),
                    PathNode.LineTo(128.0f, 216.0f),
                    PathNode.LineTo(88.0f, 232.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 34.745167f, 114.74516f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(141.25484f, 24.0f, 152.0f, 34.745167f, 152.0f, 48.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.LineTo(232.0f, 168.0f),
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
                    PathNode.MoveTo(235.58f, 128.84f),
                    PathNode.LineTo(160.0f, 91.06f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 30.326887f, 145.67311f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(110.32689f, 16.0f, 96.0f, 30.326887f, 96.0f, 48.0f),
                    PathNode.LineTo(96.0f, 91.06f),
                    PathNode.LineTo(20.42f, 128.84f),
                    PathNode.CurveTo(17.70914f, 130.19652f, 15.997829f, 132.96869f, 16.0f, 136.0f),
                    PathNode.LineTo(16.0f, 168.0f),
                    PathNode.CurveTo(16.001328f, 170.39616f, 17.076647f, 172.66556f, 18.930223f, 174.18405f),
                    PathNode.CurveTo(20.7838f, 175.70256f, 23.220436f, 176.31024f, 25.57f, 175.84f),
                    PathNode.LineTo(96.0f, 161.76f),
                    PathNode.LineTo(96.0f, 180.69f),
                    PathNode.LineTo(82.34f, 194.34f),
                    PathNode.CurveTo(80.84009f, 195.84158f, 79.99833f, 197.87762f, 80.0f, 200.0f),
                    PathNode.LineTo(80.0f, 232.0f),
                    PathNode.CurveTo(79.99541f, 234.66254f, 81.31575f, 237.1529f, 83.52213f, 238.6432f),
                    PathNode.CurveTo(85.728516f, 240.13351f, 88.53175f, 240.42845f, 91.0f, 239.43f),
                    PathNode.LineTo(128.0f, 224.62f),
                    PathNode.LineTo(165.0f, 239.43f),
                    PathNode.CurveTo(167.46825f, 240.42845f, 170.27148f, 240.13351f, 172.47786f, 238.6432f),
                    PathNode.CurveTo(174.68425f, 237.1529f, 176.0046f, 234.66254f, 176.0f, 232.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(176.00166f, 197.87762f, 175.15993f, 195.84158f, 173.66f, 194.34f),
                    PathNode.LineTo(160.0f, 180.69f),
                    PathNode.LineTo(160.0f, 161.76f),
                    PathNode.LineTo(230.43f, 175.84f),
                    PathNode.CurveTo(232.77957f, 176.31024f, 235.2162f, 175.70256f, 237.06978f, 174.18405f),
                    PathNode.CurveTo(238.92336f, 172.66556f, 239.99867f, 170.39616f, 240.0f, 168.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.CurveTo(240.00217f, 132.96869f, 238.29086f, 130.19652f, 235.58f, 128.84f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 158.24f),
                    PathNode.LineTo(153.57f, 144.16f),
                    PathNode.CurveTo(151.22043f, 143.68976f, 148.7838f, 144.29744f, 146.93022f, 145.81595f),
                    PathNode.CurveTo(145.07664f, 147.33444f, 144.00133f, 149.60384f, 144.0f, 152.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.CurveTo(143.99834f, 186.12238f, 144.84007f, 188.15842f, 146.34f, 189.66f),
                    PathNode.LineTo(160.0f, 203.31f),
                    PathNode.LineTo(160.0f, 220.18f),
                    PathNode.LineTo(131.0f, 208.57f),
                    PathNode.CurveTo(129.09337f, 207.80768f, 126.96663f, 207.80768f, 125.06f, 208.57f),
                    PathNode.LineTo(96.0f, 220.18f),
                    PathNode.LineTo(96.0f, 203.31f),
                    PathNode.LineTo(109.66f, 189.66f),
                    PathNode.CurveTo(111.15991f, 188.15842f, 112.00167f, 186.12238f, 112.0f, 184.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.CurveTo(111.99867f, 149.60384f, 110.923355f, 147.33444f, 109.06978f, 145.81595f),
                    PathNode.CurveTo(107.2162f, 144.29744f, 104.77956f, 143.68976f, 102.43f, 144.16f),
                    PathNode.LineTo(32.0f, 158.24f),
                    PathNode.LineTo(32.0f, 140.94f),
                    PathNode.LineTo(107.58f, 103.16f),
                    PathNode.CurveTo(110.290855f, 101.80349f, 112.00217f, 99.03132f, 112.0f, 96.0f),
                    PathNode.LineTo(112.0f, 48.0f),
                    PathNode.CurveTo(112.0f, 39.163445f, 119.163445f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(136.83656f, 32.0f, 144.0f, 39.163445f, 144.0f, 48.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.CurveTo(143.99783f, 99.03132f, 145.70914f, 101.80349f, 148.42f, 103.16f),
                    PathNode.LineTo(224.0f, 140.94f),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
