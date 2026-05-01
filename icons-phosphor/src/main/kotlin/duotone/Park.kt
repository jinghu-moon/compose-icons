package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Park: ImageVector
    get() {
        if (_park != null) return _park!!
        _park = phosphorDuotoneIcon(
            name = "Park",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.LineTo(200.0f, 192.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(226.46321f, 167.99963f, 228.78893f, 166.86455f, 230.30472f, 164.92294f),
                    PathNode.CurveTo(231.8205f, 162.98132f, 232.35733f, 160.44969f, 231.76f, 158.06f),
                    PathNode.LineTo(199.76f, 30.06f),
                    PathNode.CurveTo(198.868f, 26.500887f, 195.66919f, 24.004839f, 192.0f, 24.004839f),
                    PathNode.CurveTo(188.33081f, 24.004839f, 185.132f, 26.500887f, 184.24f, 30.06f),
                    PathNode.LineTo(152.24f, 158.06f),
                    PathNode.CurveTo(151.64267f, 160.44969f, 152.1795f, 162.98132f, 153.69528f, 164.92294f),
                    PathNode.CurveTo(155.21107f, 166.86455f, 157.53679f, 167.99963f, 160.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.LineTo(184.0f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.CurveTo(132.41827f, 176.0f, 136.0f, 172.41827f, 136.0f, 168.0f),
                    PathNode.CurveTo(136.0f, 163.58173f, 132.41827f, 160.0f, 128.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.CurveTo(132.41827f, 144.0f, 136.0f, 140.41827f, 136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 131.58173f, 132.41827f, 128.0f, 128.0f, 128.0f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.CurveTo(35.581722f, 128.0f, 32.0f, 131.58173f, 32.0f, 136.0f),
                    PathNode.CurveTo(32.0f, 140.41827f, 35.581722f, 144.0f, 40.0f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(35.581722f, 160.0f, 32.0f, 163.58173f, 32.0f, 168.0f),
                    PathNode.CurveTo(32.0f, 172.41827f, 35.581722f, 176.0f, 40.0f, 176.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(19.581722f, 192.0f, 16.0f, 195.58173f, 16.0f, 200.0f),
                    PathNode.CurveTo(16.0f, 204.41827f, 19.581722f, 208.0f, 24.0f, 208.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(236.41827f, 208.0f, 240.0f, 204.41827f, 240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 195.58173f, 236.41827f, 192.0f, 232.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 65.0f),
                    PathNode.LineTo(213.75f, 152.0f),
                    PathNode.LineTo(170.25f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 144.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.LineTo(64.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 176.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 96.0f),
                    PathNode.CurveTo(131.46397f, 96.0f, 144.0f, 83.463974f, 144.0f, 68.0f),
                    PathNode.CurveTo(144.0f, 52.53603f, 131.46397f, 40.0f, 116.0f, 40.0f),
                    PathNode.CurveTo(100.536026f, 40.0f, 88.0f, 52.53603f, 88.0f, 68.0f),
                    PathNode.CurveTo(88.0f, 83.463974f, 100.536026f, 96.0f, 116.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 56.0f),
                    PathNode.CurveTo(122.62742f, 56.0f, 128.0f, 61.37258f, 128.0f, 68.0f),
                    PathNode.CurveTo(128.0f, 74.62742f, 122.62742f, 80.0f, 116.0f, 80.0f),
                    PathNode.CurveTo(109.37258f, 80.0f, 104.0f, 74.62742f, 104.0f, 68.0f),
                    PathNode.CurveTo(104.0f, 61.37258f, 109.37258f, 56.0f, 116.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _park!!
    }

private var _park: ImageVector? = null
