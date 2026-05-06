package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) return _officeChair!!
        _officeChair = phosphorBoldIcon(
            name = "OfficeChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 128c0 6.627-5.373 12-12 12h-13.4c-5.59 23.428-26.514 39.969-50.6 40h-36v16h20c19.882 0 36 16.118 36 36 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627-5.373-12-12-12h-20v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-20c-6.627 0-12 5.373-12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-19.882 16.118-36 36-36h20v-16h-36C55.914 179.969 34.99 163.428 29.4 140h-13.4C9.373 140 4 134.627 4 128c0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12 0 15.464 12.536 28 28 28h96c15.464 0 28-12.536 28-28 0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12ZM72.82 133c-3.782-4.413-5.457-10.253-4.59-16L81.8 29c1.448-9.801 9.882-17.047 19.79-17h52.82c9.908-.047 18.342 7.199 19.79 17l13.57 88c.874 5.762-.808 11.618-4.607 16.037-3.799 4.419-9.336 6.962-15.163 6.963h-80c-5.839-.005-11.384-2.563-15.18-7ZM92.67 116h70.66L151 36h-46Z"),
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
