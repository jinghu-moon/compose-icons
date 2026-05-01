package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gps: ImageVector
    get() {
        if (_gps != null) return _gps!!
        _gps = phosphorDuotoneIcon(
            name = "Gps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 172.18279f, 172.18279f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(83.81722f, 208.0f, 48.0f, 172.18279f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 83.81722f, 83.81722f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(172.18279f, 48.0f, 208.0f, 83.81722f, 208.0f, 128.0f),
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
                    PathNode.MoveTo(240.0f, 120.0f),
                    PathNode.LineTo(215.63f, 120.0f),
                    PathNode.CurveTo(211.71811f, 77.74777f, 178.25223f, 44.281887f, 136.0f, 40.37f),
                    PathNode.LineTo(136.0f, 16.0f),
                    PathNode.CurveTo(136.0f, 11.581722f, 132.41827f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(123.58172f, 8.0f, 120.0f, 11.581722f, 120.0f, 16.0f),
                    PathNode.LineTo(120.0f, 40.37f),
                    PathNode.CurveTo(77.74777f, 44.281887f, 44.281887f, 77.74777f, 40.37f, 120.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.CurveTo(11.581722f, 120.0f, 8.0f, 123.58172f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 132.41827f, 11.581722f, 136.0f, 16.0f, 136.0f),
                    PathNode.LineTo(40.37f, 136.0f),
                    PathNode.CurveTo(44.281887f, 178.25223f, 77.74777f, 211.71811f, 120.0f, 215.63f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 215.63f),
                    PathNode.CurveTo(178.25223f, 211.71811f, 211.71811f, 178.25223f, 215.63f, 136.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.CurveTo(244.41827f, 136.0f, 248.0f, 132.41827f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 123.58172f, 244.41827f, 120.0f, 240.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(88.2355f, 200.0f, 56.0f, 167.7645f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 88.2355f, 88.2355f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(167.7645f, 56.0f, 200.0f, 88.2355f, 200.0f, 128.0f),
                    PathNode.CurveTo(199.95592f, 167.74623f, 167.74623f, 199.95592f, 128.0f, 200.0f),
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
        return _gps!!
    }

private var _gps: ImageVector? = null
