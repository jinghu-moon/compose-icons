package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorThinIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(219.91f, 124.0f),
                    PathNode.LineTo(187.85f, 124.0f),
                    PathNode.CurveTo(185.80983f, 94.04061f, 161.9594f, 70.19018f, 132.0f, 68.15f),
                    PathNode.LineTo(132.0f, 36.09f),
                    PathNode.CurveTo(179.63838f, 38.226383f, 217.77362f, 76.36161f, 219.91f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 124.0f),
                    PathNode.LineTo(76.17f, 124.0f),
                    PathNode.CurveTo(78.16906f, 98.458015f, 98.458015f, 78.16906f, 124.0f, 76.17f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 132.0f),
                    PathNode.LineTo(124.0f, 179.83f),
                    PathNode.CurveTo(98.458015f, 177.83093f, 78.16906f, 157.542f, 76.17f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 132.0f),
                    PathNode.LineTo(179.83f, 132.0f),
                    PathNode.CurveTo(177.83093f, 157.542f, 157.542f, 177.83093f, 132.0f, 179.83f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 124.0f),
                    PathNode.LineTo(132.0f, 76.17f),
                    PathNode.CurveTo(157.542f, 78.16906f, 177.83093f, 98.458015f, 179.83f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 36.09f),
                    PathNode.LineTo(124.0f, 68.15f),
                    PathNode.CurveTo(94.04061f, 70.19018f, 70.19018f, 94.04061f, 68.15f, 124.0f),
                    PathNode.LineTo(36.09f, 124.0f),
                    PathNode.CurveTo(38.226383f, 76.36161f, 76.36161f, 38.226383f, 124.0f, 36.09f),
                    PathNode.Close,
                    PathNode.MoveTo(36.09f, 132.0f),
                    PathNode.LineTo(68.15f, 132.0f),
                    PathNode.CurveTo(70.19018f, 161.9594f, 94.04061f, 185.80983f, 124.0f, 187.85f),
                    PathNode.LineTo(124.0f, 219.91f),
                    PathNode.CurveTo(76.36161f, 217.77362f, 38.226383f, 179.63838f, 36.09f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 219.91f),
                    PathNode.LineTo(132.0f, 187.85f),
                    PathNode.CurveTo(161.9594f, 185.80983f, 185.80983f, 161.9594f, 187.85f, 132.0f),
                    PathNode.LineTo(219.91f, 132.0f),
                    PathNode.CurveTo(217.77362f, 179.63838f, 179.63838f, 217.77362f, 132.0f, 219.91f),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
