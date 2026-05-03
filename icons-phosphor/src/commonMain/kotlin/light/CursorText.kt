package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorLightIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 208.0f),
                    PathNode.CurveTo(182.0f, 211.3137f, 179.3137f, 214.0f, 176.0f, 214.0f),
                    PathNode.LineTo(160.0f, 214.0f),
                    PathNode.CurveTo(147.03828f, 213.99042f, 134.97545f, 207.37471f, 128.0f, 196.45f),
                    PathNode.CurveTo(121.02455f, 207.37471f, 108.961716f, 213.99042f, 96.0f, 214.0f),
                    PathNode.LineTo(80.0f, 214.0f),
                    PathNode.CurveTo(76.686295f, 214.0f, 74.0f, 211.3137f, 74.0f, 208.0f),
                    PathNode.CurveTo(74.0f, 204.6863f, 76.686295f, 202.0f, 80.0f, 202.0f),
                    PathNode.LineTo(96.0f, 202.0f),
                    PathNode.CurveTo(110.359406f, 202.0f, 122.0f, 190.3594f, 122.0f, 176.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(104.0f, 134.0f),
                    PathNode.CurveTo(100.686295f, 134.0f, 98.0f, 131.3137f, 98.0f, 128.0f),
                    PathNode.CurveTo(98.0f, 124.686295f, 100.686295f, 122.0f, 104.0f, 122.0f),
                    PathNode.LineTo(122.0f, 122.0f),
                    PathNode.LineTo(122.0f, 80.0f),
                    PathNode.CurveTo(122.0f, 65.640594f, 110.359406f, 54.0f, 96.0f, 54.0f),
                    PathNode.LineTo(80.0f, 54.0f),
                    PathNode.CurveTo(76.686295f, 54.0f, 74.0f, 51.31371f, 74.0f, 48.0f),
                    PathNode.CurveTo(74.0f, 44.68629f, 76.686295f, 42.0f, 80.0f, 42.0f),
                    PathNode.LineTo(96.0f, 42.0f),
                    PathNode.CurveTo(108.961716f, 42.00958f, 121.02455f, 48.625286f, 128.0f, 59.55f),
                    PathNode.CurveTo(134.97545f, 48.625286f, 147.03828f, 42.00958f, 160.0f, 42.0f),
                    PathNode.LineTo(176.0f, 42.0f),
                    PathNode.CurveTo(179.3137f, 42.0f, 182.0f, 44.68629f, 182.0f, 48.0f),
                    PathNode.CurveTo(182.0f, 51.31371f, 179.3137f, 54.0f, 176.0f, 54.0f),
                    PathNode.LineTo(160.0f, 54.0f),
                    PathNode.CurveTo(145.6406f, 54.0f, 134.0f, 65.640594f, 134.0f, 80.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(152.0f, 122.0f),
                    PathNode.CurveTo(155.3137f, 122.0f, 158.0f, 124.686295f, 158.0f, 128.0f),
                    PathNode.CurveTo(158.0f, 131.3137f, 155.3137f, 134.0f, 152.0f, 134.0f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(134.0f, 176.0f),
                    PathNode.CurveTo(134.0f, 190.3594f, 145.6406f, 202.0f, 160.0f, 202.0f),
                    PathNode.LineTo(176.0f, 202.0f),
                    PathNode.CurveTo(179.3137f, 202.0f, 182.0f, 204.6863f, 182.0f, 208.0f),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
