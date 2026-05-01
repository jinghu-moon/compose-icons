package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorLightIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
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
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
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
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
