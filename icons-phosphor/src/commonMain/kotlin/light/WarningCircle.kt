package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WarningCircle: ImageVector
    get() {
        if (_warningCircle != null) return _warningCircle!!
        _warningCircle = phosphorLightIcon(
            name = "WarningCircle",
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
                    PathNode.MoveTo(122.0f, 136.0f),
                    PathNode.LineTo(122.0f, 80.0f),
                    PathNode.CurveTo(122.0f, 76.686295f, 124.686295f, 74.0f, 128.0f, 74.0f),
                    PathNode.CurveTo(131.3137f, 74.0f, 134.0f, 76.686295f, 134.0f, 80.0f),
                    PathNode.LineTo(134.0f, 136.0f),
                    PathNode.CurveTo(134.0f, 139.3137f, 131.3137f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(124.686295f, 142.0f, 122.0f, 139.3137f, 122.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 172.0f),
                    PathNode.CurveTo(138.0f, 177.52284f, 133.52284f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(122.47715f, 182.0f, 118.0f, 177.52284f, 118.0f, 172.0f),
                    PathNode.CurveTo(118.0f, 166.47716f, 122.47715f, 162.0f, 128.0f, 162.0f),
                    PathNode.CurveTo(133.52284f, 162.0f, 138.0f, 166.47716f, 138.0f, 172.0f),
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
        return _warningCircle!!
    }

private var _warningCircle: ImageVector? = null
