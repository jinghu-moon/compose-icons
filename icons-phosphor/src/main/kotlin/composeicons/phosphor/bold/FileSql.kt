package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileSql: ImageVector
    get() {
        if (_fileSql != null) return _fileSql!!
        _fileSql = phosphorBoldIcon(
            name = "FileSql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 120c6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20c-0-3.18-1.263-6.23-3.51-8.48l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12ZM183 80h-23v-23ZM236 208c0 6.627-5.373 12-12 12h-28c-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v44h16c6.627 0 12 5.373 12 12ZM91.78 196.8c-.791 7.343-4.827 13.946-11 18-6 4-13.26 5.15-19.73 5.15-5.483-.036-10.938-.778-16.23-2.21-4.201-1.091-7.485-4.365-8.589-8.562-1.104-4.197 .145-8.663 3.265-11.68 3.12-3.016 7.626-4.113 11.784-2.868 6.81 1.85 15 1.61 16.39 .06 .105-.225 .176-.464 .21-.71C65.94 192.75 61.06 191.34 58 190.45c-5.39-1.56-11-3.17-15.75-6.26C34.63 179.27 31.04 171.74 32.15 163c.75-7.211 4.662-13.717 10.68-17.76 6.07-4.09 14.17-5.83 24.1-5.17 4.073 .285 8.112 .931 12.07 1.93 6.334 1.748 10.084 8.264 8.414 14.618-1.67 6.354-8.14 10.184-14.514 8.592-6.35-1.63-13.61-1.5-16.07-.33 2.593 1.001 5.237 1.865 7.92 2.59 5.47 1.58 11.67 3.37 16.8 6.82 7.78 5.24 11.45 13.24 10.23 22.51ZM167.78 198.8c2.803-5.869 4.246-12.296 4.22-18.8 0-22-16.15-40-36-40-19.85 0-36 18-36 40 0 22 16.15 40 36 40 5.314-.002 10.547-1.296 15.25-3.77l.27 .26c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM124 180c0-8.67 5.5-16 12-16 6.5 0 12 7.33 12 16 0 .23 0 .46 0 .69-4.22-1.472-8.908-.477-12.166 2.581-3.258 3.059-4.547 7.675-3.344 11.979C127.62 193.16 124 187 124 180Z"),
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
        return _fileSql!!
    }

private var _fileSql: ImageVector? = null
