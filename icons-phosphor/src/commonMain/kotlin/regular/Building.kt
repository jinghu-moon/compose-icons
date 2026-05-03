package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Building: ImageVector
    get() {
        if (_building != null) return _building!!
        _building = phosphorRegularIcon(
            name = "Building",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 28.418278f, 224.0f, 24.0f),
                    PathNode.CurveTo(224.0f, 19.581722f, 220.41827f, 16.0f, 216.0f, 16.0f),
                    PathNode.LineTo(40.0f, 16.0f),
                    PathNode.CurveTo(35.581722f, 16.0f, 32.0f, 19.581722f, 32.0f, 24.0f),
                    PathNode.CurveTo(32.0f, 28.418278f, 35.581722f, 32.0f, 40.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.LineTo(24.0f, 224.0f),
                    PathNode.CurveTo(19.581722f, 224.0f, 16.0f, 227.58173f, 16.0f, 232.0f),
                    PathNode.CurveTo(16.0f, 236.41827f, 19.581722f, 240.0f, 24.0f, 240.0f),
                    PathNode.LineTo(232.0f, 240.0f),
                    PathNode.CurveTo(236.41827f, 240.0f, 240.0f, 236.41827f, 240.0f, 232.0f),
                    PathNode.CurveTo(240.0f, 227.58173f, 236.41827f, 224.0f, 232.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.CurveTo(160.0f, 179.58173f, 156.41827f, 176.0f, 152.0f, 176.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.CurveTo(99.58172f, 176.0f, 96.0f, 179.58173f, 96.0f, 184.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.LineTo(64.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.LineTo(112.0f, 192.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 59.581722f, 91.58172f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(116.41828f, 56.0f, 120.0f, 59.581722f, 120.0f, 64.0f),
                    PathNode.CurveTo(120.0f, 68.41828f, 116.41828f, 72.0f, 112.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(91.58172f, 72.0f, 88.0f, 68.41828f, 88.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 59.581722f, 139.58173f, 56.0f, 144.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(164.41827f, 56.0f, 168.0f, 59.581722f, 168.0f, 64.0f),
                    PathNode.CurveTo(168.0f, 68.41828f, 164.41827f, 72.0f, 160.0f, 72.0f),
                    PathNode.LineTo(144.0f, 72.0f),
                    PathNode.CurveTo(139.58173f, 72.0f, 136.0f, 68.41828f, 136.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 99.58172f, 91.58172f, 96.0f, 96.0f, 96.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.CurveTo(116.41828f, 96.0f, 120.0f, 99.58172f, 120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 108.41828f, 116.41828f, 112.0f, 112.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(91.58172f, 112.0f, 88.0f, 108.41828f, 88.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 104.0f),
                    PathNode.CurveTo(136.0f, 99.58172f, 139.58173f, 96.0f, 144.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.CurveTo(164.41827f, 96.0f, 168.0f, 99.58172f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 108.41828f, 164.41827f, 112.0f, 160.0f, 112.0f),
                    PathNode.LineTo(144.0f, 112.0f),
                    PathNode.CurveTo(139.58173f, 112.0f, 136.0f, 108.41828f, 136.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 139.58173f, 91.58172f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(116.41828f, 136.0f, 120.0f, 139.58173f, 120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 148.41827f, 116.41828f, 152.0f, 112.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 139.58173f, 139.58173f, 136.0f, 144.0f, 136.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.CurveTo(164.41827f, 136.0f, 168.0f, 139.58173f, 168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 148.41827f, 164.41827f, 152.0f, 160.0f, 152.0f),
                    PathNode.LineTo(144.0f, 152.0f),
                    PathNode.CurveTo(139.58173f, 152.0f, 136.0f, 148.41827f, 136.0f, 144.0f),
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
        return _building!!
    }

private var _building: ImageVector? = null
