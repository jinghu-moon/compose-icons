package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorBoldIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.51 197.94c11.42-14.798 9.615-35.873-4.154-48.514-13.769-12.641-34.922-12.641-48.691 0-13.769 12.641-15.574 33.716-4.154 48.514-7.368 5.846-12.656 13.912-15.08 23-1.696 6.403 2.118 12.97 8.52 14.67 .995 .263 2.021 .394 3.05 .39 5.438-.004 10.194-3.664 11.59-8.92C174 218.2 182.35 212 192 212c9.65 0 18 6.2 20.4 15.08 1.788 6.302 8.299 10.006 14.63 8.321 6.33-1.684 10.14-8.134 8.56-14.491-2.426-9.079-7.714-17.134-15.08-22.97ZM192 164c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM236 88v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-16h-81.33c-4.326-.007-8.535-1.41-12-4L92 68h-48v128h68c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-72C28.954 220 20 211.046 20 200v-136C20 52.954 28.954 44 40 44h53.33c4.326 .009 8.534 1.411 12 4L132 68h84c11.046 0 20 8.954 20 20Z"),
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
