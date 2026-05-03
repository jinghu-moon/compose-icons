package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorLightIcon(
            name = "NumberSquareTwo",
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
                    PathNode.MoveTo(158.0f, 176.0f),
                    PathNode.CurveTo(158.0f, 179.3137f, 155.3137f, 182.0f, 152.0f, 182.0f),
                    PathNode.LineTo(104.0f, 182.0f),
                    PathNode.CurveTo(101.72737f, 182.0f, 99.64978f, 180.71599f, 98.63344f, 178.68329f),
                    PathNode.CurveTo(97.61709f, 176.65057f, 97.83642f, 174.21811f, 99.2f, 172.4f),
                    PathNode.LineTo(142.37f, 114.84f),
                    PathNode.CurveTo(146.59915f, 109.1726f, 147.1181f, 101.553955f, 143.69652f, 95.36542f),
                    PathNode.CurveTo(140.27495f, 89.17688f, 133.5468f, 85.56509f, 126.4982f, 86.13304f),
                    PathNode.CurveTo(119.449615f, 86.70099f, 113.386566f, 91.34347f, 111.0f, 98.0f),
                    PathNode.CurveTo(110.323524f, 100.07042f, 108.57814f, 101.61162f, 106.43991f, 102.02663f),
                    PathNode.CurveTo(104.30168f, 102.44163f, 102.10648f, 101.66525f, 100.704605f, 99.99822f),
                    PathNode.CurveTo(99.302734f, 98.33119f, 98.91439f, 96.035355f, 99.69f, 94.0f),
                    PathNode.CurveTo(103.684105f, 82.9295f, 113.78236f, 75.216934f, 125.513756f, 74.27708f),
                    PathNode.CurveTo(137.24515f, 73.33722f, 148.4425f, 79.34367f, 154.14818f, 89.637085f),
                    PathNode.CurveTo(159.85385f, 99.93049f, 159.01382f, 112.60932f, 152.0f, 122.06f),
                    PathNode.LineTo(116.0f, 170.0f),
                    PathNode.LineTo(152.0f, 170.0f),
                    PathNode.CurveTo(155.3137f, 170.0f, 158.0f, 172.6863f, 158.0f, 176.0f),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
