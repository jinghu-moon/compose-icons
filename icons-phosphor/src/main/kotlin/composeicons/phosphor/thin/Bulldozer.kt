package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorThinIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 204h-8c-6.627 0-12-5.373-12-12v-32c0-6.627 5.373-12 12-12h8c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-8c-11.046 0-20 8.954-20 20v12h-24.23c-1.949-17.182-15.819-30.562-33.06-31.89L125.71 51.38C123.851 46.922 119.5 44.014 114.67 44h-90.67C17.373 44 12 49.373 12 56v97.41C3.305 164.199 1.574 179.021 7.549 191.523 13.524 204.025 26.143 211.988 40 212h120c18.332-.004 33.733-13.782 35.77-32h24.23v12c0 11.046 8.954 20 20 20h8c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM118.36 54.46 154 140h-94v-88h54.67c1.614 .001 3.069 .971 3.69 2.46ZM24 52h28v88h-12c-7.123-.011-14.088 2.107-20 6.08v-90.08c0-2.209 1.791-4 4-4ZM160 204h-120C24.536 204 12 191.464 12 176c0-15.464 12.536-28 28-28h120c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM164 176c0 2.209-1.791 4-4 4h-120c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h120c2.209 0 4 1.791 4 4Z"),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
