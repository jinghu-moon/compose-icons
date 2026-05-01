package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gps: ImageVector
    get() {
        if (_gps != null) return _gps!!
        _gps = phosphorFillIcon(
            name = "Gps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 132.41827f, 244.41827f, 136.0f, 240.0f, 136.0f),
                    PathNode.LineTo(215.63f, 136.0f),
                    PathNode.CurveTo(211.71811f, 178.25223f, 178.25223f, 211.71811f, 136.0f, 215.63f),
                    PathNode.LineTo(136.0f, 240.0f),
                    PathNode.CurveTo(136.0f, 244.41827f, 132.41827f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(123.58172f, 248.0f, 120.0f, 244.41827f, 120.0f, 240.0f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(77.74777f, 211.71811f, 44.281887f, 178.25223f, 40.37f, 136.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(11.581722f, 136.0f, 8.0f, 132.41827f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 123.58172f, 11.581722f, 120.0f, 16.0f, 120.0f),
                    PathNode.LineTo(40.37f, 120.0f),
                    PathNode.CurveTo(44.281887f, 77.74777f, 77.74777f, 44.281887f, 120.0f, 40.37f),
                    PathNode.LineTo(120.0f, 16.0f),
                    PathNode.CurveTo(120.0f, 11.581722f, 123.58172f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(132.41827f, 8.0f, 136.0f, 11.581722f, 136.0f, 16.0f),
                    PathNode.LineTo(136.0f, 40.37f),
                    PathNode.CurveTo(178.25223f, 44.281887f, 211.71811f, 77.74777f, 215.63f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.CurveTo(244.41827f, 120.0f, 248.0f, 123.58172f, 248.0f, 128.0f),
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
        return _gps!!
    }

private var _gps: ImageVector? = null
