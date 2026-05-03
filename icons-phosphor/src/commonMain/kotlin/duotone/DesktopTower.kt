package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DesktopTower: ImageVector
    get() {
        if (_desktopTower != null) return _desktopTower!!
        _desktopTower = phosphorDuotoneIcon(
            name = "DesktopTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 48.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(240.0f, 212.41827f, 236.41827f, 216.0f, 232.0f, 216.0f),
                    PathNode.LineTo(152.0f, 216.0f),
                    PathNode.CurveTo(147.58173f, 216.0f, 144.0f, 212.41827f, 144.0f, 208.0f),
                    PathNode.LineTo(144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 43.581722f, 147.58173f, 40.0f, 152.0f, 40.0f),
                    PathNode.LineTo(232.0f, 40.0f),
                    PathNode.CurveTo(236.41827f, 40.0f, 240.0f, 43.581722f, 240.0f, 48.0f),
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
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.CurveTo(216.0f, 76.41828f, 212.41827f, 80.0f, 208.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.CurveTo(171.58173f, 80.0f, 168.0f, 76.41828f, 168.0f, 72.0f),
                    PathNode.CurveTo(168.0f, 67.58172f, 171.58173f, 64.0f, 176.0f, 64.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(212.41827f, 64.0f, 216.0f, 67.58172f, 216.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(171.58173f, 96.0f, 168.0f, 99.58172f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 108.41828f, 171.58173f, 112.0f, 176.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(212.41827f, 112.0f, 216.0f, 108.41828f, 216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 99.58172f, 212.41827f, 96.0f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 48.0f),
                    PathNode.LineTo(248.0f, 208.0f),
                    PathNode.CurveTo(248.0f, 216.83656f, 240.83656f, 224.0f, 232.0f, 224.0f),
                    PathNode.LineTo(152.0f, 224.0f),
                    PathNode.CurveTo(143.16344f, 224.0f, 136.0f, 216.83656f, 136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(116.41828f, 208.0f, 120.0f, 211.58173f, 120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 220.41827f, 116.41828f, 224.0f, 112.0f, 224.0f),
                    PathNode.LineTo(64.0f, 224.0f),
                    PathNode.CurveTo(59.581722f, 224.0f, 56.0f, 220.41827f, 56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 211.58173f, 59.581722f, 208.0f, 64.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(18.745167f, 192.0f, 8.0f, 181.25484f, 8.0f, 168.0f),
                    PathNode.LineTo(8.0f, 96.0f),
                    PathNode.CurveTo(8.0f, 82.74516f, 18.745167f, 72.0f, 32.0f, 72.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.CurveTo(136.0f, 39.163445f, 143.16344f, 32.0f, 152.0f, 32.0f),
                    PathNode.LineTo(232.0f, 32.0f),
                    PathNode.CurveTo(240.83656f, 32.0f, 248.0f, 39.163445f, 248.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.CurveTo(27.581722f, 88.0f, 24.0f, 91.58172f, 24.0f, 96.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.CurveTo(24.0f, 172.41827f, 27.581722f, 176.0f, 32.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 168.0f),
                    PathNode.CurveTo(185.37259f, 168.0f, 180.0f, 173.37259f, 180.0f, 180.0f),
                    PathNode.CurveTo(180.0f, 186.62741f, 185.37259f, 192.0f, 192.0f, 192.0f),
                    PathNode.CurveTo(198.62741f, 192.0f, 204.0f, 186.62741f, 204.0f, 180.0f),
                    PathNode.CurveTo(204.0f, 173.37259f, 198.62741f, 168.0f, 192.0f, 168.0f),
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
        return _desktopTower!!
    }

private var _desktopTower: ImageVector? = null
