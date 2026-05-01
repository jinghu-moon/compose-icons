package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorFillIcon(
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
                    PathNode.CurveTo(175.95064f, 107.37191f, 176.63632f, 103.92874f, 175.39697f, 100.937675f),
                    PathNode.CurveTo(174.15764f, 97.94662f, 171.23764f, 95.99745f, 168.0f, 96.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(136.0f, 27.581722f, 132.41827f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(123.58172f, 24.0f, 120.0f, 27.581722f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(84.762344f, 95.99745f, 81.84236f, 97.94662f, 80.60302f, 100.937675f),
                    PathNode.CurveTo(79.36368f, 103.92874f, 80.04936f, 107.37191f, 82.34f, 109.66f),
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
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
