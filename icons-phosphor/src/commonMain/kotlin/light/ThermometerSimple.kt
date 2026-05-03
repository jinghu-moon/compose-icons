package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorLightIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 154.6f),
                    PathNode.LineTo(134.0f, 88.0f),
                    PathNode.CurveTo(134.0f, 84.686295f, 131.3137f, 82.0f, 128.0f, 82.0f),
                    PathNode.CurveTo(124.686295f, 82.0f, 122.0f, 84.686295f, 122.0f, 88.0f),
                    PathNode.LineTo(122.0f, 154.6f),
                    PathNode.CurveTo(106.91022f, 157.68019f, 96.60398f, 171.68619f, 98.15192f, 187.00914f),
                    PathNode.CurveTo(99.699844f, 202.33209f, 112.59907f, 213.99388f, 128.0f, 213.99388f),
                    PathNode.CurveTo(143.40094f, 213.99388f, 156.30016f, 202.33209f, 157.84808f, 187.00914f),
                    PathNode.CurveTo(159.39601f, 171.68619f, 149.08978f, 157.68019f, 134.0f, 154.6f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 202.0f),
                    PathNode.CurveTo(118.05888f, 202.0f, 110.0f, 193.94113f, 110.0f, 184.0f),
                    PathNode.CurveTo(110.0f, 174.05887f, 118.05888f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(137.94113f, 166.0f, 146.0f, 174.05887f, 146.0f, 184.0f),
                    PathNode.CurveTo(146.0f, 193.94113f, 137.94113f, 202.0f, 128.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 135.0f),
                    PathNode.LineTo(166.0f, 48.0f),
                    PathNode.CurveTo(166.0f, 27.01318f, 148.98682f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(107.013176f, 10.0f, 90.0f, 27.01318f, 90.0f, 48.0f),
                    PathNode.LineTo(90.0f, 135.0f),
                    PathNode.CurveTo(69.059525f, 151.24294f, 60.758377f, 178.99971f, 69.34266f, 204.07254f),
                    PathNode.CurveTo(77.92694f, 229.14536f, 101.49837f, 245.98979f, 128.0f, 245.98979f),
                    PathNode.CurveTo(154.50163f, 245.98979f, 178.07306f, 229.14536f, 186.65733f, 204.07254f),
                    PathNode.CurveTo(195.24162f, 178.99971f, 186.94048f, 151.24294f, 166.0f, 135.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 234.0f),
                    PathNode.CurveTo(106.17301f, 233.97899f, 86.88203f, 219.80183f, 80.34396f, 198.97704f),
                    PathNode.CurveTo(73.80589f, 178.15225f, 81.531845f, 155.49297f, 99.43f, 143.0f),
                    PathNode.CurveTo(101.06278f, 141.86261f, 102.02545f, 139.98972f, 102.0f, 138.0f),
                    PathNode.LineTo(102.0f, 48.0f),
                    PathNode.CurveTo(102.0f, 33.6406f, 113.640594f, 22.0f, 128.0f, 22.0f),
                    PathNode.CurveTo(142.3594f, 22.0f, 154.0f, 33.6406f, 154.0f, 48.0f),
                    PathNode.LineTo(154.0f, 138.0f),
                    PathNode.CurveTo(154.00095f, 139.9615f, 154.96062f, 141.79868f, 156.57f, 142.92f),
                    PathNode.CurveTo(174.54176f, 155.3896f, 182.32172f, 178.09373f, 175.77478f, 198.96509f),
                    PathNode.CurveTo(169.22786f, 219.83644f, 149.87407f, 234.02924f, 128.0f, 234.0f),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
