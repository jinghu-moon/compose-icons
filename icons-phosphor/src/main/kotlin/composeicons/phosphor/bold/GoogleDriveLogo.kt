package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorBoldIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241 141.65 172.59 29.51l-.07-.11c-3.642-5.881-10.083-9.443-17-9.4h-55.08c-6.917-.043-13.358 3.519-17 9.4l-.07 .11L15 141.65c-3.864 6.238-4.002 14.09-.36 20.46L42 209.92c3.554 6.222 10.165 10.067 17.33 10.08h137.34c7.165-.013 13.776-3.858 17.33-10.08l27.32-47.81c3.654-6.362 3.532-14.215-.32-20.46ZM211.88 140h-37.09L142 85.33 160.12 55.14ZM54.8 184 43.36 164h23.45ZM94.8 164h66.4l19.2 32h-104.8ZM109.2 140 128 108.66 146.8 140ZM189.2 164h23.45l-11.45 20ZM128 62 117.19 44h21.62ZM95.89 55.14 114 85.33 81.21 140h-37.09Z"),
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
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
