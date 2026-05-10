package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorFillIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.07 186.76c11.215-23.26 10.513-50.503-1.885-73.155C217.787 90.954 195.217 75.679 169.58 72.59 158.078 46.067 133.16 27.813 104.403 24.843 75.646 21.873 47.524 34.649 30.844 58.261 14.163 81.874 11.52 112.649 23.93 138.76l-7.27 24.71c-1.656 5.619-.108 11.694 4.034 15.836 4.142 4.142 10.217 5.69 15.836 4.034l24.71-7.27c7.928 3.837 16.442 6.321 25.19 7.35 8.58 20.1 25.01 35.815 45.471 43.493 20.462 7.678 43.174 6.651 62.859-2.843l24.71 7.27c5.619 1.656 11.694 .108 15.836-4.034 4.142-4.142 5.69-10.217 4.034-15.836ZM132 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM80 152c.006 4.796 .441 9.582 1.3 14.3-5.397-1.265-10.604-3.232-15.49-5.85-1.841-.985-3.994-1.211-6-.63L32 168l8.17-27.76c.581-2.006 .355-4.159-.63-6C22.472 103.273 33.738 64.333 64.705 47.265c30.967-17.068 69.907-5.802 86.975 25.165C110.966 76.743 80.053 111.058 80 152ZM188 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
