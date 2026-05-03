package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = tablerFilledIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 16.000 C 20.552 16.000 21.000 16.448 21.000 17.000 L 21.000 19.000 C 21.000 20.657 19.657 22.000 18.000 22.000 L 6.000 22.000 C 4.343 22.000 3.000 20.657 3.000 19.000 L 3.000 17.000 C 3.000 16.448 3.448 16.000 4.000 16.000 C 4.552 16.000 5.000 16.448 5.000 17.000 L 5.000 19.000 C 5.000 19.552 5.448 20.000 6.000 20.000 L 18.000 20.000 C 18.552 20.000 19.000 19.552 19.000 19.000 L 19.000 17.000 C 19.000 16.448 19.448 16.000 20.000 16.000M 12.000 3.000 C 12.552 3.000 13.000 3.448 13.000 4.000 L 13.000 13.585 L 16.293 10.293 C 16.685 9.914 17.309 9.919 17.695 10.305 C 18.081 10.691 18.086 11.315 17.707 11.707 L 12.707 16.707 C 12.679 16.735 12.649 16.762 12.617 16.787 L 12.707 16.707 C 12.528 16.886 12.287 16.991 12.033 16.999 L 12.000 17.000 L 11.968 17.000 L 11.914 16.996 L 12.000 17.000 C 11.776 17.000 11.559 16.925 11.383 16.787 C 11.351 16.762 11.321 16.735 11.293 16.707 L 6.293 11.707 C 5.914 11.315 5.919 10.691 6.305 10.305 C 6.691 9.919 7.315 9.914 7.707 10.293 L 11.000 13.585 L 11.000 4.000 C 11.000 3.448 11.448 3.000 12.000 3.000"),
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
        return _download!!
    }

private var _download: ImageVector? = null
