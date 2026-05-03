package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DownloadCloud2Fill: ImageVector
    get() {
        if (_downloadCloud2Fill != null) return _downloadCloud2Fill!!
        _downloadCloud2Fill = remixIcon(
            name = "DownloadCloud2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 13.000 L 13.000 18.585 L 14.828 16.757 L 16.243 18.172 L 12.000 22.414 L 7.757 18.172 L 9.172 16.757 L 11.000 18.585 L 11.000 13.000 L 13.000 13.000 ZM 12.000 2.000 C 15.593 2.000 18.554 4.708 18.954 8.194 C 21.286 8.832 23.000 10.966 23.000 13.500 C 23.000 16.369 20.804 18.725 18.001 18.978 L 18.000 17.000 C 18.000 13.686 15.314 11.000 12.000 11.000 C 8.762 11.000 6.122 13.566 6.004 16.775 L 6.000 17.000 L 6.000 18.978 C 3.197 18.725 1.000 16.369 1.000 13.500 C 1.000 10.966 2.714 8.832 5.046 8.194 C 5.446 4.708 8.407 2.000 12.000 2.000 Z"),
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
        return _downloadCloud2Fill!!
    }

private var _downloadCloud2Fill: ImageVector? = null
