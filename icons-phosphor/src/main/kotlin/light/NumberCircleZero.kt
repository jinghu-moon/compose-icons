package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) return _numberCircleZero!!
        _numberCircleZero = phosphorLightIcon(
            name = "NumberCircleZero",
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
                    PathNode.MoveTo(128.0f, 74.0f),
                    PathNode.CurveTo(114.48f, 74.0f, 103.31f, 80.12f, 95.71f, 91.71f),
                    PathNode.CurveTo(89.45f, 101.24f, 86.0f, 114.13f, 86.0f, 128.0f),
                    PathNode.CurveTo(86.0f, 141.87f, 89.45f, 154.76f, 95.7f, 164.29f),
                    PathNode.CurveTo(103.31f, 175.88f, 114.47f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(141.53f, 182.0f, 152.69f, 175.88f, 160.29f, 164.29f),
                    PathNode.CurveTo(166.55f, 154.76f, 170.0f, 141.87f, 170.0f, 128.0f),
                    PathNode.CurveTo(170.0f, 114.13f, 166.55f, 101.24f, 160.3f, 91.71f),
                    PathNode.CurveTo(152.69f, 80.12f, 141.52f, 74.0f, 128.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 170.0f),
                    PathNode.CurveTo(107.28f, 170.0f, 98.0f, 148.91f, 98.0f, 128.0f),
                    PathNode.CurveTo(98.0f, 107.09f, 107.28f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(148.72f, 86.0f, 158.0f, 107.09f, 158.0f, 128.0f),
                    PathNode.CurveTo(158.0f, 148.91f, 148.72f, 170.0f, 128.0f, 170.0f),
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
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
