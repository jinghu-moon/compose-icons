package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorBoldIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(148.37778f, 27.999168f, 144.94899f, 29.63455f, 142.67f, 32.45f),
                    PathNode.LineTo(79.5f, 110.51f),
                    PathNode.LineTo(74.84f, 105.86f),
                    PathNode.CurveTo(71.08904f, 102.10752f, 66.00073f, 99.99927f, 60.695f, 99.99927f),
                    PathNode.CurveTo(55.389267f, 99.99927f, 50.30096f, 102.10752f, 46.55f, 105.86f),
                    PathNode.LineTo(29.86f, 122.55f),
                    PathNode.CurveTo(26.10752f, 126.30096f, 23.999271f, 131.38927f, 23.999271f, 136.695f),
                    PathNode.CurveTo(23.999271f, 142.00073f, 26.10752f, 147.08904f, 29.86f, 150.84f),
                    PathNode.LineTo(29.86f, 150.84f),
                    PathNode.LineTo(45.0f, 166.0f),
                    PathNode.LineTo(23.86f, 187.17f),
                    PathNode.CurveTo(16.05236f, 194.98f, 16.05236f, 207.64f, 23.86f, 215.45f),
                    PathNode.LineTo(40.55f, 232.14f),
                    PathNode.CurveTo(48.359997f, 239.94763f, 61.020004f, 239.94763f, 68.83f, 232.14f),
                    PathNode.LineTo(90.0f, 211.0f),
                    PathNode.LineTo(105.17f, 226.16f),
                    PathNode.CurveTo(108.92096f, 229.91248f, 114.00927f, 232.02074f, 119.315f, 232.02074f),
                    PathNode.CurveTo(124.620735f, 232.02074f, 129.70905f, 229.91248f, 133.46f, 226.16f),
                    PathNode.LineTo(150.15f, 209.47f),
                    PathNode.CurveTo(153.90555f, 205.71863f, 156.01573f, 200.62819f, 156.01573f, 195.32f),
                    PathNode.CurveTo(156.01573f, 190.01181f, 153.90555f, 184.92137f, 150.15f, 181.17f),
                    PathNode.LineTo(145.5f, 176.52f),
                    PathNode.LineTo(223.56f, 113.35f),
                    PathNode.CurveTo(226.37717f, 111.06464f, 228.00932f, 107.62756f, 228.0f, 104.0f),
                    PathNode.LineTo(228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 33.37258f, 222.62741f, 28.0f, 216.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.69f, 212.34f),
                    PathNode.LineTo(43.69f, 201.34f),
                    PathNode.LineTo(62.0f, 183.0f),
                    PathNode.LineTo(73.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(119.3f, 206.34f),
                    PathNode.LineTo(49.65f, 136.7f),
                    PathNode.LineTo(60.7f, 125.7f),
                    PathNode.LineTo(130.35f, 195.35f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 98.27f),
                    PathNode.LineTo(128.42f, 159.44f),
                    PathNode.LineTo(121.0f, 152.0f),
                    PathNode.LineTo(168.51f, 104.5f),
                    PathNode.CurveTo(173.20442f, 99.80559f, 173.20442f, 92.19441f, 168.51f, 87.5f),
                    PathNode.CurveTo(163.81558f, 82.80559f, 156.20442f, 82.80559f, 151.51f, 87.5f),
                    PathNode.LineTo(104.0f, 135.0f),
                    PathNode.LineTo(96.55f, 127.56f),
                    PathNode.LineTo(157.73f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
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
        return _sword!!
    }

private var _sword: ImageVector? = null
