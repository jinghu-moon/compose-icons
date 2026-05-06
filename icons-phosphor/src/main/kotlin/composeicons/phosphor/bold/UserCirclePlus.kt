package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorBoldIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 56c0-6.627 5.373-12 12-12h12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v12h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12c-6.627 0-12-5.373-12-12ZM234.51 110c7.776 46.275-15.251 92.269-56.96 113.768C135.842 245.268 85.019 237.341 51.839 204.161 18.659 170.981 10.732 120.158 32.232 78.45 53.731 36.741 99.725 13.714 146 21.49c6.536 1.105 10.94 7.299 9.835 13.835-1.105 6.536-7.299 10.94-13.835 9.835C137.373 44.388 132.691 44 128 44 95.824 43.978 66.466 62.352 52.422 91.301c-14.045 28.95-10.305 63.38 9.628 88.639 7.778-9.893 17.692-17.899 29-23.42C70.931 136.146 71.068 103.34 91.358 83.136c20.289-20.205 53.095-20.205 73.385 0 20.289 20.205 20.427 53.01 .308 73.384 11.311 5.518 21.225 13.524 29 23.42C205.721 165.147 212.047 146.842 212 128c-.001-4.691-.389-9.373-1.16-14-1.105-6.536 3.299-12.73 9.835-13.835 6.536-1.105 12.73 3.299 13.835 9.835ZM128 148c15.464 0 28-12.536 28-28C156 104.536 143.464 92 128 92c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM128 212c17.354 .012 34.281-5.381 48.43-15.43C165.131 181.121 147.14 171.989 128 171.989c-19.14 0-37.131 9.132-48.43 24.581C93.718 206.619 110.646 212.012 128 212Z"),
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
