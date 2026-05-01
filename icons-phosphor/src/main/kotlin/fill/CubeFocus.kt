package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorFillIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.MoveTo(177.92f, 83.31f),
                    PathNode.LineTo(132.0f, 57.05f),
                    PathNode.CurveTo(129.54008f, 55.643917f, 126.51991f, 55.643917f, 124.06f, 57.05f),
                    PathNode.LineTo(78.08f, 83.31f),
                    PathNode.CurveTo(76.80674f, 84.01447f, 76.016495f, 85.35484f, 76.016495f, 86.81f),
                    PathNode.CurveTo(76.016495f, 88.26516f, 76.80674f, 89.60552f, 78.08f, 90.31f),
                    PathNode.LineTo(128.0f, 118.79f),
                    PathNode.LineTo(177.92f, 90.26f),
                    PathNode.CurveTo(179.1683f, 89.54838f, 179.939f, 88.22189f, 179.939f, 86.785f),
                    PathNode.CurveTo(179.939f, 85.348114f, 179.1683f, 84.02162f, 177.92f, 83.31f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 107.53f),
                    PathNode.LineTo(64.0f, 160.0f),
                    PathNode.CurveTo(63.974182f, 162.88374f, 65.50244f, 165.55818f, 68.0f, 167.0f),
                    PathNode.LineTo(114.0f, 193.27f),
                    PathNode.CurveTo(115.23852f, 193.98506f, 116.764565f, 193.9845f, 118.00255f, 193.26852f),
                    PathNode.CurveTo(119.24055f, 192.55255f, 120.00211f, 191.23012f, 120.0f, 189.8f),
                    PathNode.LineTo(120.0f, 132.64f),
                    PathNode.LineTo(70.0f, 104.06f),
                    PathNode.CurveTo(68.76148f, 103.34494f, 67.235435f, 103.345505f, 65.997444f, 104.06147f),
                    PathNode.CurveTo(64.75945f, 104.77744f, 63.99789f, 106.09989f, 64.0f, 107.53f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 160.0f),
                    PathNode.LineTo(192.0f, 107.53f),
                    PathNode.CurveTo(192.0021f, 106.09989f, 191.24055f, 104.77744f, 190.00256f, 104.06147f),
                    PathNode.CurveTo(188.76457f, 103.345505f, 187.23851f, 103.34494f, 186.0f, 104.06f),
                    PathNode.LineTo(136.0f, 132.64f),
                    PathNode.LineTo(136.0f, 189.75f),
                    PathNode.CurveTo(135.9979f, 191.18011f, 136.75945f, 192.50256f, 137.99744f, 193.21852f),
                    PathNode.CurveTo(139.23543f, 193.9345f, 140.76149f, 193.93506f, 142.0f, 193.22f),
                    PathNode.LineTo(188.0f, 167.0f),
                    PathNode.CurveTo(190.49756f, 165.55818f, 192.02582f, 162.88374f, 192.0f, 160.0f),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
