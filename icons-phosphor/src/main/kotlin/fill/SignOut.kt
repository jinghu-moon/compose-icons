package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorFillIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 220.41827f, 116.41828f, 224.0f, 112.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(43.581722f, 224.0f, 40.0f, 220.41827f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 35.581722f, 43.581722f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(112.0f, 32.0f),
                    PathNode.CurveTo(116.41828f, 32.0f, 120.0f, 35.581722f, 120.0f, 40.0f),
                    PathNode.CurveTo(120.0f, 44.418278f, 116.41828f, 48.0f, 112.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(116.41828f, 208.0f, 120.0f, 211.58173f, 120.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.66f, 122.34f),
                    PathNode.LineTo(189.66f, 82.34f),
                    PathNode.CurveTo(187.3719f, 80.04936f, 183.92874f, 79.36368f, 180.93768f, 80.60302f),
                    PathNode.CurveTo(177.94662f, 81.84236f, 175.99745f, 84.762344f, 176.0f, 88.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(112.0f, 120.0f),
                    PathNode.CurveTo(107.58172f, 120.0f, 104.0f, 123.58172f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 132.41827f, 107.58172f, 136.0f, 112.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(175.99745f, 171.23764f, 177.94662f, 174.15764f, 180.93768f, 175.39697f),
                    PathNode.CurveTo(183.92874f, 176.63632f, 187.3719f, 175.95064f, 189.66f, 173.66f),
                    PathNode.LineTo(229.66f, 133.66f),
                    PathNode.CurveTo(231.16223f, 132.15945f, 232.00629f, 130.12328f, 232.00629f, 128.0f),
                    PathNode.CurveTo(232.00629f, 125.876724f, 231.16223f, 123.840546f, 229.66f, 122.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _signOut!!
    }

private var _signOut: ImageVector? = null
