package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorBoldIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 100.0f),
                    PathNode.LineTo(219.22f, 100.0f),
                    PathNode.CurveTo(213.21814f, 54.202473f, 174.18913f, 19.954563f, 128.0f, 19.954563f),
                    PathNode.CurveTo(81.81087f, 19.954563f, 42.781857f, 54.202473f, 36.78f, 100.0f),
                    PathNode.LineTo(32.0f, 100.0f),
                    PathNode.CurveTo(25.372583f, 100.0f, 20.0f, 105.37258f, 20.0f, 112.0f),
                    PathNode.CurveTo(20.07339f, 151.39172f, 41.514225f, 187.64204f, 76.0f, 206.68f),
                    PathNode.LineTo(76.0f, 208.0f),
                    PathNode.CurveTo(76.0f, 219.0457f, 84.95431f, 228.0f, 96.0f, 228.0f),
                    PathNode.LineTo(160.0f, 228.0f),
                    PathNode.CurveTo(171.0457f, 228.0f, 180.0f, 219.0457f, 180.0f, 208.0f),
                    PathNode.LineTo(180.0f, 206.68f),
                    PathNode.CurveTo(214.48578f, 187.64204f, 235.9266f, 151.39172f, 236.0f, 112.0f),
                    PathNode.CurveTo(236.0f, 105.37258f, 230.62741f, 100.0f, 224.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.29f, 60.06f),
                    PathNode.CurveTo(151.94365f, 68.30403f, 136.80447f, 82.33324f, 127.19f, 100.0f),
                    PathNode.LineTo(106.0f, 100.0f),
                    PathNode.CurveTo(117.061356f, 75.6853f, 141.28755f, 60.0555f, 168.0f, 60.0f),
                    PathNode.CurveTo(168.76f, 60.0f, 169.52f, 60.0f, 170.29f, 60.06f),
                    PathNode.Close,
                    PathNode.MoveTo(187.51f, 79.14f),
                    PathNode.CurveTo(191.10846f, 85.63937f, 193.61195f, 92.68701f, 194.92f, 100.0f),
                    PathNode.LineTo(156.13f, 100.0f),
                    PathNode.CurveTo(164.41289f, 90.22584f, 175.29172f, 82.99409f, 187.51f, 79.14f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(128.83f, 44.0f, 129.65f, 44.0f, 130.48f, 44.06f),
                    PathNode.CurveTo(106.60267f, 54.76105f, 88.389206f, 75.093544f, 80.37f, 100.0f),
                    PathNode.LineTo(61.08f, 100.0f),
                    PathNode.CurveTo(66.926865f, 67.61668f, 95.09312f, 44.046597f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.0f, 188.39f),
                    PathNode.CurveTo(158.73422f, 190.34521f, 155.9995f, 194.60748f, 156.0f, 199.3f),
                    PathNode.LineTo(156.0f, 204.0f),
                    PathNode.LineTo(100.0f, 204.0f),
                    PathNode.LineTo(100.0f, 199.3f),
                    PathNode.CurveTo(100.0005f, 194.60748f, 97.26577f, 190.34521f, 93.0f, 188.39f),
                    PathNode.CurveTo(67.099205f, 176.44798f, 48.990856f, 152.222f, 44.87f, 124.0f),
                    PathNode.LineTo(211.13f, 124.0f),
                    PathNode.CurveTo(207.00914f, 152.222f, 188.90079f, 176.44798f, 163.0f, 188.39f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
