package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorThinIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.67f, 73.92f),
                    PathNode.LineTo(222.47f, 82.1f),
                    PathNode.LineTo(238.0f, 103.54f),
                    PathNode.CurveTo(238.88771f, 104.693436f, 239.07884f, 106.23802f, 238.49905f, 107.57304f),
                    PathNode.CurveTo(237.91925f, 108.908066f, 236.66005f, 109.822784f, 235.21118f, 109.96144f),
                    PathNode.CurveTo(233.76231f, 110.100105f, 232.35248f, 109.44082f, 231.53f, 108.24f),
                    PathNode.LineTo(216.0f, 86.81f),
                    PathNode.LineTo(200.43f, 108.24f),
                    PathNode.CurveTo(199.67682f, 109.277435f, 198.47202f, 109.89099f, 197.19f, 109.89f),
                    PathNode.CurveTo(195.68733f, 109.88741f, 194.3129f, 109.04287f, 193.63162f, 107.70352f),
                    PathNode.CurveTo(192.95035f, 106.364174f, 193.07718f, 104.75599f, 193.96f, 103.54f),
                    PathNode.LineTo(209.53f, 82.1f),
                    PathNode.LineTo(184.33f, 73.92f),
                    PathNode.CurveTo(182.22856f, 73.23793f, 181.07793f, 70.981445f, 181.76f, 68.88f),
                    PathNode.CurveTo(182.44208f, 66.77856f, 184.69856f, 65.62793f, 186.8f, 66.31f),
                    PathNode.LineTo(212.0f, 74.49f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 213.79086f, 44.0f, 216.0f, 44.0f),
                    PathNode.CurveTo(218.20914f, 44.0f, 220.0f, 45.79086f, 220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 74.49f),
                    PathNode.LineTo(245.2f, 66.31f),
                    PathNode.CurveTo(247.30144f, 65.62793f, 249.55792f, 66.77856f, 250.24f, 68.88f),
                    PathNode.CurveTo(250.92207f, 70.981445f, 249.77144f, 73.23793f, 247.67f, 73.92f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 184.0f),
                    PathNode.CurveTo(148.0015f, 198.9444f, 136.26657f, 211.25595f, 121.33927f, 211.97076f),
                    PathNode.CurveTo(106.41198f, 212.68558f, 93.55434f, 201.55165f, 92.12785f, 186.67549f),
                    PathNode.CurveTo(90.70136f, 171.79933f, 101.208885f, 158.42491f, 116.0f, 156.29f),
                    PathNode.LineTo(116.0f, 120.0f),
                    PathNode.CurveTo(116.0f, 117.79086f, 117.79086f, 116.0f, 120.0f, 116.0f),
                    PathNode.CurveTo(122.20914f, 116.0f, 124.0f, 117.79086f, 124.0f, 120.0f),
                    PathNode.LineTo(124.0f, 156.29f),
                    PathNode.CurveTo(137.77498f, 158.27824f, 147.9986f, 170.08228f, 148.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 172.9543f, 131.0457f, 164.0f, 120.0f, 164.0f),
                    PathNode.CurveTo(108.95431f, 164.0f, 100.0f, 172.9543f, 100.0f, 184.0f),
                    PathNode.CurveTo(100.0f, 195.0457f, 108.95431f, 204.0f, 120.0f, 204.0f),
                    PathNode.CurveTo(131.0457f, 204.0f, 140.0f, 195.0457f, 140.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 184.0f),
                    PathNode.CurveTo(180.0f, 212.21562f, 160.34056f, 236.61902f, 132.77156f, 242.62497f),
                    PathNode.CurveTo(105.20255f, 248.63092f, 77.17373f, 234.61652f, 65.43709f, 208.95773f),
                    PathNode.CurveTo(53.70045f, 183.29897f, 61.427498f, 152.92938f, 84.0f, 136.0f),
                    PathNode.LineTo(84.0f, 48.0f),
                    PathNode.CurveTo(84.0f, 28.117748f, 100.11775f, 12.0f, 120.0f, 12.0f),
                    PathNode.CurveTo(139.88223f, 12.0f, 156.0f, 28.117748f, 156.0f, 48.0f),
                    PathNode.LineTo(156.0f, 136.0f),
                    PathNode.CurveTo(171.1009f, 147.33748f, 179.99057f, 165.11679f, 180.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 184.0f),
                    PathNode.CurveTo(171.99078f, 166.98566f, 163.66797f, 151.04947f, 149.71f, 141.32f),
                    PathNode.CurveTo(148.62666f, 140.56366f, 147.98671f, 139.32117f, 148.0f, 138.0f),
                    PathNode.LineTo(148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 32.536026f, 135.46397f, 20.0f, 120.0f, 20.0f),
                    PathNode.CurveTo(104.536026f, 20.0f, 92.0f, 32.536026f, 92.0f, 48.0f),
                    PathNode.LineTo(92.0f, 138.0f),
                    PathNode.CurveTo(92.00012f, 139.30705f, 91.36166f, 140.53171f, 90.29f, 141.28f),
                    PathNode.CurveTo(70.03648f, 155.37973f, 62.482735f, 181.77303f, 72.20985f, 204.4532f),
                    PathNode.CurveTo(81.93696f, 227.13338f, 106.265495f, 239.85292f, 130.441f, 234.89787f),
                    PathNode.CurveTo(154.61649f, 229.94281f, 171.97952f, 208.67805f, 172.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
