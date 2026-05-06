package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorThinIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207.5 199.3c10.282-6.834 14.874-19.596 11.304-31.414C215.234 156.067 204.346 147.982 192 147.982c-12.346 0-23.234 8.086-26.804 19.904-3.57 11.818 1.023 24.58 11.304 31.414-10.022 4.416-17.51 13.128-20.37 23.7-.565 2.134 .706 4.323 2.84 4.89 .325 .092 .662 .139 1 .14 1.823-.001 3.414-1.235 3.87-3 3.29-12.38 14.85-21 28.13-21 13.28 0 24.84 8.65 28.13 21 .336 1.415 1.413 2.536 2.813 2.929 1.4 .392 2.903-.006 3.925-1.041 1.022-1.035 1.402-2.542 .992-3.938-2.854-10.558-10.326-19.261-20.33-23.68ZM172 176c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM228 88v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32c0-2.209-1.791-4-4-4h-85.33c-2.596-.004-5.121-.845-7.2-2.4L95.73 60.8C95.038 60.281 94.195 60 93.33 60h-53.33c-2.209 0-4 1.791-4 4v136c0 2.209 1.791 4 4 4h80c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-80c-6.627 0-12-5.373-12-12v-136C28 57.373 33.373 52 40 52h53.33c2.596 .004 5.121 .845 7.2 2.4l27.74 20.8c.692 .519 1.535 .8 2.4 .8h85.33c6.627 0 12 5.373 12 12Z"),
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
