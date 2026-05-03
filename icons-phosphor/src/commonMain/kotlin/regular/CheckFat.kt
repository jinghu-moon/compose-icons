package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorRegularIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.28f, 68.24f),
                    PathNode.LineTo(219.28f, 44.68f),
                    PathNode.CurveTo(213.03592f, 38.456516f, 202.93408f, 38.456516f, 196.69f, 44.68f),
                    PathNode.LineTo(104.0f, 136.23f),
                    PathNode.LineTo(67.31f, 100.63f),
                    PathNode.CurveTo(61.05332f, 94.42696f, 50.959152f, 94.44931f, 44.73f, 100.68f),
                    PathNode.LineTo(20.73f, 124.68f),
                    PathNode.CurveTo(14.493214f, 130.92639f, 14.493214f, 141.04361f, 20.73f, 147.29f),
                    PathNode.LineTo(92.35f, 219.29f),
                    PathNode.CurveTo(95.350685f, 222.29137f, 99.420906f, 223.97758f, 103.665f, 223.97758f),
                    PathNode.CurveTo(107.909096f, 223.97758f, 111.97932f, 222.29137f, 114.98f, 219.29f),
                    PathNode.LineTo(243.33f, 90.91f),
                    PathNode.CurveTo(246.33702f, 87.90106f, 248.02202f, 83.81853f, 248.01263f, 79.56461f),
                    PathNode.CurveTo(248.00325f, 75.31071f, 246.30026f, 71.23564f, 243.28f, 68.24f),
                    PathNode.Close,
                    PathNode.MoveTo(103.62f, 208.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(56.029125f, 112.024086f, 56.055912f, 112.05087f, 56.08f, 112.08f),
                    PathNode.LineTo(98.43f, 153.17f),
                    PathNode.CurveTo(101.53953f, 156.2126f, 106.510475f, 156.2126f, 109.62f, 153.17f),
                    PathNode.LineTo(208.06f, 56.0f),
                    PathNode.LineTo(232.0f, 79.6f),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
