package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileSvg: ImageVector
    get() {
        if (_fileSvg != null) return _fileSvg!!
        _fileSvg = phosphorBoldIcon(
            name = "FileSvg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 120c6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20c-0-3.18-1.263-6.23-3.51-8.48l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12ZM183 80h-23v-23ZM87.78 196.8c-.78 7.331-4.792 13.932-10.94 18-6 4-13.27 5.15-19.74 5.15-5.483-.036-10.938-.778-16.23-2.21-4.201-1.091-7.485-4.365-8.589-8.562-1.104-4.197 .145-8.663 3.265-11.68 3.12-3.016 7.626-4.113 11.784-2.868 6.82 1.85 15 1.61 16.39 .06 .105-.225 .176-.464 .21-.71-1.94-1.23-6.82-2.64-9.88-3.53-5.39-1.56-11-3.17-15.75-6.26C30.68 179.27 27.09 171.74 28.2 163c.75-7.211 4.662-13.717 10.68-17.76 6.07-4.09 14.17-5.82 24.1-5.17 4.056 .288 8.078 .934 12.02 1.93 6.334 1.748 10.084 8.264 8.414 14.618-1.67 6.354-8.14 10.184-14.514 8.592-6.35-1.63-13.61-1.51-16.07-.33 2.593 1.001 5.237 1.865 7.92 2.59 5.47 1.58 11.67 3.37 16.8 6.82 7.78 5.24 11.45 13.24 10.23 22.51ZM155.3 156l-20 56c-1.706 4.775-6.23 7.961-11.3 7.961-5.07 0-9.594-3.187-11.3-7.961l-20-56c-1.667-4.094-.948-8.772 1.871-12.177 2.819-3.405 7.281-4.984 11.614-4.111 4.333 .873 7.835 4.058 9.115 8.288L124 172.3 132.7 148c1.28-4.231 4.782-7.415 9.115-8.288 4.333-.873 8.795 .706 11.614 4.111 2.819 3.405 3.537 8.083 1.871 12.177ZM224 188v12.87c.001 3.092-1.192 6.066-3.33 8.3C214.289 216.023 205.364 219.941 196 220c-19.85 0-36-17.94-36-40 0-22.06 16.15-40 36-40 6.676 .019 13.193 2.04 18.71 5.8 3.661 2.352 5.762 6.502 5.49 10.845-.272 4.343-2.873 8.199-6.799 10.076-3.926 1.878-8.56 1.483-12.112-1.031C199.737 164.606 197.893 164.017 196 164c-6.5 0-12 7.33-12 16 0 8.67 5.5 16 12 16 .916-.002 1.827-.143 2.7-.42-2.926-3.591-3.524-8.545-1.537-12.728 1.987-4.184 6.205-6.85 10.837-6.852h4c6.627 0 12 5.373 12 12Z"),
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
        return _fileSvg!!
    }

private var _fileSvg: ImageVector? = null
