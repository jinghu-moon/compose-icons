package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorRegularIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.CurveTo(176.0f, 26.745167f, 165.25484f, 16.0f, 152.0f, 16.0f),
                    PathNode.LineTo(104.0f, 16.0f),
                    PathNode.CurveTo(90.74516f, 16.0f, 80.0f, 26.745167f, 80.0f, 40.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(35.581722f, 48.0f, 32.0f, 51.581722f, 32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 60.418278f, 35.581722f, 64.0f, 40.0f, 64.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 216.83656f, 55.163445f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(200.83656f, 224.0f, 208.0f, 216.83656f, 208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.CurveTo(220.41827f, 64.0f, 224.0f, 60.418278f, 224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 51.581722f, 220.41827f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 40.0f),
                    PathNode.CurveTo(96.0f, 35.581722f, 99.58172f, 32.0f, 104.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(156.41827f, 32.0f, 160.0f, 35.581722f, 160.0f, 40.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 104.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.CurveTo(112.0f, 172.41827f, 108.41828f, 176.0f, 104.0f, 176.0f),
                    PathNode.CurveTo(99.58172f, 176.0f, 96.0f, 172.41827f, 96.0f, 168.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 99.58172f, 99.58172f, 96.0f, 104.0f, 96.0f),
                    PathNode.CurveTo(108.41828f, 96.0f, 112.0f, 99.58172f, 112.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 104.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 172.41827f, 156.41827f, 176.0f, 152.0f, 176.0f),
                    PathNode.CurveTo(147.58173f, 176.0f, 144.0f, 172.41827f, 144.0f, 168.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.CurveTo(144.0f, 99.58172f, 147.58173f, 96.0f, 152.0f, 96.0f),
                    PathNode.CurveTo(156.41827f, 96.0f, 160.0f, 99.58172f, 160.0f, 104.0f),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
