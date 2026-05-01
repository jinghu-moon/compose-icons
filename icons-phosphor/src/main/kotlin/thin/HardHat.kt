package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorThinIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 156.0f),
                    PathNode.LineTo(220.0f, 156.0f),
                    PathNode.LineTo(220.0f, 136.0f),
                    PathNode.CurveTo(219.89566f, 96.007645f, 194.06148f, 60.62693f, 156.0f, 48.35f),
                    PathNode.LineTo(156.0f, 40.0f),
                    PathNode.CurveTo(156.0f, 33.37258f, 150.62741f, 28.0f, 144.0f, 28.0f),
                    PathNode.LineTo(112.0f, 28.0f),
                    PathNode.CurveTo(105.37258f, 28.0f, 100.0f, 33.37258f, 100.0f, 40.0f),
                    PathNode.LineTo(100.0f, 48.35f),
                    PathNode.CurveTo(61.938522f, 60.62693f, 36.10434f, 96.007645f, 36.0f, 136.0f),
                    PathNode.LineTo(36.0f, 156.0f),
                    PathNode.LineTo(32.0f, 156.0f),
                    PathNode.CurveTo(25.372583f, 156.0f, 20.0f, 161.37259f, 20.0f, 168.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 198.62741f, 25.372583f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(230.62741f, 204.0f, 236.0f, 198.62741f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 168.0f),
                    PathNode.CurveTo(236.0f, 161.37259f, 230.62741f, 156.0f, 224.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 136.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.LineTo(156.0f, 56.8f),
                    PathNode.CurveTo(189.50099f, 68.74868f, 211.90338f, 100.43206f, 212.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 36.0f),
                    PathNode.LineTo(144.0f, 36.0f),
                    PathNode.CurveTo(146.20914f, 36.0f, 148.0f, 37.79086f, 148.0f, 40.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.LineTo(108.0f, 156.0f),
                    PathNode.LineTo(108.0f, 40.0f),
                    PathNode.CurveTo(108.0f, 37.79086f, 109.79086f, 36.0f, 112.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 136.0f),
                    PathNode.CurveTo(44.096615f, 100.43206f, 66.499016f, 68.74868f, 100.0f, 56.8f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(29.790861f, 196.0f, 28.0f, 194.20914f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 168.0f),
                    PathNode.CurveTo(28.0f, 165.79086f, 29.790861f, 164.0f, 32.0f, 164.0f),
                    PathNode.LineTo(224.0f, 164.0f),
                    PathNode.CurveTo(226.20914f, 164.0f, 228.0f, 165.79086f, 228.0f, 168.0f),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
