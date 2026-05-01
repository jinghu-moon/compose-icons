package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorFillIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 115.31f),
                    PathNode.LineTo(211.31f, 104.0f),
                    PathNode.CurveTo(214.32419f, 101.00975f, 216.01357f, 96.93579f, 216.0f, 92.69f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 39.163445f, 208.83656f, 32.0f, 200.0f, 32.0f),
                    PathNode.LineTo(180.0f, 32.0f),
                    PathNode.CurveTo(175.58173f, 32.0f, 172.0f, 35.581722f, 172.0f, 40.0f),
                    PathNode.LineTo(172.0f, 64.0f),
                    PathNode.LineTo(148.0f, 64.0f),
                    PathNode.LineTo(148.0f, 40.0f),
                    PathNode.CurveTo(148.0f, 35.581722f, 144.41827f, 32.0f, 140.0f, 32.0f),
                    PathNode.LineTo(116.0f, 32.0f),
                    PathNode.CurveTo(111.58172f, 32.0f, 108.0f, 35.581722f, 108.0f, 40.0f),
                    PathNode.LineTo(108.0f, 64.0f),
                    PathNode.LineTo(84.0f, 64.0f),
                    PathNode.LineTo(84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 35.581722f, 80.41828f, 32.0f, 76.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(47.163445f, 32.0f, 40.0f, 39.163445f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 92.69f),
                    PathNode.CurveTo(39.986435f, 96.93579f, 41.67581f, 101.00975f, 44.69f, 104.0f),
                    PathNode.LineTo(56.0f, 115.31f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(35.581722f, 216.0f, 32.0f, 219.58173f, 32.0f, 224.0f),
                    PathNode.CurveTo(32.0f, 228.41827f, 35.581722f, 232.0f, 40.0f, 232.0f),
                    PathNode.LineTo(216.0f, 232.0f),
                    PathNode.CurveTo(220.41827f, 232.0f, 224.0f, 228.41827f, 224.0f, 224.0f),
                    PathNode.CurveTo(224.0f, 219.58173f, 220.41827f, 216.0f, 216.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 168.0f),
                    PathNode.CurveTo(112.0f, 159.16344f, 119.163445f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(136.83656f, 152.0f, 144.0f, 159.16344f, 144.0f, 168.0f),
                    PathNode.LineTo(144.0f, 216.0f),
                    PathNode.LineTo(112.0f, 216.0f),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
