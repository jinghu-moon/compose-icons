package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleOne: ImageVector
    get() {
        if (_numberCircleOne != null) return _numberCircleOne!!
        _numberCircleOne = phosphorLightIcon(
            name = "NumberCircleOne",
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
                    PathNode.MoveTo(138.0f, 80.0f),
                    PathNode.LineTo(138.0f, 176.0f),
                    PathNode.CurveTo(138.0f, 179.3137f, 135.3137f, 182.0f, 132.0f, 182.0f),
                    PathNode.CurveTo(128.6863f, 182.0f, 126.0f, 179.3137f, 126.0f, 176.0f),
                    PathNode.LineTo(126.0f, 91.21f),
                    PathNode.LineTo(111.33f, 101.0f),
                    PathNode.CurveTo(108.56857f, 102.83911f, 104.83911f, 102.09142f, 103.0f, 99.33f),
                    PathNode.CurveTo(101.16089f, 96.56857f, 101.90858f, 92.83911f, 104.67f, 91.0f),
                    PathNode.LineTo(128.67f, 75.0f),
                    PathNode.CurveTo(130.51234f, 73.770805f, 132.88202f, 73.656494f, 134.83412f, 74.70264f),
                    PathNode.CurveTo(136.78622f, 75.74879f, 138.00328f, 77.78524f, 138.0f, 80.0f),
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
        return _numberCircleOne!!
    }

private var _numberCircleOne: ImageVector? = null
