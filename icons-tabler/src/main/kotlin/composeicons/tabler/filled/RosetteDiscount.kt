package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RosetteDiscount: ImageVector
    get() {
        if (_rosetteDiscount != null) return _rosetteDiscount!!
        _rosetteDiscount = tablerFilledIcon(
            name = "RosetteDiscount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.01 2.011c.852 0 1.668 .34 2.267 .942l.698 .698c.225 .223 .528 .349 .845 .349h1c1.767 0 3.2 1.433 3.2 3.2v1c0 .316 .126 .62 .347 .843l.698 .698c.604 .6 .943 1.416 .944 2.268 0 .851-.338 1.668-.942 2.268l-.698 .698c-.223 .225-.349 .528-.349 .845v1c0 1.767-1.433 3.2-3.2 3.2h-1c-.316 0-.619 .125-.843 .347l-.698 .698c-.6 .604-1.416 .943-2.268 .944-.851 0-1.668-.338-2.268-.942l-.698-.698c-.225-.223-.528-.349-.845-.349h-1C5.433 20.02 4 18.587 4 16.82v-1c-0-.316-.125-.619-.347-.843l-.698-.698c-.604-.6-.943-1.416-.944-2.268-0-.851 .338-1.668 .942-2.268l.698-.698C3.874 8.82 4 8.517 4 8.2v-1l.005-.182C4.101 5.324 5.503 4 7.2 4h1c.316-0 .619-.125 .843-.347l.698-.698c.601-.604 1.417-.944 2.269-.944M14.5 13C13.672 13 13 13.672 13 14.5c0 .828 .672 1.5 1.5 1.5C15.328 16 16 15.328 16 14.5 16 13.672 15.328 13 14.5 13M15.707 8.293c-.391-.39-1.023-.39-1.414 0l-6 6c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l6-6c.39-.391 .39-1.023 0-1.414M9.5 8C8.672 8 8 8.672 8 9.5 8 10.328 8.672 11 9.5 11 10.328 11 11 10.328 11 9.5 11 8.672 10.328 8 9.5 8"),
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
        return _rosetteDiscount!!
    }

private var _rosetteDiscount: ImageVector? = null
