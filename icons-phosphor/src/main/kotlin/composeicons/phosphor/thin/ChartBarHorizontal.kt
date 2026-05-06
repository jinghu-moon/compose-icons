package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorThinIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 100h-44v-44c0-2.209-1.791-4-4-4h-124v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v176c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h92c2.209 0 4-1.791 4-4v-44h76c2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM172 60v40h-120v-40ZM140 196h-88v-40h88ZM220 148h-168v-40h168Z"),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
