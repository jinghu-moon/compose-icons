package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ambulance: ImageVector
    get() {
        if (_ambulance != null) return _ambulance!!
        _ambulance = phosphorDuotoneIcon(
            name = "Ambulance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 120.0f),
                    PathNode.LineTo(248.0f, 184.0f),
                    PathNode.CurveTo(248.0f, 188.41827f, 244.41827f, 192.0f, 240.0f, 192.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.00084f, 184.20831f, 212.2191f, 176.90112f, 205.85747f, 172.40225f),
                    PathNode.CurveTo(199.49582f, 167.90337f, 191.34607f, 166.77277f, 184.0f, 169.37f),
                    PathNode.LineTo(184.0f, 169.37f),
                    PathNode.CurveTo(174.40999f, 172.76057f, 167.9989f, 181.82826f, 168.0f, 192.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.CurveTo(104.0f, 178.74516f, 93.25484f, 168.0f, 80.0f, 168.0f),
                    PathNode.CurveTo(66.74516f, 168.0f, 56.0f, 178.74516f, 56.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(27.581722f, 192.0f, 24.0f, 188.41827f, 24.0f, 184.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 67.58172f, 27.581722f, 64.0f, 32.0f, 64.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.LineTo(184.0f, 120.0f),
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
                    PathNode.MoveTo(80.0f, 120.0f),
                    PathNode.CurveTo(80.0f, 115.58172f, 83.58172f, 112.0f, 88.0f, 112.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.CurveTo(104.0f, 91.58172f, 107.58172f, 88.0f, 112.0f, 88.0f),
                    PathNode.CurveTo(116.41828f, 88.0f, 120.0f, 91.58172f, 120.0f, 96.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.CurveTo(140.41827f, 112.0f, 144.0f, 115.58172f, 144.0f, 120.0f),
                    PathNode.CurveTo(144.0f, 124.41828f, 140.41827f, 128.0f, 136.0f, 128.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 148.41827f, 116.41828f, 152.0f, 112.0f, 152.0f),
                    PathNode.CurveTo(107.58172f, 152.0f, 104.0f, 148.41827f, 104.0f, 144.0f),
                    PathNode.LineTo(104.0f, 128.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.CurveTo(83.58172f, 128.0f, 80.0f, 124.41828f, 80.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 120.0f),
                    PathNode.LineTo(256.0f, 184.0f),
                    PathNode.CurveTo(256.0f, 192.83656f, 248.83656f, 200.0f, 240.0f, 200.0f),
                    PathNode.LineTo(223.0f, 200.0f),
                    PathNode.CurveTo(219.37465f, 214.15932f, 206.61607f, 224.06276f, 192.0f, 224.06276f),
                    PathNode.CurveTo(177.38393f, 224.06276f, 164.62535f, 214.15932f, 161.0f, 200.0f),
                    PathNode.LineTo(111.0f, 200.0f),
                    PathNode.CurveTo(107.37464f, 214.15932f, 94.61607f, 224.06276f, 80.0f, 224.06276f),
                    PathNode.CurveTo(65.38393f, 224.06276f, 52.62536f, 214.15932f, 49.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(23.163445f, 200.0f, 16.0f, 192.83656f, 16.0f, 184.0f),
                    PathNode.LineTo(16.0f, 72.0f),
                    PathNode.CurveTo(16.0f, 63.163445f, 23.163445f, 56.0f, 32.0f, 56.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(188.41827f, 56.0f, 192.0f, 59.581722f, 192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.LineTo(226.58f, 72.0f),
                    PathNode.CurveTo(233.13058f, 71.979065f, 239.02621f, 75.970314f, 241.44f, 82.06f),
                    PathNode.LineTo(255.44f, 117.06f),
                    PathNode.CurveTo(255.81181f, 117.99551f, 256.00186f, 118.99332f, 256.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 88.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.LineTo(236.18f, 112.0f),
                    PathNode.LineTo(226.58f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 184.0f),
                    PathNode.LineTo(49.0f, 184.0f),
                    PathNode.CurveTo(52.62536f, 169.84068f, 65.38393f, 159.93724f, 80.0f, 159.93724f),
                    PathNode.CurveTo(94.61607f, 159.93724f, 107.37464f, 169.84068f, 111.0f, 184.0f),
                    PathNode.LineTo(161.0f, 184.0f),
                    PathNode.CurveTo(163.16766f, 175.69579f, 168.56952f, 168.60497f, 176.0f, 164.31f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 183.16344f, 88.836555f, 176.0f, 80.0f, 176.0f),
                    PathNode.CurveTo(71.163445f, 176.0f, 64.0f, 183.16344f, 64.0f, 192.0f),
                    PathNode.CurveTo(64.0f, 200.83656f, 71.163445f, 208.0f, 80.0f, 208.0f),
                    PathNode.CurveTo(88.836555f, 208.0f, 96.0f, 200.83656f, 96.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 192.0f),
                    PathNode.CurveTo(208.0f, 183.16344f, 200.83656f, 176.0f, 192.0f, 176.0f),
                    PathNode.CurveTo(183.16344f, 176.0f, 176.0f, 183.16344f, 176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 200.83656f, 183.16344f, 208.0f, 192.0f, 208.0f),
                    PathNode.CurveTo(200.83656f, 208.0f, 208.0f, 200.83656f, 208.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 184.0f),
                    PathNode.LineTo(240.0f, 128.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(206.59071f, 160.0138f, 219.33186f, 169.8779f, 223.0f, 184.0f),
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
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
