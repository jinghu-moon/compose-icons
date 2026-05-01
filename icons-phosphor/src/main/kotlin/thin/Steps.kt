package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorThinIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 56.0f),
                    PathNode.CurveTo(244.0f, 58.20914f, 242.20914f, 60.0f, 240.0f, 60.0f),
                    PathNode.LineTo(188.0f, 60.0f),
                    PathNode.LineTo(188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 106.20914f, 186.20914f, 108.0f, 184.0f, 108.0f),
                    PathNode.LineTo(132.0f, 108.0f),
                    PathNode.LineTo(132.0f, 152.0f),
                    PathNode.CurveTo(132.0f, 154.20914f, 130.20914f, 156.0f, 128.0f, 156.0f),
                    PathNode.LineTo(76.0f, 156.0f),
                    PathNode.LineTo(76.0f, 200.0f),
                    PathNode.CurveTo(76.0f, 202.20914f, 74.20914f, 204.0f, 72.0f, 204.0f),
                    PathNode.LineTo(16.0f, 204.0f),
                    PathNode.CurveTo(13.790861f, 204.0f, 12.0f, 202.20914f, 12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 197.79086f, 13.790861f, 196.0f, 16.0f, 196.0f),
                    PathNode.LineTo(68.0f, 196.0f),
                    PathNode.LineTo(68.0f, 152.0f),
                    PathNode.CurveTo(68.0f, 149.79086f, 69.79086f, 148.0f, 72.0f, 148.0f),
                    PathNode.LineTo(124.0f, 148.0f),
                    PathNode.LineTo(124.0f, 104.0f),
                    PathNode.CurveTo(124.0f, 101.79086f, 125.79086f, 100.0f, 128.0f, 100.0f),
                    PathNode.LineTo(180.0f, 100.0f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 53.79086f, 181.79086f, 52.0f, 184.0f, 52.0f),
                    PathNode.LineTo(240.0f, 52.0f),
                    PathNode.CurveTo(242.20914f, 52.0f, 244.0f, 53.79086f, 244.0f, 56.0f),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
