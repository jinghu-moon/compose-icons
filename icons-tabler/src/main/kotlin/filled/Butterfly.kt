package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = tablerFilledIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.117 6.244 L 17.345 6.320 C 19.300 7.015 20.697 8.750 20.959 10.808 C 21.221 12.866 20.303 14.896 18.585 16.058 L 18.522 16.097 L 18.542 16.131 C 19.122 17.229 19.160 18.535 18.643 19.664 L 18.550 19.854 C 18.045 20.821 17.166 21.539 16.118 21.843 C 15.070 22.146 13.944 22.009 13.000 21.462 L 13.000 6.605 C 14.274 5.954 15.751 5.825 17.118 6.245"),
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
                pathData = parseSvgPathData("M 8.505 6.000 C 9.390 6.000 10.241 6.210 11.000 6.597 L 11.000 21.467 C 10.683 21.649 10.342 21.787 9.988 21.877 L 9.792 21.922 C 8.318 22.218 6.802 21.662 5.869 20.483 C 4.936 19.305 4.742 17.702 5.368 16.335 L 5.486 16.097 L 5.451 16.074 C 3.721 14.916 2.794 12.881 3.054 10.816 L 3.088 10.583 C 3.535 7.939 5.824 6.003 8.505 6.000"),
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
                pathData = parseSvgPathData("M 14.445 2.168 C 14.905 1.861 15.525 1.985 15.832 2.445 C 16.139 2.905 16.015 3.525 15.555 3.832 L 12.555 5.832 C 12.219 6.056 11.781 6.056 11.445 5.832 L 8.445 3.832 C 7.985 3.525 7.861 2.905 8.168 2.445 C 8.475 1.985 9.095 1.861 9.555 2.168 L 11.999 3.798 Z"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
