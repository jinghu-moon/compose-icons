package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorFillIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 88v64c0 4.418-3.582 8-8 8h-64c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722l26.19-26.18C163.012 95.978 125.549 89.305 93.25 103.187 60.951 117.07 40.014 148.844 40 184c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-41.637 24.834-79.261 63.119-95.627 38.285-16.367 82.642-8.322 112.741 20.447L226.34 82.34c2.288-2.291 5.731-2.976 8.722-1.737 2.991 1.239 4.94 4.159 4.938 7.397Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
