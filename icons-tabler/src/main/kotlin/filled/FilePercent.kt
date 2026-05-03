package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FilePercent: ImageVector
    get() {
        if (_filePercent != null) return _filePercent!!
        _filePercent = tablerFilledIcon(
            name = "FilePercent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 14.010 16.000 L 14.000 16.000 C 13.471 16.001 13.034 16.413 13.003 16.941 C 12.972 17.470 13.358 17.931 13.883 17.993 L 14.010 18.000 C 14.562 18.000 15.010 17.552 15.010 17.000 C 15.010 16.448 14.562 16.000 14.010 16.000M 14.707 12.293 C 14.316 11.903 13.684 11.903 13.293 12.293 L 9.293 16.293 C 8.914 16.685 8.919 17.309 9.305 17.695 C 9.691 18.081 10.315 18.086 10.707 17.707 L 14.707 13.707 C 15.097 13.316 15.097 12.684 14.707 12.293M 10.010 12.000 L 10.000 12.000 C 9.471 12.001 9.034 12.413 9.003 12.941 C 8.972 13.470 9.358 13.931 9.883 13.993 L 10.010 14.000 C 10.562 14.000 11.010 13.552 11.010 13.000 C 11.010 12.448 10.562 12.000 10.010 12.000M 14.999 2.999 L 19.000 7.000 L 15.000 7.000 Z"),
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
        return _filePercent!!
    }

private var _filePercent: ImageVector? = null
