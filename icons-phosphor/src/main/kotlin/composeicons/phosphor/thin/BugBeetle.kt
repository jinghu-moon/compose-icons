package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorThinIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 148h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-24h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20.11C202.874 88.686 194.513 70.491 180.52 57.14L202.83 34.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L174.44 51.9c-27.331-21.2-65.549-21.2-92.88 0L58.83 29.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L75.48 57.14C61.487 70.491 53.126 88.686 52.11 108h-20.11c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v24h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v12c.013 4.02 .347 8.033 1 12h-21c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h22.69c9.033 33.043 39.055 55.959 73.31 55.959 34.255 0 64.277-22.916 73.31-55.959h22.69c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-21c.653-3.967 .987-7.98 1-12ZM128 44c35.981 .046 65.714 28.083 67.87 64h-135.74C62.286 72.083 92.019 44.046 128 44ZM132 227.87v-83.87c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v83.87C88.083 225.714 60.046 195.981 60 160v-44h136v44c-.046 35.981-28.083 65.714-64 67.87Z"),
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
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
