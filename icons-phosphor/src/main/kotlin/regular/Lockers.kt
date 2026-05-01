package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorRegularIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 72.0f),
                    PathNode.CurveTo(192.0f, 76.41828f, 188.41827f, 80.0f, 184.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(155.58173f, 80.0f, 152.0f, 76.41828f, 152.0f, 72.0f),
                    PathNode.CurveTo(152.0f, 67.58172f, 155.58173f, 64.0f, 160.0f, 64.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.CurveTo(188.41827f, 64.0f, 192.0f, 67.58172f, 192.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.CurveTo(155.58173f, 96.0f, 152.0f, 99.58172f, 152.0f, 104.0f),
                    PathNode.CurveTo(152.0f, 108.41828f, 155.58173f, 112.0f, 160.0f, 112.0f),
                    PathNode.LineTo(184.0f, 112.0f),
                    PathNode.CurveTo(188.41827f, 112.0f, 192.0f, 108.41828f, 192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 99.58172f, 188.41827f, 96.0f, 184.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.CurveTo(100.41828f, 80.0f, 104.0f, 76.41828f, 104.0f, 72.0f),
                    PathNode.CurveTo(104.0f, 67.58172f, 100.41828f, 64.0f, 96.0f, 64.0f),
                    PathNode.LineTo(72.0f, 64.0f),
                    PathNode.CurveTo(67.58172f, 64.0f, 64.0f, 67.58172f, 64.0f, 72.0f),
                    PathNode.CurveTo(64.0f, 76.41828f, 67.58172f, 80.0f, 72.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 96.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.CurveTo(67.58172f, 96.0f, 64.0f, 99.58172f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 108.41828f, 67.58172f, 112.0f, 72.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(100.41828f, 112.0f, 104.0f, 108.41828f, 104.0f, 104.0f),
                    PathNode.CurveTo(104.0f, 99.58172f, 100.41828f, 96.0f, 96.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 224.0f),
                    PathNode.CurveTo(224.0f, 228.41827f, 220.41827f, 232.0f, 216.0f, 232.0f),
                    PathNode.CurveTo(211.58173f, 232.0f, 208.0f, 228.41827f, 208.0f, 224.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 228.41827f, 132.41827f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(123.58172f, 232.0f, 120.0f, 228.41827f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(48.0f, 228.41827f, 44.418278f, 232.0f, 40.0f, 232.0f),
                    PathNode.CurveTo(35.581722f, 232.0f, 32.0f, 228.41827f, 32.0f, 224.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
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
        return _lockers!!
    }

private var _lockers: ImageVector? = null
