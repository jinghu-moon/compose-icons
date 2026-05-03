package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileVector: ImageVector
    get() {
        if (_fileVector != null) return _fileVector!!
        _fileVector = tablerFilledIcon(
            name = "FileVector",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 14.500 11.000 C 13.506 11.000 12.606 11.589 12.208 12.500 L 12.000 12.500 C 10.388 12.500 8.985 13.601 8.601 15.166 C 7.691 15.516 7.069 16.363 7.005 17.336 L 7.000 17.500 C 7.000 18.724 7.886 19.768 9.094 19.967 C 10.301 20.166 11.475 19.461 11.868 18.302 C 12.260 17.143 11.756 15.870 10.676 15.294 C 10.937 14.805 11.446 14.500 12.000 14.500 L 12.208 14.500 C 12.707 15.644 13.974 16.245 15.176 15.907 C 16.378 15.568 17.146 14.395 16.976 13.159 C 16.805 11.922 15.749 11.000 14.500 11.000M 9.500 17.000 C 9.776 17.000 10.000 17.224 10.000 17.500 C 10.000 17.776 9.776 18.000 9.500 18.000 C 9.224 18.000 9.000 17.776 9.000 17.500 C 9.000 17.224 9.224 17.000 9.500 17.000M 14.500 13.000 C 14.776 13.000 15.000 13.224 15.000 13.500 C 15.000 13.776 14.776 14.000 14.500 14.000 C 14.224 14.000 14.000 13.776 14.000 13.500 C 14.000 13.224 14.224 13.000 14.500 13.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 19.000 7.000 L 15.000 7.000 L 14.999 2.999 Z"),
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
        return _fileVector!!
    }

private var _fileVector: ImageVector? = null
