package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileCsv: ImageVector
    get() {
        if (_fileCsv != null) return _fileCsv!!
        _fileCsv = phosphorBoldIcon(
            name = "FileCsv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 180c0 8.67 5.49 16 12 16 2.81-.092 5.459-1.332 7.33-3.43 4.584-4.788 12.182-4.954 16.97-.37 4.788 4.584 4.954 12.182 .37 16.97C78.289 216.023 69.364 219.941 60 220 40.15 220 24 202 24 180c0-22 16.15-40 36-40 9.364 .059 18.289 3.977 24.67 10.83 4.584 4.788 4.418 12.386-.37 16.97-4.788 4.584-12.386 4.418-16.97-.37C65.459 165.332 62.81 164.092 60 164c-6.51 0-12 7.31-12 16ZM145.51 174.29c-5.13-3.45-11.33-5.24-16.8-6.82-2.68-.725-5.32-1.589-7.91-2.59 2.45-1.18 9.71-1.3 16.07 .33 6.409 1.693 12.977-2.131 14.67-8.54C153.233 150.261 149.409 143.693 143 142c-3.938-.97-7.953-1.593-12-1.86-9.93-.66-18 1.08-24.1 5.17-6.021 4.042-9.937 10.548-10.69 17.76-1.1 8.74 2.48 16.27 10.11 21.19 4.78 3.09 10.36 4.7 15.75 6.26 3 .89 7.94 2.3 9.88 3.53-.028 .248-.103 .489-.22 .71-1.36 1.55-9.57 1.79-16.39-.06-6.316-1.602-12.757 2.129-14.509 8.406-1.752 6.276 1.826 12.804 8.059 14.704 5.284 1.422 10.728 2.158 16.2 2.19 6.47 0 13.74-1.17 19.74-5.15 6.151-4.067 10.166-10.668 10.95-18 1.22-9.32-2.46-17.32-10.27-22.58ZM216 140.68c-6.246-2.2-13.093 1.076-15.3 7.32L192 172.3 183.3 148c-1.28-4.231-4.782-7.415-9.115-8.288-4.333-.873-8.795 .706-11.614 4.111-2.819 3.405-3.537 8.083-1.871 12.177l20 56c1.706 4.775 6.23 7.961 11.3 7.961 5.07 0 9.594-3.187 11.3-7.961l20-56c2.215-6.246-1.054-13.105-7.3-15.32ZM36 108v-68C36 28.954 44.954 20 56 20h96c3.184-.003 6.238 1.26 8.49 3.51l56 56c2.25 2.252 3.512 5.306 3.51 8.49v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-48c-6.627 0-12-5.373-12-12v-48h-76v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM160 80h23L160 57Z"),
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
        return _fileCsv!!
    }

private var _fileCsv: ImageVector? = null
