package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorBoldIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 204.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(140.0f, 138.79f),
                    PathNode.CurveTo(170.17957f, 132.62962f, 190.79204f, 104.617615f, 187.69617f, 73.97171f),
                    PathNode.CurveTo(184.60031f, 43.3258f, 158.80186f, 20.002247f, 128.0f, 20.002247f),
                    PathNode.CurveTo(97.19812f, 20.002247f, 71.3997f, 43.3258f, 68.30383f, 73.97171f),
                    PathNode.CurveTo(65.20796f, 104.617615f, 85.82044f, 132.62962f, 116.0f, 138.79f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(33.37258f, 204.0f, 28.0f, 209.37259f, 28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 222.62741f, 33.37258f, 228.0f, 40.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 209.37259f, 222.62741f, 204.0f, 216.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 80.0f),
                    PathNode.CurveTo(92.0f, 60.11775f, 108.11775f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(147.88223f, 44.0f, 164.0f, 60.11775f, 164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 99.88225f, 147.88223f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(108.11775f, 116.0f, 92.0f, 99.88225f, 92.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
