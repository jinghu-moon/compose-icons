package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorLightIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 80.0f),
                    PathNode.CurveTo(178.0f, 76.686295f, 180.6863f, 74.0f, 184.0f, 74.0f),
                    PathNode.LineTo(216.0f, 74.0f),
                    PathNode.CurveTo(219.3137f, 74.0f, 222.0f, 76.686295f, 222.0f, 80.0f),
                    PathNode.CurveTo(222.0f, 83.313705f, 219.3137f, 86.0f, 216.0f, 86.0f),
                    PathNode.LineTo(184.0f, 86.0f),
                    PathNode.CurveTo(180.6863f, 86.0f, 178.0f, 83.313705f, 178.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 86.0f),
                    PathNode.LineTo(146.0f, 86.0f),
                    PathNode.LineTo(146.0f, 104.0f),
                    PathNode.CurveTo(146.0f, 107.313705f, 148.6863f, 110.0f, 152.0f, 110.0f),
                    PathNode.CurveTo(155.3137f, 110.0f, 158.0f, 107.313705f, 158.0f, 104.0f),
                    PathNode.LineTo(158.0f, 56.0f),
                    PathNode.CurveTo(158.0f, 52.68629f, 155.3137f, 50.0f, 152.0f, 50.0f),
                    PathNode.CurveTo(148.6863f, 50.0f, 146.0f, 52.68629f, 146.0f, 56.0f),
                    PathNode.LineTo(146.0f, 74.0f),
                    PathNode.LineTo(40.0f, 74.0f),
                    PathNode.CurveTo(36.68629f, 74.0f, 34.0f, 76.686295f, 34.0f, 80.0f),
                    PathNode.CurveTo(34.0f, 83.313705f, 36.68629f, 86.0f, 40.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 170.0f),
                    PathNode.LineTo(120.0f, 170.0f),
                    PathNode.CurveTo(116.686295f, 170.0f, 114.0f, 172.6863f, 114.0f, 176.0f),
                    PathNode.CurveTo(114.0f, 179.3137f, 116.686295f, 182.0f, 120.0f, 182.0f),
                    PathNode.LineTo(216.0f, 182.0f),
                    PathNode.CurveTo(219.3137f, 182.0f, 222.0f, 179.3137f, 222.0f, 176.0f),
                    PathNode.CurveTo(222.0f, 172.6863f, 219.3137f, 170.0f, 216.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 146.0f),
                    PathNode.CurveTo(84.686295f, 146.0f, 82.0f, 148.6863f, 82.0f, 152.0f),
                    PathNode.LineTo(82.0f, 170.0f),
                    PathNode.LineTo(40.0f, 170.0f),
                    PathNode.CurveTo(36.68629f, 170.0f, 34.0f, 172.6863f, 34.0f, 176.0f),
                    PathNode.CurveTo(34.0f, 179.3137f, 36.68629f, 182.0f, 40.0f, 182.0f),
                    PathNode.LineTo(82.0f, 182.0f),
                    PathNode.LineTo(82.0f, 200.0f),
                    PathNode.CurveTo(82.0f, 203.3137f, 84.686295f, 206.0f, 88.0f, 206.0f),
                    PathNode.CurveTo(91.313705f, 206.0f, 94.0f, 203.3137f, 94.0f, 200.0f),
                    PathNode.LineTo(94.0f, 152.0f),
                    PathNode.CurveTo(94.0f, 148.6863f, 91.313705f, 146.0f, 88.0f, 146.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
