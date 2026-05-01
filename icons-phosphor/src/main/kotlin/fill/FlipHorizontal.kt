package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorFillIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.CurveTo(120.0f, 208.83656f, 112.836555f, 216.0f, 104.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(34.649464f, 216.00307f, 29.651524f, 213.33144f, 26.681726f, 208.88075f),
                    PathNode.CurveTo(23.711927f, 204.43007f, 23.163385f, 198.78949f, 25.22f, 193.85f),
                    PathNode.LineTo(89.22f, 33.92f),
                    PathNode.LineTo(89.28f, 33.78f),
                    PathNode.CurveTo(92.25599f, 26.793827f, 99.732635f, 22.861788f, 107.17523f, 24.368723f),
                    PathNode.CurveTo(114.61783f, 25.875654f, 119.97603f, 32.406414f, 120.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.33f, 208.84f),
                    PathNode.CurveTo(226.36726f, 213.30966f, 221.36243f, 215.99792f, 216.0f, 216.0f),
                    PathNode.LineTo(152.0f, 216.0f),
                    PathNode.CurveTo(143.16344f, 216.0f, 136.0f, 208.83656f, 136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(135.99692f, 32.38609f, 141.35973f, 25.824684f, 148.82193f, 24.312338f),
                    PathNode.CurveTo(156.28413f, 22.799992f, 163.77841f, 26.755686f, 166.74f, 33.77f),
                    PathNode.LineTo(166.8f, 33.91f),
                    PathNode.LineTo(230.8f, 193.84f),
                    PathNode.CurveTo(232.84314f, 198.77213f, 232.29176f, 204.39836f, 229.33f, 208.84f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(215.94f, 199.85f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.LineTo(152.0f, 200.0f),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
