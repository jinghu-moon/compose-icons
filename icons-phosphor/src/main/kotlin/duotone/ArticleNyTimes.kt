package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorDuotoneIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.LineTo(128.0f, 104.0f),
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
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.LineTo(232.0f, 96.0f),
                    PathNode.CurveTo(236.41827f, 96.0f, 240.0f, 99.58172f, 240.0f, 104.0f),
                    PathNode.CurveTo(240.0f, 108.41828f, 236.41827f, 112.0f, 232.0f, 112.0f),
                    PathNode.LineTo(128.0f, 112.0f),
                    PathNode.CurveTo(123.58172f, 112.0f, 120.0f, 108.41828f, 120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 99.58172f, 123.58172f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.CurveTo(123.58172f, 128.0f, 120.0f, 131.58173f, 120.0f, 136.0f),
                    PathNode.CurveTo(120.0f, 140.41827f, 123.58172f, 144.0f, 128.0f, 144.0f),
                    PathNode.LineTo(232.0f, 144.0f),
                    PathNode.CurveTo(236.41827f, 144.0f, 240.0f, 140.41827f, 240.0f, 136.0f),
                    PathNode.CurveTo(240.0f, 131.58173f, 236.41827f, 128.0f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 160.0f),
                    PathNode.LineTo(80.0f, 160.0f),
                    PathNode.CurveTo(75.58172f, 160.0f, 72.0f, 163.58173f, 72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 172.41827f, 75.58172f, 176.0f, 80.0f, 176.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(236.41827f, 176.0f, 240.0f, 172.41827f, 240.0f, 168.0f),
                    PathNode.CurveTo(240.0f, 163.58173f, 236.41827f, 160.0f, 232.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.CurveTo(75.58172f, 192.0f, 72.0f, 195.58173f, 72.0f, 200.0f),
                    PathNode.CurveTo(72.0f, 204.41827f, 75.58172f, 208.0f, 80.0f, 208.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(236.41827f, 208.0f, 240.0f, 204.41827f, 240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 195.58173f, 236.41827f, 192.0f, 232.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 144.0f),
                    PathNode.CurveTo(100.41828f, 144.0f, 104.0f, 140.41827f, 104.0f, 136.0f),
                    PathNode.CurveTo(104.0f, 131.58173f, 100.41828f, 128.0f, 96.0f, 128.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 76.41828f, 123.58172f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(132.41827f, 80.0f, 136.0f, 76.41828f, 136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.CurveTo(136.0f, 51.581722f, 132.41827f, 48.0f, 128.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(27.581722f, 48.0f, 24.0f, 51.581722f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 76.41828f, 27.581722f, 80.0f, 32.0f, 80.0f),
                    PathNode.CurveTo(36.418278f, 80.0f, 40.0f, 76.41828f, 40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(72.0f, 64.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(64.0f, 128.0f),
                    PathNode.CurveTo(59.581722f, 128.0f, 56.0f, 131.58173f, 56.0f, 136.0f),
                    PathNode.CurveTo(56.0f, 140.41827f, 59.581722f, 144.0f, 64.0f, 144.0f),
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
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
