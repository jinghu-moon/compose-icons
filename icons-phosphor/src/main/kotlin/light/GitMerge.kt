package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorLightIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 114.0f),
                    PathNode.CurveTo(194.05753f, 114.00318f, 181.95494f, 123.611496f, 178.79f, 137.19f),
                    PathNode.LineTo(134.79f, 130.91f),
                    PathNode.CurveTo(132.38683f, 130.56754f, 130.19026f, 129.36263f, 128.61f, 127.52f),
                    PathNode.LineTo(91.18f, 83.83f),
                    PathNode.CurveTo(104.987625f, 78.27058f, 112.630936f, 63.42767f, 109.13683f, 48.95877f),
                    PathNode.CurveTo(105.64273f, 34.489876f, 92.06797f, 24.770933f, 77.24492f, 26.125542f),
                    PathNode.CurveTo(62.421875f, 27.480152f, 50.833595f, 39.498627f, 50.01996f, 54.361187f),
                    PathNode.CurveTo(49.20632f, 69.22375f, 59.413403f, 82.43539f, 74.0f, 85.4f),
                    PathNode.LineTo(74.0f, 170.6f),
                    PathNode.CurveTo(58.91022f, 173.68019f, 48.60398f, 187.68619f, 50.151917f, 203.00914f),
                    PathNode.CurveTo(51.69985f, 218.33209f, 64.59906f, 229.99388f, 80.0f, 229.99388f),
                    PathNode.CurveTo(95.40093f, 229.99388f, 108.300156f, 218.33209f, 109.84808f, 203.00914f),
                    PathNode.CurveTo(111.39602f, 187.68619f, 101.08978f, 173.68019f, 86.0f, 170.6f),
                    PathNode.LineTo(86.0f, 96.22f),
                    PathNode.LineTo(119.52f, 135.33f),
                    PathNode.CurveTo(122.99726f, 139.38538f, 127.8313f, 142.03699f, 133.12f, 142.79f),
                    PathNode.LineTo(178.47f, 149.27f),
                    PathNode.CurveTo(181.26021f, 164.90652f, 195.75464f, 175.65836f, 211.52815f, 173.79222f),
                    PathNode.CurveTo(227.30167f, 171.92609f, 238.88701f, 158.0888f, 237.9514f, 142.23286f),
                    PathNode.CurveTo(237.0158f, 126.37692f, 223.88351f, 113.99815f, 208.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 56.0f),
                    PathNode.CurveTo(62.0f, 46.058876f, 70.05888f, 38.0f, 80.0f, 38.0f),
                    PathNode.CurveTo(89.94112f, 38.0f, 98.0f, 46.058876f, 98.0f, 56.0f),
                    PathNode.CurveTo(98.0f, 65.941124f, 89.94112f, 74.0f, 80.0f, 74.0f),
                    PathNode.CurveTo(70.05888f, 74.0f, 62.0f, 65.941124f, 62.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 200.0f),
                    PathNode.CurveTo(98.0f, 209.94113f, 89.94112f, 218.0f, 80.0f, 218.0f),
                    PathNode.CurveTo(70.05888f, 218.0f, 62.0f, 209.94113f, 62.0f, 200.0f),
                    PathNode.CurveTo(62.0f, 190.05887f, 70.05888f, 182.0f, 80.0f, 182.0f),
                    PathNode.CurveTo(89.94112f, 182.0f, 98.0f, 190.05887f, 98.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 162.0f),
                    PathNode.CurveTo(198.05887f, 162.0f, 190.0f, 153.94113f, 190.0f, 144.0f),
                    PathNode.CurveTo(190.0f, 134.05887f, 198.05887f, 126.0f, 208.0f, 126.0f),
                    PathNode.CurveTo(217.94113f, 126.0f, 226.0f, 134.05887f, 226.0f, 144.0f),
                    PathNode.CurveTo(226.0f, 153.94113f, 217.94113f, 162.0f, 208.0f, 162.0f),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
