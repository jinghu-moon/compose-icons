package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorThinIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 212.0f),
                    PathNode.LineTo(236.0f, 212.0f),
                    PathNode.LineTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 121.37258f, 230.62741f, 116.0f, 224.0f, 116.0f),
                    PathNode.LineTo(164.0f, 116.0f),
                    PathNode.LineTo(164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 41.37258f, 158.62741f, 36.0f, 152.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(49.37258f, 36.0f, 44.0f, 41.37258f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(29.790861f, 212.0f, 28.0f, 213.79086f, 28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 218.20914f, 29.790861f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(248.0f, 220.0f),
                    PathNode.CurveTo(250.20914f, 220.0f, 252.0f, 218.20914f, 252.0f, 216.0f),
                    PathNode.CurveTo(252.0f, 213.79086f, 250.20914f, 212.0f, 248.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 124.0f),
                    PathNode.CurveTo(226.20914f, 124.0f, 228.0f, 125.79086f, 228.0f, 128.0f),
                    PathNode.LineTo(228.0f, 212.0f),
                    PathNode.LineTo(164.0f, 212.0f),
                    PathNode.LineTo(164.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 48.0f),
                    PathNode.CurveTo(52.0f, 45.79086f, 53.79086f, 44.0f, 56.0f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(154.20914f, 44.0f, 156.0f, 45.79086f, 156.0f, 48.0f),
                    PathNode.LineTo(156.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(132.0f, 160.0f),
                    PathNode.CurveTo(132.0f, 157.79086f, 130.20914f, 156.0f, 128.0f, 156.0f),
                    PathNode.LineTo(80.0f, 156.0f),
                    PathNode.CurveTo(77.79086f, 156.0f, 76.0f, 157.79086f, 76.0f, 160.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(52.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 212.0f),
                    PathNode.LineTo(84.0f, 212.0f),
                    PathNode.LineTo(84.0f, 164.0f),
                    PathNode.LineTo(124.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 93.79086f, 77.79086f, 92.0f, 80.0f, 92.0f),
                    PathNode.LineTo(100.0f, 92.0f),
                    PathNode.LineTo(100.0f, 72.0f),
                    PathNode.CurveTo(100.0f, 69.79086f, 101.79086f, 68.0f, 104.0f, 68.0f),
                    PathNode.CurveTo(106.20914f, 68.0f, 108.0f, 69.79086f, 108.0f, 72.0f),
                    PathNode.LineTo(108.0f, 92.0f),
                    PathNode.LineTo(128.0f, 92.0f),
                    PathNode.CurveTo(130.20914f, 92.0f, 132.0f, 93.79086f, 132.0f, 96.0f),
                    PathNode.CurveTo(132.0f, 98.20914f, 130.20914f, 100.0f, 128.0f, 100.0f),
                    PathNode.LineTo(108.0f, 100.0f),
                    PathNode.LineTo(108.0f, 120.0f),
                    PathNode.CurveTo(108.0f, 122.20914f, 106.20914f, 124.0f, 104.0f, 124.0f),
                    PathNode.CurveTo(101.79086f, 124.0f, 100.0f, 122.20914f, 100.0f, 120.0f),
                    PathNode.LineTo(100.0f, 100.0f),
                    PathNode.LineTo(80.0f, 100.0f),
                    PathNode.CurveTo(77.79086f, 100.0f, 76.0f, 98.20914f, 76.0f, 96.0f),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
