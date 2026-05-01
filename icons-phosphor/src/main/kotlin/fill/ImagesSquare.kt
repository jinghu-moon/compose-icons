package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorFillIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(80.0f, 32.0f),
                    PathNode.CurveTo(71.163445f, 32.0f, 64.0f, 39.163445f, 64.0f, 48.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.CurveTo(39.163445f, 64.0f, 32.0f, 71.163445f, 32.0f, 80.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(176.0f, 224.0f),
                    PathNode.CurveTo(184.83656f, 224.0f, 192.0f, 216.83656f, 192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(216.83656f, 192.0f, 224.0f, 184.83656f, 224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 117.38f),
                    PathNode.LineTo(191.3f, 100.68f),
                    PathNode.CurveTo(185.05246f, 94.436554f, 174.92754f, 94.436554f, 168.68f, 100.68f),
                    PathNode.LineTo(93.37f, 176.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 184.83656f, 71.163445f, 192.0f, 80.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 79.163445f, 111.163445f, 72.0f, 120.0f, 72.0f),
                    PathNode.CurveTo(128.83656f, 72.0f, 136.0f, 79.163445f, 136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 96.836555f, 128.83656f, 104.0f, 120.0f, 104.0f),
                    PathNode.CurveTo(111.163445f, 104.0f, 104.0f, 96.836555f, 104.0f, 88.0f),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
