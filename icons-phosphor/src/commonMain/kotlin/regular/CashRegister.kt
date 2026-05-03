package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CashRegister: ImageVector
    get() {
        if (_cashRegister != null) return _cashRegister!!
        _cashRegister = phosphorRegularIcon(
            name = "CashRegister",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.76f, 158.06f),
                    PathNode.LineTo(217.28f, 68.12f),
                    PathNode.CurveTo(215.49886f, 60.99431f, 209.09492f, 55.99652f, 201.75f, 56.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 31.163445f, 128.83656f, 24.0f, 120.0f, 24.0f),
                    PathNode.LineTo(80.0f, 24.0f),
                    PathNode.CurveTo(71.163445f, 24.0f, 64.0f, 31.163445f, 64.0f, 40.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.LineTo(54.25f, 56.0f),
                    PathNode.CurveTo(46.905075f, 55.99652f, 40.501144f, 60.99431f, 38.72f, 68.12f),
                    PathNode.LineTo(16.24f, 158.06f),
                    PathNode.CurveTo(16.080297f, 158.69429f, 15.999685f, 159.34592f, 16.0f, 160.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 160.0f),
                    PathNode.CurveTo(240.00032f, 159.34592f, 239.91971f, 158.69429f, 239.76f, 158.06f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 40.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.25f, 72.0f),
                    PathNode.LineTo(201.75f, 72.0f),
                    PathNode.LineTo(221.75f, 152.0f),
                    PathNode.LineTo(34.25f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 96.0f),
                    PathNode.CurveTo(64.0f, 91.58172f, 67.58172f, 88.0f, 72.0f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(92.41828f, 88.0f, 96.0f, 91.58172f, 96.0f, 96.0f),
                    PathNode.CurveTo(96.0f, 100.41828f, 92.41828f, 104.0f, 88.0f, 104.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.CurveTo(67.58172f, 104.0f, 64.0f, 100.41828f, 64.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 96.0f),
                    PathNode.CurveTo(112.0f, 91.58172f, 115.58172f, 88.0f, 120.0f, 88.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(140.41827f, 88.0f, 144.0f, 91.58172f, 144.0f, 96.0f),
                    PathNode.CurveTo(144.0f, 100.41828f, 140.41827f, 104.0f, 136.0f, 104.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(115.58172f, 104.0f, 112.0f, 100.41828f, 112.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 96.0f),
                    PathNode.CurveTo(160.0f, 91.58172f, 163.58173f, 88.0f, 168.0f, 88.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.CurveTo(188.41827f, 88.0f, 192.0f, 91.58172f, 192.0f, 96.0f),
                    PathNode.CurveTo(192.0f, 100.41828f, 188.41827f, 104.0f, 184.0f, 104.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(163.58173f, 104.0f, 160.0f, 100.41828f, 160.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 123.58172f, 67.58172f, 120.0f, 72.0f, 120.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.CurveTo(92.41828f, 120.0f, 96.0f, 123.58172f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 132.41827f, 92.41828f, 136.0f, 88.0f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(67.58172f, 136.0f, 64.0f, 132.41827f, 64.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 123.58172f, 115.58172f, 120.0f, 120.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.CurveTo(140.41827f, 120.0f, 144.0f, 123.58172f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 132.41827f, 140.41827f, 136.0f, 136.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.CurveTo(115.58172f, 136.0f, 112.0f, 132.41827f, 112.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 123.58172f, 163.58173f, 120.0f, 168.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(188.41827f, 120.0f, 192.0f, 123.58172f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 132.41827f, 188.41827f, 136.0f, 184.0f, 136.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.CurveTo(163.58173f, 136.0f, 160.0f, 132.41827f, 160.0f, 128.0f),
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
        return _cashRegister!!
    }

private var _cashRegister: ImageVector? = null
