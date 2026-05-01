package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = phosphorLightIcon(
            name = "PlayCircle",
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
                    PathNode.MoveTo(175.18f, 122.91f),
                    PathNode.LineTo(111.18f, 82.91f),
                    PathNode.CurveTo(109.33008f, 81.7538f, 106.998375f, 81.692764f, 105.09051f, 82.75062f),
                    PathNode.CurveTo(103.18264f, 83.808464f, 101.99927f, 85.81849f, 102.0f, 88.0f),
                    PathNode.LineTo(102.0f, 168.0f),
                    PathNode.CurveTo(101.99927f, 170.18152f, 103.18264f, 172.19154f, 105.09051f, 173.24939f),
                    PathNode.CurveTo(106.998375f, 174.30724f, 109.33008f, 174.2462f, 111.18f, 173.09f),
                    PathNode.LineTo(175.18f, 133.09f),
                    PathNode.CurveTo(176.93613f, 131.99396f, 178.00322f, 130.07008f, 178.00322f, 128.0f),
                    PathNode.CurveTo(178.00322f, 125.92991f, 176.93613f, 124.006035f, 175.18f, 122.91f),
                    PathNode.Close,
                    PathNode.MoveTo(114.0f, 157.17f),
                    PathNode.LineTo(114.0f, 98.83f),
                    PathNode.LineTo(160.68f, 128.0f),
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
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
