package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorBoldIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 124.0f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.CurveTo(20.954306f, 124.0f, 12.0f, 132.9543f, 12.0f, 144.0f),
                    PathNode.LineTo(12.0f, 176.0f),
                    PathNode.CurveTo(12.0f, 187.0457f, 20.954306f, 196.0f, 32.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(235.0457f, 196.0f, 244.0f, 187.0457f, 244.0f, 176.0f),
                    PathNode.LineTo(244.0f, 144.0f),
                    PathNode.CurveTo(244.0f, 132.9543f, 235.0457f, 124.0f, 224.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 148.0f),
                    PathNode.LineTo(76.0f, 148.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.LineTo(36.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 172.0f),
                    PathNode.LineTo(100.0f, 172.0f),
                    PathNode.LineTo(100.0f, 148.0f),
                    PathNode.LineTo(220.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(201.67f, 55.89f),
                    PathNode.CurveTo(209.2f, 43.18f, 208.79f, 36.26f, 206.74f, 34.79f),
                    PathNode.CurveTo(201.18213f, 31.791752f, 198.89903f, 24.998993f, 201.51778f, 19.252544f),
                    PathNode.CurveTo(204.13652f, 13.506096f, 210.76085f, 10.772571f, 216.67f, 13.0f),
                    PathNode.CurveTo(223.29037f, 16.082428f, 228.30179f, 21.816513f, 230.47f, 28.79f),
                    PathNode.CurveTo(234.07f, 39.71f, 231.33f, 52.96f, 222.33f, 68.17f),
                    PathNode.CurveTo(214.8f, 80.87f, 215.21f, 87.8f, 217.26f, 89.27f),
                    PathNode.CurveTo(223.10577f, 92.11837f, 225.61911f, 99.10469f, 222.92761f, 105.02434f),
                    PathNode.CurveTo(220.23613f, 110.94398f, 213.3193f, 113.64269f, 207.33f, 111.11f),
                    PathNode.CurveTo(200.71727f, 108.01742f, 195.70929f, 102.287285f, 193.53f, 95.32f),
                    PathNode.CurveTo(189.93f, 84.34f, 192.67f, 71.09f, 201.67f, 55.89f),
                    PathNode.Close,
                    PathNode.MoveTo(153.67f, 55.89f),
                    PathNode.CurveTo(161.2f, 43.18f, 160.79f, 36.26f, 158.74f, 34.79f),
                    PathNode.CurveTo(153.18213f, 31.791752f, 150.89903f, 24.998993f, 153.51778f, 19.252544f),
                    PathNode.CurveTo(156.13652f, 13.506096f, 162.76085f, 10.772571f, 168.67f, 13.0f),
                    PathNode.CurveTo(175.29037f, 16.082428f, 180.30179f, 21.816513f, 182.47f, 28.79f),
                    PathNode.CurveTo(186.07f, 39.71f, 183.33f, 52.96f, 174.33f, 68.17f),
                    PathNode.CurveTo(166.8f, 80.87f, 167.21f, 87.8f, 169.26f, 89.27f),
                    PathNode.CurveTo(175.10577f, 92.11837f, 177.61911f, 99.10469f, 174.92761f, 105.02434f),
                    PathNode.CurveTo(172.23613f, 110.94398f, 165.3193f, 113.64269f, 159.33f, 111.11f),
                    PathNode.CurveTo(152.71727f, 108.01742f, 147.70929f, 102.287285f, 145.53f, 95.32f),
                    PathNode.CurveTo(141.93f, 84.34f, 144.67f, 71.09f, 153.67f, 55.89f),
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
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
