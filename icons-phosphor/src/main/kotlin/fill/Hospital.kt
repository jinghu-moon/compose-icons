package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorFillIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.LineTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 119.163445f, 232.83656f, 112.0f, 224.0f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(168.0f, 39.163445f, 160.83656f, 32.0f, 152.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(47.163445f, 32.0f, 40.0f, 39.163445f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 211.58173f, 24.0f, 216.0f),
                    PathNode.CurveTo(24.0f, 220.41827f, 27.581722f, 224.0f, 32.0f, 224.0f),
                    PathNode.LineTo(248.0f, 224.0f),
                    PathNode.CurveTo(252.41827f, 224.0f, 256.0f, 220.41827f, 256.0f, 216.0f),
                    PathNode.CurveTo(256.0f, 211.58173f, 252.41827f, 208.0f, 248.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.LineTo(80.0f, 160.0f),
                    PathNode.LineTo(128.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.LineTo(112.0f, 120.0f),
                    PathNode.CurveTo(112.0f, 124.41828f, 108.41828f, 128.0f, 104.0f, 128.0f),
                    PathNode.CurveTo(99.58172f, 128.0f, 96.0f, 124.41828f, 96.0f, 120.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(75.58172f, 104.0f, 72.0f, 100.41828f, 72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 91.58172f, 75.58172f, 88.0f, 80.0f, 88.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(96.0f, 67.58172f, 99.58172f, 64.0f, 104.0f, 64.0f),
                    PathNode.CurveTo(108.41828f, 64.0f, 112.0f, 67.58172f, 112.0f, 72.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.CurveTo(132.41827f, 88.0f, 136.0f, 91.58172f, 136.0f, 96.0f),
                    PathNode.CurveTo(136.0f, 100.41828f, 132.41827f, 104.0f, 128.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 208.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.LineTo(224.0f, 128.0f),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
