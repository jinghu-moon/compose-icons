package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = tablerOutlineIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.555f, 3.843f),
                    PathNode.LineTo(20.157f, 7.445f),
                    PathNode.CurveTo(20.696636f, 7.984555f, 20.999807f, 8.716396f, 20.999807f, 9.4795f),
                    PathNode.CurveTo(20.999807f, 10.242603f, 20.696636f, 10.974445f, 20.157f, 11.514f),
                    PathNode.LineTo(17.514f, 14.157f),
                    PathNode.CurveTo(16.974445f, 14.696636f, 16.242603f, 14.999807f, 15.4795f, 14.999807f),
                    PathNode.CurveTo(14.716396f, 14.999807f, 13.984554f, 14.696636f, 13.445f, 14.157f),
                    PathNode.LineTo(13.144f, 13.856f),
                    PathNode.LineTo(6.586f, 20.414f),
                    PathNode.CurveTo(6.253721f, 20.74623f, 5.815075f, 20.95086f, 5.347f, 20.992f),
                    PathNode.LineTo(5.172f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(3.493025f, 20.999933f, 3.066316f, 20.620493f, 3.007f, 20.117f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 18.828f),
                    PathNode.CurveTo(3.000115f, 18.35845f, 3.165434f, 17.90391f, 3.467f, 17.544f),
                    PathNode.LineTo(3.586f, 17.414f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(10.144f, 10.856f),
                    PathNode.LineTo(9.843f, 10.555f),
                    PathNode.CurveTo(9.303364f, 10.015446f, 9.000193f, 9.283604f, 9.000193f, 8.5205f),
                    PathNode.CurveTo(9.000193f, 7.757397f, 9.303364f, 7.025555f, 9.843f, 6.486f),
                    PathNode.LineTo(12.486f, 3.843f),
                    PathNode.CurveTo(13.025555f, 3.303364f, 13.757397f, 3.000193f, 14.5205f, 3.000193f),
                    PathNode.CurveTo(15.283604f, 3.000193f, 16.015446f, 3.303364f, 16.555f, 3.843f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(15.01f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _key!!
    }

private var _key: ImageVector? = null
