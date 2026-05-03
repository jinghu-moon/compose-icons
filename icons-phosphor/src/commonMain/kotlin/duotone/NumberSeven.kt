package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorDuotoneIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
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
                    PathNode.MoveTo(175.66f, 50.3f),
                    PathNode.LineTo(127.66f, 210.3f),
                    PathNode.CurveTo(126.31402f, 214.43233f, 121.915146f, 216.73424f, 117.75272f, 215.48442f),
                    PathNode.CurveTo(113.590294f, 214.2346f, 111.18703f, 209.89029f, 112.34f, 205.7f),
                    PathNode.LineTo(157.25f, 56.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(83.58172f, 56.0f, 80.0f, 52.418278f, 80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 43.581722f, 83.58172f, 40.0f, 88.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(170.52867f, 40.00071f, 172.90816f, 41.196896f, 174.41714f, 43.225967f),
                    PathNode.CurveTo(175.92615f, 45.255035f, 176.387f, 47.878082f, 175.66f, 50.3f),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
