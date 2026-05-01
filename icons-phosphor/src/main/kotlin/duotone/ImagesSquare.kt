package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorDuotoneIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(80.0f, 40.0f),
                    PathNode.CurveTo(75.58172f, 40.0f, 72.0f, 43.581722f, 72.0f, 48.0f),
                    PathNode.LineTo(72.0f, 176.0f),
                    PathNode.CurveTo(72.0f, 180.41827f, 75.58172f, 184.0f, 80.0f, 184.0f),
                    PathNode.LineTo(96.69f, 184.0f),
                    PathNode.LineTo(174.34f, 106.34f),
                    PathNode.CurveTo(175.84055f, 104.83778f, 177.87672f, 103.993706f, 180.0f, 103.993706f),
                    PathNode.CurveTo(182.12328f, 103.993706f, 184.15945f, 104.83778f, 185.66f, 106.34f),
                    PathNode.LineTo(216.0f, 136.69f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 104.0f),
                    PathNode.CurveTo(111.163445f, 104.0f, 104.0f, 96.836555f, 104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 79.163445f, 111.163445f, 72.0f, 120.0f, 72.0f),
                    PathNode.CurveTo(128.83656f, 72.0f, 136.0f, 79.163445f, 136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 96.836555f, 128.83656f, 104.0f, 120.0f, 104.0f),
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
                    PathNode.MoveTo(208.0f, 176.0f),
                    PathNode.LineTo(116.0f, 176.0f),
                    PathNode.LineTo(180.0f, 112.0f),
                    PathNode.LineTo(208.0f, 140.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 112.0f),
                    PathNode.CurveTo(133.25484f, 112.0f, 144.0f, 101.25484f, 144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 74.74516f, 133.25484f, 64.0f, 120.0f, 64.0f),
                    PathNode.CurveTo(106.74516f, 64.0f, 96.0f, 74.74516f, 96.0f, 88.0f),
                    PathNode.CurveTo(96.0f, 101.25484f, 106.74516f, 112.0f, 120.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 80.0f),
                    PathNode.CurveTo(124.41828f, 80.0f, 128.0f, 83.58172f, 128.0f, 88.0f),
                    PathNode.CurveTo(128.0f, 92.41828f, 124.41828f, 96.0f, 120.0f, 96.0f),
                    PathNode.CurveTo(115.58172f, 96.0f, 112.0f, 92.41828f, 112.0f, 88.0f),
                    PathNode.CurveTo(112.0f, 83.58172f, 115.58172f, 80.0f, 120.0f, 80.0f),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
