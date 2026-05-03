package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = phosphorThinIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 40.0f),
                    PathNode.LineTo(220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 82.20914f, 218.20914f, 84.0f, 216.0f, 84.0f),
                    PathNode.CurveTo(213.79086f, 84.0f, 212.0f, 82.20914f, 212.0f, 80.0f),
                    PathNode.LineTo(212.0f, 44.0f),
                    PathNode.LineTo(176.0f, 44.0f),
                    PathNode.CurveTo(173.79086f, 44.0f, 172.0f, 42.20914f, 172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 37.79086f, 173.79086f, 36.0f, 176.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(218.20914f, 36.0f, 220.0f, 37.79086f, 220.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 212.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 173.79086f, 42.20914f, 172.0f, 40.0f, 172.0f),
                    PathNode.CurveTo(37.79086f, 172.0f, 36.0f, 173.79086f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 218.20914f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(82.20914f, 220.0f, 84.0f, 218.20914f, 84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 213.79086f, 82.20914f, 212.0f, 80.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 172.0f),
                    PathNode.CurveTo(213.79086f, 172.0f, 212.0f, 173.79086f, 212.0f, 176.0f),
                    PathNode.LineTo(212.0f, 212.0f),
                    PathNode.LineTo(176.0f, 212.0f),
                    PathNode.CurveTo(173.79086f, 212.0f, 172.0f, 213.79086f, 172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 218.20914f, 173.79086f, 220.0f, 176.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 173.79086f, 218.20914f, 172.0f, 216.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 84.0f),
                    PathNode.CurveTo(42.20914f, 84.0f, 44.0f, 82.20914f, 44.0f, 80.0f),
                    PathNode.LineTo(44.0f, 44.0f),
                    PathNode.LineTo(80.0f, 44.0f),
                    PathNode.CurveTo(82.20914f, 44.0f, 84.0f, 42.20914f, 84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 37.79086f, 82.20914f, 36.0f, 80.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(37.79086f, 36.0f, 36.0f, 37.79086f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 82.20914f, 37.79086f, 84.0f, 40.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 76.0f),
                    PathNode.LineTo(176.0f, 76.0f),
                    PathNode.CurveTo(178.20914f, 76.0f, 180.0f, 77.79086f, 180.0f, 80.0f),
                    PathNode.LineTo(180.0f, 176.0f),
                    PathNode.CurveTo(180.0f, 178.20914f, 178.20914f, 180.0f, 176.0f, 180.0f),
                    PathNode.LineTo(80.0f, 180.0f),
                    PathNode.CurveTo(77.79086f, 180.0f, 76.0f, 178.20914f, 76.0f, 176.0f),
                    PathNode.LineTo(76.0f, 80.0f),
                    PathNode.CurveTo(76.0f, 77.79086f, 77.79086f, 76.0f, 80.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 172.0f),
                    PathNode.LineTo(172.0f, 172.0f),
                    PathNode.LineTo(172.0f, 84.0f),
                    PathNode.LineTo(84.0f, 84.0f),
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
        return _scan!!
    }

private var _scan: ImageVector? = null
