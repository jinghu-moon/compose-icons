package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GearFine: ImageVector
    get() {
        if (_gearFine != null) return _gearFine!!
        _gearFine = phosphorLightIcon(
            name = "GearFine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 122.0f),
                    PathNode.LineTo(213.77f, 122.0f),
                    PathNode.CurveTo(213.01068f, 110.98791f, 210.1277f, 100.22678f, 205.28f, 90.31f),
                    PathNode.LineTo(221.07f, 81.2f),
                    PathNode.CurveTo(223.94188f, 79.543144f, 224.92685f, 75.87188f, 223.27f, 73.0f),
                    PathNode.CurveTo(221.61313f, 70.12812f, 217.94188f, 69.14314f, 215.07f, 70.8f),
                    PathNode.LineTo(199.27f, 79.92f),
                    PathNode.CurveTo(193.08533f, 70.7854f, 185.2146f, 62.914677f, 176.08f, 56.73f),
                    PathNode.LineTo(185.2f, 40.93f),
                    PathNode.CurveTo(186.85686f, 38.05812f, 185.87189f, 34.386856f, 183.0f, 32.73f),
                    PathNode.CurveTo(180.12811f, 31.073145f, 176.45685f, 32.05812f, 174.8f, 34.93f),
                    PathNode.LineTo(165.69f, 50.72f),
                    PathNode.CurveTo(155.77321f, 45.872307f, 145.01208f, 42.989315f, 134.0f, 42.23f),
                    PathNode.LineTo(134.0f, 24.0f),
                    PathNode.CurveTo(134.0f, 20.68629f, 131.3137f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(124.686295f, 18.0f, 122.0f, 20.68629f, 122.0f, 24.0f),
                    PathNode.LineTo(122.0f, 42.23f),
                    PathNode.CurveTo(110.98791f, 42.989315f, 100.22678f, 45.872307f, 90.31f, 50.72f),
                    PathNode.LineTo(81.2f, 34.93f),
                    PathNode.CurveTo(79.543144f, 32.05812f, 75.87188f, 31.073145f, 73.0f, 32.73f),
                    PathNode.CurveTo(70.12812f, 34.386856f, 69.14314f, 38.05812f, 70.8f, 40.93f),
                    PathNode.LineTo(79.92f, 56.73f),
                    PathNode.CurveTo(70.7854f, 62.914677f, 62.914677f, 70.7854f, 56.73f, 79.92f),
                    PathNode.LineTo(40.93f, 70.8f),
                    PathNode.CurveTo(38.05812f, 69.14314f, 34.386856f, 70.12812f, 32.73f, 73.0f),
                    PathNode.CurveTo(31.073145f, 75.87188f, 32.05812f, 79.543144f, 34.93f, 81.2f),
                    PathNode.LineTo(50.72f, 90.31f),
                    PathNode.CurveTo(45.872307f, 100.22678f, 42.989315f, 110.98791f, 42.23f, 122.0f),
                    PathNode.LineTo(24.0f, 122.0f),
                    PathNode.CurveTo(20.68629f, 122.0f, 18.0f, 124.686295f, 18.0f, 128.0f),
                    PathNode.CurveTo(18.0f, 131.3137f, 20.68629f, 134.0f, 24.0f, 134.0f),
                    PathNode.LineTo(42.23f, 134.0f),
                    PathNode.CurveTo(42.989315f, 145.01208f, 45.872307f, 155.77321f, 50.72f, 165.69f),
                    PathNode.LineTo(34.93f, 174.8f),
                    PathNode.CurveTo(32.05812f, 176.45685f, 31.073145f, 180.12811f, 32.73f, 183.0f),
                    PathNode.CurveTo(34.386856f, 185.87189f, 38.05812f, 186.85686f, 40.93f, 185.2f),
                    PathNode.LineTo(56.73f, 176.08f),
                    PathNode.CurveTo(62.914677f, 185.2146f, 70.7854f, 193.08533f, 79.92f, 199.27f),
                    PathNode.LineTo(70.8f, 215.07f),
                    PathNode.CurveTo(69.14314f, 217.94188f, 70.12812f, 221.61313f, 73.0f, 223.27f),
                    PathNode.CurveTo(75.87188f, 224.92685f, 79.543144f, 223.94188f, 81.2f, 221.07f),
                    PathNode.LineTo(90.31f, 205.28f),
                    PathNode.CurveTo(100.22678f, 210.1277f, 110.98791f, 213.01068f, 122.0f, 213.77f),
                    PathNode.LineTo(122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.LineTo(134.0f, 213.77f),
                    PathNode.CurveTo(145.01208f, 213.01068f, 155.77321f, 210.1277f, 165.69f, 205.28f),
                    PathNode.LineTo(174.8f, 221.07f),
                    PathNode.CurveTo(175.87427f, 222.9307f, 177.86147f, 224.07495f, 180.01f, 224.07f),
                    PathNode.CurveTo(181.06422f, 224.07147f, 182.09978f, 223.79187f, 183.01f, 223.26f),
                    PathNode.CurveTo(185.87746f, 221.60463f, 186.86201f, 217.93939f, 185.21f, 215.07f),
                    PathNode.LineTo(176.09f, 199.27f),
                    PathNode.CurveTo(185.22461f, 193.08533f, 193.09532f, 185.2146f, 199.28f, 176.08f),
                    PathNode.LineTo(215.08f, 185.2f),
                    PathNode.CurveTo(217.95187f, 186.85686f, 221.62314f, 185.87189f, 223.28f, 183.0f),
                    PathNode.CurveTo(224.93686f, 180.12811f, 223.95187f, 176.45685f, 221.08f, 174.8f),
                    PathNode.LineTo(205.29f, 165.69f),
                    PathNode.CurveTo(210.13423f, 155.7725f, 213.01382f, 145.01141f, 213.77f, 134.0f),
                    PathNode.LineTo(232.0f, 134.0f),
                    PathNode.CurveTo(235.3137f, 134.0f, 238.0f, 131.3137f, 238.0f, 128.0f),
                    PathNode.CurveTo(238.0f, 124.686295f, 235.3137f, 122.0f, 232.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 188.84f),
                    PathNode.CurveTo(65.9947f, 175.04646f, 54.048832f, 152.29967f, 54.048832f, 128.0f),
                    PathNode.CurveTo(54.048832f, 103.70033f, 65.9947f, 80.953545f, 86.0f, 67.16f),
                    PathNode.LineTo(121.07f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 202.0f),
                    PathNode.CurveTo(117.043106f, 202.01033f, 106.22251f, 199.57083f, 96.33f, 194.86f),
                    PathNode.LineTo(131.46f, 134.0f),
                    PathNode.LineTo(201.74f, 134.0f),
                    PathNode.CurveTo(198.57384f, 172.38913f, 166.51944f, 201.94838f, 128.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(131.46f, 122.0f),
                    PathNode.LineTo(96.33f, 61.14f),
                    PathNode.CurveTo(118.28616f, 50.72246f, 143.95934f, 51.757572f, 165.00554f, 63.908913f),
                    PathNode.CurveTo(186.05174f, 76.06025f, 199.78429f, 97.7766f, 201.74f, 122.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null
