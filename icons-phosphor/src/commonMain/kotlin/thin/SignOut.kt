package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorThinIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 216.0f),
                    PathNode.CurveTo(116.0f, 218.20914f, 114.20914f, 220.0f, 112.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(45.79086f, 220.0f, 44.0f, 218.20914f, 44.0f, 216.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 37.79086f, 45.79086f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(112.0f, 36.0f),
                    PathNode.CurveTo(114.20914f, 36.0f, 116.0f, 37.79086f, 116.0f, 40.0f),
                    PathNode.CurveTo(116.0f, 42.20914f, 114.20914f, 44.0f, 112.0f, 44.0f),
                    PathNode.LineTo(52.0f, 44.0f),
                    PathNode.LineTo(52.0f, 212.0f),
                    PathNode.LineTo(112.0f, 212.0f),
                    PathNode.CurveTo(114.20914f, 212.0f, 116.0f, 213.79086f, 116.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.83f, 125.17f),
                    PathNode.LineTo(186.83f, 85.17f),
                    PathNode.CurveTo(185.26703f, 83.60703f, 182.73297f, 83.60703f, 181.17f, 85.17f),
                    PathNode.CurveTo(179.60704f, 86.73296f, 179.60704f, 89.26704f, 181.17f, 90.83f),
                    PathNode.LineTo(214.34f, 124.0f),
                    PathNode.LineTo(112.0f, 124.0f),
                    PathNode.CurveTo(109.79086f, 124.0f, 108.0f, 125.79086f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 130.20914f, 109.79086f, 132.0f, 112.0f, 132.0f),
                    PathNode.LineTo(214.34f, 132.0f),
                    PathNode.LineTo(181.17f, 165.17f),
                    PathNode.CurveTo(179.60704f, 166.73297f, 179.60704f, 169.26703f, 181.17f, 170.83f),
                    PathNode.CurveTo(182.73297f, 172.39296f, 185.26703f, 172.39296f, 186.83f, 170.83f),
                    PathNode.LineTo(226.83f, 130.83f),
                    PathNode.CurveTo(227.58112f, 130.07973f, 228.00314f, 129.06163f, 228.00314f, 128.0f),
                    PathNode.CurveTo(228.00314f, 126.93836f, 227.58112f, 125.92027f, 226.83f, 125.17f),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null
