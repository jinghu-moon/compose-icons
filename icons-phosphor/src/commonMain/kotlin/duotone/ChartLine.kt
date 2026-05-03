package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorDuotoneIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(216.83656f, 48.0f, 224.0f, 55.163445f, 224.0f, 64.0f),
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
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(27.581722f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.LineTo(24.0f, 48.0f),
                    PathNode.CurveTo(24.0f, 43.581722f, 27.581722f, 40.0f, 32.0f, 40.0f),
                    PathNode.CurveTo(36.418278f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 142.37f),
                    PathNode.LineTo(90.73f, 98.0f),
                    PathNode.CurveTo(93.57507f, 95.50949f, 97.77532f, 95.35099f, 100.8f, 97.62f),
                    PathNode.LineTo(159.61f, 141.73f),
                    PathNode.LineTo(218.73f, 90.0f),
                    PathNode.CurveTo(220.84216f, 87.90918f, 223.93932f, 87.16158f, 226.7727f, 88.058624f),
                    PathNode.CurveTo(229.60611f, 88.95567f, 231.70868f, 91.3495f, 232.2327f, 94.27494f),
                    PathNode.CurveTo(232.75674f, 97.20038f, 231.61583f, 100.17521f, 229.27f, 102.0f),
                    PathNode.LineTo(165.27f, 158.0f),
                    PathNode.CurveTo(162.42493f, 160.49051f, 158.22467f, 160.64902f, 155.2f, 158.38f),
                    PathNode.LineTo(96.39f, 114.29f),
                    PathNode.LineTo(40.0f, 163.63f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
