package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderSettingsLine: ImageVector
    get() {
        if (_folderSettingsLine != null) return _folderSettingsLine!!
        _folderSettingsLine = remixIcon(
            name = "FolderSettingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 ZM 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 7.000 L 11.586 7.000 L 9.586 5.000 L 4.000 5.000 ZM 8.591 13.809 C 8.529 13.549 8.497 13.277 8.497 12.998 C 8.497 12.719 8.529 12.447 8.591 12.187 L 7.600 11.615 L 8.599 9.883 L 9.591 10.456 C 9.984 10.084 10.463 9.803 10.995 9.644 L 10.995 8.500 L 12.994 8.500 L 12.994 9.644 C 13.526 9.803 14.006 10.084 14.399 10.456 L 15.390 9.883 L 16.390 11.615 L 15.399 12.187 C 15.460 12.447 15.493 12.719 15.493 12.998 C 15.493 13.277 15.460 13.549 15.399 13.809 L 16.390 14.381 L 15.391 16.112 L 14.399 15.540 C 14.006 15.911 13.527 16.193 12.995 16.351 L 12.995 17.496 L 10.995 17.496 L 10.995 16.351 C 10.463 16.193 9.984 15.911 9.591 15.540 L 8.600 16.112 L 7.600 14.381 L 8.591 13.809 ZM 11.995 14.497 C 12.823 14.497 13.494 13.826 13.494 12.998 C 13.494 12.170 12.823 11.498 11.995 11.498 C 11.167 11.498 10.496 12.170 10.496 12.998 C 10.496 13.826 11.167 14.497 11.995 14.497 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _folderSettingsLine!!
    }

private var _folderSettingsLine: ImageVector? = null
