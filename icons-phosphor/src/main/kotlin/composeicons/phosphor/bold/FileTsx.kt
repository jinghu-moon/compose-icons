package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileTsx: ImageVector
    get() {
        if (_fileTsx != null) return _fileTsx!!
        _fileTsx = phosphorBoldIcon(
            name = "FileTsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.76 201c3.866 5.393 2.628 12.899-2.765 16.765-5.393 3.866-12.899 2.628-16.765-2.765L192 200.62 181.76 215c-3.866 5.393-11.372 6.631-16.765 2.765-5.393-3.866-6.631-11.372-2.765-16.765l15-21-15-21c-3.866-5.393-2.628-12.899 2.765-16.765 5.393-3.866 12.899-2.628 16.765 2.765L192 159.34 202.23 145c3.866-5.393 11.372-6.631 16.765-2.765 5.393 3.866 6.631 11.372 2.765 16.765l-15 21ZM141.51 174.27c-5.12-3.45-11.33-5.24-16.8-6.82-2.68-.725-5.32-1.589-7.91-2.59 2.45-1.18 9.71-1.3 16.07 .33 6.308 1.443 12.624-2.375 14.278-8.631C148.801 150.303 145.197 143.862 139 142c-3.938-.971-7.953-1.594-12-1.86-9.93-.66-18 1.08-24.1 5.17-6.021 4.042-9.937 10.548-10.69 17.76-1.1 8.74 2.48 16.27 10.11 21.19 4.78 3.09 10.36 4.7 15.75 6.26 3 .89 7.94 2.3 9.88 3.53-.034 .246-.105 .485-.21 .71-1.37 1.55-9.58 1.79-16.39-.06-4.157-1.245-8.663-.149-11.784 2.868-3.12 3.016-4.369 7.483-3.265 11.68 1.104 4.197 4.388 7.471 8.589 8.562 5.287 1.423 10.735 2.159 16.21 2.19 6.46 0 13.73-1.17 19.73-5.15 6.151-4.067 10.166-10.668 10.95-18 1.22-9.32-2.45-17.32-10.27-22.58ZM76 140h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8v44c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-44h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM36 108v-68C36 28.954 44.954 20 56 20h96c3.184-.003 6.238 1.26 8.49 3.51l56 56c2.25 2.252 3.512 5.306 3.51 8.49v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-48c-6.627 0-12-5.373-12-12v-48h-76v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM160 80h23L160 57Z"),
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
        return _fileTsx!!
    }

private var _fileTsx: ImageVector? = null
