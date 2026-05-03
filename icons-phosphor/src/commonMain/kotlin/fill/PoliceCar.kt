package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PoliceCar: ImageVector
    get() {
        if (_policeCar != null) return _policeCar!!
        _policeCar = phosphorFillIcon(
            name = "PoliceCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 24.0f),
                    PathNode.CurveTo(96.0f, 19.581722f, 99.58172f, 16.0f, 104.0f, 16.0f),
                    PathNode.LineTo(152.0f, 16.0f),
                    PathNode.CurveTo(156.41827f, 16.0f, 160.0f, 19.581722f, 160.0f, 24.0f),
                    PathNode.CurveTo(160.0f, 28.418278f, 156.41827f, 32.0f, 152.0f, 32.0f),
                    PathNode.LineTo(104.0f, 32.0f),
                    PathNode.CurveTo(99.58172f, 32.0f, 96.0f, 28.418278f, 96.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 112.0f),
                    PathNode.CurveTo(248.0f, 116.41828f, 244.41827f, 120.0f, 240.0f, 120.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(183.16344f, 216.0f, 176.0f, 208.83656f, 176.0f, 200.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.CurveTo(80.0f, 208.83656f, 72.836555f, 216.0f, 64.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.CurveTo(11.581722f, 120.0f, 8.0f, 116.41828f, 8.0f, 112.0f),
                    PathNode.CurveTo(8.0f, 107.58172f, 11.581722f, 104.0f, 16.0f, 104.0f),
                    PathNode.LineTo(27.36f, 104.0f),
                    PathNode.LineTo(54.75f, 56.06f),
                    PathNode.CurveTo(57.598804f, 51.076073f, 62.89933f, 48.000313f, 68.64f, 48.0f),
                    PathNode.LineTo(187.36f, 48.0f),
                    PathNode.CurveTo(193.10066f, 48.000313f, 198.4012f, 51.076073f, 201.25f, 56.06f),
                    PathNode.LineTo(228.64f, 104.0f),
                    PathNode.LineTo(240.0f, 104.0f),
                    PathNode.CurveTo(244.41827f, 104.0f, 248.0f, 107.58172f, 248.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 139.58173f, 84.41828f, 136.0f, 80.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(51.581722f, 136.0f, 48.0f, 139.58173f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 148.41827f, 51.581722f, 152.0f, 56.0f, 152.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.CurveTo(84.41828f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 139.58173f, 204.41827f, 136.0f, 200.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(171.58173f, 136.0f, 168.0f, 139.58173f, 168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 148.41827f, 171.58173f, 152.0f, 176.0f, 152.0f),
                    PathNode.LineTo(200.0f, 152.0f),
                    PathNode.CurveTo(204.41827f, 152.0f, 208.0f, 148.41827f, 208.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.21f, 104.0f),
                    PathNode.LineTo(187.36f, 64.0f),
                    PathNode.LineTo(68.64f, 64.0f),
                    PathNode.LineTo(45.79f, 104.0f),
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
        return _policeCar!!
    }

private var _policeCar: ImageVector? = null
