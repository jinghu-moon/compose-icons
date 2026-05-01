package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorLightIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
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
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 148.0f),
                    PathNode.CurveTo(157.99973f, 161.81589f, 149.63919f, 174.25786f, 136.84764f, 179.4785f),
                    PathNode.CurveTo(124.05611f, 184.69913f, 109.37733f, 181.66023f, 99.71f, 171.79f),
                    PathNode.CurveTo(97.393166f, 169.4207f, 97.4357f, 165.62184f, 99.805f, 163.305f),
                    PathNode.CurveTo(102.1743f, 160.98816f, 105.97317f, 161.0307f, 108.29f, 163.4f),
                    PathNode.CurveTo(115.27932f, 170.53053f, 126.19416f, 172.06004f, 134.8742f, 167.12529f),
                    PathNode.CurveTo(143.55424f, 162.19052f, 147.82259f, 152.0291f, 145.27017f, 142.37611f),
                    PathNode.CurveTo(142.71777f, 132.72313f, 133.98474f, 125.99948f, 124.0f, 126.0f),
                    PathNode.CurveTo(121.762184f, 126.00152f, 119.709496f, 124.757545f, 118.67522f, 122.77309f),
                    PathNode.CurveTo(117.640945f, 120.78861f, 117.79699f, 118.39349f, 119.08f, 116.56f),
                    PathNode.LineTo(140.48f, 86.0f),
                    PathNode.LineTo(104.0f, 86.0f),
                    PathNode.CurveTo(100.686295f, 86.0f, 98.0f, 83.313705f, 98.0f, 80.0f),
                    PathNode.CurveTo(98.0f, 76.686295f, 100.686295f, 74.0f, 104.0f, 74.0f),
                    PathNode.LineTo(152.0f, 74.0f),
                    PathNode.CurveTo(154.23781f, 73.99848f, 156.29051f, 75.242455f, 157.32478f, 77.22691f),
                    PathNode.CurveTo(158.35905f, 79.21139f, 158.20302f, 81.60651f, 156.92f, 83.44f),
                    PathNode.LineTo(134.39f, 115.62f),
                    PathNode.CurveTo(148.44864f, 120.15192f, 157.98383f, 133.22896f, 158.0f, 148.0f),
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
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
