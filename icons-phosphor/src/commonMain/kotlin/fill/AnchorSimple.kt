package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorFillIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.CurveTo(232.0f, 177.4376f, 185.4376f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(70.562386f, 224.0f, 24.0f, 177.4376f, 24.0f, 120.0f),
                    PathNode.CurveTo(24.0f, 115.58172f, 27.581722f, 112.0f, 32.0f, 112.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(60.418278f, 112.0f, 64.0f, 115.58172f, 64.0f, 120.0f),
                    PathNode.CurveTo(64.0f, 124.41828f, 60.418278f, 128.0f, 56.0f, 128.0f),
                    PathNode.LineTo(40.36f, 128.0f),
                    PathNode.CurveTo(44.28035f, 170.25201f, 77.74749f, 203.71495f, 120.0f, 207.63f),
                    PathNode.LineTo(120.0f, 90.83f),
                    PathNode.CurveTo(106.67699f, 86.85784f, 98.286224f, 73.71174f, 100.293335f, 59.954838f),
                    PathNode.CurveTo(102.30044f, 46.197937f, 114.09746f, 35.997185f, 128.0f, 35.997185f),
                    PathNode.CurveTo(141.90254f, 35.997185f, 153.69957f, 46.197937f, 155.70667f, 59.954838f),
                    PathNode.CurveTo(157.71378f, 73.71174f, 149.32301f, 86.85784f, 136.0f, 90.83f),
                    PathNode.LineTo(136.0f, 207.63f),
                    PathNode.CurveTo(178.25252f, 203.71495f, 211.71965f, 170.25201f, 215.64f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(195.58173f, 128.0f, 192.0f, 124.41828f, 192.0f, 120.0f),
                    PathNode.CurveTo(192.0f, 115.58172f, 195.58173f, 112.0f, 200.0f, 112.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(228.41827f, 112.0f, 232.0f, 115.58172f, 232.0f, 120.0f),
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
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
