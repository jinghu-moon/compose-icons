package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorRegularIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.74f, 160.58f),
                    PathNode.CurveTo(181.88388f, 179.67548f, 145.55681f, 181.14426f, 116.25f, 164.36f),
                    PathNode.LineTo(132.62f, 136.0f),
                    PathNode.LineTo(215.62f, 136.0f),
                    PathNode.CurveTo(214.86462f, 144.4355f, 212.8838f, 152.71585f, 209.74f, 160.58f),
                    PathNode.Close,
                    PathNode.MoveTo(91.12f, 48.11f),
                    PathNode.CurveTo(98.80281f, 44.55175f, 106.961044f, 42.12651f, 115.34f, 40.91f),
                    PathNode.CurveTo(145.80295f, 55.494076f, 165.23148f, 86.22613f, 165.34f, 120.0f),
                    PathNode.LineTo(132.62f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.63f, 120.0f),
                    PathNode.LineTo(181.37f, 120.0f),
                    PathNode.CurveTo(181.26884f, 89.98678f, 168.22856f, 61.4753f, 145.59f, 41.77f),
                    PathNode.CurveTo(183.60997f, 49.58916f, 212.04585f, 81.35015f, 215.63f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(77.27f, 56.13f),
                    PathNode.LineTo(94.39f, 85.78f),
                    PathNode.CurveTo(68.4471f, 100.86758f, 50.274307f, 126.41373f, 44.53f, 155.87f),
                    PathNode.CurveTo(32.230125f, 119.04127f, 45.536423f, 78.5046f, 77.27f, 56.13f),
                    PathNode.Close,
                    PathNode.MoveTo(58.9f, 182.43f),
                    PathNode.CurveTo(56.320213f, 148.77669f, 73.21602f, 116.6129f, 102.39f, 99.64f),
                    PathNode.LineTo(118.76f, 128.0f),
                    PathNode.LineTo(77.27f, 199.87f),
                    PathNode.CurveTo(70.34316f, 194.96628f, 64.156654f, 189.09297f, 58.9f, 182.43f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(115.26292f, 216.01314f, 102.67654f, 213.24536f, 91.12f, 207.89f),
                    PathNode.LineTo(108.25f, 178.22f),
                    PathNode.CurveTo(134.25928f, 193.11395f, 165.42139f, 196.09062f, 193.78f, 186.39f),
                    PathNode.CurveTo(177.1069f, 205.22667f, 153.15576f, 216.00795f, 128.0f, 216.0f),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
