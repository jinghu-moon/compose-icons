package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorThinIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.07f, 49.48f),
                    PathNode.CurveTo(239.85939f, 46.064327f, 236.06862f, 44.001427f, 232.0f, 44.0f),
                    PathNode.LineTo(88.81f, 44.0f),
                    PathNode.CurveTo(84.06622f, 43.97829f, 79.75492f, 46.753204f, 77.81f, 51.08f),
                    PathNode.LineTo(13.01f, 195.08f),
                    PathNode.CurveTo(11.337541f, 198.80048f, 11.669567f, 203.11577f, 13.891491f, 206.5366f),
                    PathNode.CurveTo(16.113417f, 209.95743f, 19.920927f, 212.0153f, 24.0f, 212.0f),
                    PathNode.LineTo(167.19f, 212.0f),
                    PathNode.CurveTo(171.91566f, 212.00195f, 176.20248f, 209.23021f, 178.14f, 204.92f),
                    PathNode.LineTo(242.94f, 60.92f),
                    PathNode.CurveTo(244.6098f, 57.20605f, 244.28223f, 52.898724f, 242.07f, 49.48f),
                    PathNode.Close,
                    PathNode.MoveTo(235.64f, 57.64f),
                    PathNode.LineTo(170.84f, 201.64f),
                    PathNode.CurveTo(170.19415f, 203.07674f, 168.76523f, 204.00066f, 167.19f, 204.0f),
                    PathNode.LineTo(24.0f, 204.0f),
                    PathNode.CurveTo(22.642673f, 204.00056f, 21.377674f, 203.31277f, 20.64022f, 202.17325f),
                    PathNode.CurveTo(19.90277f, 201.03374f, 19.793497f, 199.59798f, 20.35f, 198.36f),
                    PathNode.LineTo(85.15f, 54.36f),
                    PathNode.CurveTo(85.797325f, 52.91995f, 87.231155f, 51.995403f, 88.81f, 52.0f),
                    PathNode.LineTo(232.0f, 52.0f),
                    PathNode.CurveTo(233.35733f, 51.99944f, 234.62233f, 52.687233f, 235.35977f, 53.826748f),
                    PathNode.CurveTo(236.09723f, 54.966263f, 236.2065f, 56.402004f, 235.65f, 57.64f),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
