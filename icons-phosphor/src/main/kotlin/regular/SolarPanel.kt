package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) return _solarPanel!!
        _solarPanel = phosphorRegularIcon(
            name = "SolarPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 99.58172f, 35.581722f, 96.0f, 40.0f, 96.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(60.418278f, 96.0f, 64.0f, 99.58172f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 108.41828f, 60.418278f, 112.0f, 56.0f, 112.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.CurveTo(35.581722f, 112.0f, 32.0f, 108.41828f, 32.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(71.43f, 58.75f),
                    PathNode.CurveTo(74.55593f, 61.87593f, 79.62407f, 61.87593f, 82.75f, 58.75f),
                    PathNode.CurveTo(85.87593f, 55.62407f, 85.87593f, 50.55593f, 82.75f, 47.43f),
                    PathNode.LineTo(71.43f, 36.12f),
                    PathNode.CurveTo(68.28468f, 33.131767f, 63.330753f, 33.195194f, 60.262974f, 36.262974f),
                    PathNode.CurveTo(57.195194f, 39.330753f, 57.131767f, 44.284687f, 60.12f, 47.43f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(132.41827f, 40.0f, 136.0f, 36.418278f, 136.0f, 32.0f),
                    PathNode.LineTo(136.0f, 16.0f),
                    PathNode.CurveTo(136.0f, 11.581722f, 132.41827f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(123.58172f, 8.0f, 120.0f, 11.581722f, 120.0f, 16.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(120.0f, 36.418278f, 123.58172f, 40.0f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.91f, 61.09f),
                    PathNode.CurveTo(181.03236f, 61.091667f, 183.06842f, 60.24991f, 184.57f, 58.75f),
                    PathNode.LineTo(195.88f, 47.43f),
                    PathNode.CurveTo(198.86823f, 44.284687f, 198.80481f, 39.330753f, 195.73703f, 36.262974f),
                    PathNode.CurveTo(192.66925f, 33.195194f, 187.71532f, 33.131767f, 184.57f, 36.12f),
                    PathNode.LineTo(173.25f, 47.43f),
                    PathNode.CurveTo(170.95937f, 49.718094f, 170.27368f, 53.161263f, 171.513f, 56.15232f),
                    PathNode.CurveTo(172.75237f, 59.14338f, 175.67235f, 61.09255f, 178.91f, 61.09f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 108.41828f, 195.58173f, 112.0f, 200.0f, 112.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(220.41827f, 112.0f, 224.0f, 108.41828f, 224.0f, 104.0f),
                    PathNode.CurveTo(224.0f, 99.58172f, 220.41827f, 96.0f, 216.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.CurveTo(195.58173f, 96.0f, 192.0f, 99.58172f, 192.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 112.0f),
                    PathNode.CurveTo(92.41828f, 112.0f, 96.0f, 108.41828f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 86.32689f, 110.32689f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(145.67311f, 72.0f, 160.0f, 86.32689f, 160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 108.41828f, 163.58173f, 112.0f, 168.0f, 112.0f),
                    PathNode.CurveTo(172.41827f, 112.0f, 176.0f, 108.41828f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 77.49033f, 154.50967f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(101.49033f, 56.0f, 80.0f, 77.49033f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 108.41828f, 83.58172f, 112.0f, 88.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.91f, 220.0f),
                    PathNode.CurveTo(237.48419f, 222.46959f, 234.85162f, 223.9935f, 232.0f, 224.0f),
                    PathNode.LineTo(24.0f, 224.0f),
                    PathNode.CurveTo(21.147526f, 224.01338f, 18.503714f, 222.50693f, 17.061037f, 220.04614f),
                    PathNode.CurveTo(15.618366f, 217.58536f, 15.595109f, 214.54256f, 17.0f, 212.06f),
                    PathNode.LineTo(57.69f, 140.06f),
                    PathNode.CurveTo(59.11638f, 137.53932f, 61.79377f, 135.98643f, 64.69f, 136.0f),
                    PathNode.LineTo(191.3f, 136.0f),
                    PathNode.CurveTo(194.19623f, 135.98643f, 196.87363f, 137.53932f, 198.3f, 140.06f),
                    PathNode.LineTo(238.99f, 212.06f),
                    PathNode.CurveTo(240.37137f, 214.53406f, 240.34096f, 217.55428f, 238.91f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.64f, 152.0f),
                    PathNode.LineTo(162.27f, 152.0f),
                    PathNode.LineTo(165.75f, 168.0f),
                    PathNode.LineTo(195.68f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.38f, 168.0f),
                    PathNode.LineTo(145.9f, 152.0f),
                    PathNode.LineTo(110.1f, 152.0f),
                    PathNode.LineTo(106.62f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(103.14f, 184.0f),
                    PathNode.LineTo(97.93f, 208.0f),
                    PathNode.LineTo(158.07f, 208.0f),
                    PathNode.LineTo(152.86f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.32f, 168.0f),
                    PathNode.LineTo(90.25f, 168.0f),
                    PathNode.LineTo(93.73f, 152.0f),
                    PathNode.LineTo(69.36f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(37.71f, 208.0f),
                    PathNode.LineTo(81.55f, 208.0f),
                    PathNode.LineTo(86.77f, 184.0f),
                    PathNode.LineTo(51.28f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.29f, 208.0f),
                    PathNode.LineTo(204.72f, 184.0f),
                    PathNode.LineTo(169.23f, 184.0f),
                    PathNode.LineTo(174.45f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
