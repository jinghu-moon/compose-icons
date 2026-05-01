package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorLightIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(73.08f, 76.51f),
                    PathNode.CurveTo(55.36362f, 83.52824f, 39.27533f, 94.106285f, 25.81f, 107.59f),
                    PathNode.CurveTo(6.56f, 126.85f, 4.7f, 155.24f, 21.29f, 176.59f),
                    PathNode.CurveTo(25.097576f, 181.44862f, 31.63798f, 183.24013f, 37.39f, 181.0f),
                    PathNode.LineTo(86.39f, 163.63f),
                    PathNode.LineTo(86.61f, 163.54f),
                    PathNode.CurveTo(91.01024f, 161.79462f, 94.22296f, 157.93408f, 95.14f, 153.29f),
                    PathNode.LineTo(101.04f, 123.78f),
                    PathNode.CurveTo(101.16927f, 123.117134f, 101.624344f, 122.56428f, 102.25f, 122.31f),
                    PathNode.CurveTo(105.5204f, 121.17819f, 108.86074f, 120.2596f, 112.25f, 119.56f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(98.29f, 111.0f),
                    PathNode.CurveTo(93.66336f, 112.661606f, 90.24722f, 116.62812f, 89.29f, 121.45f),
                    PathNode.LineTo(83.37f, 151.0f),
                    PathNode.CurveTo(83.24087f, 151.63478f, 82.812294f, 152.1677f, 82.22f, 152.43f),
                    PathNode.LineTo(33.28f, 169.77f),
                    PathNode.LineTo(33.06f, 169.85f),
                    PathNode.CurveTo(32.25183f, 170.17628f, 31.32542f, 169.94165f, 30.77f, 169.27f),
                    PathNode.CurveTo(17.77f, 152.54f, 19.21f, 131.16f, 34.3f, 116.08f),
                    PathNode.CurveTo(47.692036f, 102.66079f, 63.8996f, 92.38632f, 81.75f, 86.0f),
                    PathNode.LineTo(103.09f, 109.48f),
                    PathNode.CurveTo(101.47f, 110.0f, 99.87f, 110.47f, 98.29f, 111.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.71f, 176.61f),
                    PathNode.CurveTo(230.90242f, 181.46863f, 224.36201f, 183.26013f, 218.61f, 181.02f),
                    PathNode.LineTo(209.33f, 177.73f),
                    PathNode.CurveTo(207.25958f, 177.05351f, 205.71838f, 175.30812f, 205.30338f, 173.1699f),
                    PathNode.CurveTo(204.88837f, 171.03168f, 205.66475f, 168.83649f, 207.33177f, 167.4346f),
                    PathNode.CurveTo(208.99881f, 166.03273f, 211.29465f, 165.6444f, 213.33f, 166.42f),
                    PathNode.LineTo(222.71f, 169.75f),
                    PathNode.LineTo(222.93f, 169.83f),
                    PathNode.CurveTo(223.73817f, 170.15628f, 224.66458f, 169.92165f, 225.22f, 169.25f),
                    PathNode.CurveTo(238.22f, 152.52f, 236.78f, 131.14f, 221.69f, 116.06f),
                    PathNode.CurveTo(195.64f, 90.0f, 158.86f, 76.2f, 120.83f, 78.19f),
                    PathNode.CurveTo(117.51629f, 78.36397f, 114.68897f, 75.81871f, 114.515f, 72.505f),
                    PathNode.CurveTo(114.341034f, 69.19129f, 116.88629f, 66.36397f, 120.2f, 66.19f),
                    PathNode.CurveTo(161.64f, 64.04f, 201.72f, 79.12f, 230.2f, 107.58f),
                    PathNode.CurveTo(249.44f, 126.85f, 251.3f, 155.24f, 234.71f, 176.63f),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
