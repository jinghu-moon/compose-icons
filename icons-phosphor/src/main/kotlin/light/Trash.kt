package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorLightIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 50.0f),
                    PathNode.LineTo(174.0f, 50.0f),
                    PathNode.LineTo(174.0f, 40.0f),
                    PathNode.CurveTo(174.0f, 27.849735f, 164.15027f, 18.0f, 152.0f, 18.0f),
                    PathNode.LineTo(104.0f, 18.0f),
                    PathNode.CurveTo(91.84974f, 18.0f, 82.0f, 27.849735f, 82.0f, 40.0f),
                    PathNode.LineTo(82.0f, 50.0f),
                    PathNode.LineTo(40.0f, 50.0f),
                    PathNode.CurveTo(36.68629f, 50.0f, 34.0f, 52.68629f, 34.0f, 56.0f),
                    PathNode.CurveTo(34.0f, 59.31371f, 36.68629f, 62.0f, 40.0f, 62.0f),
                    PathNode.LineTo(50.0f, 62.0f),
                    PathNode.LineTo(50.0f, 208.0f),
                    PathNode.CurveTo(50.0f, 215.73198f, 56.268013f, 222.0f, 64.0f, 222.0f),
                    PathNode.LineTo(192.0f, 222.0f),
                    PathNode.CurveTo(199.73198f, 222.0f, 206.0f, 215.73198f, 206.0f, 208.0f),
                    PathNode.LineTo(206.0f, 62.0f),
                    PathNode.LineTo(216.0f, 62.0f),
                    PathNode.CurveTo(219.3137f, 62.0f, 222.0f, 59.31371f, 222.0f, 56.0f),
                    PathNode.CurveTo(222.0f, 52.68629f, 219.3137f, 50.0f, 216.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 40.0f),
                    PathNode.CurveTo(94.0f, 34.477154f, 98.47715f, 30.0f, 104.0f, 30.0f),
                    PathNode.LineTo(152.0f, 30.0f),
                    PathNode.CurveTo(157.52284f, 30.0f, 162.0f, 34.477154f, 162.0f, 40.0f),
                    PathNode.LineTo(162.0f, 50.0f),
                    PathNode.LineTo(94.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 208.0f),
                    PathNode.CurveTo(194.0f, 209.10457f, 193.10457f, 210.0f, 192.0f, 210.0f),
                    PathNode.LineTo(64.0f, 210.0f),
                    PathNode.CurveTo(62.89543f, 210.0f, 62.0f, 209.10457f, 62.0f, 208.0f),
                    PathNode.LineTo(62.0f, 62.0f),
                    PathNode.LineTo(194.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 104.0f),
                    PathNode.LineTo(110.0f, 168.0f),
                    PathNode.CurveTo(110.0f, 171.3137f, 107.313705f, 174.0f, 104.0f, 174.0f),
                    PathNode.CurveTo(100.686295f, 174.0f, 98.0f, 171.3137f, 98.0f, 168.0f),
                    PathNode.LineTo(98.0f, 104.0f),
                    PathNode.CurveTo(98.0f, 100.686295f, 100.686295f, 98.0f, 104.0f, 98.0f),
                    PathNode.CurveTo(107.313705f, 98.0f, 110.0f, 100.686295f, 110.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 104.0f),
                    PathNode.LineTo(158.0f, 168.0f),
                    PathNode.CurveTo(158.0f, 171.3137f, 155.3137f, 174.0f, 152.0f, 174.0f),
                    PathNode.CurveTo(148.6863f, 174.0f, 146.0f, 171.3137f, 146.0f, 168.0f),
                    PathNode.LineTo(146.0f, 104.0f),
                    PathNode.CurveTo(146.0f, 100.686295f, 148.6863f, 98.0f, 152.0f, 98.0f),
                    PathNode.CurveTo(155.3137f, 98.0f, 158.0f, 100.686295f, 158.0f, 104.0f),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
