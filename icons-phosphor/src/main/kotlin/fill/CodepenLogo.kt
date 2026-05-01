package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorFillIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.79f, 89.0f),
                    PathNode.LineTo(131.79f, 33.0f),
                    PathNode.CurveTo(129.42366f, 31.727034f, 126.57634f, 31.727034f, 124.21f, 33.0f),
                    PathNode.LineTo(20.21f, 89.0f),
                    PathNode.CurveTo(17.63141f, 90.38709f, 16.016596f, 93.07206f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 160.0f),
                    PathNode.CurveTo(16.016596f, 162.92795f, 17.63141f, 165.61292f, 20.21f, 167.0f),
                    PathNode.LineTo(114.1f, 217.6f),
                    PathNode.CurveTo(115.33958f, 218.2691f, 116.839714f, 218.23688f, 118.049416f, 217.51515f),
                    PathNode.CurveTo(119.25911f, 216.79344f, 120.00002f, 215.48865f, 120.0f, 214.08f),
                    PathNode.LineTo(120.0f, 156.78f),
                    PathNode.LineTo(66.55f, 128.0f),
                    PathNode.LineTo(32.0f, 146.61f),
                    PathNode.LineTo(32.0f, 109.39f),
                    PathNode.LineTo(66.55f, 128.0f),
                    PathNode.LineTo(83.43f, 118.91f),
                    PathNode.LineTo(40.87f, 96.0f),
                    PathNode.LineTo(120.0f, 53.39f),
                    PathNode.LineTo(120.0f, 99.22f),
                    PathNode.LineTo(83.43f, 118.91f),
                    PathNode.LineTo(128.0f, 142.91f),
                    PathNode.LineTo(172.57f, 118.91f),
                    PathNode.LineTo(189.45f, 128.0f),
                    PathNode.LineTo(224.0f, 109.39f),
                    PathNode.LineTo(224.0f, 146.61f),
                    PathNode.LineTo(189.45f, 128.0f),
                    PathNode.LineTo(136.0f, 156.78f),
                    PathNode.LineTo(136.0f, 214.08f),
                    PathNode.CurveTo(135.99998f, 215.48865f, 136.74089f, 216.79344f, 137.95059f, 217.51515f),
                    PathNode.CurveTo(139.16028f, 218.23688f, 140.66043f, 218.2691f, 141.9f, 217.6f),
                    PathNode.LineTo(235.79f, 167.0f),
                    PathNode.CurveTo(238.36859f, 165.61292f, 239.9834f, 162.92795f, 240.0f, 160.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(239.9834f, 93.07206f, 238.36859f, 90.38709f, 235.79f, 89.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.57f, 119.0f),
                    PathNode.LineTo(136.0f, 99.22f),
                    PathNode.LineTo(136.0f, 53.39f),
                    PathNode.LineTo(215.13f, 96.0f),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
