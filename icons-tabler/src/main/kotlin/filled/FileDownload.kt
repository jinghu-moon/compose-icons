package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileDownload: ImageVector
    get() {
        if (_fileDownload != null) return _fileDownload!!
        _fileDownload = tablerFilledIcon(
            name = "FileDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 12.000 10.000 C 11.448 10.000 11.000 10.448 11.000 11.000 L 11.000 14.585 L 10.207 13.793 C 9.851 13.437 9.285 13.401 8.887 13.710 L 8.793 13.793 C 8.403 14.184 8.403 14.816 8.793 15.207 L 11.293 17.707 L 11.337 17.749 L 11.405 17.804 L 11.515 17.875 L 11.629 17.929 L 11.734 17.964 L 11.884 17.994 L 12.000 18.000 L 12.117 17.993 L 12.234 17.973 L 12.342 17.940 L 12.423 17.906 L 12.521 17.854 L 12.613 17.790 L 12.707 17.707 L 15.207 15.207 C 15.597 14.816 15.597 14.184 15.207 13.793 L 15.113 13.710 C 14.715 13.401 14.149 13.437 13.793 13.793 L 13.000 14.584 L 13.000 11.000 C 13.000 10.493 12.620 10.066 12.117 10.007 ZM 14.999 2.999 L 19.000 7.000 L 15.000 7.000 Z"),
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
        return _fileDownload!!
    }

private var _fileDownload: ImageVector? = null
