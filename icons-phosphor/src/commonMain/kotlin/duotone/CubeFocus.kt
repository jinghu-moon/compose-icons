package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorDuotoneIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 96.0f),
                    PathNode.LineTo(184.0f, 160.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.LineTo(128.0f, 64.0f),
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
                    PathNode.MoveTo(232.0f, 48.0f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 92.41828f, 228.41827f, 96.0f, 224.0f, 96.0f),
                    PathNode.CurveTo(219.58173f, 96.0f, 216.0f, 92.41828f, 216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(179.58173f, 56.0f, 176.0f, 52.418278f, 176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 43.581722f, 179.58173f, 40.0f, 184.0f, 40.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(228.41827f, 40.0f, 232.0f, 43.581722f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(40.0f, 163.58173f, 36.418278f, 160.0f, 32.0f, 160.0f),
                    PathNode.CurveTo(27.581722f, 160.0f, 24.0f, 163.58173f, 24.0f, 168.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(76.41828f, 216.0f, 80.0f, 212.41827f, 80.0f, 208.0f),
                    PathNode.CurveTo(80.0f, 203.58173f, 76.41828f, 200.0f, 72.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.CurveTo(219.58173f, 160.0f, 216.0f, 163.58173f, 216.0f, 168.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(179.58173f, 200.0f, 176.0f, 203.58173f, 176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 212.41827f, 179.58173f, 216.0f, 184.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 163.58173f, 228.41827f, 160.0f, 224.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.CurveTo(36.418278f, 96.0f, 40.0f, 92.41828f, 40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.CurveTo(76.41828f, 56.0f, 80.0f, 52.418278f, 80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 43.581722f, 76.41828f, 40.0f, 72.0f, 40.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(27.581722f, 40.0f, 24.0f, 43.581722f, 24.0f, 48.0f),
                    PathNode.LineTo(24.0f, 88.0f),
                    PathNode.CurveTo(24.0f, 92.41828f, 27.581722f, 96.0f, 32.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 167.0f),
                    PathNode.LineTo(132.0f, 199.0f),
                    PathNode.CurveTo(129.54008f, 200.40608f, 126.51991f, 200.40608f, 124.06f, 199.0f),
                    PathNode.LineTo(68.0f, 167.0f),
                    PathNode.CurveTo(65.50244f, 165.55818f, 63.974182f, 162.88374f, 64.0f, 160.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(63.974182f, 93.11626f, 65.50244f, 90.44181f, 68.0f, 89.0f),
                    PathNode.LineTo(124.0f, 57.0f),
                    PathNode.CurveTo(126.459915f, 55.593918f, 129.48009f, 55.593918f, 131.94f, 57.0f),
                    PathNode.LineTo(187.94f, 89.0f),
                    PathNode.CurveTo(190.43756f, 90.44181f, 191.96582f, 93.11626f, 191.94f, 96.0f),
                    PathNode.LineTo(191.94f, 160.0f),
                    PathNode.CurveTo(191.97818f, 162.87135f, 190.47449f, 165.54291f, 188.0f, 167.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.12f, 96.0f),
                    PathNode.LineTo(128.0f, 118.79f),
                    PathNode.LineTo(167.88f, 96.0f),
                    PathNode.LineTo(128.0f, 73.21f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 155.36f),
                    PathNode.LineTo(120.0f, 178.21f),
                    PathNode.LineTo(120.0f, 132.64f),
                    PathNode.LineTo(80.0f, 109.79f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 155.36f),
                    PathNode.LineTo(176.0f, 109.79f),
                    PathNode.LineTo(136.0f, 132.64f),
                    PathNode.LineTo(136.0f, 178.21f),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
