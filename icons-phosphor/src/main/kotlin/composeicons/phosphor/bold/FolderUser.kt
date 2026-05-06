package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderUser: ImageVector
    get() {
        if (_folderUser != null) return _folderUser!!
        _folderUser = phosphorBoldIcon(
            name = "FolderUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.51 197.94c11.42-14.798 9.615-35.873-4.154-48.514-13.769-12.641-34.922-12.641-48.691 0-13.769 12.641-15.574 33.716-4.154 48.514-7.368 5.846-12.656 13.912-15.08 23-1.696 6.403 2.118 12.97 8.52 14.67 .995 .263 2.021 .394 3.05 .39 5.438-.004 10.194-3.664 11.59-8.92C174 218.2 182.35 212 192 212c9.65 0 18 6.2 20.4 15.08 1.788 6.302 8.299 10.006 14.63 8.321 6.33-1.684 10.14-8.134 8.56-14.491-2.426-9.079-7.714-17.134-15.08-22.97ZM192 164c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM216 68h-82.61l-26-29.29C103.587 34.433 98.133 31.99 92.41 32h-52.41C28.954 32 20 40.954 20 52v148.61c.011 10.7 8.68 19.373 19.38 19.39h73.18c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-68.56v-104h168v16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20C236 76.954 227.046 68 216 68ZM44 68v-12h46.61l10.67 12Z"),
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
