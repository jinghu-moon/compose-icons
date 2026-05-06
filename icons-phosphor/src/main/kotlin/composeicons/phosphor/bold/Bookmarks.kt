package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorBoldIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 20h-96C84.954 20 76 28.954 76 40v20h-12C52.954 60 44 68.954 44 80v144c-0 4.573 2.598 8.748 6.7 10.768 4.103 2.019 8.996 1.532 12.62-1.258L108 199.14l44.69 34.37c3.623 2.783 8.513 3.267 12.612 1.249 4.099-2.019 6.696-6.19 6.698-10.759v-46.4l20.68 15.91c3.623 2.789 8.517 3.277 12.62 1.258 4.103-2.019 6.701-6.195 6.7-10.768v-144C212 28.954 203.046 20 192 20ZM148 199.63 115.31 174.49c-4.313-3.316-10.317-3.316-14.63 0L68 199.63v-115.63h80ZM188 159.63 172 147.33v-67.33C172 68.954 163.046 60 152 60h-52v-16h88Z"),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
