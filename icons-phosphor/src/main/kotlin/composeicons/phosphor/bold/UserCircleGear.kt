package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) return _userCircleGear!!
        _userCircleGear = phosphorBoldIcon(
            name = "UserCircleGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M169.57 46.11c2.05-6.301 8.819-9.748 15.12-7.7L188 39.48v-3.48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v3.48l3.31-1.07c4.102-1.417 8.648-.509 11.891 2.374 3.243 2.883 4.677 7.293 3.75 11.532-.927 4.239-4.07 7.648-8.221 8.914l-3.31 1.08 2 2.82c2.663 3.46 3.237 8.094 1.497 12.099-1.739 4.005-5.517 6.749-9.864 7.165-4.347 .416-8.576-1.562-11.044-5.164L200 76.42l-2 2.81c-2.467 3.602-6.697 5.58-11.044 5.164-4.347-.416-8.124-3.16-9.864-7.165-1.739-4.005-1.166-8.639 1.497-12.099l2-2.82-3.31-1.08c-3.028-.982-5.541-3.127-6.987-5.963-1.446-2.836-1.706-6.13-.723-9.157ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c6.031-.001 12.051 .497 18 1.49 6.536 1.105 10.94 7.299 9.835 13.835-1.105 6.536-7.299 10.94-13.835 9.835C137.373 44.388 132.691 44 128 44 95.824 43.978 66.466 62.352 52.422 91.301c-14.045 28.95-10.305 63.38 9.628 88.639 7.778-9.893 17.692-17.899 29-23.42C70.931 136.146 71.068 103.34 91.358 83.136c20.289-20.205 53.095-20.205 73.385 0 20.289 20.205 20.427 53.01 .308 73.384 11.308 5.521 21.222 13.527 29 23.42C205.717 165.145 212.043 146.842 212 128c-.001-4.691-.389-9.373-1.16-14-1.105-6.536 3.299-12.73 9.835-13.835 6.536-1.105 12.73 3.299 13.835 9.835 .994 5.948 1.492 11.969 1.49 18ZM128 148c15.464 0 28-12.536 28-28C156 104.536 143.464 92 128 92c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM128 212c17.354 .012 34.281-5.381 48.43-15.43C165.131 181.121 147.14 171.989 128 171.989c-19.14 0-37.131 9.132-48.43 24.581C93.718 206.619 110.646 212.012 128 212Z"),
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
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null
