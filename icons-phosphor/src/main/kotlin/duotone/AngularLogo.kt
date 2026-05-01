package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorDuotoneIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 72.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.LineTo(128.0f, 232.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.08f, 64.62f),
                    PathNode.LineTo(131.08f, 24.62f),
                    PathNode.CurveTo(129.11057f, 23.789904f, 126.889435f, 23.789904f, 124.92f, 24.62f),
                    PathNode.LineTo(28.92f, 64.62f),
                    PathNode.CurveTo(25.5808f, 66.012924f, 23.592129f, 69.47362f, 24.07f, 73.06f),
                    PathNode.LineTo(40.07f, 193.06f),
                    PathNode.CurveTo(40.419415f, 195.68861f, 42.04864f, 197.97327f, 44.42f, 199.16f),
                    PathNode.LineTo(124.42f, 239.16f),
                    PathNode.CurveTo(126.67347f, 240.28764f, 129.32652f, 240.28764f, 131.58f, 239.16f),
                    PathNode.LineTo(211.58f, 199.16f),
                    PathNode.CurveTo(213.95135f, 197.97327f, 215.58058f, 195.68861f, 215.93f, 193.06f),
                    PathNode.LineTo(231.93f, 73.06f),
                    PathNode.CurveTo(232.40787f, 69.47362f, 230.4192f, 66.012924f, 227.08f, 64.62f),
                    PathNode.Close,
                    PathNode.MoveTo(200.63f, 186.74f),
                    PathNode.LineTo(128.0f, 223.06f),
                    PathNode.LineTo(55.37f, 186.74f),
                    PathNode.LineTo(40.74f, 77.0f),
                    PathNode.LineTo(128.0f, 40.67f),
                    PathNode.LineTo(215.26f, 77.0f),
                    PathNode.Close,
                    PathNode.MoveTo(121.0f, 84.12f),
                    PathNode.LineTo(81.0f, 156.12f),
                    PathNode.CurveTo(78.857124f, 159.986f, 80.254005f, 164.85713f, 84.12f, 167.0f),
                    PathNode.CurveTo(87.98599f, 169.14287f, 92.857124f, 167.74599f, 95.0f, 163.88f),
                    PathNode.LineTo(106.0f, 144.0f),
                    PathNode.LineTo(150.0f, 144.0f),
                    PathNode.LineTo(161.0f, 163.88f),
                    PathNode.CurveTo(163.14287f, 167.74599f, 168.014f, 169.14287f, 171.88f, 167.0f),
                    PathNode.CurveTo(175.74599f, 164.85713f, 177.14287f, 159.986f, 175.0f, 156.12f),
                    PathNode.LineTo(135.0f, 84.12f),
                    PathNode.CurveTo(133.59105f, 81.57347f, 130.91031f, 79.99298f, 128.0f, 79.99298f),
                    PathNode.CurveTo(125.08968f, 79.99298f, 122.40895f, 81.57347f, 121.0f, 84.12f),
                    PathNode.Close,
                    PathNode.MoveTo(141.07f, 128.0f),
                    PathNode.LineTo(114.93f, 128.0f),
                    PathNode.LineTo(128.0f, 104.47f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
