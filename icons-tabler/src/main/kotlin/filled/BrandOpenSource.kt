package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandOpenSource: ImageVector
    get() {
        if (_brandOpenSource != null) return _brandOpenSource!!
        _brandOpenSource = tablerFilledIcon(
            name = "BrandOpenSource",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.283 2.004 C 16.961 2.134 20.924 5.492 21.820 10.086 C 22.716 14.680 20.306 19.280 16.019 21.159 C 15.770 21.268 15.487 21.271 15.236 21.167 C 14.984 21.063 14.786 20.861 14.687 20.608 L 12.494 15.006 C 12.309 14.535 12.505 14.001 12.950 13.761 C 13.756 13.326 14.163 12.399 13.939 11.511 C 13.715 10.623 12.916 10.001 12.000 10.001 C 11.084 10.001 10.285 10.623 10.061 11.511 C 9.837 12.399 10.244 13.326 11.050 13.761 C 11.495 14.001 11.691 14.534 11.507 15.005 L 9.314 20.608 C 9.215 20.861 9.017 21.063 8.766 21.168 C 8.514 21.272 8.231 21.269 7.982 21.160 C 3.646 19.261 1.235 14.581 2.207 9.948 C 3.178 5.314 7.266 1.997 12.000 2.000 Z"),
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
        return _brandOpenSource!!
    }

private var _brandOpenSource: ImageVector? = null
