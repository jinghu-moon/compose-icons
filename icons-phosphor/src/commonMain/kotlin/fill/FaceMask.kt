package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorFillIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 72.0f),
                    PathNode.LineTo(223.15f, 72.0f),
                    PathNode.CurveTo(221.61801f, 67.36437f, 218.05336f, 63.681885f, 213.47f, 62.0f),
                    PathNode.LineTo(133.47f, 33.0f),
                    PathNode.CurveTo(129.93571f, 31.719675f, 126.064285f, 31.719675f, 122.53f, 33.0f),
                    PathNode.LineTo(42.53f, 62.09f),
                    PathNode.CurveTo(37.946636f, 63.771885f, 34.381985f, 67.45438f, 32.85f, 72.09f),
                    PathNode.LineTo(32.0f, 72.09f),
                    PathNode.CurveTo(14.361976f, 72.08993f, 0.049607f, 86.362045f, 0f, 104.0f),
                    PathNode.LineTo(0f, 128.0f),
                    PathNode.CurveTo(0f, 145.67311f, 14.326888f, 160.0f, 32.0f, 160.0f),
                    PathNode.LineTo(37.19f, 160.0f),
                    PathNode.CurveTo(44.38f, 175.8f, 58.98f, 189.43f, 80.42f, 200.16f),
                    PathNode.CurveTo(95.06981f, 207.34482f, 110.57923f, 212.6244f, 126.57f, 215.87f),
                    PathNode.CurveTo(127.51546f, 216.04333f, 128.48454f, 216.04333f, 129.43f, 215.87f),
                    PathNode.CurveTo(145.42076f, 212.6244f, 160.93019f, 207.34482f, 175.58f, 200.16f),
                    PathNode.CurveTo(197.02f, 189.43f, 211.58f, 175.8f, 218.81f, 160.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(241.67311f, 160.0f, 256.0f, 145.67311f, 256.0f, 128.0f),
                    PathNode.LineTo(256.0f, 104.0f),
                    PathNode.CurveTo(256.0f, 86.32689f, 241.67311f, 72.0f, 224.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 144.0f),
                    PathNode.CurveTo(23.163445f, 144.0f, 16.0f, 136.83656f, 16.0f, 128.0f),
                    PathNode.LineTo(16.0f, 104.0f),
                    PathNode.CurveTo(16.0f, 95.163445f, 23.163445f, 88.0f, 32.0f, 88.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.CurveTo(32.00089f, 138.67609f, 32.184647f, 141.34897f, 32.55f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 144.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.CurveTo(83.58172f, 144.0f, 80.0f, 140.41827f, 80.0f, 136.0f),
                    PathNode.CurveTo(80.0f, 131.58173f, 83.58172f, 128.0f, 88.0f, 128.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.CurveTo(172.41827f, 128.0f, 176.0f, 131.58173f, 176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 140.41827f, 172.41827f, 144.0f, 168.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.CurveTo(83.58172f, 112.0f, 80.0f, 108.41828f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 99.58172f, 83.58172f, 96.0f, 88.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(172.41827f, 96.0f, 176.0f, 99.58172f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 108.41828f, 172.41827f, 112.0f, 168.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 136.83656f, 232.83656f, 144.0f, 224.0f, 144.0f),
                    PathNode.LineTo(223.45f, 144.0f),
                    PathNode.CurveTo(223.81535f, 141.34897f, 223.99911f, 138.67609f, 224.0f, 136.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.CurveTo(232.83656f, 88.0f, 240.0f, 95.163445f, 240.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
