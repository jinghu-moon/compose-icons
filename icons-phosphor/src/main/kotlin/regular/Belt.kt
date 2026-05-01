package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorRegularIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 160.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.LineTo(192.0f, 96.0f),
                    PathNode.LineTo(248.0f, 96.0f),
                    PathNode.CurveTo(252.41827f, 96.0f, 256.0f, 92.41828f, 256.0f, 88.0f),
                    PathNode.CurveTo(256.0f, 83.58172f, 252.41827f, 80.0f, 248.0f, 80.0f),
                    PathNode.LineTo(189.83f, 80.0f),
                    PathNode.CurveTo(186.9766f, 75.05775f, 181.70682f, 72.00942f, 176.0f, 72.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.CurveTo(106.29319f, 72.00942f, 101.0234f, 75.05775f, 98.17f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 75.58172f, 60.418278f, 72.0f, 56.0f, 72.0f),
                    PathNode.CurveTo(51.581722f, 72.0f, 48.0f, 75.58172f, 48.0f, 80.0f),
                    PathNode.LineTo(8.0f, 80.0f),
                    PathNode.CurveTo(3.581722f, 80.0f, 0f, 83.58172f, 0f, 88.0f),
                    PathNode.CurveTo(0f, 92.41828f, 3.581722f, 96.0f, 8.0f, 96.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.LineTo(8.0f, 160.0f),
                    PathNode.CurveTo(3.581722f, 160.0f, 0f, 163.58173f, 0f, 168.0f),
                    PathNode.CurveTo(0f, 172.41827f, 3.581722f, 176.0f, 8.0f, 176.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 51.581722f, 184.0f, 56.0f, 184.0f),
                    PathNode.CurveTo(60.418278f, 184.0f, 64.0f, 180.41827f, 64.0f, 176.0f),
                    PathNode.LineTo(98.17f, 176.0f),
                    PathNode.CurveTo(101.0234f, 180.94226f, 106.29319f, 183.99057f, 112.0f, 184.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.CurveTo(181.70682f, 183.99057f, 186.9766f, 180.94226f, 189.83f, 176.0f),
                    PathNode.LineTo(248.0f, 176.0f),
                    PathNode.CurveTo(252.41827f, 176.0f, 256.0f, 172.41827f, 256.0f, 168.0f),
                    PathNode.CurveTo(256.0f, 163.58173f, 252.41827f, 160.0f, 248.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 96.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(64.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(144.0f, 120.0f),
                    PathNode.CurveTo(139.58173f, 120.0f, 136.0f, 123.58172f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 139.58173f, 136.0f, 144.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.LineTo(176.0f, 167.8f),
                    PathNode.CurveTo(176.0f, 167.87f, 176.0f, 167.93f, 176.0f, 168.0f),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
