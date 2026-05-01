package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorLightIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 70.0f),
                    PathNode.CurveTo(144.56854f, 70.0f, 158.0f, 56.568542f, 158.0f, 40.0f),
                    PathNode.CurveTo(158.0f, 23.431458f, 144.56854f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(111.43146f, 10.0f, 98.0f, 23.431458f, 98.0f, 40.0f),
                    PathNode.CurveTo(98.0f, 56.568542f, 111.43146f, 70.0f, 128.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 22.0f),
                    PathNode.CurveTo(137.94113f, 22.0f, 146.0f, 30.058874f, 146.0f, 40.0f),
                    PathNode.CurveTo(146.0f, 49.941124f, 137.94113f, 58.0f, 128.0f, 58.0f),
                    PathNode.CurveTo(118.05888f, 58.0f, 110.0f, 49.941124f, 110.0f, 40.0f),
                    PathNode.CurveTo(110.0f, 30.058874f, 118.05888f, 22.0f, 128.0f, 22.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.88f, 135.42f),
                    PathNode.LineTo(171.67f, 84.16f),
                    PathNode.CurveTo(165.97559f, 77.701324f, 157.78052f, 74.00079f, 149.17f, 74.0f),
                    PathNode.LineTo(106.83f, 74.0f),
                    PathNode.CurveTo(98.22106f, 73.99826f, 90.026245f, 77.69504f, 84.33f, 84.15f),
                    PathNode.LineTo(39.12f, 135.42f),
                    PathNode.CurveTo(32.05628f, 142.41745f, 32.002552f, 153.81628f, 39.0f, 160.88f),
                    PathNode.CurveTo(45.997448f, 167.94373f, 57.39628f, 167.99745f, 64.46f, 161.0f),
                    PathNode.LineTo(85.57f, 144.07f),
                    PathNode.LineTo(67.44f, 212.92f),
                    PathNode.CurveTo(63.473923f, 221.93277f, 67.48601f, 232.45967f, 76.44469f, 236.54648f),
                    PathNode.CurveTo(85.403366f, 240.63327f, 95.983215f, 236.76297f, 100.19f, 227.86f),
                    PathNode.LineTo(128.0f, 180.0f),
                    PathNode.LineTo(155.81f, 227.91f),
                    PathNode.CurveTo(160.01678f, 236.81297f, 170.59663f, 240.68327f, 179.55531f, 236.59647f),
                    PathNode.CurveTo(188.514f, 232.50967f, 192.52608f, 221.98277f, 188.56f, 212.97f),
                    PathNode.LineTo(170.43f, 144.1f),
                    PathNode.LineTo(191.54f, 161.0f),
                    PathNode.CurveTo(198.63838f, 167.74785f, 209.82921f, 167.58205f, 216.72455f, 160.62683f),
                    PathNode.CurveTo(223.61989f, 153.67163f, 223.68896f, 142.4798f, 216.88f, 135.44f),
                    PathNode.Close,
                    PathNode.MoveTo(208.25f, 152.24f),
                    PathNode.CurveTo(207.12459f, 153.36667f, 205.59746f, 153.99973f, 204.005f, 153.99973f),
                    PathNode.CurveTo(202.41254f, 153.99973f, 200.8854f, 153.36667f, 199.76f, 152.24f),
                    PathNode.CurveTo(199.60858f, 152.08058f, 199.44473f, 151.93346f, 199.27f, 151.8f),
                    PathNode.LineTo(163.76f, 123.32f),
                    PathNode.CurveTo(161.74136f, 121.69955f, 158.91107f, 121.5564f, 156.73924f, 122.964905f),
                    PathNode.CurveTo(154.56743f, 124.37341f, 153.54376f, 127.01598f, 154.2f, 129.52f),
                    PathNode.LineTo(177.07f, 216.45f),
                    PathNode.CurveTo(177.16995f, 216.79152f, 177.2936f, 217.12567f, 177.44f, 217.45f),
                    PathNode.CurveTo(178.84004f, 220.45442f, 177.53943f, 224.02496f, 174.535f, 225.425f),
                    PathNode.CurveTo(171.53056f, 226.82504f, 167.96004f, 225.52443f, 166.56f, 222.52f),
                    PathNode.CurveTo(166.48665f, 222.355f, 166.40317f, 222.19469f, 166.31f, 222.04f),
                    PathNode.LineTo(133.19f, 165.0f),
                    PathNode.CurveTo(132.11661f, 163.14958f, 130.1392f, 162.01064f, 128.0f, 162.01064f),
                    PathNode.CurveTo(125.860794f, 162.01064f, 123.88339f, 163.14958f, 122.81f, 165.0f),
                    PathNode.LineTo(89.69f, 222.05f),
                    PathNode.CurveTo(89.59683f, 222.20468f, 89.513336f, 222.36499f, 89.44f, 222.53f),
                    PathNode.CurveTo(88.039955f, 225.53441f, 84.46943f, 226.83504f, 81.465f, 225.435f),
                    PathNode.CurveTo(78.46057f, 224.03496f, 77.15996f, 220.46443f, 78.56f, 217.46f),
                    PathNode.CurveTo(78.70641f, 217.13567f, 78.83005f, 216.80153f, 78.93f, 216.46f),
                    PathNode.LineTo(101.8f, 129.53f),
                    PathNode.CurveTo(102.44615f, 127.0359f, 101.42788f, 124.4077f, 99.27f, 123.0f),
                    PathNode.CurveTo(98.298355f, 122.36019f, 97.16331f, 122.01308f, 96.0f, 122.0f),
                    PathNode.CurveTo(94.63289f, 121.99879f, 93.30635f, 122.464485f, 92.24f, 123.32f),
                    PathNode.LineTo(56.73f, 151.8f),
                    PathNode.CurveTo(56.555267f, 151.93346f, 56.39142f, 152.08058f, 56.24f, 152.24f),
                    PathNode.CurveTo(53.89555f, 154.58444f, 50.094448f, 154.58444f, 47.75f, 152.24f),
                    PathNode.CurveTo(45.405552f, 149.89555f, 45.405552f, 146.09445f, 47.75f, 143.75f),
                    PathNode.LineTo(48.01f, 143.48f),
                    PathNode.LineTo(93.33f, 92.09f),
                    PathNode.CurveTo(96.74775f, 88.21702f, 101.664635f, 85.998955f, 106.83f, 86.0f),
                    PathNode.LineTo(149.17f, 86.0f),
                    PathNode.CurveTo(154.33536f, 85.998955f, 159.25226f, 88.21702f, 162.67f, 92.09f),
                    PathNode.LineTo(208.0f, 143.48f),
                    PathNode.LineTo(208.26f, 143.75f),
                    PathNode.CurveTo(209.38533f, 144.87674f, 210.0166f, 146.40462f, 210.01472f, 147.99707f),
                    PathNode.CurveTo(210.01285f, 149.58952f, 209.37799f, 151.11592f, 208.25f, 152.24f),
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
        return _person!!
    }

private var _person: ImageVector? = null
