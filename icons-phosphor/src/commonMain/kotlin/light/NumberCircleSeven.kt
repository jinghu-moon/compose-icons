package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) return _numberCircleSeven!!
        _numberCircleSeven = phosphorLightIcon(
            name = "NumberCircleSeven",
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
                    PathNode.MoveTo(156.91f, 84.56f),
                    PathNode.CurveTo(158.03389f, 86.16152f, 158.30634f, 88.210434f, 157.64f, 90.05f),
                    PathNode.LineTo(125.64f, 178.05f),
                    PathNode.CurveTo(124.77776f, 180.42174f, 122.52361f, 182.00046f, 120.0f, 182.0f),
                    PathNode.CurveTo(119.317986f, 181.99173f, 118.64209f, 181.87007f, 118.0f, 181.64f),
                    PathNode.CurveTo(116.50401f, 181.09653f, 115.28526f, 179.98093f, 114.61197f, 178.53871f),
                    PathNode.CurveTo(113.93868f, 177.09647f, 113.86602f, 175.4458f, 114.41f, 173.95f),
                    PathNode.LineTo(143.43f, 94.0f),
                    PathNode.LineTo(104.0f, 94.0f),
                    PathNode.CurveTo(100.686295f, 94.0f, 98.0f, 91.313705f, 98.0f, 88.0f),
                    PathNode.CurveTo(98.0f, 84.686295f, 100.686295f, 82.0f, 104.0f, 82.0f),
                    PathNode.LineTo(152.0f, 82.0f),
                    PathNode.CurveTo(153.95612f, 82.00194f, 155.7885f, 82.957306f, 156.91f, 84.56f),
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
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
