package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) return _officeChair!!
        _officeChair = phosphorFillIcon(
            name = "OfficeChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 132.41827f, 244.41827f, 136.0f, 240.0f, 136.0f),
                    PathNode.LineTo(223.33f, 136.0f),
                    PathNode.CurveTo(219.39572f, 159.07808f, 199.41101f, 175.96776f, 176.0f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.CurveTo(177.67311f, 200.0f, 192.0f, 214.32689f, 192.0f, 232.0f),
                    PathNode.CurveTo(192.0f, 236.41827f, 188.41827f, 240.0f, 184.0f, 240.0f),
                    PathNode.CurveTo(179.58173f, 240.0f, 176.0f, 236.41827f, 176.0f, 232.0f),
                    PathNode.CurveTo(176.0f, 223.16344f, 168.83656f, 216.0f, 160.0f, 216.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 236.41827f, 132.41827f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(123.58172f, 240.0f, 120.0f, 236.41827f, 120.0f, 232.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(87.163445f, 216.0f, 80.0f, 223.16344f, 80.0f, 232.0f),
                    PathNode.CurveTo(80.0f, 236.41827f, 76.41828f, 240.0f, 72.0f, 240.0f),
                    PathNode.CurveTo(67.58172f, 240.0f, 64.0f, 236.41827f, 64.0f, 232.0f),
                    PathNode.CurveTo(64.0f, 214.32689f, 78.32689f, 200.0f, 96.0f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.CurveTo(56.588985f, 175.96776f, 36.60428f, 159.07808f, 32.67f, 136.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(11.581722f, 136.0f, 8.0f, 132.41827f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 123.58172f, 11.581722f, 120.0f, 16.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(44.418278f, 120.0f, 48.0f, 123.58172f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 145.67311f, 62.32689f, 160.0f, 80.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.CurveTo(193.67311f, 160.0f, 208.0f, 145.67311f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 123.58172f, 211.58173f, 120.0f, 216.0f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.CurveTo(244.41827f, 120.0f, 248.0f, 123.58172f, 248.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 144.0f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.CurveTo(180.63783f, 144.00012f, 185.04756f, 141.98781f, 188.08664f, 138.48444f),
                    PathNode.CurveTo(191.12572f, 134.98105f, 192.4951f, 130.33134f, 191.84f, 125.74f),
                    PathNode.LineTo(178.12f, 29.74f),
                    PathNode.CurveTo(176.96304f, 21.873764f, 170.23079f, 16.034042f, 162.28f, 16.0f),
                    PathNode.LineTo(93.72f, 16.0f),
                    PathNode.CurveTo(85.76921f, 16.034042f, 79.03696f, 21.873764f, 77.88f, 29.74f),
                    PathNode.LineTo(64.16f, 125.74f),
                    PathNode.CurveTo(63.5049f, 130.33134f, 64.87429f, 134.98105f, 67.91336f, 138.48444f),
                    PathNode.CurveTo(70.95244f, 141.98781f, 75.36215f, 144.00012f, 80.0f, 144.0f),
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
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
