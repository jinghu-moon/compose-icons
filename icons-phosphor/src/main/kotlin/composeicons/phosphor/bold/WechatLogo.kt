package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorBoldIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 144c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM184 128c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM243.18 210.35c2.065 7.021 .13 14.61-5.045 19.785-5.175 5.175-12.763 7.11-19.785 5.045l-23.26-6.84c-42.14 19.353-91.991 .898-111.37-41.23-7.892-1.151-15.577-3.431-22.82-6.77l-23.25 6.84c-1.835 .539-3.737 .815-5.65 .82-6.303 .001-12.237-2.97-16.014-8.016-3.777-5.046-4.954-11.577-3.176-17.624l6.84-23.26C.268 96.939 18.734 47.047 60.895 27.665c42.161-19.382 92.053-.916 111.435 41.245 26.153 3.878 48.954 19.842 61.544 43.091 12.59 23.248 13.5 51.068 2.456 75.089ZM76.46 160.75C71.863 117.044 101.755 77.192 145 69.37 126.733 43.419 91.417 36.182 64.414 52.854 37.412 69.527 28.062 104.343 43.08 132.3c1.489 2.78 1.823 6.035 .93 9.06l-6.09 20.72L58.64 156c3.025-.893 6.28-.559 9.06 .93 2.814 1.504 5.743 2.781 8.76 3.82ZM220 152c-.006-26.974-18.012-50.629-44.011-57.817-25.999-7.188-53.599 3.857-67.461 26.998-13.862 23.14-10.577 52.687 8.029 72.217 18.606 19.531 47.958 24.245 71.743 11.522 2.78-1.489 6.035-1.823 9.06-.93l20.72 6.09L212 189.36c-.893-3.025-.559-6.28 .93-9.06 4.645-8.709 7.074-18.429 7.07-28.3Z"),
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
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
