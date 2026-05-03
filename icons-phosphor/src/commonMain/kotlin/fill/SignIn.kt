package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorFillIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(141.66f, 133.66f),
                    PathNode.LineTo(101.66f, 173.66f),
                    PathNode.CurveTo(99.37191f, 175.95064f, 95.92874f, 176.63632f, 92.937675f, 175.39697f),
                    PathNode.CurveTo(89.94662f, 174.15764f, 87.99745f, 171.23764f, 88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.CurveTo(19.581722f, 136.0f, 16.0f, 132.41827f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 123.58172f, 19.581722f, 120.0f, 24.0f, 120.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(87.99745f, 84.762344f, 89.94662f, 81.84236f, 92.937675f, 80.60302f),
                    PathNode.CurveTo(95.92874f, 79.36368f, 99.37191f, 80.04936f, 101.66f, 82.34f),
                    PathNode.LineTo(141.66f, 122.34f),
                    PathNode.CurveTo(143.16223f, 123.840546f, 144.00629f, 125.876724f, 144.00629f, 128.0f),
                    PathNode.CurveTo(144.00629f, 130.12328f, 143.16223f, 132.15945f, 141.66f, 133.66f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 32.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(131.58173f, 32.0f, 128.0f, 35.581722f, 128.0f, 40.0f),
                    PathNode.CurveTo(128.0f, 44.418278f, 131.58173f, 48.0f, 136.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.CurveTo(131.58173f, 208.0f, 128.0f, 211.58173f, 128.0f, 216.0f),
                    PathNode.CurveTo(128.0f, 220.41827f, 131.58173f, 224.0f, 136.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(204.41827f, 224.0f, 208.0f, 220.41827f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 204.41827f, 32.0f, 200.0f, 32.0f),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null
