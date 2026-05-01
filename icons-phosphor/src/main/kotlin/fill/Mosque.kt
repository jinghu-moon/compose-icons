package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorFillIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(221.27405f, 127.999245f, 218.56816f, 128.466f, 216.0f, 129.38f),
                    PathNode.LineTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 86.22f, 184.93f, 65.54f, 162.24f, 50.44f),
                    PathNode.CurveTo(148.16f, 41.06f, 136.0f, 33.0f, 136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 33.0f, 107.84f, 41.06f, 93.76f, 50.44f),
                    PathNode.CurveTo(71.07f, 65.54f, 40.0f, 86.22f, 40.0f, 128.0f),
                    PathNode.LineTo(40.0f, 129.38f),
                    PathNode.CurveTo(32.655586f, 126.783356f, 24.507763f, 127.91283f, 18.146622f, 132.40936f),
                    PathNode.CurveTo(11.785478f, 136.90588f, 8.002407f, 144.21007f, 8.0f, 152.0f),
                    PathNode.LineTo(8.0f, 208.0f),
                    PathNode.CurveTo(8.0f, 212.41827f, 11.581722f, 216.0f, 16.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(76.41828f, 216.0f, 80.0f, 212.41827f, 80.0f, 208.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.CurveTo(80.0f, 167.16344f, 87.163445f, 160.0f, 96.0f, 160.0f),
                    PathNode.CurveTo(104.836555f, 160.0f, 112.0f, 167.16344f, 112.0f, 176.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(112.0f, 212.41827f, 115.58172f, 216.0f, 120.0f, 216.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(140.41827f, 216.0f, 144.0f, 212.41827f, 144.0f, 208.0f),
                    PathNode.LineTo(144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 167.16344f, 151.16344f, 160.0f, 160.0f, 160.0f),
                    PathNode.CurveTo(168.83656f, 160.0f, 176.0f, 167.16344f, 176.0f, 176.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 212.41827f, 179.58173f, 216.0f, 184.0f, 216.0f),
                    PathNode.LineTo(240.0f, 216.0f),
                    PathNode.CurveTo(244.41827f, 216.0f, 248.0f, 212.41827f, 248.0f, 208.0f),
                    PathNode.LineTo(248.0f, 152.0f),
                    PathNode.CurveTo(248.0f, 138.74516f, 237.25484f, 128.0f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 200.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 147.58173f, 27.581722f, 144.0f, 32.0f, 144.0f),
                    PathNode.CurveTo(36.418278f, 144.0f, 40.0f, 147.58173f, 40.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 147.58173f, 219.58173f, 144.0f, 224.0f, 144.0f),
                    PathNode.CurveTo(228.41827f, 144.0f, 232.0f, 147.58173f, 232.0f, 152.0f),
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
        return _mosque!!
    }

private var _mosque: ImageVector? = null
