package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorThinIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(81.62865f, 20.049604f, 44.049603f, 57.628643f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 126.57f, 53.08f, 151.63f, 68.28f, 171.0f),
                    PathNode.CurveTo(80.96f, 187.17f, 96.28f, 197.81f, 112.5f, 202.0f),
                    PathNode.LineTo(100.32f, 230.4f),
                    PathNode.CurveTo(99.77929f, 231.6389f, 99.90088f, 233.06708f, 100.64323f, 234.19673f),
                    PathNode.CurveTo(101.38558f, 235.3264f, 102.64826f, 236.00471f, 104.0f, 236.0f),
                    PathNode.LineTo(152.0f, 236.0f),
                    PathNode.CurveTo(153.34633f, 236.00177f, 154.60327f, 235.32614f, 155.34448f, 234.20221f),
                    PathNode.CurveTo(156.08571f, 233.07828f, 156.2118f, 231.65686f, 155.68f, 230.42f),
                    PathNode.LineTo(143.5f, 202.0f),
                    PathNode.CurveTo(159.73f, 197.83f, 175.04f, 187.19f, 187.72f, 171.0f),
                    PathNode.CurveTo(202.92f, 151.59f, 212.0f, 126.53f, 212.0f, 104.0f),
                    PathNode.CurveTo(211.9504f, 57.628643f, 174.37135f, 20.049604f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(145.93f, 228.0f),
                    PathNode.LineTo(110.07f, 228.0f),
                    PathNode.LineTo(120.55f, 203.54f),
                    PathNode.CurveTo(125.497734f, 204.15334f, 130.50227f, 204.15334f, 135.45f, 203.54f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(85.9f, 196.0f, 52.0f, 145.67f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 62.02636f, 86.02636f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(169.97365f, 28.0f, 204.0f, 62.02636f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 145.67f, 170.1f, 196.0f, 128.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 95.34f),
                    PathNode.CurveTo(180.17636f, 96.38778f, 179.92859f, 97.46267f, 179.31137f, 98.32753f),
                    PathNode.CurveTo(178.69415f, 99.19239f, 177.7582f, 99.77614f, 176.71f, 99.95f),
                    PathNode.CurveTo(176.49023f, 99.96454f, 176.26976f, 99.96454f, 176.05f, 99.95f),
                    PathNode.CurveTo(174.09373f, 99.95236f, 172.42278f, 98.53944f, 172.1f, 96.61f),
                    PathNode.CurveTo(168.73715f, 77.90499f, 154.05861f, 63.28634f, 135.34f, 60.0f),
                    PathNode.CurveTo(133.15848f, 59.63549f, 131.68549f, 57.571526f, 132.05f, 55.39f),
                    PathNode.CurveTo(132.4145f, 53.208477f, 134.47847f, 51.735493f, 136.66f, 52.1f),
                    PathNode.CurveTo(158.74644f, 55.99554f, 176.05345f, 73.26262f, 180.0f, 95.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _balloon!!
    }

private var _balloon: ImageVector? = null
