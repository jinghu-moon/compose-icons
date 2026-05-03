package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Question: ImageVector
    get() {
        if (_question != null) return _question!!
        _question = phosphorLightIcon(
            name = "Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.0f, 180.0f),
                    PathNode.CurveTo(138.0f, 185.52284f, 133.52284f, 190.0f, 128.0f, 190.0f),
                    PathNode.CurveTo(122.47715f, 190.0f, 118.0f, 185.52284f, 118.0f, 180.0f),
                    PathNode.CurveTo(118.0f, 174.47716f, 122.47715f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(133.52284f, 170.0f, 138.0f, 174.47716f, 138.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 74.0f),
                    PathNode.CurveTo(107.0f, 74.0f, 90.0f, 89.25f, 90.0f, 108.0f),
                    PathNode.LineTo(90.0f, 112.0f),
                    PathNode.CurveTo(90.0f, 115.313705f, 92.686295f, 118.0f, 96.0f, 118.0f),
                    PathNode.CurveTo(99.313705f, 118.0f, 102.0f, 115.313705f, 102.0f, 112.0f),
                    PathNode.LineTo(102.0f, 108.0f),
                    PathNode.CurveTo(102.0f, 95.87f, 113.66f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(142.34f, 86.0f, 154.0f, 95.87f, 154.0f, 108.0f),
                    PathNode.CurveTo(154.0f, 120.13f, 142.34f, 130.0f, 128.0f, 130.0f),
                    PathNode.CurveTo(124.686295f, 130.0f, 122.0f, 132.6863f, 122.0f, 136.0f),
                    PathNode.LineTo(122.0f, 144.0f),
                    PathNode.CurveTo(122.0f, 147.3137f, 124.686295f, 150.0f, 128.0f, 150.0f),
                    PathNode.CurveTo(131.3137f, 150.0f, 134.0f, 147.3137f, 134.0f, 144.0f),
                    PathNode.LineTo(134.0f, 141.58f),
                    PathNode.CurveTo(152.11f, 139.0f, 166.0f, 124.92f, 166.0f, 108.0f),
                    PathNode.CurveTo(166.0f, 89.25f, 149.0f, 74.0f, 128.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 184.33304f, 184.33304f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(71.666954f, 230.0f, 26.0f, 184.33304f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 71.666954f, 71.666954f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(184.30563f, 26.066126f, 229.93387f, 71.69437f, 230.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 78.29437f, 177.70563f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(78.29437f, 38.0f, 38.0f, 78.29437f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 177.70563f, 78.29437f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(177.68279f, 217.94489f, 217.94489f, 177.68279f, 218.0f, 128.0f),
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
        return _question!!
    }

private var _question: ImageVector? = null
