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
                pathData = parseSvgPathData("M13 13v5.585l1.828-1.828 1.414 1.414L12 22.414 7.757 18.172 9.172 16.757 11 18.585v-5.585h2ZM12 2c3.593 0 6.554 2.708 6.954 6.194C21.286 8.832 23 10.966 23 13.5c0 2.869-2.196 5.225-4.999 5.478L18 17c0-3.314-2.686-6-6-6C8.762 11 6.122 13.566 6.004 16.775L6 17l0 1.978C3.197 18.725 1 16.369 1 13.5 1 10.966 2.714 8.832 5.046 8.194 5.446 4.708 8.407 2 12 2Z"),
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
