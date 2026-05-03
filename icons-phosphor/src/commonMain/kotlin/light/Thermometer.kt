package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorLightIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 58.0f),
                    PathNode.CurveTo(197.6406f, 58.0f, 186.0f, 69.640594f, 186.0f, 84.0f),
                    PathNode.CurveTo(186.0f, 98.359406f, 197.6406f, 110.0f, 212.0f, 110.0f),
                    PathNode.CurveTo(226.3594f, 110.0f, 238.0f, 98.359406f, 238.0f, 84.0f),
                    PathNode.CurveTo(238.0f, 69.640594f, 226.3594f, 58.0f, 212.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 98.0f),
                    PathNode.CurveTo(204.26802f, 98.0f, 198.0f, 91.73199f, 198.0f, 84.0f),
                    PathNode.CurveTo(198.0f, 76.26801f, 204.26802f, 70.0f, 212.0f, 70.0f),
                    PathNode.CurveTo(219.73198f, 70.0f, 226.0f, 76.26801f, 226.0f, 84.0f),
                    PathNode.CurveTo(226.0f, 91.73199f, 219.73198f, 98.0f, 212.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(126.0f, 154.6f),
                    PathNode.LineTo(126.0f, 88.0f),
                    PathNode.CurveTo(126.0f, 84.686295f, 123.313705f, 82.0f, 120.0f, 82.0f),
                    PathNode.CurveTo(116.686295f, 82.0f, 114.0f, 84.686295f, 114.0f, 88.0f),
                    PathNode.LineTo(114.0f, 154.6f),
                    PathNode.CurveTo(98.91022f, 157.68019f, 88.60398f, 171.68619f, 90.15192f, 187.00914f),
                    PathNode.CurveTo(91.699844f, 202.33209f, 104.59907f, 213.99388f, 120.0f, 213.99388f),
                    PathNode.CurveTo(135.40094f, 213.99388f, 148.30016f, 202.33209f, 149.84808f, 187.00914f),
                    PathNode.CurveTo(151.39601f, 171.68619f, 141.08978f, 157.68019f, 126.0f, 154.6f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 202.0f),
                    PathNode.CurveTo(110.05888f, 202.0f, 102.0f, 193.94113f, 102.0f, 184.0f),
                    PathNode.CurveTo(102.0f, 174.05887f, 110.05888f, 166.0f, 120.0f, 166.0f),
                    PathNode.CurveTo(129.94113f, 166.0f, 138.0f, 174.05887f, 138.0f, 184.0f),
                    PathNode.CurveTo(138.0f, 193.94113f, 129.94113f, 202.0f, 120.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 135.0f),
                    PathNode.LineTo(158.0f, 48.0f),
                    PathNode.CurveTo(158.0f, 27.01318f, 140.98682f, 10.0f, 120.0f, 10.0f),
                    PathNode.CurveTo(99.013176f, 10.0f, 82.0f, 27.01318f, 82.0f, 48.0f),
                    PathNode.LineTo(82.0f, 135.0f),
                    PathNode.CurveTo(61.05952f, 151.24294f, 52.758377f, 178.99971f, 61.34266f, 204.07254f),
                    PathNode.CurveTo(69.92694f, 229.14536f, 93.49837f, 245.98979f, 120.0f, 245.98979f),
                    PathNode.CurveTo(146.50163f, 245.98979f, 170.07306f, 229.14536f, 178.65733f, 204.07254f),
                    PathNode.CurveTo(187.24162f, 178.99971f, 178.94048f, 151.24294f, 158.0f, 135.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 234.0f),
                    PathNode.CurveTo(98.17301f, 233.97899f, 78.88203f, 219.80183f, 72.34396f, 198.97704f),
                    PathNode.CurveTo(65.80589f, 178.15225f, 73.531845f, 155.49297f, 91.43f, 143.0f),
                    PathNode.CurveTo(93.06278f, 141.86261f, 94.02545f, 139.98972f, 94.0f, 138.0f),
                    PathNode.LineTo(94.0f, 48.0f),
                    PathNode.CurveTo(94.0f, 33.6406f, 105.640594f, 22.0f, 120.0f, 22.0f),
                    PathNode.CurveTo(134.3594f, 22.0f, 146.0f, 33.6406f, 146.0f, 48.0f),
                    PathNode.LineTo(146.0f, 138.0f),
                    PathNode.CurveTo(146.00095f, 139.9615f, 146.96062f, 141.79868f, 148.57f, 142.92f),
                    PathNode.CurveTo(166.54176f, 155.3896f, 174.32172f, 178.09373f, 167.77478f, 198.96509f),
                    PathNode.CurveTo(161.22786f, 219.83644f, 141.87407f, 234.02924f, 120.0f, 234.0f),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
