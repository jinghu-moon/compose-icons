package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorRegularIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.85f, 47.12f),
                    PathNode.CurveTo(223.35944f, 39.04765f, 216.92235f, 32.61056f, 208.85f, 32.12f),
                    PathNode.CurveTo(196.27f, 31.37f, 164.12f, 32.52f, 137.44f, 59.19f),
                    PathNode.LineTo(132.69f, 64.0f),
                    PathNode.LineTo(74.36f, 64.0f),
                    PathNode.CurveTo(70.09944f, 63.975994f, 66.00727f, 65.66185f, 63.0f, 68.68f),
                    PathNode.LineTo(28.7f, 103.0f),
                    PathNode.CurveTo(24.409588f, 107.28749f, 22.912468f, 113.63241f, 24.833723f, 119.38558f),
                    PathNode.CurveTo(26.754978f, 125.138756f, 31.764233f, 129.31088f, 37.77f, 130.16f),
                    PathNode.LineTo(76.24f, 135.53f),
                    PathNode.LineTo(120.45f, 179.74f),
                    PathNode.LineTo(125.82f, 218.23f),
                    PathNode.CurveTo(126.662384f, 224.23695f, 130.8411f, 229.24521f, 136.6f, 231.15f),
                    PathNode.CurveTo(138.24426f, 231.69926f, 139.96642f, 231.97954f, 141.7f, 231.98f),
                    PathNode.CurveTo(145.93977f, 231.98796f, 150.00737f, 230.30333f, 153.0f, 227.3f),
                    PathNode.LineTo(187.32f, 193.0f),
                    PathNode.CurveTo(190.33815f, 189.99272f, 192.024f, 185.90056f, 192.0f, 181.64f),
                    PathNode.LineTo(192.0f, 123.31f),
                    PathNode.LineTo(196.77f, 118.54f),
                    PathNode.CurveTo(223.45f, 91.86f, 224.6f, 59.71f, 223.85f, 47.12f),
                    PathNode.Close,
                    PathNode.MoveTo(74.36f, 80.0f),
                    PathNode.LineTo(116.69f, 80.0f),
                    PathNode.LineTo(77.16f, 119.52f),
                    PathNode.LineTo(40.0f, 114.34f),
                    PathNode.Close,
                    PathNode.MoveTo(148.77f, 70.55f),
                    PathNode.CurveTo(164.32161f, 54.902588f, 185.86118f, 46.714573f, 207.88f, 48.08f),
                    PathNode.CurveTo(209.29831f, 70.11202f, 201.124f, 91.681694f, 185.46f, 107.24f),
                    PathNode.LineTo(128.0f, 164.68f),
                    PathNode.LineTo(91.32f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 181.64f),
                    PathNode.LineTo(141.67f, 216.0f),
                    PathNode.LineTo(136.48f, 178.83f),
                    PathNode.LineTo(176.0f, 139.31f),
                    PathNode.Close,
                    PathNode.MoveTo(101.84f, 191.14f),
                    PathNode.CurveTo(97.34f, 201.0f, 82.29f, 224.0f, 40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 173.71f, 55.0f, 158.66f, 64.86f, 154.15f),
                    PathNode.CurveTo(68.88063f, 152.31642f, 73.62641f, 154.08937f, 75.46f, 158.11f),
                    PathNode.CurveTo(77.29359f, 162.13063f, 75.52063f, 166.87642f, 71.5f, 168.71f),
                    PathNode.CurveTo(65.07f, 171.64f, 50.88f, 181.07f, 48.38f, 207.62f),
                    PathNode.CurveTo(74.93f, 205.12f, 84.38f, 190.93f, 87.29f, 184.5f),
                    PathNode.CurveTo(89.12359f, 180.47937f, 93.86937f, 178.70642f, 97.89f, 180.54f),
                    PathNode.CurveTo(101.91064f, 182.37358f, 103.683586f, 187.11937f, 101.85f, 191.14f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
