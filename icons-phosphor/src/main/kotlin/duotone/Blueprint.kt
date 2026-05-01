package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorDuotoneIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(34.745167f, 200.0f, 24.0f, 189.25484f, 24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 162.74516f, 34.745167f, 152.0f, 48.0f, 152.0f),
                    PathNode.LineTo(64.0f, 152.0f),
                    PathNode.LineTo(64.0f, 64.0f),
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
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(72.0f, 35.581722f, 68.41828f, 32.0f, 64.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(30.326887f, 32.0f, 16.0f, 46.32689f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 193.67311f, 30.326887f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(236.41827f, 208.0f, 240.0f, 204.41827f, 240.0f, 200.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 59.581722f, 236.41827f, 56.0f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 55.163445f, 39.163445f, 48.0f, 48.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(42.38145f, 143.99234f, 36.86105f, 145.47249f, 32.0f, 148.29f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(39.163445f, 192.0f, 32.0f, 184.83656f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 167.16344f, 39.163445f, 160.0f, 48.0f, 160.0f),
                    PathNode.LineTo(64.0f, 160.0f),
                    PathNode.CurveTo(68.41828f, 160.0f, 72.0f, 156.41827f, 72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 136.0f),
                    PathNode.CurveTo(99.58172f, 136.0f, 96.0f, 139.58173f, 96.0f, 144.0f),
                    PathNode.CurveTo(96.0f, 148.41827f, 99.58172f, 152.0f, 104.0f, 152.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.CurveTo(120.0f, 164.41827f, 123.58172f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(132.41827f, 168.0f, 136.0f, 164.41827f, 136.0f, 160.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.CurveTo(160.0f, 164.41827f, 163.58173f, 168.0f, 168.0f, 168.0f),
                    PathNode.CurveTo(172.41827f, 168.0f, 176.0f, 164.41827f, 176.0f, 160.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.CurveTo(196.41827f, 152.0f, 200.0f, 148.41827f, 200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 139.58173f, 196.41827f, 136.0f, 192.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(196.41827f, 120.0f, 200.0f, 116.41828f, 200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 107.58172f, 196.41827f, 104.0f, 192.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 91.58172f, 172.41827f, 88.0f, 168.0f, 88.0f),
                    PathNode.CurveTo(163.58173f, 88.0f, 160.0f, 91.58172f, 160.0f, 96.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.CurveTo(136.0f, 91.58172f, 132.41827f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(123.58172f, 88.0f, 120.0f, 91.58172f, 120.0f, 96.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.CurveTo(99.58172f, 104.0f, 96.0f, 107.58172f, 96.0f, 112.0f),
                    PathNode.CurveTo(96.0f, 116.41828f, 99.58172f, 120.0f, 104.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
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
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
