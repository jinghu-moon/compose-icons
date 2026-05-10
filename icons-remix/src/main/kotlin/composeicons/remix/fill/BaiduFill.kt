package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BaiduFill: ImageVector
    get() {
        if (_baiduFill != null) return _baiduFill!!
        _baiduFill = remixIcon(
            name = "BaiduFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.926 12.497C7.989 12.054 7.708 9.588 7.646 9.049 7.545 8.219 6.568 6.767 5.242 6.882 3.572 7.032 3.328 9.443 3.328 9.443c-.226 1.115 .541 3.497 2.598 3.053ZM8.117 16.785c-.06 .173-.195 .617-.079 1.003 .23 .866 .982 .905 .982 .905h1.08v-2.641h-1.157c-.52 .155-.771 .56-.827 .733ZM9.755 8.363c1.139 0 2.06-1.311 2.06-2.932 0-1.619-.921-2.93-2.06-2.93C8.617 2.5 7.694 3.811 7.694 5.43c0 1.621 .924 2.932 2.061 2.932ZM14.662 8.556c1.523 .198 2.502-1.427 2.697-2.659C17.557 4.667 16.575 3.239 15.497 2.993 14.417 2.745 13.068 4.476 12.945 5.604c-.147 1.379 .197 2.757 1.717 2.953ZM14.662 12.004C12.797 9.099 10.149 10.281 9.263 11.759c-.882 1.477-2.257 2.411-2.452 2.659-.198 .243-2.846 1.673-2.258 4.284 .588 2.609 2.652 2.559 2.652 2.559 0 0 1.521 .15 3.286-.245 1.766-.392 3.286 .097 3.286 .097 0 0 4.124 1.381 5.253-1.278 1.127-2.66-.638-4.038-.638-4.038 0 0-2.356-1.823-3.732-3.793ZM8.655 19.754C7.497 19.523 7.036 18.733 6.978 18.598c-.057-.137-.386-.772-.212-1.852 .5-1.619 1.927-1.735 1.927-1.735h1.427v-1.755l1.216 .019v6.479h-2.681ZM13.245 19.735c-1.196-.308-1.252-1.158-1.252-1.158v-3.412l1.252-.02v3.067c.076 .327 .483 .386 .483 .386h1.271v-3.433h1.332v4.57h-3.086ZM20.698 10.625c0-.589-.49-2.364-2.305-2.364-1.818 0-2.062 1.675-2.062 2.859 0 1.13 .095 2.707 2.354 2.657 2.26-.05 2.012-2.559 2.012-3.152Z"),
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
        return _baiduFill!!
    }

private var _baiduFill: ImageVector? = null
