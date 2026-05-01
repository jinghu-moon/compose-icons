package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = phosphorLightIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(24.268015f, 50.0f, 18.0f, 56.268013f, 18.0f, 64.0f),
                    PathNode.LineTo(18.0f, 192.0f),
                    PathNode.CurveTo(18.0f, 199.73198f, 24.268015f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(231.73198f, 206.0f, 238.0f, 199.73198f, 238.0f, 192.0f),
                    PathNode.LineTo(238.0f, 64.0f),
                    PathNode.CurveTo(238.0f, 56.268013f, 231.73198f, 50.0f, 224.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 62.0f),
                    PathNode.LineTo(224.0f, 62.0f),
                    PathNode.CurveTo(225.10457f, 62.0f, 226.0f, 62.89543f, 226.0f, 64.0f),
                    PathNode.LineTo(226.0f, 90.0f),
                    PathNode.LineTo(30.0f, 90.0f),
                    PathNode.LineTo(30.0f, 64.0f),
                    PathNode.CurveTo(30.0f, 62.89543f, 30.89543f, 62.0f, 32.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 194.0f),
                    PathNode.LineTo(32.0f, 194.0f),
                    PathNode.CurveTo(30.89543f, 194.0f, 30.0f, 193.10457f, 30.0f, 192.0f),
                    PathNode.LineTo(30.0f, 102.0f),
                    PathNode.LineTo(226.0f, 102.0f),
                    PathNode.LineTo(226.0f, 192.0f),
                    PathNode.CurveTo(226.0f, 193.10457f, 225.10457f, 194.0f, 224.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 168.0f),
                    PathNode.CurveTo(206.0f, 171.3137f, 203.3137f, 174.0f, 200.0f, 174.0f),
                    PathNode.LineTo(168.0f, 174.0f),
                    PathNode.CurveTo(164.6863f, 174.0f, 162.0f, 171.3137f, 162.0f, 168.0f),
                    PathNode.CurveTo(162.0f, 164.6863f, 164.6863f, 162.0f, 168.0f, 162.0f),
                    PathNode.LineTo(200.0f, 162.0f),
                    PathNode.CurveTo(203.3137f, 162.0f, 206.0f, 164.6863f, 206.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 168.0f),
                    PathNode.CurveTo(142.0f, 171.3137f, 139.3137f, 174.0f, 136.0f, 174.0f),
                    PathNode.LineTo(120.0f, 174.0f),
                    PathNode.CurveTo(116.686295f, 174.0f, 114.0f, 171.3137f, 114.0f, 168.0f),
                    PathNode.CurveTo(114.0f, 164.6863f, 116.686295f, 162.0f, 120.0f, 162.0f),
                    PathNode.LineTo(136.0f, 162.0f),
                    PathNode.CurveTo(139.3137f, 162.0f, 142.0f, 164.6863f, 142.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
