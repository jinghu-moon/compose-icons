package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleDownRight: ImageVector
    get() {
        if (_arrowCircleDownRight != null) return _arrowCircleDownRight!!
        _arrowCircleDownRight = phosphorLightIcon(
            name = "ArrowCircleDownRight",
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
                    PathNode.MoveTo(166.0f, 112.0f),
                    PathNode.LineTo(166.0f, 160.0f),
                    PathNode.CurveTo(166.0f, 163.3137f, 163.3137f, 166.0f, 160.0f, 166.0f),
                    PathNode.LineTo(112.0f, 166.0f),
                    PathNode.CurveTo(108.686295f, 166.0f, 106.0f, 163.3137f, 106.0f, 160.0f),
                    PathNode.CurveTo(106.0f, 156.6863f, 108.686295f, 154.0f, 112.0f, 154.0f),
                    PathNode.LineTo(145.51f, 154.0f),
                    PathNode.LineTo(91.76f, 100.24f),
                    PathNode.CurveTo(89.55713f, 97.87592f, 89.62213f, 94.191925f, 91.90703f, 91.90703f),
                    PathNode.CurveTo(94.191925f, 89.62213f, 97.87592f, 89.55713f, 100.24f, 91.76f),
                    PathNode.LineTo(154.0f, 145.51f),
                    PathNode.LineTo(154.0f, 112.0f),
                    PathNode.CurveTo(154.0f, 108.686295f, 156.6863f, 106.0f, 160.0f, 106.0f),
                    PathNode.CurveTo(163.3137f, 106.0f, 166.0f, 108.686295f, 166.0f, 112.0f),
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
        return _arrowCircleDownRight!!
    }

private var _arrowCircleDownRight: ImageVector? = null
