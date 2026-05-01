package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Record: ImageVector
    get() {
        if (_record != null) return _record!!
        _record = phosphorLightIcon(
            name = "Record",
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
                    PathNode.MoveTo(128.0f, 58.0f),
                    PathNode.CurveTo(89.340065f, 58.0f, 58.0f, 89.340065f, 58.0f, 128.0f),
                    PathNode.CurveTo(58.0f, 166.65993f, 89.340065f, 198.0f, 128.0f, 198.0f),
                    PathNode.CurveTo(166.65993f, 198.0f, 198.0f, 166.65993f, 198.0f, 128.0f),
                    PathNode.CurveTo(197.95592f, 89.358345f, 166.64166f, 58.044086f, 128.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 186.0f),
                    PathNode.CurveTo(95.96748f, 186.0f, 70.0f, 160.03252f, 70.0f, 128.0f),
                    PathNode.CurveTo(70.0f, 95.96748f, 95.96748f, 70.0f, 128.0f, 70.0f),
                    PathNode.CurveTo(160.03252f, 70.0f, 186.0f, 95.96748f, 186.0f, 128.0f),
                    PathNode.CurveTo(185.96143f, 160.01653f, 160.01653f, 185.96143f, 128.0f, 186.0f),
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
        return _record!!
    }

private var _record: ImageVector? = null
