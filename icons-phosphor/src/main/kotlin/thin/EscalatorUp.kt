package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorThinIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(166.88286f, 44.000584f, 165.81686f, 44.468315f, 165.06f, 45.29f),
                    PathNode.LineTo(70.25f, 148.0f),
                    PathNode.LineTo(32.0f, 148.0f),
                    PathNode.CurveTo(25.372583f, 148.0f, 20.0f, 153.37259f, 20.0f, 160.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 206.62741f, 25.372583f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(89.11714f, 211.99942f, 90.183136f, 211.53168f, 90.94f, 210.71f),
                    PathNode.LineTo(185.75f, 108.0f),
                    PathNode.LineTo(224.0f, 108.0f),
                    PathNode.CurveTo(230.62741f, 108.0f, 236.0f, 102.62742f, 236.0f, 96.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 49.37258f, 230.62741f, 44.0f, 224.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 98.20914f, 226.20914f, 100.0f, 224.0f, 100.0f),
                    PathNode.LineTo(184.0f, 100.0f),
                    PathNode.CurveTo(182.88286f, 100.00059f, 181.81686f, 100.468315f, 181.06f, 101.29f),
                    PathNode.LineTo(86.25f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(29.790861f, 204.0f, 28.0f, 202.20914f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 160.0f),
                    PathNode.CurveTo(28.0f, 157.79086f, 29.790861f, 156.0f, 32.0f, 156.0f),
                    PathNode.LineTo(72.0f, 156.0f),
                    PathNode.CurveTo(73.11714f, 155.99942f, 74.183136f, 155.53168f, 74.94f, 154.71f),
                    PathNode.LineTo(169.75f, 52.0f),
                    PathNode.LineTo(224.0f, 52.0f),
                    PathNode.CurveTo(226.20914f, 52.0f, 228.0f, 53.79086f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.83f, 173.17f),
                    PathNode.CurveTo(228.39296f, 174.73297f, 228.39296f, 177.26703f, 226.83f, 178.83f),
                    PathNode.CurveTo(225.26703f, 180.39296f, 222.73297f, 180.39296f, 221.17f, 178.83f),
                    PathNode.LineTo(204.0f, 161.66f),
                    PathNode.LineTo(204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 210.20914f, 202.20914f, 212.0f, 200.0f, 212.0f),
                    PathNode.CurveTo(197.79086f, 212.0f, 196.0f, 210.20914f, 196.0f, 208.0f),
                    PathNode.LineTo(196.0f, 161.66f),
                    PathNode.LineTo(178.83f, 178.83f),
                    PathNode.CurveTo(177.26703f, 180.39296f, 174.73297f, 180.39296f, 173.17f, 178.83f),
                    PathNode.CurveTo(171.60704f, 177.26703f, 171.60704f, 174.73297f, 173.17f, 173.17f),
                    PathNode.LineTo(197.17f, 149.17f),
                    PathNode.CurveTo(197.92027f, 148.41888f, 198.93837f, 147.99686f, 200.0f, 147.99686f),
                    PathNode.CurveTo(201.06163f, 147.99686f, 202.07973f, 148.41888f, 202.83f, 149.17f),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
