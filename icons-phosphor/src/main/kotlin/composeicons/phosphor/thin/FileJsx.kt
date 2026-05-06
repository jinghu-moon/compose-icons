package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileJsx: ImageVector
    get() {
        if (_fileJsx != null) return _fileJsx!!
        _fileJsx = phosphorThinIcon(
            name = "FileJsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M143.84 195.8c-.506 5.037-3.229 9.586-7.43 12.41-4.39 2.91-10 3.77-15.22 3.77-4.789-.034-9.556-.662-14.19-1.87-1.424-.341-2.548-1.434-2.929-2.847-.382-1.414 .04-2.923 1.099-3.935 1.059-1.012 2.586-1.364 3.981-.918 4.22 1.17 16.56 3.29 22.83-.88 2.268-1.533 3.709-4.02 3.91-6.75 .83-6.45-4.38-8.69-15.64-11.94-9.68-2.8-21.72-6.28-20.14-18.77 .49-4.914 3.135-9.356 7.22-12.13 4.56-3.07 11-4.36 19.1-3.82 3.533 .233 7.04 .772 10.48 1.61 2.137 .566 3.411 2.758 2.845 4.895-.566 2.137-2.758 3.411-4.895 2.845-4.29-1.13-16.81-3.12-23.06 1.11-2.187 1.467-3.571 3.863-3.75 6.49-.66 5.17 3.89 7 14.42 10.08 9.79 2.85 23.17 6.69 21.37 20.65ZM72 148c-2.209 0-4 1.791-4 4v38c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22v-38c0-2.209-1.791-4-4-4ZM210.32 148.75c-1.795-1.286-4.293-.874-5.58 .92L188 173.12 171.25 149.67c-1.287-1.798-3.787-2.212-5.585-.925-1.798 1.287-2.212 3.787-.925 5.585L183.08 180l-18.34 25.67c-.617 .863-.865 1.936-.691 2.983 .174 1.046 .757 1.981 1.621 2.597 1.795 1.286 4.293 .874 5.58-.92L188 186.88l16.74 23.45c.753 1.051 1.967 1.673 3.26 1.67 .834 .004 1.646-.259 2.32-.75 .863-.617 1.446-1.551 1.621-2.597 .174-1.046-.074-2.119-.691-2.983L192.92 180l18.33-25.67c.617-.863 .865-1.936 .691-2.983-.174-1.046-.757-1.981-1.621-2.597ZM212 88v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-52c-2.209 0-4-1.791-4-4v-52h-92c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-72C44 33.373 49.373 28 56 28h96c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83ZM198.34 84 156 41.65v42.35Z"),
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
