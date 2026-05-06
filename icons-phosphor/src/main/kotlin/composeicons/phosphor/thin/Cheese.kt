package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorThinIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 36c-.39 .001-.777 .058-1.15 .17l-160 48h0C21.159 84.678 20 86.234 20 88v24c0 2.209 1.791 4 4 4h8c10.871 .056 19.73 8.742 20 19.61 .082 5.293-1.981 10.393-5.72 14.14-3.91 3.975-9.245 6.225-14.82 6.25h-7.46c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4h200c6.627 0 12-5.373 12-12v-96C235.967 59.295 212.705 36.033 184 36ZM184.57 44c22.518 .324 41.167 17.576 43.24 40h-176.56ZM196 104c.007 11.5-7.018 21.835-17.715 26.06-10.696 4.224-22.888 1.479-30.741-6.922C139.692 114.736 137.774 102.387 142.71 92h50.58c1.782 3.75 2.707 7.849 2.71 12ZM140 188h-56v-4c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28ZM228 184c0 2.209-1.791 4-4 4h-76v-4c0-19.882-16.118-36-36-36-19.882 0-36 16.118-36 36v4h-48v-24h3.46c7.726-.032 15.119-3.146 20.54-8.65 5.246-5.276 8.132-12.451 8-19.89C59.632 120.239 47.225 108.071 32 108h-4v-16h106.07c-5.291 14.921-.213 31.548 12.512 40.967 12.725 9.419 30.11 9.419 42.835 0C202.143 123.548 207.221 106.921 201.93 92h26.07Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
