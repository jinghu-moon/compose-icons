package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Woman: ImageVector
    get() {
        if (_woman != null) return _woman!!
        _woman = tablerFilledIcon(
            name = "Woman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 8.000 C 15.910 8.000 17.790 8.752 19.625 10.219 C 20.056 10.564 20.126 11.194 19.781 11.625 C 19.436 12.056 18.806 12.126 18.375 11.781 C 17.356 10.966 16.359 10.436 15.378 10.181 L 16.962 15.725 C 17.048 16.027 16.988 16.352 16.799 16.602 C 16.610 16.853 16.314 17.000 16.000 17.000 L 15.000 17.000 L 15.000 21.000 C 15.000 21.552 14.552 22.000 14.000 22.000 C 13.448 22.000 13.000 21.552 13.000 21.000 L 13.000 17.000 L 11.000 17.000 L 11.000 21.000 C 11.000 21.552 10.552 22.000 10.000 22.000 C 9.448 22.000 9.000 21.552 9.000 21.000 L 9.000 17.000 L 8.000 17.000 C 7.686 17.000 7.390 16.853 7.201 16.602 C 7.012 16.352 6.952 16.027 7.038 15.725 L 8.622 10.180 C 7.642 10.436 6.644 10.966 5.625 11.781 C 5.194 12.126 4.564 12.056 4.219 11.625 C 3.874 11.194 3.944 10.564 4.375 10.219 C 6.108 8.833 7.881 8.086 9.682 8.007 L 10.017 8.000 Z"),
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
                pathData = parseSvgPathData("M 12.000 1.000 C 13.657 1.000 15.000 2.343 15.000 4.000 C 15.000 5.657 13.657 7.000 12.000 7.000 C 10.343 7.000 9.000 5.657 9.000 4.000 L 9.005 3.824 C 9.098 2.238 10.411 1.000 12.000 1.000"),
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
        return _woman!!
    }

private var _woman: ImageVector? = null
