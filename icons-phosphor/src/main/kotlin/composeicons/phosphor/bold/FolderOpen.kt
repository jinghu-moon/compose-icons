package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorBoldIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.23 112.31C244.471 107.092 238.431 103.999 232 104h-12v-16C220 76.954 211.046 68 200 68h-68L105.34 48c-3.466-2.589-7.674-3.991-12-4h-53.34C28.954 44 20 52.954 20 64v144c0 6.627 5.373 12 12 12h179.1c5.091 .007 9.633-3.2 11.33-8l28.49-81.47 .06-.17c2.043-6.108 1.02-12.827-2.75-18.05ZM92 68l28.8 21.6C122.877 91.158 125.404 92 128 92h68v12h-126.23c-8.571 .001-16.189 5.463-18.94 13.58L44 137.15v-69.15ZM202.59 196h-153.7L72.61 128h153.76Z"),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
