package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorLightIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(197.29f, 125.17f),
                    PathNode.CurveTo(196.2462f, 123.21862f, 194.213f, 122.00025f, 192.0f, 122.0f),
                    PathNode.LineTo(139.21f, 122.0f),
                    PathNode.LineTo(165.0f, 83.33f),
                    PathNode.CurveTo(166.22919f, 81.487656f, 166.3435f, 79.11799f, 165.29736f, 77.16588f),
                    PathNode.CurveTo(164.25122f, 75.21377f, 162.21475f, 73.99671f, 160.0f, 74.0f),
                    PathNode.LineTo(96.0f, 74.0f),
                    PathNode.CurveTo(93.78524f, 73.99671f, 91.74879f, 75.21377f, 90.70264f, 77.16588f),
                    PathNode.CurveTo(89.656494f, 79.11799f, 89.770805f, 81.487656f, 91.0f, 83.33f),
                    PathNode.LineTo(116.79f, 122.0f),
                    PathNode.LineTo(64.0f, 122.0f),
                    PathNode.CurveTo(61.785244f, 121.99671f, 59.748787f, 123.21377f, 58.70264f, 125.16588f),
                    PathNode.CurveTo(57.656494f, 127.11799f, 57.770805f, 129.48766f, 59.0f, 131.33f),
                    PathNode.LineTo(91.0f, 179.33f),
                    PathNode.CurveTo(92.11165f, 181.00587f, 93.98895f, 182.01338f, 96.0f, 182.01338f),
                    PathNode.CurveTo(98.01105f, 182.01338f, 99.88835f, 181.00587f, 101.0f, 179.33f),
                    PathNode.LineTo(128.0f, 138.82f),
                    PathNode.LineTo(155.0f, 179.33f),
                    PathNode.CurveTo(156.11165f, 181.00587f, 157.98895f, 182.01338f, 160.0f, 182.01338f),
                    PathNode.CurveTo(162.01105f, 182.01338f, 163.88835f, 181.00587f, 165.0f, 179.33f),
                    PathNode.LineTo(197.0f, 131.33f),
                    PathNode.CurveTo(198.22522f, 129.48726f, 198.33669f, 127.119705f, 197.29f, 125.17f),
                    PathNode.Close,
                    PathNode.MoveTo(148.79f, 86.0f),
                    PathNode.LineTo(128.0f, 117.18f),
                    PathNode.LineTo(107.21f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 165.18f),
                    PathNode.LineTo(75.21f, 134.0f),
                    PathNode.LineTo(116.79f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 165.18f),
                    PathNode.LineTo(139.21f, 134.0f),
                    PathNode.LineTo(180.79f, 134.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
