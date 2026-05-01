package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorLightIcon(
            name = "VinylRecord",
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
                    PathNode.MoveTo(128.0f, 70.0f),
                    PathNode.CurveTo(95.983475f, 70.038574f, 70.038574f, 95.983475f, 70.0f, 128.0f),
                    PathNode.CurveTo(70.0f, 131.3137f, 67.313705f, 134.0f, 64.0f, 134.0f),
                    PathNode.CurveTo(60.68629f, 134.0f, 58.0f, 131.3137f, 58.0f, 128.0f),
                    PathNode.CurveTo(58.044086f, 89.358345f, 89.358345f, 58.044086f, 128.0f, 58.0f),
                    PathNode.CurveTo(131.3137f, 58.0f, 134.0f, 60.68629f, 134.0f, 64.0f),
                    PathNode.CurveTo(134.0f, 67.313705f, 131.3137f, 70.0f, 128.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 128.0f),
                    PathNode.CurveTo(197.95592f, 166.64166f, 166.64166f, 197.95592f, 128.0f, 198.0f),
                    PathNode.CurveTo(124.686295f, 198.0f, 122.0f, 195.3137f, 122.0f, 192.0f),
                    PathNode.CurveTo(122.0f, 188.6863f, 124.686295f, 186.0f, 128.0f, 186.0f),
                    PathNode.CurveTo(160.01653f, 185.96143f, 185.96143f, 160.01653f, 186.0f, 128.0f),
                    PathNode.CurveTo(186.0f, 124.686295f, 188.6863f, 122.0f, 192.0f, 122.0f),
                    PathNode.CurveTo(195.3137f, 122.0f, 198.0f, 124.686295f, 198.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 128.0f),
                    PathNode.CurveTo(158.0f, 111.43146f, 144.56854f, 98.0f, 128.0f, 98.0f),
                    PathNode.CurveTo(111.43146f, 98.0f, 98.0f, 111.43146f, 98.0f, 128.0f),
                    PathNode.CurveTo(98.0f, 144.56854f, 111.43146f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(144.56854f, 158.0f, 158.0f, 144.56854f, 158.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 128.0f),
                    PathNode.CurveTo(110.0f, 118.05888f, 118.05888f, 110.0f, 128.0f, 110.0f),
                    PathNode.CurveTo(137.94113f, 110.0f, 146.0f, 118.05888f, 146.0f, 128.0f),
                    PathNode.CurveTo(146.0f, 137.94113f, 137.94113f, 146.0f, 128.0f, 146.0f),
                    PathNode.CurveTo(118.05888f, 146.0f, 110.0f, 137.94113f, 110.0f, 128.0f),
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
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
