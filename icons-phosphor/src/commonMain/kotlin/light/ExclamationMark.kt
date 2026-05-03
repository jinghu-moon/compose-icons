package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = phosphorLightIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(142.0f, 200.0f),
                    PathNode.CurveTo(142.0f, 207.73198f, 135.73198f, 214.0f, 128.0f, 214.0f),
                    PathNode.CurveTo(120.26801f, 214.0f, 114.0f, 207.73198f, 114.0f, 200.0f),
                    PathNode.CurveTo(114.0f, 192.26802f, 120.26801f, 186.0f, 128.0f, 186.0f),
                    PathNode.CurveTo(135.73198f, 186.0f, 142.0f, 192.26802f, 142.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 158.0f),
                    PathNode.CurveTo(131.3137f, 158.0f, 134.0f, 155.3137f, 134.0f, 152.0f),
                    PathNode.LineTo(134.0f, 48.0f),
                    PathNode.CurveTo(134.0f, 44.68629f, 131.3137f, 42.0f, 128.0f, 42.0f),
                    PathNode.CurveTo(124.686295f, 42.0f, 122.0f, 44.68629f, 122.0f, 48.0f),
                    PathNode.LineTo(122.0f, 152.0f),
                    PathNode.CurveTo(122.0f, 155.3137f, 124.686295f, 158.0f, 128.0f, 158.0f),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
