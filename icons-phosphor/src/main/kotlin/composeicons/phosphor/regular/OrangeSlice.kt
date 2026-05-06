package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorRegularIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 80h-240C3.582 80 0 83.582 0 88c0 70.692 57.308 128 128 128 70.692 0 128-57.308 128-128 0-4.418-3.582-8-8-8ZM77.4 149.91 120 107.31v60.29C104.365 166.038 89.542 159.882 77.4 149.91ZM66.09 138.6C56.118 126.458 49.962 111.635 48.4 96h60.29ZM136 107.31l42.6 42.6c-12.143 9.972-26.965 16.128-42.6 17.69ZM189.91 138.6 147.31 96h60.29c-1.562 15.635-7.718 30.458-17.69 42.6ZM128 200C69.275 199.93 20.548 154.57 16.28 96h16.06c4.195 49.713 45.77 87.928 95.66 87.928 49.89 0 91.465-38.214 95.66-87.928h16.06C235.452 154.57 186.725 199.93 128 200Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
