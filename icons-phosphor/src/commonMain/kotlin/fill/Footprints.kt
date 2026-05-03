package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorFillIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.06f, 192.0f),
                    PathNode.LineTo(216.06f, 204.0f),
                    PathNode.CurveTo(216.06f, 223.89882f, 199.92882f, 240.03f, 180.03f, 240.03f),
                    PathNode.CurveTo(160.13118f, 240.03f, 144.0f, 223.89882f, 144.0f, 204.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 187.58173f, 147.58173f, 184.0f, 152.0f, 184.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.CurveTo(210.13211f, 183.98401f, 212.18239f, 184.8198f, 213.69568f, 186.32182f),
                    PathNode.CurveTo(215.20897f, 187.82385f, 216.06006f, 189.86783f, 216.06f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 160.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.CurveTo(43.581722f, 160.0f, 40.0f, 163.58173f, 40.0f, 168.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(40.0f, 199.88223f, 56.11775f, 216.0f, 76.0f, 216.0f),
                    PathNode.CurveTo(95.88225f, 216.0f, 112.0f, 199.88223f, 112.0f, 180.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.CurveTo(112.0f, 163.58173f, 108.41828f, 160.0f, 104.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 16.0f),
                    PathNode.CurveTo(64.36f, 16.0f, 53.07f, 26.31f, 44.2f, 45.0f),
                    PathNode.CurveTo(30.27f, 74.38f, 25.64f, 118.0f, 44.49f, 141.0f),
                    PathNode.CurveTo(46.01208f, 142.85782f, 48.288296f, 143.9335f, 50.69f, 143.93f),
                    PathNode.LineTo(101.24f, 143.93f),
                    PathNode.CurveTo(103.64171f, 143.9335f, 105.91792f, 142.85782f, 107.44f, 141.0f),
                    PathNode.CurveTo(126.29f, 118.0f, 121.66f, 74.35f, 107.73f, 45.0f),
                    PathNode.CurveTo(98.85f, 26.31f, 87.57f, 16.0f, 76.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.8f, 168.0f),
                    PathNode.LineTo(205.35f, 168.0f),
                    PathNode.CurveTo(207.75171f, 168.00351f, 210.02792f, 166.92781f, 211.55f, 165.07f),
                    PathNode.CurveTo(230.4f, 142.07f, 225.77f, 98.42f, 211.84f, 69.07f),
                    PathNode.CurveTo(202.93f, 50.31f, 191.64f, 40.0f, 180.0f, 40.0f),
                    PathNode.CurveTo(168.36f, 40.0f, 157.11f, 50.31f, 148.23f, 69.0f),
                    PathNode.CurveTo(134.3f, 98.38f, 129.67f, 142.0f, 148.52f, 165.0f),
                    PathNode.CurveTo(150.03714f, 166.89491f, 152.33258f, 167.99849f, 154.76f, 168.0f),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
