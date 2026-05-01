package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Clock: ImageVector
    get() {
        if (_clock != null) return _clock!!
        _clock = phosphorLightIcon(
            name = "Clock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 128.0f),
                    PathNode.CurveTo(190.0f, 131.3137f, 187.3137f, 134.0f, 184.0f, 134.0f),
                    PathNode.LineTo(128.0f, 134.0f),
                    PathNode.CurveTo(124.686295f, 134.0f, 122.0f, 131.3137f, 122.0f, 128.0f),
                    PathNode.LineTo(122.0f, 72.0f),
                    PathNode.CurveTo(122.0f, 68.686295f, 124.686295f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(131.3137f, 66.0f, 134.0f, 68.686295f, 134.0f, 72.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(184.0f, 122.0f),
                    PathNode.CurveTo(187.3137f, 122.0f, 190.0f, 124.686295f, 190.0f, 128.0f),
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
        return _clock!!
    }

private var _clock: ImageVector? = null
