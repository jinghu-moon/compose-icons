package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = phosphorFillIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.04155f, 150.68431f, 203.86707f, 156.66962f, 197.58f, 158.94f),
                    PathNode.LineTo(146.0f, 178.0f),
                    PathNode.LineTo(127.0f, 229.62f),
                    PathNode.CurveTo(124.69541f, 235.88084f, 118.73152f, 240.04065f, 112.06f, 240.04065f),
                    PathNode.CurveTo(105.38847f, 240.04065f, 99.42458f, 235.88084f, 97.12f, 229.62f),
                    PathNode.LineTo(78.0f, 178.0f),
                    PathNode.LineTo(26.38f, 159.0f),
                    PathNode.CurveTo(20.11916f, 156.69542f, 15.959346f, 150.73152f, 15.959346f, 144.06f),
                    PathNode.CurveTo(15.959346f, 137.38847f, 20.11916f, 131.42459f, 26.38f, 129.12f),
                    PathNode.LineTo(78.0f, 110.0f),
                    PathNode.LineTo(97.0f, 58.38f),
                    PathNode.CurveTo(99.30459f, 52.11916f, 105.26848f, 47.959347f, 111.94f, 47.959347f),
                    PathNode.CurveTo(118.61153f, 47.959347f, 124.57542f, 52.11916f, 126.88f, 58.38f),
                    PathNode.LineTo(146.0f, 110.0f),
                    PathNode.LineTo(197.62f, 129.0f),
                    PathNode.CurveTo(203.91219f, 131.29112f, 208.07315f, 137.30406f, 208.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.CurveTo(168.0f, 68.41828f, 171.58173f, 72.0f, 176.0f, 72.0f),
                    PathNode.CurveTo(180.41827f, 72.0f, 184.0f, 68.41828f, 184.0f, 64.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.CurveTo(204.41827f, 48.0f, 208.0f, 44.418278f, 208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 204.41827f, 32.0f, 200.0f, 32.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.LineTo(184.0f, 16.0f),
                    PathNode.CurveTo(184.0f, 11.581722f, 180.41827f, 8.0f, 176.0f, 8.0f),
                    PathNode.CurveTo(171.58173f, 8.0f, 168.0f, 11.581722f, 168.0f, 16.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(147.58173f, 32.0f, 144.0f, 35.581722f, 144.0f, 40.0f),
                    PathNode.CurveTo(144.0f, 44.418278f, 147.58173f, 48.0f, 152.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 80.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(232.0f, 67.58172f, 228.41827f, 64.0f, 224.0f, 64.0f),
                    PathNode.CurveTo(219.58173f, 64.0f, 216.0f, 67.58172f, 216.0f, 72.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(203.58173f, 80.0f, 200.0f, 83.58172f, 200.0f, 88.0f),
                    PathNode.CurveTo(200.0f, 92.41828f, 203.58173f, 96.0f, 208.0f, 96.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 108.41828f, 219.58173f, 112.0f, 224.0f, 112.0f),
                    PathNode.CurveTo(228.41827f, 112.0f, 232.0f, 108.41828f, 232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 96.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(244.41827f, 96.0f, 248.0f, 92.41828f, 248.0f, 88.0f),
                    PathNode.CurveTo(248.0f, 83.58172f, 244.41827f, 80.0f, 240.0f, 80.0f),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
