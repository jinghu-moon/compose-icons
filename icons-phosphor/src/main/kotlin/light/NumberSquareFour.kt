package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorLightIcon(
            name = "NumberSquareFour",
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
                    PathNode.MoveTo(160.0f, 146.0f),
                    PathNode.LineTo(150.0f, 146.0f),
                    PathNode.LineTo(150.0f, 80.0f),
                    PathNode.CurveTo(150.00058f, 77.43536f, 148.37103f, 75.15391f, 145.94487f, 74.32259f),
                    PathNode.CurveTo(143.51869f, 73.49128f, 140.8324f, 74.29394f, 139.26f, 76.32f),
                    PathNode.LineTo(83.26f, 148.32f),
                    PathNode.CurveTo(81.85488f, 150.12946f, 81.60279f, 152.58113f, 82.6103f, 154.63866f),
                    PathNode.CurveTo(83.617805f, 156.69618f, 85.70904f, 158.0004f, 88.0f, 158.0f),
                    PathNode.LineTo(138.0f, 158.0f),
                    PathNode.LineTo(138.0f, 176.0f),
                    PathNode.CurveTo(138.0f, 179.3137f, 140.6863f, 182.0f, 144.0f, 182.0f),
                    PathNode.CurveTo(147.3137f, 182.0f, 150.0f, 179.3137f, 150.0f, 176.0f),
                    PathNode.LineTo(150.0f, 158.0f),
                    PathNode.LineTo(160.0f, 158.0f),
                    PathNode.CurveTo(163.3137f, 158.0f, 166.0f, 155.3137f, 166.0f, 152.0f),
                    PathNode.CurveTo(166.0f, 148.6863f, 163.3137f, 146.0f, 160.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 146.0f),
                    PathNode.LineTo(100.27f, 146.0f),
                    PathNode.LineTo(138.0f, 97.49f),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
