package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorFillIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 96.0f),
                    PathNode.LineTo(256.0f, 160.0f),
                    PathNode.CurveTo(256.0f, 164.41827f, 252.41827f, 168.0f, 248.0f, 168.0f),
                    PathNode.CurveTo(243.58173f, 168.0f, 240.0f, 164.41827f, 240.0f, 160.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 91.58172f, 243.58173f, 88.0f, 248.0f, 88.0f),
                    PathNode.CurveTo(252.41827f, 88.0f, 256.0f, 91.58172f, 256.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 189.25484f, 213.25484f, 200.0f, 200.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(18.745167f, 200.0f, 8.0f, 189.25484f, 8.0f, 176.0f),
                    PathNode.LineTo(8.0f, 80.0f),
                    PathNode.CurveTo(8.0f, 66.74516f, 18.745167f, 56.0f, 32.0f, 56.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.CurveTo(213.25484f, 56.0f, 224.0f, 66.74516f, 224.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.81f, 123.79f),
                    PathNode.CurveTo(137.35045f, 121.4316f, 134.7735f, 119.99745f, 132.0f, 120.0f),
                    PathNode.LineTo(112.94f, 120.0f),
                    PathNode.LineTo(123.16f, 99.58f),
                    PathNode.CurveTo(125.13718f, 95.62564f, 123.534355f, 90.81718f, 119.58f, 88.84f),
                    PathNode.CurveTo(115.62564f, 86.86282f, 110.81718f, 88.465645f, 108.84f, 92.42f),
                    PathNode.LineTo(92.84f, 124.42f),
                    PathNode.CurveTo(91.598595f, 126.90083f, 91.731f, 129.8477f, 93.189896f, 132.2072f),
                    PathNode.CurveTo(94.64879f, 134.56671f, 97.22591f, 136.00198f, 100.0f, 136.0f),
                    PathNode.LineTo(119.06f, 136.0f),
                    PathNode.LineTo(108.84f, 156.42f),
                    PathNode.CurveTo(106.86282f, 160.37436f, 108.465645f, 165.18282f, 112.42f, 167.16f),
                    PathNode.CurveTo(116.37436f, 169.13718f, 121.18282f, 167.53436f, 123.16f, 163.58f),
                    PathNode.LineTo(139.16f, 131.58f),
                    PathNode.CurveTo(140.40242f, 129.0984f, 140.26996f, 126.150185f, 138.81f, 123.79f),
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
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
