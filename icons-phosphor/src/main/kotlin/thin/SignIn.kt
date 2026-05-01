package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorThinIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.83f, 130.83f),
                    PathNode.LineTo(98.83f, 170.83f),
                    PathNode.CurveTo(97.26704f, 172.39296f, 94.73296f, 172.39296f, 93.17f, 170.83f),
                    PathNode.CurveTo(91.60703f, 169.26703f, 91.60703f, 166.73297f, 93.17f, 165.17f),
                    PathNode.LineTo(126.34f, 132.0f),
                    PathNode.LineTo(24.0f, 132.0f),
                    PathNode.CurveTo(21.790861f, 132.0f, 20.0f, 130.20914f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 125.79086f, 21.790861f, 124.0f, 24.0f, 124.0f),
                    PathNode.LineTo(126.34f, 124.0f),
                    PathNode.LineTo(93.17f, 90.83f),
                    PathNode.CurveTo(91.60703f, 89.26704f, 91.60703f, 86.73296f, 93.17f, 85.17f),
                    PathNode.CurveTo(94.73296f, 83.60703f, 97.26704f, 83.60703f, 98.83f, 85.17f),
                    PathNode.LineTo(138.83f, 125.17f),
                    PathNode.CurveTo(139.58112f, 125.92027f, 140.00314f, 126.93836f, 140.00314f, 128.0f),
                    PathNode.CurveTo(140.00314f, 129.06163f, 139.58112f, 130.07973f, 138.83f, 130.83f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.LineTo(136.0f, 36.0f),
                    PathNode.CurveTo(133.79086f, 36.0f, 132.0f, 37.79086f, 132.0f, 40.0f),
                    PathNode.CurveTo(132.0f, 42.20914f, 133.79086f, 44.0f, 136.0f, 44.0f),
                    PathNode.LineTo(196.0f, 44.0f),
                    PathNode.LineTo(196.0f, 212.0f),
                    PathNode.LineTo(136.0f, 212.0f),
                    PathNode.CurveTo(133.79086f, 212.0f, 132.0f, 213.79086f, 132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 218.20914f, 133.79086f, 220.0f, 136.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(202.20914f, 220.0f, 204.0f, 218.20914f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 37.79086f, 202.20914f, 36.0f, 200.0f, 36.0f),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null
