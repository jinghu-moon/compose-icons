package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTabler: ImageVector
    get() {
        if (_brandTabler != null) return _brandTabler!!
        _brandTabler = tablerFilledIcon(
            name = "BrandTabler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 2.000 C 19.761 2.000 22.000 4.239 22.000 7.000 L 22.000 17.000 C 22.000 19.761 19.761 22.000 17.000 22.000 L 7.000 22.000 C 4.239 22.000 2.000 19.761 2.000 17.000 L 2.000 7.000 C 2.000 4.239 4.239 2.000 7.000 2.000 ZM 16.000 14.000 L 13.000 14.000 C 12.448 14.000 12.000 14.448 12.000 15.000 C 12.000 15.552 12.448 16.000 13.000 16.000 L 16.000 16.000 C 16.552 16.000 17.000 15.552 17.000 15.000 C 17.000 14.448 16.552 14.000 16.000 14.000M 8.707 8.293 C 8.316 7.903 7.683 7.903 7.293 8.293 L 7.210 8.387 C 6.901 8.785 6.937 9.351 7.293 9.707 L 9.585 12.000 L 7.293 14.293 C 6.914 14.685 6.919 15.309 7.305 15.695 C 7.691 16.081 8.315 16.086 8.707 15.707 L 11.707 12.707 C 12.097 12.316 12.097 11.684 11.707 11.293 Z"),
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
        return _brandTabler!!
    }

private var _brandTabler: ImageVector? = null
