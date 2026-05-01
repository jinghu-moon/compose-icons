package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorThinIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 106.83f),
                    PathNode.LineTo(178.83f, 154.83f),
                    PathNode.CurveTo(177.26703f, 156.39296f, 174.73297f, 156.39296f, 173.17f, 154.83f),
                    PathNode.CurveTo(171.60704f, 153.26703f, 171.60704f, 150.73297f, 173.17f, 149.17f),
                    PathNode.LineTo(214.34f, 108.0f),
                    PathNode.LineTo(165.0f, 108.0f),
                    PathNode.CurveTo(123.03648f, 107.98569f, 86.38088f, 136.36899f, 75.89f, 177.0f),
                    PathNode.CurveTo(75.432434f, 178.77225f, 73.83032f, 180.00778f, 72.0f, 180.0f),
                    PathNode.CurveTo(71.66242f, 180.00047f, 71.32624f, 179.95676f, 71.0f, 179.87f),
                    PathNode.CurveTo(68.86369f, 179.31635f, 67.57942f, 177.1371f, 68.13f, 175.0f),
                    PathNode.CurveTo(79.512314f, 130.81738f, 119.3748f, 99.954506f, 165.0f, 100.0f),
                    PathNode.LineTo(214.36f, 100.0f),
                    PathNode.LineTo(173.17f, 58.83f),
                    PathNode.CurveTo(171.60704f, 57.267033f, 171.60704f, 54.732967f, 173.17f, 53.17f),
                    PathNode.CurveTo(174.73297f, 51.607033f, 177.26703f, 51.607033f, 178.83f, 53.17f),
                    PathNode.LineTo(226.83f, 101.17f),
                    PathNode.CurveTo(227.58112f, 101.92027f, 228.00314f, 102.93836f, 228.00314f, 104.0f),
                    PathNode.CurveTo(228.00314f, 105.06164f, 227.58112f, 106.07973f, 226.83f, 106.83f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 212.0f),
                    PathNode.LineTo(36.0f, 212.0f),
                    PathNode.LineTo(36.0f, 88.0f),
                    PathNode.CurveTo(36.0f, 85.79086f, 34.20914f, 84.0f, 32.0f, 84.0f),
                    PathNode.CurveTo(29.790861f, 84.0f, 28.0f, 85.79086f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 218.20914f, 29.790861f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(194.20914f, 220.0f, 196.0f, 218.20914f, 196.0f, 216.0f),
                    PathNode.CurveTo(196.0f, 213.79086f, 194.20914f, 212.0f, 192.0f, 212.0f),
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
        return _share!!
    }

private var _share: ImageVector? = null
