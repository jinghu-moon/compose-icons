package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileSettingsLine: ImageVector
    get() {
        if (_fileSettingsLine != null) return _fileSettingsLine!!
        _fileSettingsLine = remixIcon(
            name = "FileSettingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.595 12.811 C 8.533 12.551 8.500 12.279 8.500 12.000 C 8.500 11.721 8.533 11.449 8.595 11.189 L 7.603 10.616 L 8.603 8.884 L 9.595 9.457 C 9.988 9.085 10.468 8.803 11.000 8.645 L 11.000 7.500 L 13.000 7.500 L 13.000 8.645 C 13.532 8.803 14.012 9.085 14.405 9.457 L 15.397 8.884 L 16.397 10.616 L 15.405 11.189 C 15.467 11.449 15.500 11.721 15.500 12.000 C 15.500 12.279 15.467 12.551 15.406 12.811 L 16.397 13.384 L 15.397 15.116 L 14.405 14.543 C 14.012 14.915 13.533 15.197 13.000 15.355 L 13.000 16.500 L 11.000 16.500 L 11.000 15.355 C 10.468 15.197 9.988 14.915 9.595 14.543 L 8.603 15.116 L 7.603 13.384 L 8.595 12.811 ZM 12.000 13.500 C 12.828 13.500 13.500 12.828 13.500 12.000 C 13.500 11.172 12.828 10.500 12.000 10.500 C 11.172 10.500 10.500 11.172 10.500 12.000 C 10.500 12.828 11.172 13.500 12.000 13.500 ZM 15.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 8.000 L 15.000 8.000 L 15.000 4.000 ZM 3.000 2.992 C 3.000 2.444 3.447 2.000 3.999 2.000 L 16.000 2.000 L 21.000 7.000 L 21.000 20.993 C 21.000 21.549 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 Z"),
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
        return _fileSettingsLine!!
    }

private var _fileSettingsLine: ImageVector? = null
