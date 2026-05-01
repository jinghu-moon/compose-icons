package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorFillIcon(
            name = "CurrencyJpy",
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
                    PathNode.MoveTo(182.4f, 76.8f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(164.41827f, 128.0f, 168.0f, 131.58173f, 168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 140.41827f, 164.41827f, 144.0f, 160.0f, 144.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.CurveTo(164.41827f, 160.0f, 168.0f, 163.58173f, 168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 172.41827f, 164.41827f, 176.0f, 160.0f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 196.41827f, 132.41827f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(123.58172f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(91.58172f, 176.0f, 88.0f, 172.41827f, 88.0f, 168.0f),
                    PathNode.CurveTo(88.0f, 163.58173f, 91.58172f, 160.0f, 96.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.CurveTo(91.58172f, 144.0f, 88.0f, 140.41827f, 88.0f, 136.0f),
                    PathNode.CurveTo(88.0f, 131.58173f, 91.58172f, 128.0f, 96.0f, 128.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(73.6f, 76.8f),
                    PathNode.CurveTo(70.949036f, 73.26538f, 71.665375f, 68.25097f, 75.2f, 65.6f),
                    PathNode.CurveTo(78.73462f, 62.94903f, 83.74903f, 63.66538f, 86.4f, 67.2f),
                    PathNode.LineTo(128.0f, 122.67f),
                    PathNode.LineTo(169.6f, 67.2f),
                    PathNode.CurveTo(172.25096f, 63.66538f, 177.26538f, 62.94903f, 180.8f, 65.6f),
                    PathNode.CurveTo(184.33463f, 68.25097f, 185.05096f, 73.26538f, 182.4f, 76.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null
