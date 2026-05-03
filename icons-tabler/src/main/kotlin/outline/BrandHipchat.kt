package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHipchat: ImageVector
    get() {
        if (_brandHipchat != null) return _brandHipchat!!
        _brandHipchat = tablerOutlineIcon(
            name = "BrandHipchat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.802 17.292 C 17.802 17.292 17.879 17.237 18.002 17.143 C 19.845 15.718 21.002 13.653 21.002 11.354 C 21.002 7.068 16.972 3.590 12.002 3.590 C 7.032 3.590 3.002 7.068 3.002 11.354 C 3.002 15.642 7.032 19.000 12.002 19.000 C 12.426 19.000 13.122 18.972 14.090 18.916 C 15.352 19.736 17.194 20.409 18.806 20.409 C 19.305 20.409 19.540 19.999 19.220 19.581 C 18.734 18.985 18.064 18.030 17.804 17.291 L 17.802 17.292"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.500 13.500 C 10.000 16.000 14.000 16.000 16.500 13.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandHipchat!!
    }

private var _brandHipchat: ImageVector? = null
