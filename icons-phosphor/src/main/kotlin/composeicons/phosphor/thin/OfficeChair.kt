package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) return _officeChair!!
        _officeChair = phosphorThinIcon(
            name = "OfficeChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 128c0 2.209-1.791 4-4 4h-20.18c-2.095 22.644-21.08 39.973-43.82 40h-44v32h28c15.464 0 28 12.536 28 28 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-11.046-8.954-20-20-20h-28v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-28c-11.046 0-20 8.954-20 20 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-15.464 12.536-28 28-28h28v-32h-44C57.26 171.973 38.275 154.644 36.18 132h-20.18c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4 0 19.882 16.118 36 36 36h96c19.882 0 36-16.118 36-36 0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4ZM70.94 135.86c-2.282-2.627-3.31-6.115-2.82-9.56L81.84 30.3C82.71 24.402 87.759 20.025 93.72 20h68.56c5.961 .025 11.01 4.402 11.88 10.3l13.72 96c.493 3.444-.533 6.933-2.813 9.562-2.279 2.629-5.588 4.139-9.067 4.138h-96c-3.477-.002-6.782-1.513-9.06-4.14ZM76.94 130.62c.762 .894 1.885 1.401 3.06 1.38h96c1.154 .003 2.251-.502 3-1.38 .761-.877 1.104-2.041 .94-3.19l-13.72-96c-.286-1.984-1.996-3.45-4-3.43h-68.5c-2.004-.02-3.714 1.446-4 3.43L76 127.43c-.148 1.158 .217 2.324 1 3.19Z"),
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
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
