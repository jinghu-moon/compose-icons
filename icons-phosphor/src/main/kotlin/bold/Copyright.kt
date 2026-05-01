package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorBoldIcon(
            name = "Copyright",
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
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(169.59f, 159.21f),
                    PathNode.CurveTo(156.15619f, 177.1083f, 132.77776f, 184.40424f, 111.548515f, 177.32356f),
                    PathNode.CurveTo(90.319275f, 170.2429f, 76.00125f, 150.37393f, 76.00125f, 127.995f),
                    PathNode.CurveTo(76.00125f, 105.61607f, 90.319275f, 85.7471f, 111.548515f, 78.666435f),
                    PathNode.CurveTo(132.77776f, 71.58577f, 156.15619f, 78.8817f, 169.59f, 96.78f),
                    PathNode.CurveTo(172.26039f, 100.20032f, 172.87624f, 104.795845f, 171.2006f, 108.79858f),
                    PathNode.CurveTo(169.52498f, 112.80131f, 165.81894f, 115.58759f, 161.50829f, 116.085495f),
                    PathNode.CurveTo(157.19765f, 116.5834f, 152.95401f, 114.71534f, 150.41f, 111.2f),
                    PathNode.CurveTo(143.17877f, 101.55836f, 130.5892f, 97.62567f, 119.155624f, 101.43687f),
                    PathNode.CurveTo(107.722046f, 105.24806f, 100.01f, 115.94795f, 100.01f, 128.0f),
                    PathNode.CurveTo(100.01f, 140.05205f, 107.722046f, 150.75194f, 119.155624f, 154.56313f),
                    PathNode.CurveTo(130.5892f, 158.37433f, 143.17877f, 154.44164f, 150.41f, 144.8f),
                    PathNode.CurveTo(152.93288f, 141.2321f, 157.19583f, 139.31764f, 161.53864f, 139.80222f),
                    PathNode.CurveTo(165.88145f, 140.28676f, 169.61758f, 143.09372f, 171.29202f, 147.12993f),
                    PathNode.CurveTo(172.96646f, 151.16618f, 172.31448f, 155.79356f, 169.59f, 159.21f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _copyright!!
    }

private var _copyright: ImageVector? = null
