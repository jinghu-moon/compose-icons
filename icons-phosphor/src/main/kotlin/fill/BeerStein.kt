package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorFillIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.LineTo(200.0f, 72.0f),
                    PathNode.CurveTo(200.0f, 49.90861f, 182.09138f, 32.0f, 160.0f, 32.0f),
                    PathNode.LineTo(148.82f, 32.0f),
                    PathNode.CurveTo(136.91f, 21.8f, 120.82f, 16.0f, 104.0f, 16.0f),
                    PathNode.CurveTo(68.71f, 16.0f, 40.0f, 41.12f, 40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 216.83656f, 47.163445f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(184.0f, 224.0f),
                    PathNode.CurveTo(192.83656f, 224.0f, 200.0f, 216.83656f, 200.0f, 208.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(229.25484f, 200.0f, 240.0f, 189.25484f, 240.0f, 176.0f),
                    PathNode.LineTo(240.0f, 112.0f),
                    PathNode.CurveTo(240.0f, 98.74516f, 229.25484f, 88.0f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 184.0f),
                    PathNode.CurveTo(104.0f, 188.41827f, 100.41828f, 192.0f, 96.0f, 192.0f),
                    PathNode.CurveTo(91.58172f, 192.0f, 88.0f, 188.41827f, 88.0f, 184.0f),
                    PathNode.LineTo(88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 99.58172f, 91.58172f, 96.0f, 96.0f, 96.0f),
                    PathNode.CurveTo(100.41828f, 96.0f, 104.0f, 99.58172f, 104.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 184.0f),
                    PathNode.CurveTo(152.0f, 188.41827f, 148.41827f, 192.0f, 144.0f, 192.0f),
                    PathNode.CurveTo(139.58173f, 192.0f, 136.0f, 188.41827f, 136.0f, 184.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.CurveTo(136.0f, 99.58172f, 139.58173f, 96.0f, 144.0f, 96.0f),
                    PathNode.CurveTo(148.41827f, 96.0f, 152.0f, 99.58172f, 152.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.0f, 64.0f),
                    PathNode.CurveTo(61.46f, 45.76f, 80.85f, 32.0f, 104.0f, 32.0f),
                    PathNode.CurveTo(117.87f, 32.0f, 131.06f, 37.0f, 140.21f, 45.78f),
                    PathNode.CurveTo(141.69867f, 47.20453f, 143.67957f, 47.999752f, 145.74f, 48.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(170.16808f, 48.003143f, 179.23064f, 54.413452f, 182.62f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 180.41827f, 220.41827f, 184.0f, 216.0f, 184.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.CurveTo(220.41827f, 104.0f, 224.0f, 107.58172f, 224.0f, 112.0f),
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
        return _beerStein!!
    }

private var _beerStein: ImageVector? = null
