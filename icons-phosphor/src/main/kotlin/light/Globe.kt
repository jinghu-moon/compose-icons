package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorLightIcon(
            name = "Globe",
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
                    PathNode.MoveTo(209.57f, 90.0f),
                    PathNode.LineTo(169.19f, 90.0f),
                    PathNode.CurveTo(164.37653f, 71.4488f, 155.59824f, 54.161724f, 143.46f, 39.33f),
                    PathNode.CurveTo(172.43639f, 44.43923f, 197.10577f, 63.34708f, 209.57f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(218.00673f, 136.8077f, 216.71622f, 145.56837f, 214.17f, 154.0f),
                    PathNode.LineTo(171.81f, 154.0f),
                    PathNode.CurveTo(174.73006f, 136.78964f, 174.73006f, 119.21035f, 171.81f, 102.0f),
                    PathNode.LineTo(214.17f, 102.0f),
                    PathNode.CurveTo(216.71622f, 110.43163f, 218.00673f, 119.1923f, 218.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 215.83f),
                    PathNode.CurveTo(122.22312f, 209.93698f, 117.12772f, 203.4126f, 112.81f, 196.38f),
                    PathNode.CurveTo(106.98327f, 186.9017f, 102.456116f, 176.68367f, 99.35f, 166.0f),
                    PathNode.LineTo(156.65f, 166.0f),
                    PathNode.CurveTo(153.54388f, 176.68367f, 149.01674f, 186.9017f, 143.19f, 196.38f),
                    PathNode.CurveTo(138.87227f, 203.4126f, 133.77689f, 209.93698f, 128.0f, 215.83f),
                    PathNode.Close,
                    PathNode.MoveTo(96.45f, 154.0f),
                    PathNode.CurveTo(93.183235f, 136.82059f, 93.183235f, 119.17941f, 96.45f, 102.0f),
                    PathNode.LineTo(159.55f, 102.0f),
                    PathNode.CurveTo(162.81677f, 119.17941f, 162.81677f, 136.82059f, 159.55f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 128.0f),
                    PathNode.CurveTo(37.993263f, 119.1923f, 39.28378f, 110.43163f, 41.83f, 102.0f),
                    PathNode.LineTo(84.19f, 102.0f),
                    PathNode.CurveTo(81.26994f, 119.21035f, 81.26994f, 136.78964f, 84.19f, 154.0f),
                    PathNode.LineTo(41.83f, 154.0f),
                    PathNode.CurveTo(39.28378f, 145.56837f, 37.993263f, 136.8077f, 38.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.17f),
                    PathNode.CurveTo(133.77689f, 46.063026f, 138.87227f, 52.587406f, 143.19f, 59.62f),
                    PathNode.CurveTo(149.01674f, 69.0983f, 153.54388f, 79.31632f, 156.65f, 90.0f),
                    PathNode.LineTo(99.35f, 90.0f),
                    PathNode.CurveTo(102.456116f, 79.31632f, 106.98327f, 69.0983f, 112.81f, 59.62f),
                    PathNode.CurveTo(117.12772f, 52.587406f, 122.22312f, 46.063026f, 128.0f, 40.17f),
                    PathNode.Close,
                    PathNode.MoveTo(112.54f, 39.33f),
                    PathNode.CurveTo(100.40177f, 54.161724f, 91.623474f, 71.4488f, 86.81f, 90.0f),
                    PathNode.LineTo(46.43f, 90.0f),
                    PathNode.CurveTo(58.89423f, 63.34708f, 83.563614f, 44.43923f, 112.54f, 39.33f),
                    PathNode.Close,
                    PathNode.MoveTo(46.43f, 166.0f),
                    PathNode.LineTo(86.81f, 166.0f),
                    PathNode.CurveTo(91.623474f, 184.55121f, 100.40177f, 201.83827f, 112.54f, 216.67f),
                    PathNode.CurveTo(83.563614f, 211.56076f, 58.89423f, 192.65292f, 46.43f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(143.43f, 216.67f),
                    PathNode.CurveTo(155.57896f, 201.841f, 164.36758f, 184.55373f, 169.19f, 166.0f),
                    PathNode.LineTo(209.57f, 166.0f),
                    PathNode.CurveTo(197.10577f, 192.65292f, 172.43639f, 211.56076f, 143.46f, 216.67f),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
