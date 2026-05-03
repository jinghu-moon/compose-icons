package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorLightIcon(
            name = "CrosshairSimple",
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
                    PathNode.MoveTo(134.0f, 217.8f),
                    PathNode.LineTo(134.0f, 184.0f),
                    PathNode.CurveTo(134.0f, 180.6863f, 131.3137f, 178.0f, 128.0f, 178.0f),
                    PathNode.CurveTo(124.686295f, 178.0f, 122.0f, 180.6863f, 122.0f, 184.0f),
                    PathNode.LineTo(122.0f, 217.8f),
                    PathNode.CurveTo(77.050995f, 214.73114f, 41.268856f, 178.949f, 38.2f, 134.0f),
                    PathNode.LineTo(72.0f, 134.0f),
                    PathNode.CurveTo(75.313705f, 134.0f, 78.0f, 131.3137f, 78.0f, 128.0f),
                    PathNode.CurveTo(78.0f, 124.686295f, 75.313705f, 122.0f, 72.0f, 122.0f),
                    PathNode.LineTo(38.2f, 122.0f),
                    PathNode.CurveTo(41.268856f, 77.050995f, 77.050995f, 41.268856f, 122.0f, 38.2f),
                    PathNode.LineTo(122.0f, 72.0f),
                    PathNode.CurveTo(122.0f, 75.313705f, 124.686295f, 78.0f, 128.0f, 78.0f),
                    PathNode.CurveTo(131.3137f, 78.0f, 134.0f, 75.313705f, 134.0f, 72.0f),
                    PathNode.LineTo(134.0f, 38.2f),
                    PathNode.CurveTo(178.949f, 41.268856f, 214.73114f, 77.050995f, 217.8f, 122.0f),
                    PathNode.LineTo(184.0f, 122.0f),
                    PathNode.CurveTo(180.6863f, 122.0f, 178.0f, 124.686295f, 178.0f, 128.0f),
                    PathNode.CurveTo(178.0f, 131.3137f, 180.6863f, 134.0f, 184.0f, 134.0f),
                    PathNode.LineTo(217.8f, 134.0f),
                    PathNode.CurveTo(214.73114f, 178.949f, 178.949f, 214.73114f, 134.0f, 217.8f),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
