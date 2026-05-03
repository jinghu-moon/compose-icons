package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderForbidFill: ImageVector
    get() {
        if (_folderForbidFill != null) return _folderForbidFill!!
        _folderForbidFill = remixIcon(
            name = "FolderForbidFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 11.255 C 20.866 10.464 19.487 10.000 18.000 10.000 C 14.134 10.000 11.000 13.134 11.000 17.000 C 11.000 18.487 11.464 19.866 12.255 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 11.255 ZM 18.000 22.000 C 15.239 22.000 13.000 19.761 13.000 17.000 C 13.000 14.239 15.239 12.000 18.000 12.000 C 20.761 12.000 23.000 14.239 23.000 17.000 C 23.000 19.761 20.761 22.000 18.000 22.000 ZM 16.707 19.708 C 17.098 19.895 17.537 20.000 18.000 20.000 C 19.657 20.000 21.000 18.657 21.000 17.000 C 21.000 16.537 20.895 16.098 20.708 15.707 L 16.707 19.708 ZM 15.292 18.293 L 19.293 14.292 C 18.902 14.105 18.463 14.000 18.000 14.000 C 16.343 14.000 15.000 15.343 15.000 17.000 C 15.000 17.463 15.105 17.902 15.292 18.293 Z"),
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
        return _folderForbidFill!!
    }

private var _folderForbidFill: ImageVector? = null
