package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Tags: ImageVector
    get() {
        if (_tags != null) return _tags!!
        _tags = tablerFilledIcon(
            name = "Tags",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.172 5.000 C 9.968 5.000 10.731 5.316 11.293 5.879 L 17.003 11.589 C 18.334 12.921 18.334 15.079 17.003 16.411 L 13.411 20.003 C 12.079 21.334 9.921 21.334 8.589 20.003 L 2.879 14.293 C 2.316 13.731 2.000 12.968 2.000 12.172 L 2.000 8.000 C 2.000 6.343 3.343 5.000 5.000 5.000 ZM 7.000 9.000 L 6.990 9.000 C 6.438 9.003 5.992 9.453 5.995 10.005 C 5.998 10.557 6.448 11.003 7.000 11.000 C 7.552 11.000 8.000 10.552 8.000 10.000 C 8.000 9.448 7.552 9.000 7.000 9.000"),
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
                pathData = parseSvgPathData("M 14.293 5.293 C 14.684 4.903 15.316 4.903 15.707 5.293 L 20.300 9.885 C 22.572 12.158 22.572 15.842 20.300 18.115 L 18.708 19.707 C 18.316 20.086 17.692 20.081 17.306 19.695 C 16.920 19.309 16.915 18.685 17.294 18.293 L 18.886 16.701 C 20.378 15.209 20.378 12.791 18.886 11.299 L 14.294 6.707 C 13.904 6.317 13.904 5.683 14.294 5.293"),
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
        return _tags!!
    }

private var _tags: ImageVector? = null
