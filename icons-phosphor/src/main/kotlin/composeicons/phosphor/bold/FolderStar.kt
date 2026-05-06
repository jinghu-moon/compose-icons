package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorBoldIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112.56 196h-68.56v-104h168v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24C236 76.954 227.046 68 216 68h-82.61l-26-29.29h0C103.587 34.433 98.133 31.99 92.41 32h-52.41C28.954 32 20 40.954 20 52v148.62c.017 10.696 8.684 19.363 19.38 19.38h73.18c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM44 56h46.61l10.67 12h-57.28ZM243.44 158c-1.478-4.665-5.641-7.965-10.52-8.34l-27.42-2.12L195 123.25c-1.908-4.375-6.227-7.204-11-7.204-4.773 0-9.092 2.829-11 7.204l-10.5 24.28-27.42 2.12c-4.88 .375-9.044 3.676-10.522 8.342-1.478 4.666 .027 9.762 3.802 12.878l20.58 17-6.25 25.26c-1.156 4.686 .608 9.609 4.478 12.494 3.869 2.885 9.091 3.171 13.252 .726L184 212.46l23.58 13.88c4.161 2.445 9.383 2.159 13.252-.726 3.869-2.885 5.634-7.808 4.478-12.494l-6.25-25.26 20.58-17c3.767-3.113 5.27-8.199 3.8-12.86ZM198 174.16c-3.553 2.939-5.108 7.654-4 12.13l1.21 4.89-5.07-3c-3.762-2.201-8.418-2.201-12.18 0l-5.07 3 1.21-4.89c1.108-4.476-.447-9.191-4-12.13l-3.48-2.87 5-.39c4.444-.341 8.334-3.117 10.1-7.21l2.33-5.4 2.33 5.4c1.765 4.09 5.649 6.865 10.09 7.21l5 .39Z"),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
