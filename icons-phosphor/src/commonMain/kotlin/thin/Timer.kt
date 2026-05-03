package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorThinIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(77.18981f, 44.0f, 36.0f, 85.18981f, 36.0f, 136.0f),
                    PathNode.CurveTo(36.0f, 186.8102f, 77.18981f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(178.8102f, 228.0f, 220.0f, 186.8102f, 220.0f, 136.0f),
                    PathNode.CurveTo(219.94489f, 85.21265f, 178.78735f, 44.055115f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(81.60808f, 220.0f, 44.0f, 182.39192f, 44.0f, 136.0f),
                    PathNode.CurveTo(44.0f, 89.60808f, 81.60808f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(174.39192f, 52.0f, 212.0f, 89.60808f, 212.0f, 136.0f),
                    PathNode.CurveTo(211.9504f, 182.37135f, 174.37135f, 219.9504f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.83f, 93.17f),
                    PathNode.CurveTo(171.58112f, 93.92027f, 172.00314f, 94.93836f, 172.00314f, 96.0f),
                    PathNode.CurveTo(172.00314f, 97.06164f, 171.58112f, 98.07973f, 170.83f, 98.83f),
                    PathNode.LineTo(130.83f, 138.83f),
                    PathNode.CurveTo(129.26703f, 140.39296f, 126.73296f, 140.39296f, 125.17f, 138.83f),
                    PathNode.CurveTo(123.60703f, 137.26703f, 123.60703f, 134.73297f, 125.17f, 133.17f),
                    PathNode.LineTo(165.17f, 93.17f),
                    PathNode.CurveTo(165.92027f, 92.418884f, 166.93837f, 91.99686f, 168.0f, 91.99686f),
                    PathNode.CurveTo(169.06163f, 91.99686f, 170.07973f, 92.418884f, 170.83f, 93.17f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 16.0f),
                    PathNode.CurveTo(100.0f, 13.790861f, 101.79086f, 12.0f, 104.0f, 12.0f),
                    PathNode.LineTo(152.0f, 12.0f),
                    PathNode.CurveTo(154.20914f, 12.0f, 156.0f, 13.790861f, 156.0f, 16.0f),
                    PathNode.CurveTo(156.0f, 18.209139f, 154.20914f, 20.0f, 152.0f, 20.0f),
                    PathNode.LineTo(104.0f, 20.0f),
                    PathNode.CurveTo(101.79086f, 20.0f, 100.0f, 18.209139f, 100.0f, 16.0f),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
