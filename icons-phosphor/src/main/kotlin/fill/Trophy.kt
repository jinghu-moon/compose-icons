package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorFillIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 43.581722f, 204.41827f, 40.0f, 200.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(51.581722f, 40.0f, 48.0f, 43.581722f, 48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(15.163444f, 64.0f, 8.0f, 71.163445f, 8.0f, 80.0f),
                    PathNode.LineTo(8.0f, 96.0f),
                    PathNode.CurveTo(8.0f, 118.09139f, 25.90861f, 136.0f, 48.0f, 136.0f),
                    PathNode.LineTo(51.65f, 136.0f),
                    PathNode.CurveTo(61.28187f, 166.52408f, 88.15488f, 188.38812f, 120.0f, 191.61f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(91.58172f, 216.0f, 88.0f, 219.58173f, 88.0f, 224.0f),
                    PathNode.CurveTo(88.0f, 228.41827f, 91.58172f, 232.0f, 96.0f, 232.0f),
                    PathNode.LineTo(160.0f, 232.0f),
                    PathNode.CurveTo(164.41827f, 232.0f, 168.0f, 228.41827f, 168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 219.58173f, 164.41827f, 216.0f, 160.0f, 216.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 191.58f),
                    PathNode.CurveTo(167.94f, 188.35f, 194.44f, 165.94f, 204.08f, 136.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.CurveTo(230.09138f, 136.0f, 248.0f, 118.09139f, 248.0f, 96.0f),
                    PathNode.LineTo(248.0f, 80.0f),
                    PathNode.CurveTo(248.0f, 71.163445f, 240.83656f, 64.0f, 232.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 120.0f),
                    PathNode.CurveTo(34.745167f, 120.0f, 24.0f, 109.25484f, 24.0f, 96.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.QuadTo(48.0f, 116.0f, 48.39f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 96.0f),
                    PathNode.CurveTo(232.0f, 109.25484f, 221.25484f, 120.0f, 208.0f, 120.0f),
                    PathNode.LineTo(207.5f, 120.0f),
                    PathNode.CurveTo(207.8283f, 117.044624f, 207.99521f, 114.07355f, 208.0f, 111.1f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _trophy!!
    }

private var _trophy: ImageVector? = null
