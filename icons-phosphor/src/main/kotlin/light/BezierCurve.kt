package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorLightIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.44f, 146.2f),
                    PathNode.CurveTo(213.2683f, 120.69061f, 196.78273f, 98.88854f, 173.92f, 86.0f),
                    PathNode.LineTo(240.0f, 86.0f),
                    PathNode.CurveTo(243.3137f, 86.0f, 246.0f, 83.313705f, 246.0f, 80.0f),
                    PathNode.CurveTo(246.0f, 76.686295f, 243.3137f, 74.0f, 240.0f, 74.0f),
                    PathNode.LineTo(157.4f, 74.0f),
                    PathNode.CurveTo(154.56085f, 60.018055f, 142.2673f, 49.969925f, 128.0f, 49.969925f),
                    PathNode.CurveTo(113.73271f, 49.969925f, 101.439156f, 60.018055f, 98.6f, 74.0f),
                    PathNode.LineTo(16.0f, 74.0f),
                    PathNode.CurveTo(12.686292f, 74.0f, 10.0f, 76.686295f, 10.0f, 80.0f),
                    PathNode.CurveTo(10.0f, 83.313705f, 12.686292f, 86.0f, 16.0f, 86.0f),
                    PathNode.LineTo(82.08f, 86.0f),
                    PathNode.CurveTo(59.21727f, 98.88854f, 42.73172f, 120.69061f, 36.56f, 146.2f),
                    PathNode.CurveTo(21.27351f, 147.95978f, 9.797015f, 160.99979f, 9.993363f, 176.38597f),
                    PathNode.CurveTo(10.189712f, 191.77217f, 21.99523f, 204.51508f, 37.321648f, 205.88419f),
                    PathNode.CurveTo(52.648067f, 207.2533f, 66.52529f, 196.80463f, 69.44566f, 181.69685f),
                    PathNode.CurveTo(72.36604f, 166.58907f, 63.38254f, 151.72137f, 48.65f, 147.28f),
                    PathNode.CurveTo(55.544346f, 121.21616f, 74.7346f, 100.16288f, 100.05f, 90.89f),
                    PathNode.CurveTo(104.54137f, 102.407455f, 115.637794f, 109.99057f, 128.0f, 109.99057f),
                    PathNode.CurveTo(140.3622f, 109.99057f, 151.45863f, 102.407455f, 155.95f, 90.89f),
                    PathNode.CurveTo(181.2654f, 100.16288f, 200.45566f, 121.21616f, 207.35f, 147.28f),
                    PathNode.CurveTo(192.61746f, 151.72137f, 183.63396f, 166.58907f, 186.55434f, 181.69685f),
                    PathNode.CurveTo(189.47472f, 196.80463f, 203.35193f, 207.2533f, 218.67834f, 205.88419f),
                    PathNode.CurveTo(234.00479f, 204.51508f, 245.81029f, 191.77217f, 246.00664f, 176.38597f),
                    PathNode.CurveTo(246.20299f, 160.99979f, 234.72649f, 147.95978f, 219.44f, 146.2f),
                    PathNode.Close,
                    PathNode.MoveTo(58.0f, 176.0f),
                    PathNode.CurveTo(58.0f, 185.94113f, 49.941124f, 194.0f, 40.0f, 194.0f),
                    PathNode.CurveTo(30.058874f, 194.0f, 22.0f, 185.94113f, 22.0f, 176.0f),
                    PathNode.CurveTo(22.0f, 166.05887f, 30.058874f, 158.0f, 40.0f, 158.0f),
                    PathNode.CurveTo(49.941124f, 158.0f, 58.0f, 166.05887f, 58.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 98.0f),
                    PathNode.CurveTo(118.05888f, 98.0f, 110.0f, 89.94112f, 110.0f, 80.0f),
                    PathNode.CurveTo(110.0f, 70.05888f, 118.05888f, 62.0f, 128.0f, 62.0f),
                    PathNode.CurveTo(137.94113f, 62.0f, 146.0f, 70.05888f, 146.0f, 80.0f),
                    PathNode.CurveTo(146.0f, 89.94112f, 137.94113f, 98.0f, 128.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 194.0f),
                    PathNode.CurveTo(206.05887f, 194.0f, 198.0f, 185.94113f, 198.0f, 176.0f),
                    PathNode.CurveTo(198.0f, 166.05887f, 206.05887f, 158.0f, 216.0f, 158.0f),
                    PathNode.CurveTo(225.94113f, 158.0f, 234.0f, 166.05887f, 234.0f, 176.0f),
                    PathNode.CurveTo(234.0f, 185.94113f, 225.94113f, 194.0f, 216.0f, 194.0f),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
