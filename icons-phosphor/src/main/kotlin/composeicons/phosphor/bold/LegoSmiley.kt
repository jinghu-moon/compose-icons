package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorBoldIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 112c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM156 96c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM149.6 141.85c-13.232 8.202-29.968 8.202-43.2 0-3.628-2.344-8.235-2.557-12.063-.559-3.829 1.998-6.289 5.899-6.441 10.215-.152 4.316 2.026 8.381 5.704 10.644 21.053 13.132 47.747 13.132 68.8 0 3.678-2.263 5.857-6.328 5.704-10.644-.152-4.316-2.612-8.217-6.441-10.215-3.829-1.998-8.436-1.784-12.063 .559ZM220 84v88c-.021 15.249-9.63 28.837-24 33.94v18.06c0 11.046-8.954 20-20 20h-96C68.954 244 60 235.046 60 224v-18.06C45.63 200.837 36.021 187.249 36 172v-88C36 64.118 52.118 48 72 48h12v-16C84 20.954 92.954 12 104 12h48c11.046 0 20 8.954 20 20v16h12c19.882 0 36 16.118 36 36ZM108 48h40v-12h-40ZM172 220v-12h-88v12ZM196 84c0-6.627-5.373-12-12-12h-112C65.373 72 60 77.373 60 84v88c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12Z"),
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
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
