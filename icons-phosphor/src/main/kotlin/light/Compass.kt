package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorLightIcon(
            name = "Compass",
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
                    PathNode.MoveTo(173.32f, 74.63f),
                    PathNode.LineTo(109.32f, 106.63f),
                    PathNode.CurveTo(108.15528f, 107.21114f, 107.21114f, 108.15528f, 106.63f, 109.32f),
                    PathNode.LineTo(74.63f, 173.32f),
                    PathNode.CurveTo(73.70132f, 175.1802f, 73.801865f, 177.3886f, 74.89574f, 179.15671f),
                    PathNode.CurveTo(75.98961f, 180.92484f, 77.92086f, 182.00063f, 80.0f, 182.0f),
                    PathNode.CurveTo(80.92983f, 181.99838f, 81.84683f, 181.78282f, 82.68f, 181.37f),
                    PathNode.LineTo(146.68f, 149.37f),
                    PathNode.CurveTo(147.84471f, 148.78886f, 148.78886f, 147.84471f, 149.37f, 146.68f),
                    PathNode.LineTo(181.37f, 82.68f),
                    PathNode.CurveTo(182.52516f, 80.37002f, 182.07248f, 77.58002f, 180.24623f, 75.75377f),
                    PathNode.CurveTo(178.41998f, 73.92751f, 175.62997f, 73.474846f, 173.32f, 74.63f),
                    PathNode.Close,
                    PathNode.MoveTo(139.53f, 139.53f),
                    PathNode.LineTo(93.42f, 162.58f),
                    PathNode.LineTo(116.42f, 116.47f),
                    PathNode.LineTo(162.53f, 93.47f),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
