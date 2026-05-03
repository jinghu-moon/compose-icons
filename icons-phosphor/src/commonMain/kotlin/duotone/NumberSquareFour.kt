package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorDuotoneIcon(
            name = "NumberSquareFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(216.0f, 212.41827f, 212.41827f, 216.0f, 208.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(40.0f, 43.581722f, 43.581722f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
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
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 144.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(151.9967f, 76.58522f, 149.8263f, 73.54899f, 146.59636f, 72.44074f),
                    PathNode.CurveTo(143.36642f, 71.3325f, 139.78911f, 72.39659f, 137.69f, 75.09f),
                    PathNode.LineTo(81.69f, 147.09f),
                    PathNode.CurveTo(79.81558f, 149.50114f, 79.477486f, 152.76915f, 80.81859f, 155.51299f),
                    PathNode.CurveTo(82.15968f, 158.25682f, 84.94596f, 159.99771f, 88.0f, 160.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 180.41827f, 139.58173f, 184.0f, 144.0f, 184.0f),
                    PathNode.CurveTo(148.41827f, 184.0f, 152.0f, 180.41827f, 152.0f, 176.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.CurveTo(164.41827f, 160.0f, 168.0f, 156.41827f, 168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 147.58173f, 164.41827f, 144.0f, 160.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 144.0f),
                    PathNode.LineTo(104.36f, 144.0f),
                    PathNode.LineTo(136.0f, 103.32f),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
