package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileUpload: ImageVector
    get() {
        if (_fileUpload != null) return _fileUpload!!
        _fileUpload = tablerFilledIcon(
            name = "FileUpload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 12.000 11.000 L 11.910 11.004 L 11.852 11.011 L 11.734 11.036 L 11.629 11.071 L 11.516 11.125 L 11.405 11.196 C 11.365 11.226 11.328 11.258 11.293 11.293 L 8.793 13.793 C 8.403 14.184 8.403 14.816 8.793 15.207 L 8.887 15.290 C 9.285 15.599 9.851 15.563 10.207 15.207 L 11.000 14.414 L 11.000 18.000 C 11.000 18.552 11.448 19.000 12.000 19.000 C 12.552 19.000 13.000 18.552 13.000 18.000 L 13.000 14.415 L 13.793 15.207 C 14.185 15.586 14.809 15.581 15.195 15.195 C 15.581 14.809 15.586 14.185 15.207 13.793 L 12.707 11.293 L 12.625 11.220 L 12.521 11.146 L 12.423 11.094 L 12.313 11.050 L 12.201 11.020 L 12.075 11.003 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 19.000 7.000 L 15.000 7.000 L 14.999 2.999 Z"),
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
        return _fileUpload!!
    }

private var _fileUpload: ImageVector? = null
