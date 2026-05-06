package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileJsx: ImageVector
    get() {
        if (_fileJsx != null) return _fileJsx!!
        _fileJsx = phosphorBoldIcon(
            name = "FileJsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M151.78 196.8c-.784 7.332-4.799 13.933-10.95 18-6 4-13.27 5.15-19.73 5.15-5.483-.036-10.938-.778-16.23-2.21-4.201-1.091-7.485-4.365-8.589-8.562-1.104-4.197 .145-8.663 3.265-11.68 3.12-3.016 7.626-4.113 11.784-2.868 6.81 1.85 15 1.61 16.39 .06 .105-.225 .176-.464 .21-.71-1.94-1.23-6.83-2.64-9.88-3.53-5.39-1.56-11-3.17-15.75-6.26C94.67 179.27 91.09 171.74 92.19 163c.753-7.212 4.669-13.718 10.69-17.76 6.06-4.09 14.17-5.83 24.1-5.17 4.056 .288 8.078 .934 12.02 1.93 6.334 1.748 10.084 8.264 8.414 14.618-1.67 6.354-8.14 10.184-14.514 8.592-6.36-1.63-13.62-1.51-16.07-.33 2.59 1.001 5.23 1.865 7.91 2.59 5.47 1.58 11.68 3.37 16.8 6.82 7.79 5.24 11.46 13.24 10.24 22.51ZM68 140c-6.627 0-12 5.373-12 12v38c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30v-38c0-6.627-5.373-12-12-12ZM206.75 180l15-21c3.866-5.393 2.628-12.899-2.765-16.765-5.393-3.866-12.899-2.628-16.765 2.765L192 159.34 181.76 145c-3.866-5.393-11.372-6.631-16.765-2.765-5.393 3.866-6.631 11.372-2.765 16.765l15 21-15 21c-3.866 5.393-2.628 12.899 2.765 16.765 5.393 3.866 12.899 2.628 16.765-2.765L192 200.62 202.23 215c3.866 5.393 11.372 6.631 16.765 2.765 5.393-3.866 6.631-11.372 2.765-16.765ZM36 108v-68C36 28.954 44.954 20 56 20h96c3.184-.003 6.238 1.26 8.49 3.51l56 56c2.25 2.252 3.512 5.306 3.51 8.49v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-48c-6.627 0-12-5.373-12-12v-48h-76v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM160 80h23L160 57Z"),
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
        return _fileJsx!!
    }

private var _fileJsx: ImageVector? = null
