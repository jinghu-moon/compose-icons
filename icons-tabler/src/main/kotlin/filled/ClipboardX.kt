package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardX: ImageVector
    get() {
        if (_clipboardX != null) return _clipboardX!!
        _clipboardX = tablerFilledIcon(
            name = "ClipboardX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.997 4.170 C 19.197 4.593 20.000 5.727 20.000 7.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 7.000 C 4.000 5.727 4.803 4.593 6.003 4.170 C 6.094 6.311 7.857 8.000 10.000 8.000 L 14.000 8.000 C 16.053 8.000 17.773 6.446 17.980 4.403 ZM 10.707 11.293 C 10.316 10.903 9.684 10.903 9.293 11.293 L 9.210 11.387 C 8.901 11.785 8.937 12.351 9.293 12.707 L 10.585 14.000 L 9.293 15.293 C 8.903 15.684 8.903 16.316 9.293 16.707 L 9.387 16.790 C 9.785 17.099 10.351 17.063 10.707 16.707 L 12.000 15.414 L 13.293 16.707 C 13.684 17.097 14.316 17.097 14.707 16.707 L 14.790 16.613 C 15.099 16.215 15.063 15.649 14.707 15.293 L 13.414 14.000 L 14.707 12.707 C 15.097 12.316 15.097 11.684 14.707 11.293 L 14.613 11.210 C 14.215 10.901 13.649 10.937 13.293 11.293 L 12.000 12.585 ZM 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 C 16.000 5.105 15.105 6.000 14.000 6.000 L 10.000 6.000 C 8.895 6.000 8.000 5.105 8.000 4.000 C 8.000 2.895 8.895 2.000 10.000 2.000 Z"),
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
        return _clipboardX!!
    }

private var _clipboardX: ImageVector? = null
