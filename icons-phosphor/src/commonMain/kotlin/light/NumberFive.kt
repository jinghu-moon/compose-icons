package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorLightIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 160.0f),
                    PathNode.CurveTo(174.0003f, 181.2951f, 161.48538f, 200.60182f, 142.04576f, 209.29565f),
                    PathNode.CurveTo(122.60615f, 217.98947f, 99.87244f, 214.44673f, 84.0f, 200.25f),
                    PathNode.CurveTo(82.34504f, 198.83633f, 81.58544f, 196.63727f, 82.01505f, 194.50354f),
                    PathNode.CurveTo(82.444664f, 192.36981f, 83.99612f, 190.63608f, 86.06921f, 189.97302f),
                    PathNode.CurveTo(88.1423f, 189.30997f, 90.4119f, 189.82161f, 92.0f, 191.31f),
                    PathNode.CurveTo(108.73545f, 206.27724f, 134.28285f, 205.43558f, 149.99689f, 189.3993f),
                    PathNode.CurveTo(165.71094f, 173.36302f, 166.0339f, 147.8038f, 150.73009f, 131.37558f),
                    PathNode.CurveTo(135.42628f, 114.94735f, 109.9083f, 113.46043f, 92.8f, 128.0f),
                    PathNode.CurveTo(90.855606f, 129.6805f, 88.05687f, 129.93605f, 85.84027f, 128.63548f),
                    PathNode.CurveTo(83.62368f, 127.33494f, 82.481514f, 124.76712f, 83.0f, 122.25f),
                    PathNode.LineTo(98.12f, 46.82f),
                    PathNode.CurveTo(98.68202f, 44.01805f, 101.14224f, 42.001343f, 104.0f, 42.0f),
                    PathNode.LineTo(168.0f, 42.0f),
                    PathNode.CurveTo(171.3137f, 42.0f, 174.0f, 44.68629f, 174.0f, 48.0f),
                    PathNode.CurveTo(174.0f, 51.31371f, 171.3137f, 54.0f, 168.0f, 54.0f),
                    PathNode.LineTo(108.92f, 54.0f),
                    PathNode.LineTo(97.54f, 110.89f),
                    PathNode.CurveTo(114.257225f, 103.24415f, 133.71579f, 104.62784f, 149.18289f, 114.5623f),
                    PathNode.CurveTo(164.65f, 124.496765f, 174.00084f, 141.61726f, 174.0f, 160.0f),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
