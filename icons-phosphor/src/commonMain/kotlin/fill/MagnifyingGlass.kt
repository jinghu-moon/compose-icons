package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorFillIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 142.92795f, 142.92795f, 168.0f, 112.0f, 168.0f),
                    PathNode.CurveTo(81.07206f, 168.0f, 56.0f, 142.92795f, 56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 81.07206f, 81.07206f, 56.0f, 112.0f, 56.0f),
                    PathNode.CurveTo(142.92795f, 56.0f, 168.0f, 81.07206f, 168.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.66f, 229.66f),
                    PathNode.CurveTo(228.15945f, 231.16223f, 226.12328f, 232.00629f, 224.0f, 232.00629f),
                    PathNode.CurveTo(221.87672f, 232.00629f, 219.84055f, 231.16223f, 218.34f, 229.66f),
                    PathNode.LineTo(168.28f, 179.59f),
                    PathNode.CurveTo(132.11497f, 209.67686f, 78.682335f, 205.99887f, 46.98089f, 171.24048f),
                    PathNode.CurveTo(15.279437f, 136.48207f, 16.522068f, 82.937416f, 49.80182f, 49.68706f),
                    PathNode.CurveTo(83.08157f, 16.436707f, 136.62732f, 15.241399f, 171.35768f, 46.973557f),
                    PathNode.CurveTo(206.08804f, 78.70571f, 209.71881f, 132.14159f, 179.6f, 168.28f),
                    PathNode.LineTo(229.66f, 218.34f),
                    PathNode.CurveTo(231.16223f, 219.84055f, 232.00629f, 221.87672f, 232.00629f, 224.0f),
                    PathNode.CurveTo(232.00629f, 226.12328f, 231.16223f, 228.15945f, 229.66f, 229.66f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 184.0f),
                    PathNode.CurveTo(151.7645f, 184.0f, 184.0f, 151.7645f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 72.2355f, 151.7645f, 40.0f, 112.0f, 40.0f),
                    PathNode.CurveTo(72.2355f, 40.0f, 40.0f, 72.2355f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.04409f, 151.74623f, 72.25378f, 183.95592f, 112.0f, 184.0f),
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
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
