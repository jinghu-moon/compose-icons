package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorLightIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 208.0f),
                    PathNode.CurveTo(174.0f, 211.3137f, 171.3137f, 214.0f, 168.0f, 214.0f),
                    PathNode.LineTo(88.0f, 214.0f),
                    PathNode.CurveTo(85.72737f, 214.0f, 83.64978f, 212.71599f, 82.63344f, 210.68329f),
                    PathNode.CurveTo(81.61709f, 208.65057f, 81.83642f, 206.21811f, 83.2f, 204.4f),
                    PathNode.LineTo(155.2f, 108.48f),
                    PathNode.CurveTo(163.48126f, 97.498314f, 164.33043f, 82.608986f, 157.35144f, 70.756966f),
                    PathNode.CurveTo(150.37245f, 58.904945f, 136.9402f, 52.425148f, 123.32f, 54.34f),
                    PathNode.CurveTo(111.60685f, 55.98313f, 101.58172f, 63.578617f, 96.83f, 74.41f),
                    PathNode.CurveTo(95.501755f, 77.44756f, 91.96256f, 78.833244f, 88.925f, 77.505f),
                    PathNode.CurveTo(85.88743f, 76.17676f, 84.501755f, 72.637566f, 85.83f, 69.6f),
                    PathNode.CurveTo(87.27484f, 66.30699f, 89.09704f, 63.192818f, 91.26f, 60.32f),
                    PathNode.CurveTo(106.55f, 40.02906f, 135.39406f, 35.975f, 155.685f, 51.265f),
                    PathNode.CurveTo(175.97594f, 66.555f, 180.03f, 95.399055f, 164.74f, 115.69f),
                    PathNode.LineTo(100.0f, 202.0f),
                    PathNode.LineTo(168.0f, 202.0f),
                    PathNode.CurveTo(171.3137f, 202.0f, 174.0f, 204.6863f, 174.0f, 208.0f),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
