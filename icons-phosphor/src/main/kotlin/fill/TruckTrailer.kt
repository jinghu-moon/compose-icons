package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) return _truckTrailer!!
        _truckTrailer = phosphorFillIcon(
            name = "TruckTrailer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 96.8f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(223.96693f, 65.08576f, 198.91423f, 40.03307f, 168.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(151.16344f, 40.0f, 144.0f, 47.163445f, 144.0f, 56.0f),
                    PathNode.LineTo(144.0f, 176.0f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.LineTo(128.0f, 72.0f),
                    PathNode.CurveTo(128.0f, 67.58172f, 124.41828f, 64.0f, 120.0f, 64.0f),
                    PathNode.LineTo(16.0f, 64.0f),
                    PathNode.CurveTo(7.163444f, 64.0f, 0f, 71.163445f, 0f, 80.0f),
                    PathNode.LineTo(0f, 184.0f),
                    PathNode.CurveTo(0.01496f, 197.30205f, 8.257542f, 209.20766f, 20.70312f, 213.90364f),
                    PathNode.CurveTo(33.148697f, 218.59961f, 47.201527f, 215.10657f, 56.0f, 205.13f),
                    PathNode.CurveTo(63.827545f, 214.02226f, 75.92731f, 217.86247f, 87.45014f, 215.11168f),
                    PathNode.CurveTo(98.97298f, 212.36086f, 108.03327f, 203.46915f, 111.0f, 192.0f),
                    PathNode.LineTo(193.0f, 192.0f),
                    PathNode.CurveTo(197.00287f, 207.63423f, 212.02121f, 217.84106f, 228.03119f, 215.80807f),
                    PathNode.CurveTo(244.04115f, 213.77505f, 256.03177f, 200.13852f, 256.0f, 184.0f),
                    PathNode.LineTo(256.0f, 136.0f),
                    PathNode.CurveTo(255.97679f, 116.99892f, 242.61176f, 100.62676f, 224.0f, 96.8f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 200.0f),
                    PathNode.CurveTo(23.163445f, 200.0f, 16.0f, 192.83656f, 16.0f, 184.0f),
                    PathNode.CurveTo(16.0f, 175.16344f, 23.163445f, 168.0f, 32.0f, 168.0f),
                    PathNode.CurveTo(40.836555f, 168.0f, 48.0f, 175.16344f, 48.0f, 184.0f),
                    PathNode.CurveTo(48.0f, 192.83656f, 40.836555f, 200.0f, 32.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 200.0f),
                    PathNode.CurveTo(71.163445f, 200.0f, 64.0f, 192.83656f, 64.0f, 184.0f),
                    PathNode.CurveTo(64.0f, 175.16344f, 71.163445f, 168.0f, 80.0f, 168.0f),
                    PathNode.CurveTo(88.836555f, 168.0f, 96.0f, 175.16344f, 96.0f, 184.0f),
                    PathNode.CurveTo(96.0f, 192.83656f, 88.836555f, 200.0f, 80.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.CurveTo(215.16344f, 200.0f, 208.0f, 192.83656f, 208.0f, 184.0f),
                    PathNode.CurveTo(208.0f, 175.16344f, 215.16344f, 168.0f, 224.0f, 168.0f),
                    PathNode.CurveTo(232.83656f, 168.0f, 240.0f, 175.16344f, 240.0f, 184.0f),
                    PathNode.CurveTo(240.0f, 192.83656f, 232.83656f, 200.0f, 224.0f, 200.0f),
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
        return _truckTrailer!!
    }

private var _truckTrailer: ImageVector? = null
