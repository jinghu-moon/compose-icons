package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorFillIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 97.37f),
                    PathNode.LineTo(208.0f, 96.0f),
                    PathNode.CurveTo(208.0f, 51.81722f, 172.18279f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(83.81722f, 16.0f, 48.0f, 51.81722f, 48.0f, 96.0f),
                    PathNode.LineTo(48.0f, 97.37f),
                    PathNode.CurveTo(36.975685f, 101.26368f, 30.361298f, 112.534874f, 32.338284f, 124.05823f),
                    PathNode.CurveTo(34.31527f, 135.58159f, 44.30828f, 144.00356f, 56.0f, 144.0f),
                    PathNode.LineTo(59.29f, 144.0f),
                    PathNode.LineTo(114.11f, 239.94f),
                    PathNode.CurveTo(116.9592f, 244.92334f, 122.25965f, 247.99847f, 128.0f, 247.99847f),
                    PathNode.CurveTo(133.74034f, 247.99847f, 139.0408f, 244.92334f, 141.89f, 239.94f),
                    PathNode.LineTo(196.71f, 144.0f),
                    PathNode.LineTo(200.0f, 144.0f),
                    PathNode.CurveTo(211.69171f, 144.00356f, 221.68472f, 135.58159f, 223.66171f, 124.05823f),
                    PathNode.CurveTo(225.6387f, 112.534874f, 219.02432f, 101.26368f, 208.0f, 97.37f),
                    PathNode.Close,
                    PathNode.MoveTo(146.89f, 198.94f),
                    PathNode.LineTo(115.5f, 144.0f),
                    PathNode.LineTo(134.79f, 144.0f),
                    PathNode.LineTo(156.54f, 182.06f),
                    PathNode.Close,
                    PathNode.MoveTo(77.71f, 144.0f),
                    PathNode.LineTo(97.07f, 144.0f),
                    PathNode.LineTo(137.68f, 215.06f),
                    PathNode.LineTo(128.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.71f, 165.94f),
                    PathNode.LineTo(153.21f, 144.0f),
                    PathNode.LineTo(178.29f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
