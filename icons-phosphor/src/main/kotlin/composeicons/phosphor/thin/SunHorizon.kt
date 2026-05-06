package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorThinIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 156h-45.06c4.525-25.326-5.63-51.037-26.24-66.435C148.09 74.167 120.555 71.719 97.552 83.238 74.548 94.758 60.015 118.273 60 144c.001 4.023 .356 8.039 1.06 12h-45.06c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM68 144c.004-22.879 13.019-43.764 33.556-53.847 20.537-10.083 45.02-7.61 63.126 6.377 18.105 13.987 26.68 37.053 22.109 59.47h-117.58C68.406 152.051 68 148.03 68 144ZM212 200c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM76.42 41.79c-.989-1.977-.187-4.381 1.79-5.37 1.977-.989 4.381-.187 5.37 1.79l8 16c.989 1.977 .187 4.381-1.79 5.37-1.977 .989-4.381 .187-5.37-1.79ZM20.42 94.21c.474-.95 1.307-1.672 2.314-2.008 1.007-.336 2.107-.257 3.056 .218l16 8c1.977 .989 2.779 3.393 1.79 5.37-.989 1.977-3.393 2.779-5.37 1.79l-16-8c-.95-.474-1.672-1.307-2.008-2.314-.336-1.007-.257-2.107 .218-3.056ZM212.42 105.79c-.475-.949-.554-2.049-.218-3.056 .336-1.007 1.058-1.84 2.008-2.314l16-8c1.977-.989 4.381-.187 5.37 1.79 .989 1.977 .187 4.381-1.79 5.37l-16 8c-.949 .475-2.049 .554-3.056 .218-1.007-.336-1.84-1.058-2.314-2.008ZM164.42 54.21l8-16c.989-1.977 3.393-2.779 5.37-1.79 1.977 .989 2.779 3.393 1.79 5.37l-8 16c-.989 1.977-3.393 2.779-5.37 1.79-1.977-.989-2.779-3.393-1.79-5.37Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
