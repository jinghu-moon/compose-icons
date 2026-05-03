package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorThinIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(203.61f, 201.71f),
                    PathNode.CurveTo(202.9497f, 203.1063f, 201.54454f, 203.99767f, 200.0f, 204.0f),
                    PathNode.CurveTo(199.4076f, 204.0033f, 198.8224f, 203.86983f, 198.29f, 203.61f),
                    PathNode.LineTo(46.29f, 131.61f),
                    PathNode.CurveTo(44.892956f, 130.94829f, 44.002243f, 129.54083f, 44.002243f, 127.995f),
                    PathNode.CurveTo(44.002243f, 126.44917f, 44.892956f, 125.04171f, 46.29f, 124.38f),
                    PathNode.LineTo(198.29f, 52.38f),
                    PathNode.CurveTo(200.27603f, 51.493248f, 202.60664f, 52.355923f, 203.53667f, 54.322052f),
                    PathNode.CurveTo(204.4667f, 56.288177f, 203.65529f, 58.637127f, 201.71f, 59.61f),
                    PathNode.LineTo(57.34f, 128.0f),
                    PathNode.LineTo(201.71f, 196.38f),
                    PathNode.CurveTo(202.66898f, 196.83461f, 203.40799f, 197.65169f, 203.76434f, 198.65134f),
                    PathNode.CurveTo(204.1207f, 199.65099f, 204.06517f, 200.7513f, 203.61f, 201.71f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
