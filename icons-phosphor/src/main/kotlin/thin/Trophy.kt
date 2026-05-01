package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorThinIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 68.0f),
                    PathNode.LineTo(204.0f, 68.0f),
                    PathNode.LineTo(204.0f, 48.0f),
                    PathNode.CurveTo(204.0f, 45.79086f, 202.20914f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(53.79086f, 44.0f, 52.0f, 45.79086f, 52.0f, 48.0f),
                    PathNode.LineTo(52.0f, 68.0f),
                    PathNode.LineTo(24.0f, 68.0f),
                    PathNode.CurveTo(17.372583f, 68.0f, 12.0f, 73.37258f, 12.0f, 80.0f),
                    PathNode.LineTo(12.0f, 96.0f),
                    PathNode.CurveTo(12.0f, 115.88225f, 28.117748f, 132.0f, 48.0f, 132.0f),
                    PathNode.LineTo(54.66f, 132.0f),
                    PathNode.CurveTo(63.293102f, 163.63972f, 91.2486f, 186.17265f, 124.0f, 187.89f),
                    PathNode.LineTo(124.0f, 220.0f),
                    PathNode.LineTo(96.0f, 220.0f),
                    PathNode.CurveTo(93.79086f, 220.0f, 92.0f, 221.79086f, 92.0f, 224.0f),
                    PathNode.CurveTo(92.0f, 226.20914f, 93.79086f, 228.0f, 96.0f, 228.0f),
                    PathNode.LineTo(160.0f, 228.0f),
                    PathNode.CurveTo(162.20914f, 228.0f, 164.0f, 226.20914f, 164.0f, 224.0f),
                    PathNode.CurveTo(164.0f, 221.79086f, 162.20914f, 220.0f, 160.0f, 220.0f),
                    PathNode.LineTo(132.0f, 220.0f),
                    PathNode.LineTo(132.0f, 187.88f),
                    PathNode.CurveTo(164.93f, 186.14f, 192.41f, 162.97f, 201.11f, 132.0f),
                    PathNode.LineTo(208.0f, 132.0f),
                    PathNode.CurveTo(227.88223f, 132.0f, 244.0f, 115.88225f, 244.0f, 96.0f),
                    PathNode.LineTo(244.0f, 80.0f),
                    PathNode.CurveTo(244.0f, 73.37258f, 238.62741f, 68.0f, 232.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 124.0f),
                    PathNode.CurveTo(32.536026f, 124.0f, 20.0f, 111.463974f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 80.0f),
                    PathNode.CurveTo(20.0f, 77.79086f, 21.790861f, 76.0f, 24.0f, 76.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(52.0f, 112.0f),
                    PathNode.CurveTo(52.019573f, 116.01997f, 52.353928f, 120.032234f, 53.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 111.1f),
                    PathNode.CurveTo(196.0f, 148.81f, 165.21f, 179.72f, 128.0f, 180.0f),
                    PathNode.CurveTo(90.44463f, 180.0f, 60.0f, 149.55536f, 60.0f, 112.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.LineTo(196.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 96.0f),
                    PathNode.CurveTo(236.0f, 111.463974f, 223.46397f, 124.0f, 208.0f, 124.0f),
                    PathNode.LineTo(202.9f, 124.0f),
                    PathNode.CurveTo(203.62653f, 119.7383f, 203.99448f, 115.42319f, 204.0f, 111.1f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(232.0f, 76.0f),
                    PathNode.CurveTo(234.20914f, 76.0f, 236.0f, 77.79086f, 236.0f, 80.0f),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
