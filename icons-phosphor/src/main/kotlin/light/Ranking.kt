package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorLightIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(114.31f, 101.9f),
                    PathNode.CurveTo(113.26135f, 98.757545f, 114.957954f, 95.35986f, 118.1f, 94.31f),
                    PathNode.LineTo(130.1f, 90.31f),
                    PathNode.CurveTo(131.92967f, 89.69917f, 133.94144f, 90.00526f, 135.50664f, 91.1326f),
                    PathNode.CurveTo(137.07185f, 92.25995f, 137.9996f, 94.07107f, 138.0f, 96.0f),
                    PathNode.LineTo(138.0f, 136.0f),
                    PathNode.CurveTo(138.0f, 139.3137f, 135.3137f, 142.0f, 132.0f, 142.0f),
                    PathNode.CurveTo(128.6863f, 142.0f, 126.0f, 139.3137f, 126.0f, 136.0f),
                    PathNode.LineTo(126.0f, 104.32f),
                    PathNode.LineTo(121.9f, 105.69f),
                    PathNode.CurveTo(118.757545f, 106.73865f, 115.35986f, 105.042046f, 114.31f, 101.9f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 208.0f),
                    PathNode.CurveTo(246.0f, 211.3137f, 243.3137f, 214.0f, 240.0f, 214.0f),
                    PathNode.LineTo(16.0f, 214.0f),
                    PathNode.CurveTo(12.686292f, 214.0f, 10.0f, 211.3137f, 10.0f, 208.0f),
                    PathNode.CurveTo(10.0f, 204.6863f, 12.686292f, 202.0f, 16.0f, 202.0f),
                    PathNode.LineTo(26.0f, 202.0f),
                    PathNode.LineTo(26.0f, 104.0f),
                    PathNode.CurveTo(26.0f, 96.26801f, 32.268013f, 90.0f, 40.0f, 90.0f),
                    PathNode.LineTo(82.0f, 90.0f),
                    PathNode.LineTo(82.0f, 56.0f),
                    PathNode.CurveTo(82.0f, 48.268013f, 88.26801f, 42.0f, 96.0f, 42.0f),
                    PathNode.LineTo(160.0f, 42.0f),
                    PathNode.CurveTo(167.73198f, 42.0f, 174.0f, 48.268013f, 174.0f, 56.0f),
                    PathNode.LineTo(174.0f, 130.0f),
                    PathNode.LineTo(216.0f, 130.0f),
                    PathNode.CurveTo(223.73198f, 130.0f, 230.0f, 136.26802f, 230.0f, 144.0f),
                    PathNode.LineTo(230.0f, 202.0f),
                    PathNode.LineTo(240.0f, 202.0f),
                    PathNode.CurveTo(243.3137f, 202.0f, 246.0f, 204.6863f, 246.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 142.0f),
                    PathNode.LineTo(174.0f, 202.0f),
                    PathNode.LineTo(218.0f, 202.0f),
                    PathNode.LineTo(218.0f, 144.0f),
                    PathNode.CurveTo(218.0f, 142.89543f, 217.10457f, 142.0f, 216.0f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 202.0f),
                    PathNode.LineTo(162.0f, 202.0f),
                    PathNode.LineTo(162.0f, 56.0f),
                    PathNode.CurveTo(162.0f, 54.89543f, 161.10457f, 54.0f, 160.0f, 54.0f),
                    PathNode.LineTo(96.0f, 54.0f),
                    PathNode.CurveTo(94.89543f, 54.0f, 94.0f, 54.89543f, 94.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 202.0f),
                    PathNode.LineTo(82.0f, 202.0f),
                    PathNode.LineTo(82.0f, 102.0f),
                    PathNode.LineTo(40.0f, 102.0f),
                    PathNode.CurveTo(38.89543f, 102.0f, 38.0f, 102.89543f, 38.0f, 104.0f),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
