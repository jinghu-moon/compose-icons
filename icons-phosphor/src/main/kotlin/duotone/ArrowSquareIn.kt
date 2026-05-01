package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorDuotoneIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 180.41827f, 212.41827f, 184.0f, 208.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(75.58172f, 184.0f, 72.0f, 180.41827f, 72.0f, 176.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(72.0f, 43.581722f, 75.58172f, 40.0f, 80.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
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
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.CurveTo(128.0f, 204.41827f, 124.41828f, 208.0f, 120.0f, 208.0f),
                    PathNode.CurveTo(115.58172f, 208.0f, 112.0f, 204.41827f, 112.0f, 200.0f),
                    PathNode.LineTo(112.0f, 155.32f),
                    PathNode.LineTo(45.66f, 221.66f),
                    PathNode.CurveTo(42.53407f, 224.78593f, 37.46593f, 224.78593f, 34.34f, 221.66f),
                    PathNode.CurveTo(31.21407f, 218.53407f, 31.214067f, 213.46593f, 34.34f, 210.34f),
                    PathNode.LineTo(100.68f, 144.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(51.581722f, 144.0f, 48.0f, 140.41827f, 48.0f, 136.0f),
                    PathNode.CurveTo(48.0f, 131.58173f, 51.581722f, 128.0f, 56.0f, 128.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.CurveTo(124.41828f, 128.0f, 128.0f, 131.58173f, 128.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(80.0f, 32.0f),
                    PathNode.CurveTo(71.163445f, 32.0f, 64.0f, 39.163445f, 64.0f, 48.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(64.0f, 100.41828f, 67.58172f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(76.41828f, 104.0f, 80.0f, 100.41828f, 80.0f, 96.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.LineTo(160.0f, 176.0f),
                    PathNode.CurveTo(155.58173f, 176.0f, 152.0f, 179.58173f, 152.0f, 184.0f),
                    PathNode.CurveTo(152.0f, 188.41827f, 155.58173f, 192.0f, 160.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(216.83656f, 192.0f, 224.0f, 184.83656f, 224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
