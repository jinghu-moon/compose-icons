package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorRegularIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 72.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(208.0f, 50.745167f, 197.25484f, 40.0f, 184.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(26.745167f, 40.0f, 16.0f, 50.745167f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 160.0f),
                    PathNode.CurveTo(16.0f, 173.25484f, 26.745167f, 184.0f, 40.0f, 184.0f),
                    PathNode.LineTo(152.0f, 184.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.CurveTo(152.0f, 205.25484f, 162.74516f, 216.0f, 176.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(237.25484f, 216.0f, 248.0f, 205.25484f, 248.0f, 192.0f),
                    PathNode.LineTo(248.0f, 96.0f),
                    PathNode.CurveTo(248.0f, 82.74516f, 237.25484f, 72.0f, 224.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 168.0f),
                    PathNode.CurveTo(35.581722f, 168.0f, 32.0f, 164.41827f, 32.0f, 160.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(188.41827f, 56.0f, 192.0f, 59.581722f, 192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(162.74516f, 72.0f, 152.0f, 82.74516f, 152.0f, 96.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 196.41827f, 228.41827f, 200.0f, 224.0f, 200.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(171.58173f, 200.0f, 168.0f, 196.41827f, 168.0f, 192.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(168.0f, 91.58172f, 171.58173f, 88.0f, 176.0f, 88.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.CurveTo(228.41827f, 88.0f, 232.0f, 91.58172f, 232.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 208.0f),
                    PathNode.CurveTo(136.0f, 212.41827f, 132.41827f, 216.0f, 128.0f, 216.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.CurveTo(83.58172f, 216.0f, 80.0f, 212.41827f, 80.0f, 208.0f),
                    PathNode.CurveTo(80.0f, 203.58173f, 83.58172f, 200.0f, 88.0f, 200.0f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.CurveTo(132.41827f, 200.0f, 136.0f, 203.58173f, 136.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 116.41828f, 212.41827f, 120.0f, 208.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(187.58173f, 120.0f, 184.0f, 116.41828f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 107.58172f, 187.58173f, 104.0f, 192.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.CurveTo(212.41827f, 104.0f, 216.0f, 107.58172f, 216.0f, 112.0f),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
