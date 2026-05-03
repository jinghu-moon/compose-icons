package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorFillIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 200.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(235.58173f, 200.0f, 232.0f, 196.41827f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 160.0f),
                    PathNode.CurveTo(232.0f, 155.58173f, 235.58173f, 152.0f, 240.0f, 152.0f),
                    PathNode.LineTo(248.0f, 152.0f),
                    PathNode.CurveTo(252.41827f, 152.0f, 256.0f, 148.41827f, 256.0f, 144.0f),
                    PathNode.CurveTo(256.0f, 139.58173f, 252.41827f, 136.0f, 248.0f, 136.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.CurveTo(226.74516f, 136.0f, 216.0f, 146.74516f, 216.0f, 160.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.LineTo(199.2f, 168.0f),
                    PathNode.CurveTo(195.77469f, 151.39702f, 182.27872f, 138.74178f, 165.49f, 136.39f),
                    PathNode.LineTo(129.44f, 49.85f),
                    PathNode.CurveTo(126.956764f, 43.885883f, 121.130424f, 40.000336f, 114.67f, 40.0f),
                    PathNode.LineTo(24.0f, 40.0f),
                    PathNode.CurveTo(15.163444f, 40.0f, 8.0f, 47.163445f, 8.0f, 56.0f),
                    PathNode.LineTo(8.0f, 152.0f),
                    PathNode.CurveTo(-1.09053f, 164.12073f, -2.552768f, 180.33719f, 4.222913f, 193.88855f),
                    PathNode.CurveTo(10.998593f, 207.43991f, 24.849117f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(179.00108f, 215.97679f, 195.37325f, 202.61176f, 199.2f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 205.25484f, 226.74516f, 216.0f, 240.0f, 216.0f),
                    PathNode.LineTo(248.0f, 216.0f),
                    PathNode.CurveTo(252.41827f, 216.0f, 256.0f, 212.41827f, 256.0f, 208.0f),
                    PathNode.CurveTo(256.0f, 203.58173f, 252.41827f, 200.0f, 248.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 56.0f),
                    PathNode.LineTo(114.67f, 56.0f),
                    PathNode.LineTo(148.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(34.492085f, 135.99524f, 29.043377f, 137.13606f, 24.0f, 139.35f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 180.41827f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 171.58173f, 35.581722f, 168.0f, 40.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(164.41827f, 168.0f, 168.0f, 171.58173f, 168.0f, 176.0f),
                    PathNode.CurveTo(168.0f, 180.41827f, 164.41827f, 184.0f, 160.0f, 184.0f),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
