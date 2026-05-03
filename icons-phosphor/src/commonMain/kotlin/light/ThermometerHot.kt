package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) return _thermometerHot!!
        _thermometerHot = phosphorLightIcon(
            name = "ThermometerHot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(126.0f, 154.6f),
                    PathNode.LineTo(126.0f, 48.0f),
                    PathNode.CurveTo(126.0f, 44.68629f, 123.313705f, 42.0f, 120.0f, 42.0f),
                    PathNode.CurveTo(116.686295f, 42.0f, 114.0f, 44.68629f, 114.0f, 48.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(179.0f, 79.68f),
                    PathNode.CurveTo(177.19243f, 76.90455f, 177.97574f, 73.1894f, 180.75f, 71.38f),
                    PathNode.CurveTo(194.89f, 62.17f, 205.7f, 66.77f, 214.38f, 70.48f),
                    PathNode.CurveTo(222.28f, 73.85f, 227.98f, 76.28f, 236.75f, 70.57f),
                    PathNode.CurveTo(238.54546f, 69.33298f, 240.87067f, 69.16732f, 242.82336f, 70.13731f),
                    PathNode.CurveTo(244.77608f, 71.107285f, 246.04889f, 73.060234f, 246.14792f, 75.23833f),
                    PathNode.CurveTo(246.24695f, 77.41641f, 245.15663f, 79.476814f, 243.3f, 80.62f),
                    PathNode.CurveTo(237.18f, 84.62f, 231.68f, 86.01f, 226.71f, 86.01f),
                    PathNode.CurveTo(220.2f, 86.01f, 214.6f, 83.62f, 209.71f, 81.52f),
                    PathNode.CurveTo(201.82f, 78.15f, 196.12f, 75.72f, 187.34f, 81.43f),
                    PathNode.CurveTo(186.00398f, 82.31078f, 184.37148f, 82.62138f, 182.80536f, 82.29276f),
                    PathNode.CurveTo(181.23924f, 81.96414f, 179.86928f, 81.02353f, 179.0f, 79.68f),
                    PathNode.Close,
                    PathNode.MoveTo(245.0f, 104.32f),
                    PathNode.CurveTo(246.80566f, 107.098045f, 246.01773f, 110.81385f, 243.24f, 112.62f),
                    PathNode.CurveTo(237.12f, 116.62f, 231.62f, 118.01f, 226.65f, 118.01f),
                    PathNode.CurveTo(220.14f, 118.01f, 214.54f, 115.62f, 209.65f, 113.52f),
                    PathNode.CurveTo(201.76f, 110.15f, 196.06f, 107.72f, 187.28f, 113.43f),
                    PathNode.CurveTo(184.50941f, 115.135956f, 180.884f, 114.322784f, 179.10745f, 111.59693f),
                    PathNode.CurveTo(177.3309f, 108.87108f, 178.05067f, 105.22598f, 180.73f, 103.38f),
                    PathNode.CurveTo(194.87f, 94.17f, 205.68f, 98.78f, 214.36f, 102.48f),
                    PathNode.CurveTo(222.26f, 105.85f, 227.96f, 108.28f, 236.73f, 102.57f),
                    PathNode.CurveTo(239.4994f, 100.78282f, 243.19193f, 101.56419f, 245.0f, 104.32f),
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
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
