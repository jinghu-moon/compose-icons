package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareSeven: ImageVector
    get() {
        if (_numberSquareSeven != null) return _numberSquareSeven!!
        _numberSquareSeven = phosphorLightIcon(
            name = "NumberSquareSeven",
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSquareSeven!!
    }

private var _numberSquareSeven: ImageVector? = null
