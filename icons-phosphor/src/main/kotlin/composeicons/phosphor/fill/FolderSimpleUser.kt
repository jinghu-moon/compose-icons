package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorFillIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.73 221.94c.64 2.401 .128 4.964-1.387 6.934-1.514 1.971-3.858 3.126-6.343 3.126h-64c-2.471-.005-4.802-1.152-6.313-3.107-1.512-1.955-2.034-4.5-1.417-6.893 2.593-9.639 8.696-17.961 17.11-23.33-9.156-9.15-11.898-22.916-6.946-34.876 4.952-11.96 16.621-19.759 29.566-19.759 12.945 0 24.614 7.799 29.566 19.759 4.952 11.96 2.21 25.726-6.946 34.876 8.402 5.355 14.504 13.653 17.11 23.27ZM216 72h-85.33L102.93 51.2C100.156 49.131 96.791 48.009 93.33 48h-53.33C31.163 48 24 55.163 24 64v136c0 8.837 7.163 16 16 16h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-80v-136h53.33l27.74 20.8c2.774 2.069 6.139 3.191 9.6 3.2h85.33v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32c0-8.837-7.163-16-16-16Z"),
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
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
