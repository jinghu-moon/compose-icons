package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRedhat: ImageVector
    get() {
        if (_brandRedhat != null) return _brandRedhat!!
        _brandRedhat = tablerOutlineIcon(
            name = "BrandRedhat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 10.500 L 7.436 6.500 C 7.754 5.624 8.164 5.198 8.795 5.198 C 9.014 5.198 9.849 5.563 10.675 5.781 C 11.500 6.000 11.408 5.452 11.583 5.294 C 11.759 5.136 11.938 5.000 12.193 5.000 C 12.435 5.000 12.746 5.048 13.885 5.448 C 14.644 5.715 15.378 6.022 16.089 6.370 C 17.264 6.952 17.515 7.283 17.684 7.877 L 18.500 12.500 C 20.586 13.398 22.000 14.857 22.000 16.182 C 22.000 17.867 20.800 20.000 16.043 20.000 C 9.837 20.000 2.000 15.958 2.000 12.680 C 2.000 11.636 3.333 10.910 6.000 10.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 6.000 10.500 C 6.000 11.469 10.390 14.000 15.500 14.000 C 16.814 14.000 18.500 14.063 18.500 12.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandRedhat!!
    }

private var _brandRedhat: ImageVector? = null
