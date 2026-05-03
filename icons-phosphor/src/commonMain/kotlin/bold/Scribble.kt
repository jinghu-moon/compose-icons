package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorBoldIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.5f, 192.49f),
                    PathNode.CurveTo(206.50926f, 194.47827f, 205.39066f, 197.17642f, 205.39066f, 199.99f),
                    PathNode.CurveTo(205.39066f, 202.80359f, 206.50926f, 205.50174f, 208.5f, 207.49f),
                    PathNode.CurveTo(213.19443f, 212.18442f, 213.19443f, 219.79558f, 208.5f, 224.49f),
                    PathNode.CurveTo(203.80557f, 229.18442f, 196.19443f, 229.18442f, 191.5f, 224.49f),
                    PathNode.CurveTo(184.99527f, 217.9959f, 181.34006f, 209.18158f, 181.34006f, 199.99f),
                    PathNode.CurveTo(181.34006f, 190.79842f, 184.99527f, 181.98413f, 191.5f, 175.49f),
                    PathNode.LineTo(200.87f, 166.12f),
                    PathNode.CurveTo(204.55663f, 161.90848f, 204.34589f, 155.5597f, 200.38809f, 151.6019f),
                    PathNode.CurveTo(196.43031f, 147.64412f, 190.08151f, 147.43338f, 185.87f, 151.12f),
                    PathNode.LineTo(119.11f, 217.87f),
                    PathNode.CurveTo(105.579025f, 231.40097f, 83.640976f, 231.40097f, 70.11f, 217.87f),
                    PathNode.CurveTo(56.579025f, 204.33902f, 56.579025f, 182.40097f, 70.11f, 168.87f),
                    PathNode.LineTo(168.87f, 70.12f),
                    PathNode.CurveTo(172.55663f, 65.90847f, 172.34589f, 59.55969f, 168.38809f, 55.601906f),
                    PathNode.CurveTo(164.43031f, 51.644115f, 158.08151f, 51.43338f, 153.87f, 55.12f),
                    PathNode.LineTo(87.11f, 121.86f),
                    PathNode.CurveTo(73.579025f, 135.39098f, 51.640976f, 135.39098f, 38.11f, 121.86f),
                    PathNode.CurveTo(24.579023f, 108.329025f, 24.579023f, 86.390976f, 38.11f, 72.86f),
                    PathNode.LineTo(79.51f, 31.51f),
                    PathNode.CurveTo(84.20442f, 26.81558f, 91.81558f, 26.815578f, 96.51f, 31.51f),
                    PathNode.CurveTo(101.20442f, 36.20442f, 101.20442f, 43.81558f, 96.51f, 48.51f),
                    PathNode.LineTo(55.1f, 89.86f),
                    PathNode.CurveTo(51.41338f, 94.071526f, 51.624115f, 100.42031f, 55.5819f, 104.3781f),
                    PathNode.CurveTo(59.53969f, 108.33589f, 65.88847f, 108.54662f, 70.1f, 104.86f),
                    PathNode.LineTo(136.86f, 38.11f),
                    PathNode.CurveTo(150.39098f, 24.579023f, 172.32903f, 24.579023f, 185.86f, 38.11f),
                    PathNode.CurveTo(199.39098f, 51.640976f, 199.39098f, 73.579025f, 185.86f, 87.11f),
                    PathNode.LineTo(87.11f, 185.86f),
                    PathNode.CurveTo(83.42338f, 190.07153f, 83.63412f, 196.42032f, 87.5919f, 200.3781f),
                    PathNode.CurveTo(91.54969f, 204.33588f, 97.898476f, 204.54662f, 102.11f, 200.86f),
                    PathNode.LineTo(168.86f, 134.11f),
                    PathNode.CurveTo(182.39098f, 120.579025f, 204.32903f, 120.579025f, 217.86f, 134.11f),
                    PathNode.CurveTo(231.39098f, 147.64098f, 231.39098f, 169.57903f, 217.86f, 183.11f),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
