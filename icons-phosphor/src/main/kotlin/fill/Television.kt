package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Television: ImageVector
    get() {
        if (_television != null) return _television!!
        _television = phosphorFillIcon(
            name = "Television",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(147.31f, 64.0f),
                    PathNode.LineTo(181.66f, 29.66f),
                    PathNode.CurveTo(184.78593f, 26.53407f, 184.78593f, 21.46593f, 181.66f, 18.34f),
                    PathNode.CurveTo(178.53407f, 15.214068f, 173.46593f, 15.214068f, 170.34f, 18.34f),
                    PathNode.LineTo(128.0f, 60.69f),
                    PathNode.LineTo(85.66f, 18.34f),
                    PathNode.CurveTo(82.534065f, 15.214068f, 77.465935f, 15.214068f, 74.34f, 18.34f),
                    PathNode.CurveTo(71.214066f, 21.46593f, 71.214066f, 26.53407f, 74.34f, 29.66f),
                    PathNode.LineTo(108.69f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(31.163445f, 64.0f, 24.0f, 71.163445f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 71.163445f, 224.83656f, 64.0f, 216.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 116.0f),
                    PathNode.CurveTo(200.0f, 122.62742f, 194.62741f, 128.0f, 188.0f, 128.0f),
                    PathNode.CurveTo(181.37259f, 128.0f, 176.0f, 122.62742f, 176.0f, 116.0f),
                    PathNode.CurveTo(176.0f, 109.37258f, 181.37259f, 104.0f, 188.0f, 104.0f),
                    PathNode.CurveTo(194.62741f, 104.0f, 200.0f, 109.37258f, 200.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 164.0f),
                    PathNode.CurveTo(200.0f, 170.62741f, 194.62741f, 176.0f, 188.0f, 176.0f),
                    PathNode.CurveTo(181.37259f, 176.0f, 176.0f, 170.62741f, 176.0f, 164.0f),
                    PathNode.CurveTo(176.0f, 157.37259f, 181.37259f, 152.0f, 188.0f, 152.0f),
                    PathNode.CurveTo(194.62741f, 152.0f, 200.0f, 157.37259f, 200.0f, 164.0f),
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
        return _television!!
    }

private var _television: ImageVector? = null
