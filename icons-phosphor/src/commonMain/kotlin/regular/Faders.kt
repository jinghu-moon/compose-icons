package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorRegularIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 220.41827f, 132.41827f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(123.58172f, 224.0f, 120.0f, 220.41827f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 115.58172f, 123.58172f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(132.41827f, 112.0f, 136.0f, 115.58172f, 136.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.CurveTo(195.58173f, 192.0f, 192.0f, 195.58173f, 192.0f, 200.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(192.0f, 220.41827f, 195.58173f, 224.0f, 200.0f, 224.0f),
                    PathNode.CurveTo(204.41827f, 224.0f, 208.0f, 220.41827f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 195.58173f, 204.41827f, 192.0f, 200.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 204.41827f, 32.0f, 200.0f, 32.0f),
                    PathNode.CurveTo(195.58173f, 32.0f, 192.0f, 35.581722f, 192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.CurveTo(171.58173f, 160.0f, 168.0f, 163.58173f, 168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 172.41827f, 171.58173f, 176.0f, 176.0f, 176.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(228.41827f, 176.0f, 232.0f, 172.41827f, 232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 163.58173f, 228.41827f, 160.0f, 224.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 160.0f),
                    PathNode.CurveTo(51.581722f, 160.0f, 48.0f, 163.58173f, 48.0f, 168.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 220.41827f, 51.581722f, 224.0f, 56.0f, 224.0f),
                    PathNode.CurveTo(60.418278f, 224.0f, 64.0f, 220.41827f, 64.0f, 216.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.CurveTo(64.0f, 163.58173f, 60.418278f, 160.0f, 56.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 128.0f),
                    PathNode.LineTo(64.0f, 128.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(64.0f, 35.581722f, 60.418278f, 32.0f, 56.0f, 32.0f),
                    PathNode.CurveTo(51.581722f, 32.0f, 48.0f, 35.581722f, 48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(27.581722f, 128.0f, 24.0f, 131.58173f, 24.0f, 136.0f),
                    PathNode.CurveTo(24.0f, 140.41827f, 27.581722f, 144.0f, 32.0f, 144.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.CurveTo(84.41828f, 144.0f, 88.0f, 140.41827f, 88.0f, 136.0f),
                    PathNode.CurveTo(88.0f, 131.58173f, 84.41828f, 128.0f, 80.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 80.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 35.581722f, 132.41827f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(123.58172f, 32.0f, 120.0f, 35.581722f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.LineTo(104.0f, 80.0f),
                    PathNode.CurveTo(99.58172f, 80.0f, 96.0f, 83.58172f, 96.0f, 88.0f),
                    PathNode.CurveTo(96.0f, 92.41828f, 99.58172f, 96.0f, 104.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(156.41827f, 96.0f, 160.0f, 92.41828f, 160.0f, 88.0f),
                    PathNode.CurveTo(160.0f, 83.58172f, 156.41827f, 80.0f, 152.0f, 80.0f),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
