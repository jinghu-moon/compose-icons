package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorLightIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.52f, 64.0f),
                    PathNode.CurveTo(44.23f, 81.46f, 38.0f, 103.0f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 153.0f, 44.23f, 174.54f, 56.52f, 192.0f),
                    PathNode.CurveTo(65.69f, 205.0f, 75.01f, 210.81f, 75.11f, 210.87f),
                    PathNode.CurveTo(77.85539f, 212.62094f, 78.70312f, 216.24205f, 77.020226f, 219.02968f),
                    PathNode.CurveTo(75.33733f, 221.8173f, 71.738174f, 222.75381f, 68.91f, 221.14f),
                    PathNode.CurveTo(67.16f, 220.09f, 26.0f, 194.63f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 61.37f, 67.16f, 35.91f, 68.91f, 34.86f),
                    PathNode.CurveTo(71.738174f, 33.246178f, 75.33733f, 34.1827f, 77.020226f, 36.970325f),
                    PathNode.CurveTo(78.70312f, 39.757954f, 77.85539f, 43.37906f, 75.11f, 45.13f),
                    PathNode.CurveTo(75.0f, 45.19f, 65.69f, 51.0f, 56.52f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.09f, 34.86f),
                    PathNode.CurveTo(184.26183f, 33.246178f, 180.66266f, 34.1827f, 178.97977f, 36.970325f),
                    PathNode.CurveTo(177.29689f, 39.757954f, 178.1446f, 43.37906f, 180.89f, 45.13f),
                    PathNode.CurveTo(180.99f, 45.19f, 190.31f, 50.97f, 199.48f, 64.0f),
                    PathNode.CurveTo(211.77f, 81.46f, 218.0f, 103.0f, 218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 153.0f, 211.77f, 174.54f, 199.48f, 192.0f),
                    PathNode.CurveTo(190.31f, 205.0f, 180.99f, 210.81f, 180.91f, 210.85f),
                    PathNode.CurveTo(178.0685f, 212.55656f, 177.14844f, 216.2435f, 178.855f, 219.085f),
                    PathNode.CurveTo(180.56155f, 221.9265f, 184.24849f, 222.84656f, 187.09f, 221.14f),
                    PathNode.CurveTo(188.84f, 220.14f, 230.0f, 194.63f, 230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 61.37f, 188.84f, 35.91f, 187.09f, 34.86f),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
