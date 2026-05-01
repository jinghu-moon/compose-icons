package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorFillIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 120.0f),
                    PathNode.LineTo(256.0f, 168.0f),
                    PathNode.CurveTo(256.0f, 176.83656f, 248.83656f, 184.0f, 240.0f, 184.0f),
                    PathNode.LineTo(227.31f, 184.0f),
                    PathNode.LineTo(192.0f, 219.31f),
                    PathNode.CurveTo(189.00975f, 222.32419f, 184.93579f, 224.01357f, 180.69f, 224.0f),
                    PathNode.LineTo(103.31f, 224.0f),
                    PathNode.CurveTo(99.06421f, 224.01357f, 94.99025f, 222.32419f, 92.0f, 219.31f),
                    PathNode.LineTo(52.69f, 180.0f),
                    PathNode.CurveTo(49.67581f, 177.00975f, 47.986435f, 172.93579f, 48.0f, 168.69f),
                    PathNode.LineTo(48.0f, 148.0f),
                    PathNode.LineTo(24.0f, 148.0f),
                    PathNode.LineTo(24.0f, 172.0f),
                    PathNode.CurveTo(24.0f, 176.41827f, 20.418278f, 180.0f, 16.0f, 180.0f),
                    PathNode.CurveTo(11.581722f, 180.0f, 8.0f, 176.41827f, 8.0f, 172.0f),
                    PathNode.LineTo(8.0f, 108.0f),
                    PathNode.CurveTo(8.0f, 103.58172f, 11.581722f, 100.0f, 16.0f, 100.0f),
                    PathNode.CurveTo(20.418278f, 100.0f, 24.0f, 103.58172f, 24.0f, 108.0f),
                    PathNode.LineTo(24.0f, 132.0f),
                    PathNode.LineTo(48.0f, 132.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(48.0f, 71.163445f, 55.163445f, 64.0f, 64.0f, 64.0f),
                    PathNode.LineTo(124.0f, 64.0f),
                    PathNode.LineTo(124.0f, 40.0f),
                    PathNode.LineTo(100.0f, 40.0f),
                    PathNode.CurveTo(95.58172f, 40.0f, 92.0f, 36.418278f, 92.0f, 32.0f),
                    PathNode.CurveTo(92.0f, 27.581722f, 95.58172f, 24.0f, 100.0f, 24.0f),
                    PathNode.LineTo(164.0f, 24.0f),
                    PathNode.CurveTo(168.41827f, 24.0f, 172.0f, 27.581722f, 172.0f, 32.0f),
                    PathNode.CurveTo(172.0f, 36.418278f, 168.41827f, 40.0f, 164.0f, 40.0f),
                    PathNode.LineTo(140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 64.0f),
                    PathNode.LineTo(180.69f, 64.0f),
                    PathNode.CurveTo(184.93579f, 63.986435f, 189.00975f, 65.67581f, 192.0f, 68.69f),
                    PathNode.LineTo(227.31f, 104.0f),
                    PathNode.LineTo(240.0f, 104.0f),
                    PathNode.CurveTo(248.83656f, 104.0f, 256.0f, 111.163445f, 256.0f, 120.0f),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
