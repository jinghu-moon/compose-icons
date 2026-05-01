package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorLightIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(142.1f, 19.38f),
                    PathNode.CurveTo(140.59871f, 18.133265f, 138.58487f, 17.694536f, 136.70102f, 18.203793f),
                    PathNode.CurveTo(134.81717f, 18.713049f, 133.29868f, 20.106665f, 132.63f, 21.94f),
                    PathNode.LineTo(109.54f, 85.25f),
                    PathNode.LineTo(83.2f, 59.69f),
                    PathNode.CurveTo(81.96736f, 58.47814f, 80.27196f, 57.85678f, 78.54814f, 57.985107f),
                    PathNode.CurveTo(76.824326f, 58.113434f, 75.23962f, 58.978985f, 74.2f, 60.36f),
                    PathNode.CurveTo(52.85f, 88.39f, 42.0f, 116.53f, 42.0f, 144.0f),
                    PathNode.CurveTo(42.0f, 191.49649f, 80.50351f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(175.49649f, 230.0f, 214.0f, 191.49649f, 214.0f, 144.0f),
                    PathNode.CurveTo(214.0f, 85.4f, 163.72f, 37.33f, 142.1f, 19.38f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(87.15149f, 217.95041f, 54.04959f, 184.84851f, 54.0f, 144.0f),
                    PathNode.CurveTo(54.0f, 121.0f, 62.67f, 97.13f, 79.77f, 73.09f),
                    PathNode.LineTo(107.82f, 100.31f),
                    PathNode.CurveTo(109.27935f, 101.728485f, 111.35825f, 102.31051f, 113.34199f, 101.85599f),
                    PathNode.CurveTo(115.32572f, 101.40147f, 116.943825f, 99.97237f, 117.64f, 98.06f),
                    PathNode.LineTo(140.93f, 34.2f),
                    PathNode.CurveTo(163.35f, 54.16f, 202.0f, 95.6f, 202.0f, 144.0f),
                    PathNode.CurveTo(201.95041f, 184.84851f, 168.84851f, 217.95041f, 128.0f, 218.0f),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
