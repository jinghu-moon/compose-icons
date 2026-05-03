package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorRegularIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 212.41827f, 220.41827f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(35.581722f, 216.0f, 32.0f, 212.41827f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 139.58173f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.CurveTo(44.418278f, 136.0f, 48.0f, 139.58173f, 48.0f, 144.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 139.58173f, 211.58173f, 136.0f, 216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 139.58173f, 224.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.34f, 149.66f),
                    PathNode.CurveTo(123.840546f, 151.16223f, 125.876724f, 152.00629f, 128.0f, 152.00629f),
                    PathNode.CurveTo(130.12328f, 152.00629f, 132.15945f, 151.16223f, 133.66f, 149.66f),
                    PathNode.LineTo(173.66f, 109.66f),
                    PathNode.CurveTo(176.78593f, 106.534065f, 176.78593f, 101.465935f, 173.66f, 98.34f),
                    PathNode.CurveTo(170.53407f, 95.214066f, 165.46593f, 95.214066f, 162.34f, 98.34f),
                    PathNode.LineTo(136.0f, 124.69f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(136.0f, 27.581722f, 132.41827f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(123.58172f, 24.0f, 120.0f, 27.581722f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 124.69f),
                    PathNode.LineTo(93.66f, 98.34f),
                    PathNode.CurveTo(90.534065f, 95.214066f, 85.465935f, 95.214066f, 82.34f, 98.34f),
                    PathNode.CurveTo(79.214066f, 101.465935f, 79.214066f, 106.534065f, 82.34f, 109.66f),
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
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
