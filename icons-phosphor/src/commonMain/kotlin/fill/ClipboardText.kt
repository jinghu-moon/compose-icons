package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorFillIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 32.0f),
                    PathNode.LineTo(163.74f, 32.0f),
                    PathNode.CurveTo(154.6485f, 21.82095f, 141.64801f, 16.001448f, 128.0f, 16.001448f),
                    PathNode.CurveTo(114.35198f, 16.001448f, 101.351494f, 21.82095f, 92.26f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(47.163445f, 32.0f, 40.0f, 39.163445f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 39.163445f, 208.83656f, 32.0f, 200.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(145.67311f, 32.0f, 160.0f, 46.32689f, 160.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.CurveTo(96.0f, 46.32689f, 110.32689f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 160.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.CurveTo(91.58172f, 160.0f, 88.0f, 156.41827f, 88.0f, 152.0f),
                    PathNode.CurveTo(88.0f, 147.58173f, 91.58172f, 144.0f, 96.0f, 144.0f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.CurveTo(164.41827f, 144.0f, 168.0f, 147.58173f, 168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 156.41827f, 164.41827f, 160.0f, 160.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 128.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.CurveTo(91.58172f, 128.0f, 88.0f, 124.41828f, 88.0f, 120.0f),
                    PathNode.CurveTo(88.0f, 115.58172f, 91.58172f, 112.0f, 96.0f, 112.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.CurveTo(164.41827f, 112.0f, 168.0f, 115.58172f, 168.0f, 120.0f),
                    PathNode.CurveTo(168.0f, 124.41828f, 164.41827f, 128.0f, 160.0f, 128.0f),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
