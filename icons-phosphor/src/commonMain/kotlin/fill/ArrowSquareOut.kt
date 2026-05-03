package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorFillIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 136.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(192.0f, 216.83656f, 184.83656f, 224.0f, 176.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 71.163445f, 39.163445f, 64.0f, 48.0f, 64.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.CurveTo(124.41828f, 64.0f, 128.0f, 67.58172f, 128.0f, 72.0f),
                    PathNode.CurveTo(128.0f, 76.41828f, 124.41828f, 80.0f, 120.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 131.58173f, 179.58173f, 128.0f, 184.0f, 128.0f),
                    PathNode.CurveTo(188.41827f, 128.0f, 192.0f, 131.58173f, 192.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(148.76236f, 31.997452f, 145.84236f, 33.94662f, 144.60303f, 36.93768f),
                    PathNode.CurveTo(143.36368f, 39.928738f, 144.04936f, 43.371906f, 146.34f, 45.66f),
                    PathNode.LineTo(172.69f, 72.0f),
                    PathNode.LineTo(130.34f, 114.34f),
                    PathNode.CurveTo(127.214066f, 117.465935f, 127.214066f, 122.534065f, 130.34f, 125.66f),
                    PathNode.CurveTo(133.46593f, 128.78593f, 138.53407f, 128.78593f, 141.66f, 125.66f),
                    PathNode.LineTo(184.0f, 83.31f),
                    PathNode.LineTo(210.34f, 109.66f),
                    PathNode.CurveTo(212.6281f, 111.95064f, 216.07126f, 112.63632f, 219.06232f, 111.39698f),
                    PathNode.CurveTo(222.05338f, 110.15764f, 224.00255f, 107.237656f, 224.0f, 104.0f),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
