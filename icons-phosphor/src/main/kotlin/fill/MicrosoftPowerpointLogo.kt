package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) return _microsoftPowerpointLogo!!
        _microsoftPowerpointLogo = phosphorFillIcon(
            name = "MicrosoftPowerpointLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 24.0f),
                    PathNode.CurveTo(103.97631f, 24.04191f, 73.745834f, 38.788486f, 54.0f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(31.163445f, 64.0f, 24.0f, 71.163445f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 184.83656f, 31.163445f, 192.0f, 40.0f, 192.0f),
                    PathNode.LineTo(54.0f, 192.0f),
                    PathNode.CurveTo(83.93999f, 230.3492f, 136.4659f, 242.81647f, 180.44614f, 222.0126f),
                    PathNode.CurveTo(224.4264f, 201.20874f, 248.10619f, 152.69408f, 237.45071f, 105.22277f),
                    PathNode.CurveTo(226.79524f, 57.75147f, 184.65248f, 24.011414f, 136.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.CurveTo(72.0f, 99.58172f, 75.58172f, 96.0f, 80.0f, 96.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.CurveTo(109.25484f, 96.0f, 120.0f, 106.74516f, 120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 133.25484f, 109.25484f, 144.0f, 96.0f, 144.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.CurveTo(88.0f, 156.41827f, 84.41828f, 160.0f, 80.0f, 160.0f),
                    PathNode.CurveTo(75.58172f, 160.0f, 72.0f, 156.41827f, 72.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 215.63f),
                    PathNode.CurveTo(108.39842f, 213.80716f, 89.966934f, 205.49063f, 75.63f, 192.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.LineTo(75.63f, 64.0f),
                    PathNode.CurveTo(89.966934f, 50.509377f, 108.39842f, 42.192856f, 128.0f, 40.37f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 40.37f),
                    PathNode.CurveTo(186.25223f, 44.281887f, 219.71811f, 77.74777f, 223.63f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 71.163445f, 152.83656f, 64.0f, 144.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 215.63f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(152.83656f, 192.0f, 160.0f, 184.83656f, 160.0f, 176.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(223.63f, 136.0f),
                    PathNode.CurveTo(219.71811f, 178.25223f, 186.25223f, 211.71811f, 144.0f, 215.63f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 128.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(100.41828f, 112.0f, 104.0f, 115.58172f, 104.0f, 120.0f),
                    PathNode.CurveTo(104.0f, 124.41828f, 100.41828f, 128.0f, 96.0f, 128.0f),
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
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
