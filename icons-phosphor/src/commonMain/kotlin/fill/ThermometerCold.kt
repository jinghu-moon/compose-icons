package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorFillIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.91f, 77.72f),
                    PathNode.LineTo(228.91f, 84.21f),
                    PathNode.LineTo(241.25f, 101.21f),
                    PathNode.CurveTo(243.02544f, 103.51686f, 243.40768f, 106.60605f, 242.2481f, 109.276085f),
                    PathNode.CurveTo(241.0885f, 111.94613f, 238.5701f, 113.775566f, 235.67236f, 114.05289f),
                    PathNode.CurveTo(232.77464f, 114.33021f, 229.95496f, 113.011635f, 228.31f, 110.61f),
                    PathNode.LineTo(216.0f, 93.61f),
                    PathNode.LineTo(203.66f, 110.61f),
                    PathNode.CurveTo(201.01788f, 114.04297f, 196.12326f, 114.74922f, 192.61842f, 112.20321f),
                    PathNode.CurveTo(189.1136f, 109.6572f, 188.27203f, 104.784004f, 190.72f, 101.21f),
                    PathNode.LineTo(203.06f, 84.21f),
                    PathNode.LineTo(183.06f, 77.72f),
                    PathNode.CurveTo(178.85712f, 76.35586f, 176.55586f, 71.84289f, 177.92f, 67.64f),
                    PathNode.CurveTo(179.28415f, 63.437115f, 183.79712f, 61.135857f, 188.0f, 62.5f),
                    PathNode.LineTo(208.0f, 69.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 43.581722f, 211.58173f, 40.0f, 216.0f, 40.0f),
                    PathNode.CurveTo(220.41827f, 40.0f, 224.0f, 43.581722f, 224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 69.0f),
                    PathNode.LineTo(244.0f, 62.51f),
                    PathNode.CurveTo(248.20288f, 61.143097f, 252.7181f, 63.442112f, 254.085f, 67.645f),
                    PathNode.CurveTo(255.4519f, 71.847885f, 253.1529f, 76.3631f, 248.95f, 77.73f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 192.0f),
                    PathNode.CurveTo(175.97935f, 218.57603f, 157.28235f, 241.47733f, 131.2479f, 246.81526f),
                    PathNode.CurveTo(105.21345f, 252.1532f, 79.012825f, 238.45741f, 68.535545f, 214.0338f),
                    PathNode.CurveTo(58.05826f, 189.6102f, 66.19032f, 161.18633f, 88.0f, 146.0f),
                    PathNode.LineTo(88.0f, 40.0f),
                    PathNode.CurveTo(88.0f, 22.326887f, 102.32689f, 8.0f, 120.0f, 8.0f),
                    PathNode.CurveTo(137.67311f, 8.0f, 152.0f, 22.326887f, 152.0f, 40.0f),
                    PathNode.LineTo(152.0f, 146.0f),
                    PathNode.CurveTo(167.01884f, 156.50551f, 175.97507f, 173.67159f, 176.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.82f, 184.0f),
                    PathNode.LineTo(159.18f, 184.0f),
                    PathNode.CurveTo(156.87608f, 172.78952f, 149.89862f, 163.09457f, 140.0f, 157.35f),
                    PathNode.CurveTo(137.52423f, 155.92062f, 135.99936f, 153.27876f, 136.0f, 150.42f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 31.163445f, 128.83656f, 24.0f, 120.0f, 24.0f),
                    PathNode.CurveTo(111.163445f, 24.0f, 104.0f, 31.163445f, 104.0f, 40.0f),
                    PathNode.LineTo(104.0f, 150.42f),
                    PathNode.CurveTo(104.00064f, 153.27876f, 102.47576f, 155.92062f, 100.0f, 157.35f),
                    PathNode.CurveTo(90.10138f, 163.09457f, 83.123924f, 172.78952f, 80.82f, 184.0f),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
