package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorBoldIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.15f, 65.46f),
                    PathNode.LineTo(246.08f, 65.38f),
                    PathNode.LineTo(222.15f, 41.85f),
                    PathNode.CurveTo(214.35954f, 34.061787f, 201.738f, 34.039433f, 193.92f, 41.8f),
                    PathNode.LineTo(103.92f, 130.63f),
                    PathNode.LineTo(70.06f, 97.78f),
                    PathNode.CurveTo(62.236095f, 90.04098f, 49.629887f, 90.07673f, 41.85f, 97.86f),
                    PathNode.LineTo(17.85f, 121.86f),
                    PathNode.CurveTo(10.055681f, 129.6677f, 10.055681f, 142.3123f, 17.85f, 150.12f),
                    PathNode.LineTo(89.47f, 222.12f),
                    PathNode.CurveTo(93.22096f, 225.87248f, 98.309265f, 227.98074f, 103.615f, 227.98074f),
                    PathNode.CurveTo(108.92073f, 227.98074f, 114.00904f, 225.87248f, 117.76f, 222.12f),
                    PathNode.LineTo(246.15f, 93.74f),
                    PathNode.CurveTo(253.95764f, 85.93f, 253.95764f, 73.27f, 246.15f, 65.46f),
                    PathNode.Close,
                    PathNode.MoveTo(103.61f, 202.33f),
                    PathNode.LineTo(37.64f, 136.0f),
                    PathNode.LineTo(56.0f, 117.61f),
                    PathNode.LineTo(95.65f, 156.0f),
                    PathNode.CurveTo(100.335396f, 160.5385f, 107.7881f, 160.50296f, 112.43f, 155.92f),
                    PathNode.LineTo(208.0f, 61.61f),
                    PathNode.LineTo(226.32f, 79.61f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
