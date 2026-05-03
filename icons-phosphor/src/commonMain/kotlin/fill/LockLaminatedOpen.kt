package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LockLaminatedOpen: ImageVector
    get() {
        if (_lockLaminatedOpen != null) return _lockLaminatedOpen!!
        _lockLaminatedOpen = phosphorFillIcon(
            name = "LockLaminatedOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 38.32689f, 110.32689f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(143.37f, 24.0f, 157.2f, 35.0f, 160.16f, 49.59f),
                    PathNode.CurveTo(161.07465f, 53.880913f, 165.27452f, 56.634617f, 169.5743f, 55.762596f),
                    PathNode.CurveTo(173.87408f, 54.890575f, 176.66931f, 50.71822f, 175.84f, 46.41f),
                    PathNode.CurveTo(171.32f, 24.15f, 151.2f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(101.501755f, 8.02756f, 80.02756f, 29.501757f, 80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(39.163445f, 80.0f, 32.0f, 87.163445f, 32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 87.163445f, 216.83656f, 80.0f, 208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(67.58172f, 192.0f, 64.0f, 188.41827f, 64.0f, 184.0f),
                    PathNode.CurveTo(64.0f, 179.58173f, 67.58172f, 176.0f, 72.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(188.41827f, 176.0f, 192.0f, 179.58173f, 192.0f, 184.0f),
                    PathNode.CurveTo(192.0f, 188.41827f, 188.41827f, 192.0f, 184.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 160.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.CurveTo(67.58172f, 160.0f, 64.0f, 156.41827f, 64.0f, 152.0f),
                    PathNode.CurveTo(64.0f, 147.58173f, 67.58172f, 144.0f, 72.0f, 144.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.CurveTo(188.41827f, 144.0f, 192.0f, 147.58173f, 192.0f, 152.0f),
                    PathNode.CurveTo(192.0f, 156.41827f, 188.41827f, 160.0f, 184.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.CurveTo(67.58172f, 128.0f, 64.0f, 124.41828f, 64.0f, 120.0f),
                    PathNode.CurveTo(64.0f, 115.58172f, 67.58172f, 112.0f, 72.0f, 112.0f),
                    PathNode.LineTo(184.0f, 112.0f),
                    PathNode.CurveTo(188.41827f, 112.0f, 192.0f, 115.58172f, 192.0f, 120.0f),
                    PathNode.CurveTo(192.0f, 124.41828f, 188.41827f, 128.0f, 184.0f, 128.0f),
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
        return _lockLaminatedOpen!!
    }

private var _lockLaminatedOpen: ImageVector? = null
