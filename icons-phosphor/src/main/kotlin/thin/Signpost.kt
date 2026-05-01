package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorThinIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.0f, 109.32f),
                    PathNode.LineTo(209.36f, 72.0f),
                    PathNode.CurveTo(207.0846f, 69.46733f, 203.84467f, 68.01444f, 200.44f, 68.0f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(132.0f, 32.0f),
                    PathNode.CurveTo(132.0f, 29.790861f, 130.20914f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(125.79086f, 28.0f, 124.0f, 29.790861f, 124.0f, 32.0f),
                    PathNode.LineTo(124.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(33.37258f, 68.0f, 28.0f, 73.37258f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 150.62741f, 33.37258f, 156.0f, 40.0f, 156.0f),
                    PathNode.LineTo(124.0f, 156.0f),
                    PathNode.LineTo(124.0f, 224.0f),
                    PathNode.CurveTo(124.0f, 226.20914f, 125.79086f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(130.20914f, 228.0f, 132.0f, 226.20914f, 132.0f, 224.0f),
                    PathNode.LineTo(132.0f, 156.0f),
                    PathNode.LineTo(200.44f, 156.0f),
                    PathNode.CurveTo(203.84467f, 155.98555f, 207.0846f, 154.53267f, 209.36f, 152.0f),
                    PathNode.LineTo(243.0f, 114.68f),
                    PathNode.CurveTo(244.37407f, 113.15753f, 244.37407f, 110.84247f, 243.0f, 109.32f),
                    PathNode.Close,
                    PathNode.MoveTo(203.44f, 146.68f),
                    PathNode.CurveTo(202.67444f, 147.5283f, 201.58264f, 148.0087f, 200.44f, 148.0f),
                    PathNode.LineTo(40.0f, 148.0f),
                    PathNode.CurveTo(37.79086f, 148.0f, 36.0f, 146.20914f, 36.0f, 144.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 77.79086f, 37.79086f, 76.0f, 40.0f, 76.0f),
                    PathNode.LineTo(200.44f, 76.0f),
                    PathNode.CurveTo(201.58264f, 75.9913f, 202.67444f, 76.471695f, 203.44f, 77.32f),
                    PathNode.LineTo(234.62f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _signpost!!
    }

private var _signpost: ImageVector? = null
