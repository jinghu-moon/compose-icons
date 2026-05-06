package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorBoldIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 96v112c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-112C203.967 67.295 180.705 44.033 152 44h-48C75.295 44.033 52.033 67.295 52 96v112c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-112C28.044 54.045 62.045 20.044 104 20h48c41.955 .044 75.956 34.045 76 76ZM188 96v72c-.003 11.95-7.59 22.582-18.89 26.47l2 5.07c2.463 6.152-.528 13.137-6.68 15.6-1.408 .568-2.912 .859-4.43 .86-4.905-0-9.317-2.986-11.14-7.54l-5-12.46h-31.74l-5 12.46c-1.82 4.547-6.222 7.532-11.12 7.54-1.528 .003-3.043-.289-4.46-.86-6.152-2.463-9.143-9.448-6.68-15.6l2-5.07C75.572 190.572 67.998 179.943 68 168v-72C68 80.536 80.536 68 96 68h64c15.464 0 28 12.536 28 28ZM92 96v36h72v-36c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4ZM164 168v-12h-24v16h20c2.209 0 4-1.791 4-4ZM116 172v-16h-24v12c0 2.209 1.791 4 4 4Z"),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
