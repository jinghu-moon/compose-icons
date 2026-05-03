package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderCloseFill: ImageVector
    get() {
        if (_folderCloseFill != null) return _folderCloseFill!!
        _folderCloseFill = remixIcon(
            name = "FolderCloseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 12.000 C 20.093 12.000 21.118 12.292 22.000 12.803 L 22.000 6.000 C 22.000 5.448 21.552 5.000 21.000 5.000 L 12.414 5.000 L 10.414 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 13.803 21.000 C 13.292 20.118 13.000 19.093 13.000 18.000 C 13.000 14.686 15.686 12.000 19.000 12.000 ZM 20.414 18.000 L 22.536 20.121 L 21.121 21.535 L 19.000 19.414 L 16.879 21.535 L 15.465 20.121 L 17.586 18.000 L 15.465 15.879 L 16.879 14.464 L 19.000 16.586 L 21.121 14.464 L 22.536 15.879 L 20.414 18.000 Z"),
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
        return _folderCloseFill!!
    }

private var _folderCloseFill: ImageVector? = null
