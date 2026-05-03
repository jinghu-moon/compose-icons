package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorThinIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(132.0f, 131.83f),
                    PathNode.CurveTo(159.85728f, 129.68077f, 181.03688f, 105.901955f, 179.96147f, 77.98259f),
                    PathNode.CurveTo(178.88605f, 50.06323f, 155.94006f, 27.984074f, 128.0f, 27.984074f),
                    PathNode.CurveTo(100.05994f, 27.984074f, 77.113945f, 50.06323f, 76.038536f, 77.98259f),
                    PathNode.CurveTo(74.96312f, 105.901955f, 96.142715f, 129.68077f, 124.0f, 131.83f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(37.79086f, 212.0f, 36.0f, 213.79086f, 36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 218.20914f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 213.79086f, 218.20914f, 212.0f, 216.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 80.0f),
                    PathNode.CurveTo(84.0f, 55.69947f, 103.69947f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(152.30052f, 36.0f, 172.0f, 55.69947f, 172.0f, 80.0f),
                    PathNode.CurveTo(172.0f, 104.30053f, 152.30052f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(103.71089f, 123.97244f, 84.02756f, 104.28911f, 84.0f, 80.0f),
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
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
