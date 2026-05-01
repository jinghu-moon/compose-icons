package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorFillIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 188.41827f, 140.41827f, 192.0f, 136.0f, 192.0f),
                    PathNode.CurveTo(131.58173f, 192.0f, 128.0f, 188.41827f, 128.0f, 184.0f),
                    PathNode.LineTo(128.0f, 84.94f),
                    PathNode.LineTo(107.58f, 95.16f),
                    PathNode.CurveTo(103.62564f, 97.13718f, 98.81718f, 95.534355f, 96.84f, 91.58f),
                    PathNode.CurveTo(94.86282f, 87.62564f, 96.465645f, 82.81718f, 100.42f, 80.84f),
                    PathNode.LineTo(132.42f, 64.84f),
                    PathNode.CurveTo(134.90083f, 63.59859f, 137.8477f, 63.731f, 140.2072f, 65.189896f),
                    PathNode.CurveTo(142.56671f, 66.64879f, 144.00198f, 69.22591f, 144.0f, 72.0f),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
