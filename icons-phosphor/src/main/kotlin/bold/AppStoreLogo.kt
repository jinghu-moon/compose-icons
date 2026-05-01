package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorBoldIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 160.0f),
                    PathNode.CurveTo(244.0f, 166.62741f, 238.62741f, 172.0f, 232.0f, 172.0f),
                    PathNode.LineTo(200.67f, 172.0f),
                    PathNode.LineTo(218.33f, 201.89f),
                    PathNode.CurveTo(220.5722f, 205.58366f, 220.65547f, 210.19757f, 218.54802f, 213.96974f),
                    PathNode.CurveTo(216.44054f, 217.74191f, 212.46782f, 220.08978f, 208.14696f, 220.11674f),
                    PathNode.CurveTo(203.82608f, 220.1437f, 199.82436f, 217.84558f, 197.67f, 214.1f),
                    PathNode.LineTo(140.9f, 118.0f),
                    PathNode.CurveTo(137.72063f, 112.311775f, 139.66191f, 105.12578f, 145.27309f, 101.81231f),
                    PathNode.CurveTo(150.88426f, 98.49884f, 158.1143f, 100.26904f, 161.56f, 105.8f),
                    PathNode.LineTo(186.48f, 148.0f),
                    PathNode.LineTo(232.0f, 148.0f),
                    PathNode.CurveTo(238.62741f, 148.0f, 244.0f, 153.37259f, 244.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(133.15f, 148.0f),
                    PathNode.LineTo(97.39f, 148.0f),
                    PathNode.LineTo(162.33f, 38.11f),
                    PathNode.CurveTo(164.5722f, 34.416336f, 164.65547f, 29.802422f, 162.54802f, 26.030256f),
                    PathNode.CurveTo(160.44054f, 22.25809f, 156.46782f, 19.910213f, 152.14696f, 19.883257f),
                    PathNode.CurveTo(147.82608f, 19.856298f, 143.82436f, 22.154423f, 141.67f, 25.9f),
                    PathNode.LineTo(128.0f, 49.0f),
                    PathNode.LineTo(114.33f, 25.9f),
                    PathNode.CurveTo(112.17564f, 22.154423f, 108.17391f, 19.856298f, 103.85305f, 19.883257f),
                    PathNode.CurveTo(99.53218f, 19.910213f, 95.55944f, 22.25809f, 93.45198f, 26.030256f),
                    PathNode.CurveTo(91.34452f, 29.802422f, 91.427795f, 34.416336f, 93.67f, 38.11f),
                    PathNode.LineTo(114.06f, 72.62f),
                    PathNode.LineTo(69.52f, 148.0f),
                    PathNode.LineTo(24.0f, 148.0f),
                    PathNode.CurveTo(17.372583f, 148.0f, 12.0f, 153.37259f, 12.0f, 160.0f),
                    PathNode.CurveTo(12.0f, 166.62741f, 17.372583f, 172.0f, 24.0f, 172.0f),
                    PathNode.LineTo(133.15f, 172.0f),
                    PathNode.CurveTo(139.77742f, 172.0f, 145.15f, 166.62741f, 145.15f, 160.0f),
                    PathNode.CurveTo(145.15f, 153.37259f, 139.77742f, 148.0f, 133.15f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(58.83f, 189.67f),
                    PathNode.CurveTo(53.127228f, 186.30135f, 45.77354f, 188.19011f, 42.4f, 193.89f),
                    PathNode.LineTo(37.67f, 201.89f),
                    PathNode.CurveTo(35.427795f, 205.58366f, 35.34452f, 210.19757f, 37.45198f, 213.96974f),
                    PathNode.CurveTo(39.55944f, 217.74191f, 43.532177f, 220.08978f, 47.853046f, 220.11674f),
                    PathNode.CurveTo(52.173916f, 220.1437f, 56.175636f, 217.84558f, 58.33f, 214.1f),
                    PathNode.LineTo(63.06f, 206.1f),
                    PathNode.CurveTo(66.42694f, 200.39462f, 64.533485f, 193.04015f, 58.83f, 189.67f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
