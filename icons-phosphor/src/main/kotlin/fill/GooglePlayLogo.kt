package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorFillIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.82f, 114.18f),
                    PathNode.LineTo(72.0f, 18.16f),
                    PathNode.CurveTo(67.01918f, 15.255456f, 60.86082f, 15.255456f, 55.88f, 18.16f),
                    PathNode.CurveTo(50.97251f, 20.973938f, 47.96122f, 26.21313f, 48.0f, 31.87f),
                    PathNode.LineTo(48.0f, 224.13f),
                    PathNode.CurveTo(47.983852f, 229.78091f, 51.0096f, 235.00339f, 55.92f, 237.8f),
                    PathNode.CurveTo(60.90082f, 240.70454f, 67.05918f, 240.70454f, 72.04f, 237.8f),
                    PathNode.LineTo(239.82f, 141.8f),
                    PathNode.CurveTo(244.86711f, 139.03348f, 248.0047f, 133.7356f, 248.0047f, 127.98f),
                    PathNode.CurveTo(248.0047f, 122.224396f, 244.86711f, 116.92652f, 239.82f, 114.16f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 139.31f),
                    PathNode.LineTo(178.92f, 158.23f),
                    PathNode.LineTo(90.42f, 208.89f),
                    PathNode.Close,
                    PathNode.MoveTo(90.4f, 47.1f),
                    PathNode.LineTo(178.93f, 97.77f),
                    PathNode.LineTo(160.0f, 116.69f),
                    PathNode.Close,
                    PathNode.MoveTo(193.31f, 150.0f),
                    PathNode.LineTo(171.31f, 128.0f),
                    PathNode.LineTo(193.31f, 106.0f),
                    PathNode.LineTo(231.74f, 128.0f),
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
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
