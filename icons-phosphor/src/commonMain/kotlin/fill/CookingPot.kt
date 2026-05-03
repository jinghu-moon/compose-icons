package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorFillIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 16.0f),
                    PathNode.CurveTo(88.0f, 11.581722f, 91.58172f, 8.0f, 96.0f, 8.0f),
                    PathNode.CurveTo(100.41828f, 8.0f, 104.0f, 11.581722f, 104.0f, 16.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 52.418278f, 100.41828f, 56.0f, 96.0f, 56.0f),
                    PathNode.CurveTo(91.58172f, 56.0f, 88.0f, 52.418278f, 88.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(132.41827f, 56.0f, 136.0f, 52.418278f, 136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 16.0f),
                    PathNode.CurveTo(136.0f, 11.581722f, 132.41827f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(123.58172f, 8.0f, 120.0f, 11.581722f, 120.0f, 16.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 52.418278f, 123.58172f, 56.0f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 56.0f),
                    PathNode.CurveTo(164.41827f, 56.0f, 168.0f, 52.418278f, 168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 16.0f),
                    PathNode.CurveTo(168.0f, 11.581722f, 164.41827f, 8.0f, 160.0f, 8.0f),
                    PathNode.CurveTo(155.58173f, 8.0f, 152.0f, 11.581722f, 152.0f, 16.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 52.418278f, 155.58173f, 56.0f, 160.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(254.4f, 91.2f),
                    PathNode.CurveTo(251.74904f, 87.665375f, 246.73462f, 86.949036f, 243.2f, 89.6f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 75.58172f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 75.58172f, 32.0f, 80.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(12.8f, 89.6f),
                    PathNode.CurveTo(9.265378f, 86.949036f, 4.250967f, 87.665375f, 1.6f, 91.2f),
                    PathNode.CurveTo(-1.050967f, 94.73462f, -0.334622f, 99.74903f, 3.2f, 102.4f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(32.0f, 201.67311f, 46.32689f, 216.0f, 64.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(209.67311f, 216.0f, 224.0f, 201.67311f, 224.0f, 184.0f),
                    PathNode.LineTo(224.0f, 124.0f),
                    PathNode.LineTo(252.8f, 102.4f),
                    PathNode.CurveTo(256.33463f, 99.74903f, 257.05096f, 94.73462f, 254.4f, 91.2f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
