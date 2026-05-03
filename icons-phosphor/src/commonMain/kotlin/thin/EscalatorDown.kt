package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorThinIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.17f, 82.83f),
                    PathNode.CurveTo(171.60704f, 81.26704f, 171.60704f, 78.73296f, 173.17f, 77.17f),
                    PathNode.CurveTo(174.73297f, 75.60703f, 177.26703f, 75.60703f, 178.83f, 77.17f),
                    PathNode.LineTo(196.0f, 94.34f),
                    PathNode.LineTo(196.0f, 48.0f),
                    PathNode.CurveTo(196.0f, 45.79086f, 197.79086f, 44.0f, 200.0f, 44.0f),
                    PathNode.CurveTo(202.20914f, 44.0f, 204.0f, 45.79086f, 204.0f, 48.0f),
                    PathNode.LineTo(204.0f, 94.34f),
                    PathNode.LineTo(221.17f, 77.17f),
                    PathNode.CurveTo(222.73297f, 75.60703f, 225.26703f, 75.60703f, 226.83f, 77.17f),
                    PathNode.CurveTo(228.39296f, 78.73296f, 228.39296f, 81.26704f, 226.83f, 82.83f),
                    PathNode.LineTo(202.83f, 106.83f),
                    PathNode.CurveTo(202.07973f, 107.581116f, 201.06163f, 108.00314f, 200.0f, 108.00314f),
                    PathNode.CurveTo(198.93837f, 108.00314f, 197.92027f, 107.581116f, 197.17f, 106.83f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 160.0f),
                    PathNode.LineTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 206.62741f, 230.62741f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(168.0f, 212.0f),
                    PathNode.CurveTo(166.88286f, 211.99942f, 165.81686f, 211.53168f, 165.06f, 210.71f),
                    PathNode.LineTo(70.25f, 108.0f),
                    PathNode.LineTo(32.0f, 108.0f),
                    PathNode.CurveTo(25.372583f, 108.0f, 20.0f, 102.62742f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 49.37258f, 25.372583f, 44.0f, 32.0f, 44.0f),
                    PathNode.LineTo(88.0f, 44.0f),
                    PathNode.CurveTo(89.11714f, 44.000584f, 90.183136f, 44.468315f, 90.94f, 45.29f),
                    PathNode.LineTo(185.75f, 148.0f),
                    PathNode.LineTo(224.0f, 148.0f),
                    PathNode.CurveTo(230.62741f, 148.0f, 236.0f, 153.37259f, 236.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 160.0f),
                    PathNode.CurveTo(228.0f, 157.79086f, 226.20914f, 156.0f, 224.0f, 156.0f),
                    PathNode.LineTo(184.0f, 156.0f),
                    PathNode.CurveTo(182.88286f, 155.99942f, 181.81686f, 155.53168f, 181.06f, 154.71f),
                    PathNode.LineTo(86.25f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(29.790861f, 52.0f, 28.0f, 53.79086f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 96.0f),
                    PathNode.CurveTo(28.0f, 98.20914f, 29.790861f, 100.0f, 32.0f, 100.0f),
                    PathNode.LineTo(72.0f, 100.0f),
                    PathNode.CurveTo(73.11714f, 100.00059f, 74.183136f, 100.468315f, 74.94f, 101.29f),
                    PathNode.LineTo(169.75f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 202.20914f, 228.0f, 200.0f),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
