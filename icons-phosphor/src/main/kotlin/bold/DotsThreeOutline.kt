package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsThreeOutline: ImageVector
    get() {
        if (_dotsThreeOutline != null) return _dotsThreeOutline!!
        _dotsThreeOutline = phosphorBoldIcon(
            name = "DotsThreeOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(110.32689f, 96.0f, 96.0f, 110.32689f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 145.67311f, 110.32689f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(145.67311f, 160.0f, 160.0f, 145.67311f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 110.32689f, 145.67311f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(132.41827f, 120.0f, 136.0f, 123.58172f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.CurveTo(190.32689f, 96.0f, 176.0f, 110.32689f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 145.67311f, 190.32689f, 160.0f, 208.0f, 160.0f),
                    PathNode.CurveTo(225.67311f, 160.0f, 240.0f, 145.67311f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 110.32689f, 225.67311f, 96.0f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.CurveTo(203.58173f, 136.0f, 200.0f, 132.41827f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 123.58172f, 203.58173f, 120.0f, 208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 123.58172f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 132.41827f, 212.41827f, 136.0f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 96.0f),
                    PathNode.CurveTo(30.326887f, 96.0f, 16.0f, 110.32689f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 145.67311f, 30.326887f, 160.0f, 48.0f, 160.0f),
                    PathNode.CurveTo(65.67311f, 160.0f, 80.0f, 145.67311f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 110.32689f, 65.67311f, 96.0f, 48.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 136.0f),
                    PathNode.CurveTo(43.581722f, 136.0f, 40.0f, 132.41827f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 123.58172f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.CurveTo(52.418278f, 120.0f, 56.0f, 123.58172f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 132.41827f, 52.418278f, 136.0f, 48.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dotsThreeOutline!!
    }

private var _dotsThreeOutline: ImageVector? = null
