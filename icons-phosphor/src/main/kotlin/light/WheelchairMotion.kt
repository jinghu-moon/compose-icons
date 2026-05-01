package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorLightIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 78.0f),
                    PathNode.CurveTo(192.56854f, 78.0f, 206.0f, 64.56854f, 206.0f, 48.0f),
                    PathNode.CurveTo(206.0f, 31.431458f, 192.56854f, 18.0f, 176.0f, 18.0f),
                    PathNode.CurveTo(159.43146f, 18.0f, 146.0f, 31.431458f, 146.0f, 48.0f),
                    PathNode.CurveTo(146.0f, 64.56854f, 159.43146f, 78.0f, 176.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 30.0f),
                    PathNode.CurveTo(185.94113f, 30.0f, 194.0f, 38.058876f, 194.0f, 48.0f),
                    PathNode.CurveTo(194.0f, 57.941124f, 185.94113f, 66.0f, 176.0f, 66.0f),
                    PathNode.CurveTo(166.05887f, 66.0f, 158.0f, 57.941124f, 158.0f, 48.0f),
                    PathNode.CurveTo(158.0f, 38.058876f, 166.05887f, 30.0f, 176.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 168.0f),
                    PathNode.CurveTo(166.0f, 202.24165f, 138.24165f, 230.0f, 104.0f, 230.0f),
                    PathNode.CurveTo(69.75835f, 230.0f, 42.0f, 202.24165f, 42.0f, 168.0f),
                    PathNode.CurveTo(42.0f, 133.75835f, 69.75835f, 106.0f, 104.0f, 106.0f),
                    PathNode.CurveTo(107.313705f, 106.0f, 110.0f, 108.686295f, 110.0f, 112.0f),
                    PathNode.CurveTo(110.0f, 115.313705f, 107.313705f, 118.0f, 104.0f, 118.0f),
                    PathNode.CurveTo(76.385765f, 118.0f, 54.0f, 140.38576f, 54.0f, 168.0f),
                    PathNode.CurveTo(54.0f, 195.61424f, 76.385765f, 218.0f, 104.0f, 218.0f),
                    PathNode.CurveTo(131.61424f, 218.0f, 154.0f, 195.61424f, 154.0f, 168.0f),
                    PathNode.CurveTo(154.0f, 164.6863f, 156.6863f, 162.0f, 160.0f, 162.0f),
                    PathNode.CurveTo(163.3137f, 162.0f, 166.0f, 164.6863f, 166.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.64f, 132.2f),
                    PathNode.CurveTo(205.7842f, 133.5954f, 206.23958f, 135.43167f, 205.88f, 137.2f),
                    PathNode.LineTo(189.88f, 217.2f),
                    PathNode.CurveTo(189.30968f, 219.994f, 186.85162f, 222.00058f, 184.0f, 222.0f),
                    PathNode.CurveTo(183.60036f, 221.9992f, 183.20174f, 221.95901f, 182.81f, 221.88f),
                    PathNode.CurveTo(179.56349f, 221.22693f, 177.45993f, 218.06711f, 178.11f, 214.82f),
                    PathNode.LineTo(192.68f, 142.0f),
                    PathNode.LineTo(128.0f, 142.0f),
                    PathNode.CurveTo(125.85572f, 142.00137f, 123.873695f, 140.85832f, 122.800964f, 139.00166f),
                    PathNode.CurveTo(121.728226f, 137.145f, 121.72786f, 134.857f, 122.8f, 133.0f),
                    PathNode.LineTo(143.87f, 96.32f),
                    PathNode.CurveTo(114.37627f, 79.92939f, 77.85522f, 83.266075f, 51.82f, 104.73f),
                    PathNode.CurveTo(50.173775f, 106.15093f, 47.88755f, 106.5699f, 45.844437f, 105.825035f),
                    PathNode.CurveTo(43.80132f, 105.08018f, 42.32117f, 103.28811f, 41.975727f, 101.14107f),
                    PathNode.CurveTo(41.630287f, 98.99402f, 42.47363f, 96.828125f, 44.18f, 95.48f),
                    PathNode.CurveTo(75.863335f, 69.33696f, 120.852394f, 66.79392f, 155.28f, 89.2f),
                    PathNode.CurveTo(157.93532f, 90.939026f, 158.77681f, 94.44527f, 157.2f, 97.2f),
                    PathNode.LineTo(138.37f, 130.0f),
                    PathNode.LineTo(200.0f, 130.0f),
                    PathNode.CurveTo(201.79819f, 130.00098f, 203.50114f, 130.80841f, 204.64f, 132.2f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
