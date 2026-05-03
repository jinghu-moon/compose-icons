package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleUpRight: ImageVector
    get() {
        if (_arrowCircleUpRight != null) return _arrowCircleUpRight!!
        _arrowCircleUpRight = phosphorLightIcon(
            name = "ArrowCircleUpRight",
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
                    PathNode.MoveTo(166.0f, 96.0f),
                    PathNode.LineTo(166.0f, 144.0f),
                    PathNode.CurveTo(166.0f, 147.3137f, 163.3137f, 150.0f, 160.0f, 150.0f),
                    PathNode.CurveTo(156.6863f, 150.0f, 154.0f, 147.3137f, 154.0f, 144.0f),
                    PathNode.LineTo(154.0f, 110.49f),
                    PathNode.LineTo(100.24f, 164.24f),
                    PathNode.CurveTo(97.87592f, 166.44287f, 94.191925f, 166.37787f, 91.90703f, 164.09297f),
                    PathNode.CurveTo(89.62213f, 161.80807f, 89.55713f, 158.12408f, 91.76f, 155.76f),
                    PathNode.LineTo(145.51f, 102.0f),
                    PathNode.LineTo(112.0f, 102.0f),
                    PathNode.CurveTo(108.686295f, 102.0f, 106.0f, 99.313705f, 106.0f, 96.0f),
                    PathNode.CurveTo(106.0f, 92.686295f, 108.686295f, 90.0f, 112.0f, 90.0f),
                    PathNode.LineTo(160.0f, 90.0f),
                    PathNode.CurveTo(163.3137f, 90.0f, 166.0f, 92.686295f, 166.0f, 96.0f),
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
        return _arrowCircleUpRight!!
    }

private var _arrowCircleUpRight: ImageVector? = null
