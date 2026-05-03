package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserMinus: ImageVector
    get() {
        if (_userMinus != null) return _userMinus!!
        _userMinus = phosphorLightIcon(
            name = "UserMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(254.0f, 136.0f),
                    PathNode.CurveTo(254.0f, 139.3137f, 251.3137f, 142.0f, 248.0f, 142.0f),
                    PathNode.LineTo(200.0f, 142.0f),
                    PathNode.CurveTo(196.6863f, 142.0f, 194.0f, 139.3137f, 194.0f, 136.0f),
                    PathNode.CurveTo(194.0f, 132.6863f, 196.6863f, 130.0f, 200.0f, 130.0f),
                    PathNode.LineTo(248.0f, 130.0f),
                    PathNode.CurveTo(251.3137f, 130.0f, 254.0f, 132.6863f, 254.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.59f, 196.14f),
                    PathNode.CurveTo(198.04675f, 197.7705f, 198.50122f, 200.06433f, 197.77621f, 202.12709f),
                    PathNode.CurveTo(197.0512f, 204.18985f, 195.26149f, 205.69493f, 193.10495f, 206.05544f),
                    PathNode.CurveTo(190.94841f, 206.41594f, 188.7665f, 205.5748f, 187.41f, 203.86f),
                    PathNode.CurveTo(166.9f, 179.45f, 138.69f, 166.0f, 108.0f, 166.0f),
                    PathNode.CurveTo(77.31f, 166.0f, 49.11f, 179.45f, 28.59f, 203.86f),
                    PathNode.CurveTo(26.42884f, 206.27892f, 22.736506f, 206.54225f, 20.25394f, 204.45451f),
                    PathNode.CurveTo(17.771374f, 202.36678f, 17.397564f, 198.68399f, 19.41f, 196.14f),
                    PathNode.CurveTo(35.14f, 177.41f, 55.0f, 164.48f, 77.0f, 158.26f),
                    PathNode.CurveTo(50.25236f, 144.02927f, 36.629093f, 113.41513f, 43.96252f, 84.01835f),
                    PathNode.CurveTo(51.295948f, 54.62157f, 77.70231f, 33.993374f, 108.0f, 33.993374f),
                    PathNode.CurveTo(138.29768f, 33.993374f, 164.70404f, 54.62157f, 172.03748f, 84.01835f),
                    PathNode.CurveTo(179.37091f, 113.41513f, 165.74763f, 144.02927f, 139.0f, 158.26f),
                    PathNode.CurveTo(161.0f, 164.48f, 180.86f, 177.41f, 196.59f, 196.14f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 154.0f),
                    PathNode.CurveTo(137.82338f, 154.0f, 162.0f, 129.82338f, 162.0f, 100.0f),
                    PathNode.CurveTo(162.0f, 70.17662f, 137.82338f, 46.0f, 108.0f, 46.0f),
                    PathNode.CurveTo(78.17662f, 46.0f, 54.0f, 70.17662f, 54.0f, 100.0f),
                    PathNode.CurveTo(54.033066f, 129.80966f, 78.19033f, 153.96693f, 108.0f, 154.0f),
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
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
