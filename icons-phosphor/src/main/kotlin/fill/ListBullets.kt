package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorFillIcon(
            name = "ListBullets",
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
                    PathNode.MoveTo(68.0f, 188.0f),
                    PathNode.CurveTo(61.37258f, 188.0f, 56.0f, 182.62741f, 56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 169.37259f, 61.37258f, 164.0f, 68.0f, 164.0f),
                    PathNode.CurveTo(74.62742f, 164.0f, 80.0f, 169.37259f, 80.0f, 176.0f),
                    PathNode.CurveTo(80.0f, 182.62741f, 74.62742f, 188.0f, 68.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 140.0f),
                    PathNode.CurveTo(61.37258f, 140.0f, 56.0f, 134.62741f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 121.37258f, 61.37258f, 116.0f, 68.0f, 116.0f),
                    PathNode.CurveTo(74.62742f, 116.0f, 80.0f, 121.37258f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 134.62741f, 74.62742f, 140.0f, 68.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 92.0f),
                    PathNode.CurveTo(61.37258f, 92.0f, 56.0f, 86.62742f, 56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 73.37258f, 61.37258f, 68.0f, 68.0f, 68.0f),
                    PathNode.CurveTo(74.62742f, 68.0f, 80.0f, 73.37258f, 80.0f, 80.0f),
                    PathNode.CurveTo(80.0f, 86.62742f, 74.62742f, 92.0f, 68.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 184.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.CurveTo(99.58172f, 184.0f, 96.0f, 180.41827f, 96.0f, 176.0f),
                    PathNode.CurveTo(96.0f, 171.58173f, 99.58172f, 168.0f, 104.0f, 168.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.CurveTo(196.41827f, 168.0f, 200.0f, 171.58173f, 200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 180.41827f, 196.41827f, 184.0f, 192.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.CurveTo(99.58172f, 136.0f, 96.0f, 132.41827f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 123.58172f, 99.58172f, 120.0f, 104.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(196.41827f, 120.0f, 200.0f, 123.58172f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 132.41827f, 196.41827f, 136.0f, 192.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(99.58172f, 88.0f, 96.0f, 84.41828f, 96.0f, 80.0f),
                    PathNode.CurveTo(96.0f, 75.58172f, 99.58172f, 72.0f, 104.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 84.41828f, 196.41827f, 88.0f, 192.0f, 88.0f),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
