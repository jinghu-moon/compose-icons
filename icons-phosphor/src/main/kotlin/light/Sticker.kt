package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorLightIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 34.0f),
                    PathNode.LineTo(88.0f, 34.0f),
                    PathNode.CurveTo(58.19033f, 34.033066f, 34.033066f, 58.19033f, 34.0f, 88.0f),
                    PathNode.LineTo(34.0f, 168.0f),
                    PathNode.CurveTo(34.033066f, 197.80966f, 58.19033f, 221.96693f, 88.0f, 222.0f),
                    PathNode.LineTo(136.0f, 222.0f),
                    PathNode.CurveTo(136.64607f, 222.00212f, 137.28809f, 221.89737f, 137.9f, 221.69f),
                    PathNode.CurveTo(163.74f, 213.08f, 213.08f, 163.74f, 221.69f, 137.9f),
                    PathNode.CurveTo(221.89737f, 137.28809f, 222.00212f, 136.64607f, 222.0f, 136.0f),
                    PathNode.LineTo(222.0f, 88.0f),
                    PathNode.CurveTo(221.96693f, 58.19033f, 197.80966f, 34.033066f, 168.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 168.0f),
                    PathNode.LineTo(46.0f, 88.0f),
                    PathNode.CurveTo(46.0f, 64.80404f, 64.80404f, 46.0f, 88.0f, 46.0f),
                    PathNode.LineTo(168.0f, 46.0f),
                    PathNode.CurveTo(191.19595f, 46.0f, 210.0f, 64.80404f, 210.0f, 88.0f),
                    PathNode.LineTo(210.0f, 130.0f),
                    PathNode.LineTo(184.0f, 130.0f),
                    PathNode.CurveTo(154.19034f, 130.03307f, 130.03307f, 154.19034f, 130.0f, 184.0f),
                    PathNode.LineTo(130.0f, 210.0f),
                    PathNode.LineTo(88.0f, 210.0f),
                    PathNode.CurveTo(64.80404f, 210.0f, 46.0f, 191.19595f, 46.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 206.67f),
                    PathNode.LineTo(142.0f, 184.0f),
                    PathNode.CurveTo(142.0f, 160.80405f, 160.80405f, 142.0f, 184.0f, 142.0f),
                    PathNode.LineTo(206.67f, 142.0f),
                    PathNode.CurveTo(194.84f, 163.1f, 163.1f, 194.84f, 142.0f, 206.67f),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
