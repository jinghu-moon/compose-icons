package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorDuotoneIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(43.581722f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(56.69f, 216.0f),
                    PathNode.LineTo(166.34f, 106.34f),
                    PathNode.CurveTo(167.84055f, 104.83778f, 169.87672f, 103.993706f, 172.0f, 103.993706f),
                    PathNode.CurveTo(174.12328f, 103.993706f, 176.15945f, 104.83778f, 177.66f, 106.34f),
                    PathNode.LineTo(216.0f, 144.69f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 112.0f),
                    PathNode.CurveTo(87.163445f, 112.0f, 80.0f, 104.836555f, 80.0f, 96.0f),
                    PathNode.CurveTo(80.0f, 87.163445f, 87.163445f, 80.0f, 96.0f, 80.0f),
                    PathNode.CurveTo(104.836555f, 80.0f, 112.0f, 87.163445f, 112.0f, 96.0f),
                    PathNode.CurveTo(112.0f, 104.836555f, 104.836555f, 112.0f, 96.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 125.38f),
                    PathNode.LineTo(183.31f, 100.68f),
                    PathNode.CurveTo(177.06245f, 94.436554f, 166.93755f, 94.436554f, 160.69f, 100.68f),
                    PathNode.LineTo(53.37f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(76.0f, 208.0f),
                    PathNode.LineTo(172.0f, 112.0f),
                    PathNode.LineTo(208.0f, 148.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.CurveTo(109.25484f, 120.0f, 120.0f, 109.25484f, 120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 82.74516f, 109.25484f, 72.0f, 96.0f, 72.0f),
                    PathNode.CurveTo(82.74516f, 72.0f, 72.0f, 82.74516f, 72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 109.25484f, 82.74516f, 120.0f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 88.0f),
                    PathNode.CurveTo(100.41828f, 88.0f, 104.0f, 91.58172f, 104.0f, 96.0f),
                    PathNode.CurveTo(104.0f, 100.41828f, 100.41828f, 104.0f, 96.0f, 104.0f),
                    PathNode.CurveTo(91.58172f, 104.0f, 88.0f, 100.41828f, 88.0f, 96.0f),
                    PathNode.CurveTo(88.0f, 91.58172f, 91.58172f, 88.0f, 96.0f, 88.0f),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
