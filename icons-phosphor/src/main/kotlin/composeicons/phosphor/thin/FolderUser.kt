package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderUser: ImageVector
    get() {
        if (_folderUser != null) return _folderUser!!
        _folderUser = phosphorThinIcon(
            name = "FolderUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207.5 199.3c10.282-6.834 14.874-19.596 11.304-31.414C215.234 156.067 204.346 147.982 192 147.982c-12.346 0-23.234 8.086-26.804 19.904-3.57 11.818 1.023 24.58 11.304 31.414-10.022 4.416-17.51 13.128-20.37 23.7-.565 2.134 .706 4.323 2.84 4.89 .325 .092 .662 .139 1 .14 1.823-.001 3.414-1.235 3.87-3 3.29-12.38 14.85-21 28.13-21 13.28 0 24.84 8.65 28.13 21 .336 1.415 1.413 2.536 2.813 2.929 1.4 .392 2.903-.006 3.925-1.041 1.022-1.035 1.402-2.542 .992-3.938-2.854-10.558-10.326-19.261-20.33-23.68ZM172 176c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM216 76h-86.34L101.17 47.51C98.92 45.263 95.87 44 92.69 44h-52.69C33.373 44 28 49.373 28 56v144.61c.006 6.284 5.096 11.379 11.38 11.39h81.18c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-81.18c-1.868-.006-3.38-1.522-3.38-3.39v-116.61h180c2.209 0 4 1.791 4 4v32c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-6.627-5.373-12-12-12ZM40 52h52.69c1.058 .002 2.072 .422 2.82 1.17L118.34 76h-82.34v-20c0-2.209 1.791-4 4-4Z"),
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
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
