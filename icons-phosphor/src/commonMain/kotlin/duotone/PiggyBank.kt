package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = phosphorDuotoneIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 112.0f),
                    PathNode.LineTo(240.0f, 144.0f),
                    PathNode.CurveTo(240.0f, 152.83656f, 232.83656f, 160.0f, 224.0f, 160.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(197.9f, 210.69f),
                    PathNode.CurveTo(196.76236f, 213.87633f, 193.74332f, 216.00246f, 190.36f, 216.0f),
                    PathNode.LineTo(177.64f, 216.0f),
                    PathNode.CurveTo(174.25668f, 216.00246f, 171.23764f, 213.87633f, 170.1f, 210.69f),
                    PathNode.LineTo(166.29f, 200.0f),
                    PathNode.LineTo(97.71f, 200.0f),
                    PathNode.LineTo(93.9f, 210.69f),
                    PathNode.CurveTo(92.76236f, 213.87633f, 89.74331f, 216.00246f, 86.36f, 216.0f),
                    PathNode.LineTo(73.64f, 216.0f),
                    PathNode.CurveTo(70.25669f, 216.00246f, 67.23764f, 213.87633f, 66.1f, 210.69f),
                    PathNode.LineTo(53.0f, 174.0f),
                    PathNode.CurveTo(39.47345f, 159.27191f, 31.977692f, 139.9971f, 32.0f, 120.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(32.0f, 75.81722f, 67.81722f, 40.0f, 112.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.CurveTo(175.90527f, 39.99076f, 204.76562f, 58.940193f, 217.44f, 88.22f),
                    PathNode.CurveTo(218.53708f, 90.76284f, 219.50497f, 93.35948f, 220.34f, 96.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(232.83656f, 96.0f, 240.0f, 103.163445f, 240.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 116.0f),
                    PathNode.CurveTo(192.0f, 122.62742f, 186.62741f, 128.0f, 180.0f, 128.0f),
                    PathNode.CurveTo(173.37259f, 128.0f, 168.0f, 122.62742f, 168.0f, 116.0f),
                    PathNode.CurveTo(168.0f, 109.37258f, 173.37259f, 104.0f, 180.0f, 104.0f),
                    PathNode.CurveTo(186.62741f, 104.0f, 192.0f, 109.37258f, 192.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 64.0f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.CurveTo(107.58172f, 64.0f, 104.0f, 67.58172f, 104.0f, 72.0f),
                    PathNode.CurveTo(104.0f, 76.41828f, 107.58172f, 80.0f, 112.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(156.41827f, 80.0f, 160.0f, 76.41828f, 160.0f, 72.0f),
                    PathNode.CurveTo(160.0f, 67.58172f, 156.41827f, 64.0f, 152.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 112.0f),
                    PathNode.LineTo(248.0f, 144.0f),
                    PathNode.CurveTo(248.0f, 157.25484f, 237.25484f, 168.0f, 224.0f, 168.0f),
                    PathNode.LineTo(221.64f, 168.0f),
                    PathNode.LineTo(205.43f, 213.38f),
                    PathNode.CurveTo(203.15598f, 219.74916f, 197.12296f, 224.00069f, 190.36f, 224.0f),
                    PathNode.LineTo(177.64f, 224.0f),
                    PathNode.CurveTo(170.87704f, 224.00069f, 164.84402f, 219.74916f, 162.57f, 213.38f),
                    PathNode.LineTo(160.65f, 208.0f),
                    PathNode.LineTo(103.35f, 208.0f),
                    PathNode.LineTo(101.43f, 213.38f),
                    PathNode.CurveTo(99.15595f, 219.74916f, 93.122955f, 224.00069f, 86.36f, 224.0f),
                    PathNode.LineTo(73.64f, 224.0f),
                    PathNode.CurveTo(66.877045f, 224.00069f, 60.844044f, 219.74916f, 58.57f, 213.38f),
                    PathNode.LineTo(46.0f, 178.22f),
                    PathNode.CurveTo(34.041813f, 164.68594f, 26.55411f, 147.78972f, 24.56f, 129.84f),
                    PathNode.CurveTo(19.29813f, 132.60374f, 16.001846f, 138.05647f, 16.0f, 144.0f),
                    PathNode.CurveTo(16.0f, 148.41827f, 12.418278f, 152.0f, 8.0f, 152.0f),
                    PathNode.CurveTo(3.581722f, 152.0f, 0f, 148.41827f, 0f, 144.0f),
                    PathNode.CurveTo(0.025151f, 129.32088f, 10.034424f, 116.54132f, 24.28f, 113.0f),
                    PathNode.CurveTo(27.98569f, 67.28639f, 66.13648f, 32.058235f, 112.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 44.418278f, 220.41827f, 48.0f, 216.0f, 48.0f),
                    PathNode.LineTo(194.61f, 48.0f),
                    PathNode.CurveTo(207.88646f, 57.31496f, 218.32802f, 70.12032f, 224.78f, 85.0f),
                    PathNode.CurveTo(225.21f, 86.0f, 225.63f, 87.0f, 226.03f, 88.0f),
                    PathNode.CurveTo(238.4862f, 89.0573f, 248.04478f, 99.4991f, 248.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 107.58172f, 228.41827f, 104.0f, 224.0f, 104.0f),
                    PathNode.LineTo(220.34f, 104.0f),
                    PathNode.CurveTo(216.84312f, 104.0037f, 213.74905f, 101.73581f, 212.7f, 98.4f),
                    PathNode.CurveTo(203.29257f, 68.37921f, 175.46022f, 47.960716f, 144.0f, 48.0f),
                    PathNode.LineTo(112.0f, 48.0f),
                    PathNode.CurveTo(83.44949f, 47.998516f, 57.59518f, 64.866936f, 46.095264f, 90.99898f),
                    PathNode.CurveTo(34.59535f, 117.131004f, 39.622547f, 147.58945f, 58.91f, 168.64f),
                    PathNode.CurveTo(59.63183f, 169.425f, 60.189423f, 170.34639f, 60.55f, 171.35f),
                    PathNode.LineTo(73.64f, 208.0f),
                    PathNode.LineTo(86.36f, 208.0f),
                    PathNode.LineTo(90.18f, 197.31f),
                    PathNode.CurveTo(91.31641f, 194.12714f, 94.33035f, 192.00177f, 97.71f, 192.0f),
                    PathNode.LineTo(166.29f, 192.0f),
                    PathNode.CurveTo(169.66965f, 192.00177f, 172.6836f, 194.12714f, 173.82f, 197.31f),
                    PathNode.LineTo(177.64f, 208.0f),
                    PathNode.LineTo(190.36f, 208.0f),
                    PathNode.LineTo(208.47f, 157.31f),
                    PathNode.CurveTo(209.6064f, 154.12714f, 212.62036f, 152.00177f, 216.0f, 152.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(228.41827f, 152.0f, 232.0f, 148.41827f, 232.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
