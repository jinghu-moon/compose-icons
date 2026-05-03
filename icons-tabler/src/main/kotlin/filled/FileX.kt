package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = tablerFilledIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 L 12.000 2.000 ZM 10.511 11.140 C 10.098 10.894 9.568 10.977 9.250 11.337 C 8.932 11.698 8.915 12.233 9.210 12.613 L 9.293 12.707 L 10.585 14.000 L 9.293 15.293 L 9.210 15.387 C 8.901 15.785 8.937 16.351 9.293 16.707 C 9.649 17.063 10.215 17.099 10.613 16.790 L 10.707 16.707 L 12.000 15.415 L 13.293 16.707 L 13.387 16.790 C 13.785 17.099 14.351 17.063 14.707 16.707 C 15.063 16.351 15.099 15.785 14.790 15.387 L 14.707 15.293 L 13.415 14.000 L 14.707 12.707 L 14.790 12.613 C 15.099 12.215 15.063 11.649 14.707 11.293 C 14.351 10.937 13.785 10.901 13.387 11.210 L 13.293 11.293 L 12.000 12.585 L 10.707 11.293 L 10.613 11.210 L 10.511 11.140 Z"),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null
