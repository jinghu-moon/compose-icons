package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorBoldIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 177.28f),
                    PathNode.CurveTo(51.9967f, 166.2705f, 46.802933f, 153.47314f, 44.87f, 140.0f),
                    PathNode.LineTo(75.14f, 140.0f),
                    PathNode.CurveTo(73.22346f, 153.47928f, 68.02439f, 166.2812f, 60.0f, 177.28f),
                    PathNode.Close,
                    PathNode.MoveTo(44.87f, 116.0f),
                    PathNode.CurveTo(46.802933f, 102.52685f, 51.9967f, 89.72951f, 60.0f, 78.72f),
                    PathNode.CurveTo(68.02439f, 89.718796f, 73.22346f, 102.52071f, 75.14f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 211.13f),
                    PathNode.CurveTo(101.80354f, 209.07869f, 88.37331f, 203.41045f, 77.0f, 194.67f),
                    PathNode.CurveTo(89.43077f, 178.90494f, 97.1727f, 159.95906f, 99.34f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 116.0f),
                    PathNode.LineTo(99.34f, 116.0f),
                    PathNode.CurveTo(97.1727f, 96.04095f, 89.43077f, 77.095055f, 77.0f, 61.33f),
                    PathNode.CurveTo(88.37331f, 52.589558f, 101.80354f, 46.92131f, 116.0f, 44.87f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 78.72f),
                    PathNode.CurveTo(204.0033f, 89.72951f, 209.19707f, 102.52685f, 211.13f, 116.0f),
                    PathNode.LineTo(180.86f, 116.0f),
                    PathNode.CurveTo(182.77655f, 102.52071f, 187.97562f, 89.718796f, 196.0f, 78.72f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 211.13f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(156.66f, 140.0f),
                    PathNode.CurveTo(158.8273f, 159.95906f, 166.56923f, 178.90494f, 179.0f, 194.67f),
                    PathNode.CurveTo(167.6267f, 203.41045f, 154.19646f, 209.07869f, 140.0f, 211.13f),
                    PathNode.Close,
                    PathNode.MoveTo(156.66f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 44.87f),
                    PathNode.CurveTo(154.19646f, 46.92131f, 167.6267f, 52.589558f, 179.0f, 61.33f),
                    PathNode.CurveTo(166.56923f, 77.095055f, 158.8273f, 96.04095f, 156.66f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 177.28f),
                    PathNode.CurveTo(187.97562f, 166.2812f, 182.77655f, 153.47928f, 180.86f, 140.0f),
                    PathNode.LineTo(211.13f, 140.0f),
                    PathNode.CurveTo(209.19707f, 153.47314f, 204.0033f, 166.2705f, 196.0f, 177.28f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _basketball!!
    }

private var _basketball: ImageVector? = null
