package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) return _pauseCircle!!
        _pauseCircle = phosphorLightIcon(
            name = "PauseCircle",
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
                    PathNode.MoveTo(110.0f, 96.0f),
                    PathNode.LineTo(110.0f, 160.0f),
                    PathNode.CurveTo(110.0f, 163.3137f, 107.313705f, 166.0f, 104.0f, 166.0f),
                    PathNode.CurveTo(100.686295f, 166.0f, 98.0f, 163.3137f, 98.0f, 160.0f),
                    PathNode.LineTo(98.0f, 96.0f),
                    PathNode.CurveTo(98.0f, 92.686295f, 100.686295f, 90.0f, 104.0f, 90.0f),
                    PathNode.CurveTo(107.313705f, 90.0f, 110.0f, 92.686295f, 110.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 96.0f),
                    PathNode.LineTo(158.0f, 160.0f),
                    PathNode.CurveTo(158.0f, 163.3137f, 155.3137f, 166.0f, 152.0f, 166.0f),
                    PathNode.CurveTo(148.6863f, 166.0f, 146.0f, 163.3137f, 146.0f, 160.0f),
                    PathNode.LineTo(146.0f, 96.0f),
                    PathNode.CurveTo(146.0f, 92.686295f, 148.6863f, 90.0f, 152.0f, 90.0f),
                    PathNode.CurveTo(155.3137f, 90.0f, 158.0f, 92.686295f, 158.0f, 96.0f),
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
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
