package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorLightIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 64.0f),
                    PathNode.CurveTo(221.99678f, 48.21324f, 209.75935f, 35.13006f, 194.008f, 34.0734f),
                    PathNode.CurveTo(178.25664f, 33.016743f, 164.3814f, 44.348194f, 162.26962f, 59.993073f),
                    PathNode.CurveTo(160.15785f, 75.63795f, 170.5322f, 90.242645f, 186.0f, 93.4f),
                    PathNode.LineTo(186.0f, 112.0f),
                    PathNode.CurveTo(186.0f, 117.52285f, 181.52284f, 122.0f, 176.0f, 122.0f),
                    PathNode.LineTo(80.0f, 122.0f),
                    PathNode.CurveTo(74.47715f, 122.0f, 70.0f, 117.52285f, 70.0f, 112.0f),
                    PathNode.LineTo(70.0f, 93.4f),
                    PathNode.CurveTo(85.08978f, 90.31981f, 95.39602f, 76.313805f, 93.84808f, 60.990852f),
                    PathNode.CurveTo(92.300156f, 45.6679f, 79.40093f, 34.006123f, 64.0f, 34.006123f),
                    PathNode.CurveTo(48.59906f, 34.006123f, 35.69985f, 45.6679f, 34.151917f, 60.990852f),
                    PathNode.CurveTo(32.60398f, 76.313805f, 42.91022f, 90.31981f, 58.0f, 93.4f),
                    PathNode.LineTo(58.0f, 112.0f),
                    PathNode.CurveTo(58.0f, 124.15026f, 67.84974f, 134.0f, 80.0f, 134.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(122.0f, 162.6f),
                    PathNode.CurveTo(106.91022f, 165.68019f, 96.60398f, 179.68619f, 98.15192f, 195.00914f),
                    PathNode.CurveTo(99.699844f, 210.33209f, 112.59907f, 221.99388f, 128.0f, 221.99388f),
                    PathNode.CurveTo(143.40094f, 221.99388f, 156.30016f, 210.33209f, 157.84808f, 195.00914f),
                    PathNode.CurveTo(159.39601f, 179.68619f, 149.08978f, 165.68019f, 134.0f, 162.6f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(176.0f, 134.0f),
                    PathNode.CurveTo(188.15027f, 134.0f, 198.0f, 124.15026f, 198.0f, 112.0f),
                    PathNode.LineTo(198.0f, 93.4f),
                    PathNode.CurveTo(211.95935f, 90.53081f, 221.98355f, 78.25116f, 222.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 64.0f),
                    PathNode.CurveTo(46.0f, 54.058876f, 54.058876f, 46.0f, 64.0f, 46.0f),
                    PathNode.CurveTo(73.94112f, 46.0f, 82.0f, 54.058876f, 82.0f, 64.0f),
                    PathNode.CurveTo(82.0f, 73.94112f, 73.94112f, 82.0f, 64.0f, 82.0f),
                    PathNode.CurveTo(54.058876f, 82.0f, 46.0f, 73.94112f, 46.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 192.0f),
                    PathNode.CurveTo(146.0f, 201.94113f, 137.94113f, 210.0f, 128.0f, 210.0f),
                    PathNode.CurveTo(118.05888f, 210.0f, 110.0f, 201.94113f, 110.0f, 192.0f),
                    PathNode.CurveTo(110.0f, 182.05887f, 118.05888f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(137.94113f, 174.0f, 146.0f, 182.05887f, 146.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 82.0f),
                    PathNode.CurveTo(182.05887f, 82.0f, 174.0f, 73.94112f, 174.0f, 64.0f),
                    PathNode.CurveTo(174.0f, 54.058876f, 182.05887f, 46.0f, 192.0f, 46.0f),
                    PathNode.CurveTo(201.94113f, 46.0f, 210.0f, 54.058876f, 210.0f, 64.0f),
                    PathNode.CurveTo(210.0f, 73.94112f, 201.94113f, 82.0f, 192.0f, 82.0f),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
