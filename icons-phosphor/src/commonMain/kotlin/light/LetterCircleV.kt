package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LetterCircleV: ImageVector
    get() {
        if (_letterCircleV != null) return _letterCircleV!!
        _letterCircleV = phosphorLightIcon(
            name = "LetterCircleV",
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
                    PathNode.MoveTo(165.57f, 98.23f),
                    PathNode.LineTo(133.57f, 178.23f),
                    PathNode.CurveTo(132.65825f, 180.50682f, 130.45259f, 181.9995f, 128.0f, 181.9995f),
                    PathNode.CurveTo(125.54742f, 181.9995f, 123.34174f, 180.50682f, 122.43f, 178.23f),
                    PathNode.LineTo(90.43f, 98.23f),
                    PathNode.CurveTo(89.6135f, 96.23592f, 89.92899f, 93.95713f, 91.25654f, 92.25988f),
                    PathNode.CurveTo(92.58408f, 90.56263f, 94.719795f, 89.70758f, 96.85183f, 90.01976f),
                    PathNode.CurveTo(98.983864f, 90.33194f, 100.78478f, 91.7634f, 101.57f, 93.77f),
                    PathNode.LineTo(128.0f, 159.84f),
                    PathNode.LineTo(154.43f, 93.77f),
                    PathNode.CurveTo(155.67871f, 90.72034f, 159.1533f, 89.24854f, 162.21263f, 90.47337f),
                    PathNode.CurveTo(165.27196f, 91.69821f, 166.77087f, 95.16119f, 165.57f, 98.23f),
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
        return _letterCircleV!!
    }

private var _letterCircleV: ImageVector? = null
