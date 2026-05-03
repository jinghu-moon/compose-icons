package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorFillIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(101.85f, 191.14f),
                    PathNode.CurveTo(97.34f, 201.0f, 82.29f, 224.0f, 40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 173.71f, 55.0f, 158.66f, 64.86f, 154.15f),
                    PathNode.CurveTo(68.88063f, 152.31642f, 73.62641f, 154.08937f, 75.46f, 158.11f),
                    PathNode.CurveTo(77.29359f, 162.13063f, 75.52063f, 166.87642f, 71.5f, 168.71f),
                    PathNode.CurveTo(65.07f, 171.64f, 50.88f, 181.07f, 48.38f, 207.62f),
                    PathNode.CurveTo(74.93f, 205.12f, 84.38f, 190.93f, 87.29f, 184.5f),
                    PathNode.CurveTo(89.12359f, 180.47937f, 93.86937f, 178.70642f, 97.89f, 180.54f),
                    PathNode.CurveTo(101.91064f, 182.37358f, 103.683586f, 187.11937f, 101.85f, 191.14f),
                    PathNode.Close,
                    PathNode.MoveTo(223.85f, 47.14f),
                    PathNode.CurveTo(223.35944f, 39.06765f, 216.92235f, 32.63056f, 208.85f, 32.14f),
                    PathNode.CurveTo(196.27f, 31.39f, 164.12f, 32.54f, 137.45f, 59.21f),
                    PathNode.LineTo(137.45f, 59.21f),
                    PathNode.LineTo(88.0f, 108.7f),
                    PathNode.CurveTo(84.87683f, 111.82869f, 79.80869f, 111.83317f, 76.68f, 108.71f),
                    PathNode.CurveTo(73.55131f, 105.58683f, 73.54683f, 100.5187f, 76.67f, 97.39f),
                    PathNode.LineTo(103.23f, 70.82f),
                    PathNode.CurveTo(104.36692f, 69.67632f, 104.70588f, 67.96178f, 104.08967f, 66.47151f),
                    PathNode.CurveTo(103.47346f, 64.981255f, 102.02262f, 64.00677f, 100.41f, 64.0f),
                    PathNode.LineTo(74.35f, 64.0f),
                    PathNode.CurveTo(70.09269f, 63.977554f, 66.0042f, 65.663376f, 63.0f, 68.68f),
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
                    PathNode.CurveTo(190.32718f, 189.9895f, 192.0113f, 185.90514f, 192.0f, 181.65f),
                    PathNode.LineTo(192.0f, 155.59f),
                    PathNode.CurveTo(191.99724f, 153.97299f, 191.02116f, 152.5167f, 189.52655f, 151.8996f),
                    PathNode.CurveTo(188.03192f, 151.28249f, 186.31276f, 151.62596f, 185.17f, 152.77f),
                    PathNode.LineTo(158.6f, 179.33f),
                    PathNode.CurveTo(157.0291f, 180.9025f, 154.8748f, 181.75056f, 152.6535f, 181.6709f),
                    PathNode.CurveTo(150.43222f, 181.59122f, 148.34421f, 180.591f, 146.89f, 178.91f),
                    PathNode.CurveTo(144.16888f, 175.61832f, 144.42992f, 170.78918f, 147.49f, 167.81f),
                    PathNode.LineTo(196.76f, 118.54f),
                    PathNode.LineTo(196.76f, 118.54f),
                    PathNode.CurveTo(223.45f, 91.86f, 224.6f, 59.71f, 223.85f, 47.12f),
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
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
