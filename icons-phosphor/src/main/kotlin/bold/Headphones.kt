package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorBoldIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.73f, 51.85f),
                    PathNode.CurveTo(173.87962f, 20.802492f, 127.34857f, 11.428692f, 86.883194f, 28.109459f),
                    PathNode.CurveTo(46.417828f, 44.790222f, 20.00943f, 84.23136f, 20.0f, 128.0f),
                    PathNode.LineTo(20.0f, 184.0f),
                    PathNode.CurveTo(20.0f, 199.46397f, 32.536026f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(79.463974f, 212.0f, 92.0f, 199.46397f, 92.0f, 184.0f),
                    PathNode.LineTo(92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 128.53603f, 79.463974f, 116.0f, 64.0f, 116.0f),
                    PathNode.LineTo(44.84f, 116.0f),
                    PathNode.CurveTo(50.826508f, 74.67483f, 86.24347f, 44.010796f, 128.0f, 44.0f),
                    PathNode.LineTo(128.64f, 44.0f),
                    PathNode.CurveTo(170.20972f, 44.177967f, 205.3495f, 74.83798f, 211.16f, 116.0f),
                    PathNode.LineTo(192.0f, 116.0f),
                    PathNode.CurveTo(176.53603f, 116.0f, 164.0f, 128.53603f, 164.0f, 144.0f),
                    PathNode.LineTo(164.0f, 184.0f),
                    PathNode.CurveTo(164.0f, 199.46397f, 176.53603f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(223.46397f, 212.0f, 236.0f, 199.46397f, 236.0f, 184.0f),
                    PathNode.LineTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.11107f, 99.46966f, 224.8593f, 72.06889f, 204.73f, 51.85f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 140.0f),
                    PathNode.CurveTo(66.20914f, 140.0f, 68.0f, 141.79086f, 68.0f, 144.0f),
                    PathNode.LineTo(68.0f, 184.0f),
                    PathNode.CurveTo(68.0f, 186.20914f, 66.20914f, 188.0f, 64.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(45.79086f, 188.0f, 44.0f, 186.20914f, 44.0f, 184.0f),
                    PathNode.LineTo(44.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 184.0f),
                    PathNode.CurveTo(212.0f, 186.20914f, 210.20914f, 188.0f, 208.0f, 188.0f),
                    PathNode.LineTo(192.0f, 188.0f),
                    PathNode.CurveTo(189.79086f, 188.0f, 188.0f, 186.20914f, 188.0f, 184.0f),
                    PathNode.LineTo(188.0f, 144.0f),
                    PathNode.CurveTo(188.0f, 141.79086f, 189.79086f, 140.0f, 192.0f, 140.0f),
                    PathNode.LineTo(212.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _headphones!!
    }

private var _headphones: ImageVector? = null
