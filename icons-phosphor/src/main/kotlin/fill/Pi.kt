package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorFillIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 168.0f),
                    PathNode.CurveTo(178.62741f, 168.0f, 184.0f, 162.62741f, 184.0f, 156.0f),
                    PathNode.CurveTo(184.0f, 151.58173f, 187.58173f, 148.0f, 192.0f, 148.0f),
                    PathNode.CurveTo(196.41827f, 148.0f, 200.0f, 151.58173f, 200.0f, 156.0f),
                    PathNode.CurveTo(200.0f, 171.46397f, 187.46397f, 184.0f, 172.0f, 184.0f),
                    PathNode.CurveTo(156.53603f, 184.0f, 144.0f, 171.46397f, 144.0f, 156.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.LineTo(112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 180.41827f, 108.41828f, 184.0f, 104.0f, 184.0f),
                    PathNode.CurveTo(99.58172f, 184.0f, 96.0f, 180.41827f, 96.0f, 176.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(74.74516f, 96.0f, 64.0f, 106.74516f, 64.0f, 120.0f),
                    PathNode.CurveTo(64.0f, 124.41828f, 60.418278f, 128.0f, 56.0f, 128.0f),
                    PathNode.CurveTo(51.581722f, 128.0f, 48.0f, 124.41828f, 48.0f, 120.0f),
                    PathNode.CurveTo(48.0f, 97.90861f, 65.90861f, 80.0f, 88.0f, 80.0f),
                    PathNode.LineTo(192.0f, 80.0f),
                    PathNode.CurveTo(196.41827f, 80.0f, 200.0f, 83.58172f, 200.0f, 88.0f),
                    PathNode.CurveTo(200.0f, 92.41828f, 196.41827f, 96.0f, 192.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.LineTo(160.0f, 156.0f),
                    PathNode.CurveTo(160.0f, 162.62741f, 165.37259f, 168.0f, 172.0f, 168.0f),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
