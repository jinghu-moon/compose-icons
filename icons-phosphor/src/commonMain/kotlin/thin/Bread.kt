package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorThinIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 60.11775f, 219.88223f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(30.467932f, 44.00155f, 15.486404f, 56.63266f, 12.52165f, 73.91223f),
                    PathNode.CurveTo(9.556897f, 91.1918f, 19.471155f, 108.09443f, 36.0f, 113.94f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 206.62741f, 41.37258f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(200.0f, 212.0f),
                    PathNode.CurveTo(206.62741f, 212.0f, 212.0f, 206.62741f, 212.0f, 200.0f),
                    PathNode.LineTo(212.0f, 113.94f),
                    PathNode.CurveTo(226.37004f, 108.83724f, 235.9786f, 95.249115f, 236.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 115.77f),
                    PathNode.CurveTo(45.32789f, 115.92251f, 46.663383f, 115.9993f, 48.0f, 116.0f),
                    PathNode.CurveTo(50.20914f, 116.0f, 52.0f, 114.20914f, 52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 109.79086f, 50.20914f, 108.0f, 48.0f, 108.0f),
                    PathNode.CurveTo(32.536026f, 108.0f, 20.0f, 95.463974f, 20.0f, 80.0f),
                    PathNode.CurveTo(20.0f, 64.536026f, 32.536026f, 52.0f, 48.0f, 52.0f),
                    PathNode.LineTo(144.0f, 52.0f),
                    PathNode.CurveTo(159.46397f, 52.0f, 172.0f, 64.536026f, 172.0f, 80.0f),
                    PathNode.CurveTo(172.0f, 95.463974f, 159.46397f, 108.0f, 144.0f, 108.0f),
                    PathNode.CurveTo(141.79086f, 108.0f, 140.0f, 109.79086f, 140.0f, 112.0f),
                    PathNode.CurveTo(140.0f, 114.20914f, 141.79086f, 116.0f, 144.0f, 116.0f),
                    PathNode.CurveTo(145.33662f, 115.9993f, 146.67209f, 115.92251f, 148.0f, 115.77f),
                    PathNode.LineTo(148.0f, 200.0f),
                    PathNode.CurveTo(148.0f, 202.20914f, 146.20914f, 204.0f, 144.0f, 204.0f),
                    PathNode.LineTo(48.0f, 204.0f),
                    PathNode.CurveTo(45.79086f, 204.0f, 44.0f, 202.20914f, 44.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 108.0f),
                    PathNode.CurveTo(197.79086f, 108.0f, 196.0f, 109.79086f, 196.0f, 112.0f),
                    PathNode.CurveTo(196.0f, 114.20914f, 197.79086f, 116.0f, 200.0f, 116.0f),
                    PathNode.CurveTo(201.33662f, 115.9993f, 202.67209f, 115.92251f, 204.0f, 115.77f),
                    PathNode.LineTo(204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 202.20914f, 202.20914f, 204.0f, 200.0f, 204.0f),
                    PathNode.LineTo(155.3f, 204.0f),
                    PathNode.CurveTo(155.76273f, 202.71713f, 155.99957f, 201.36377f, 156.0f, 200.0f),
                    PathNode.LineTo(156.0f, 113.94f),
                    PathNode.CurveTo(168.288f, 109.58454f, 177.26102f, 98.925964f, 179.45811f, 86.07538f),
                    PathNode.CurveTo(181.6552f, 73.2248f, 176.73299f, 60.19052f, 166.59f, 52.0f),
                    PathNode.LineTo(200.0f, 52.0f),
                    PathNode.CurveTo(215.46397f, 52.0f, 228.0f, 64.536026f, 228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 95.463974f, 215.46397f, 108.0f, 200.0f, 108.0f),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
