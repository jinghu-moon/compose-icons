package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ambulance: ImageVector
    get() {
        if (_ambulance != null) return _ambulance!!
        _ambulance = phosphorFillIcon(
            name = "Ambulance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(255.43f, 117.0f),
                    PathNode.LineTo(241.43f, 82.0f),
                    PathNode.CurveTo(238.99844f, 75.937294f, 233.11209f, 71.97342f, 226.58f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.CurveTo(192.0f, 59.581722f, 188.41827f, 56.0f, 184.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(23.163445f, 56.0f, 16.0f, 63.163445f, 16.0f, 72.0f),
                    PathNode.LineTo(16.0f, 184.0f),
                    PathNode.CurveTo(16.0f, 192.83656f, 23.163445f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(49.0f, 200.0f),
                    PathNode.CurveTo(52.62536f, 214.15932f, 65.38393f, 224.06276f, 80.0f, 224.06276f),
                    PathNode.CurveTo(94.61607f, 224.06276f, 107.37464f, 214.15932f, 111.0f, 200.0f),
                    PathNode.LineTo(161.0f, 200.0f),
                    PathNode.CurveTo(164.62535f, 214.15932f, 177.38393f, 224.06276f, 192.0f, 224.06276f),
                    PathNode.CurveTo(206.61607f, 224.06276f, 219.37465f, 214.15932f, 223.0f, 200.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(248.83656f, 200.0f, 256.0f, 192.83656f, 256.0f, 184.0f),
                    PathNode.LineTo(256.0f, 120.0f),
                    PathNode.CurveTo(256.0064f, 118.972496f, 255.8128f, 117.95356f, 255.43f, 117.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 208.0f),
                    PathNode.CurveTo(71.163445f, 208.0f, 64.0f, 200.83656f, 64.0f, 192.0f),
                    PathNode.CurveTo(64.0f, 183.16344f, 71.163445f, 176.0f, 80.0f, 176.0f),
                    PathNode.CurveTo(88.836555f, 176.0f, 96.0f, 183.16344f, 96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 200.83656f, 88.836555f, 208.0f, 80.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 148.41827f, 116.41828f, 152.0f, 112.0f, 152.0f),
                    PathNode.CurveTo(107.58172f, 152.0f, 104.0f, 148.41827f, 104.0f, 144.0f),
                    PathNode.LineTo(104.0f, 128.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.CurveTo(83.58172f, 128.0f, 80.0f, 124.41828f, 80.0f, 120.0f),
                    PathNode.CurveTo(80.0f, 115.58172f, 83.58172f, 112.0f, 88.0f, 112.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.CurveTo(104.0f, 91.58172f, 107.58172f, 88.0f, 112.0f, 88.0f),
                    PathNode.CurveTo(116.41828f, 88.0f, 120.0f, 91.58172f, 120.0f, 96.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.CurveTo(140.41827f, 112.0f, 144.0f, 115.58172f, 144.0f, 120.0f),
                    PathNode.CurveTo(144.0f, 124.41828f, 140.41827f, 128.0f, 136.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 208.0f),
                    PathNode.CurveTo(183.16344f, 208.0f, 176.0f, 200.83656f, 176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 183.16344f, 183.16344f, 176.0f, 192.0f, 176.0f),
                    PathNode.CurveTo(200.83656f, 176.0f, 208.0f, 183.16344f, 208.0f, 192.0f),
                    PathNode.CurveTo(208.0f, 200.83656f, 200.83656f, 208.0f, 192.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 112.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.LineTo(226.58f, 88.0f),
                    PathNode.LineTo(236.18f, 112.0f),
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
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
