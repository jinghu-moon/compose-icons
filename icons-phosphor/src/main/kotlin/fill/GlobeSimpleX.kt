package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorFillIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 173.66f),
                    PathNode.LineTo(203.31f, 192.0f),
                    PathNode.LineTo(221.66f, 210.34f),
                    PathNode.CurveTo(224.78593f, 213.46593f, 224.78593f, 218.53407f, 221.66f, 221.66f),
                    PathNode.CurveTo(218.53407f, 224.78593f, 213.46593f, 224.78593f, 210.34f, 221.66f),
                    PathNode.LineTo(192.0f, 203.31f),
                    PathNode.LineTo(173.66f, 221.66f),
                    PathNode.CurveTo(170.53407f, 224.78593f, 165.46593f, 224.78593f, 162.34f, 221.66f),
                    PathNode.CurveTo(159.21407f, 218.53407f, 159.21407f, 213.46593f, 162.34f, 210.34f),
                    PathNode.LineTo(180.69f, 192.0f),
                    PathNode.LineTo(162.34f, 173.66f),
                    PathNode.CurveTo(159.21407f, 170.53407f, 159.21407f, 165.46593f, 162.34f, 162.34f),
                    PathNode.CurveTo(165.46593f, 159.21407f, 170.53407f, 159.21407f, 173.66f, 162.34f),
                    PathNode.LineTo(192.0f, 180.69f),
                    PathNode.LineTo(210.34f, 162.34f),
                    PathNode.CurveTo(213.46593f, 159.21407f, 218.53407f, 159.21407f, 221.66f, 162.34f),
                    PathNode.CurveTo(224.78593f, 165.46593f, 224.78593f, 170.53407f, 221.66f, 173.66f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 132.41827f, 228.41827f, 136.0f, 224.0f, 136.0f),
                    PathNode.LineTo(96.25f, 136.0f),
                    PathNode.CurveTo(99.25f, 189.73f, 131.58f, 216.6f, 133.02f, 217.77f),
                    PathNode.LineTo(133.02f, 217.77f),
                    PathNode.CurveTo(135.66212f, 219.8984f, 136.67435f, 223.46193f, 135.54564f, 226.66145f),
                    PathNode.CurveTo(134.41693f, 229.86098f, 131.39278f, 232.00056f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.4376f, 24.0f, 232.0f, 70.562386f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.41f, 42.4f),
                    PathNode.CurveTo(159.94f, 57.67f, 174.0f, 83.49f, 175.79f, 120.0f),
                    PathNode.LineTo(215.63f, 120.0f),
                    PathNode.CurveTo(212.14055f, 82.41272f, 185.1154f, 51.214382f, 148.41f, 42.4f),
                    PathNode.Close,
                    PathNode.MoveTo(96.23f, 120.0f),
                    PathNode.LineTo(159.77f, 120.0f),
                    PathNode.CurveTo(157.46f, 78.4f, 137.55f, 52.9f, 128.0f, 43.0f),
                    PathNode.CurveTo(118.46f, 52.89f, 98.54f, 78.39f, 96.23f, 120.0f),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
