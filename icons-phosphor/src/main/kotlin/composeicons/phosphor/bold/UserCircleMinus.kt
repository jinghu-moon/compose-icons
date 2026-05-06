package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorBoldIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 56c0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12ZM229.85 92c15.681 44.351 .85 93.751-36.666 122.131-37.516 28.38-89.087 29.213-127.5 2.058C27.271 189.035 10.853 140.139 25.094 95.305 39.335 50.471 80.958 20.012 128 20c6.031-.001 12.051 .497 18 1.49 6.536 1.105 10.94 7.299 9.835 13.835-1.105 6.536-7.299 10.94-13.835 9.835C137.373 44.388 132.691 44 128 44 95.824 43.978 66.466 62.352 52.422 91.301c-14.045 28.95-10.305 63.38 9.628 88.639 7.778-9.893 17.692-17.899 29-23.42C70.931 136.146 71.068 103.34 91.358 83.136c20.289-20.205 53.095-20.205 73.385 0 20.289 20.205 20.427 53.01 .308 73.384 11.311 5.518 21.225 13.524 29 23.42C211.86 157.316 216.831 127.142 207.22 100c-2.209-6.249 1.066-13.106 7.315-15.315 6.249-2.209 13.106 1.066 15.315 7.315ZM128 148c15.464 0 28-12.536 28-28C156 104.536 143.464 92 128 92c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM128 212c17.354 .012 34.281-5.381 48.43-15.43C165.131 181.121 147.14 171.989 128 171.989c-19.14 0-37.131 9.132-48.43 24.581C93.718 206.619 110.646 212.012 128 212Z"),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
