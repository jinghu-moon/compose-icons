package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = radixIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.728 1.063c1.248 .127 2.222 1.181 2.223 2.462l-.013 .254c-.071 .703-.439 1.317-.974 1.721 .598 .452 .986 1.168 .986 1.976l-.013 .254C11.811 8.976 10.756 9.95 9.475 9.95L9.222 9.938C8.766 9.891 8.349 9.719 8 9.46v1.965l-.013 .254c-.127 1.248-1.182 2.222-2.463 2.222l-.253-.013C4.107 13.769 3.181 12.843 3.063 11.679l-.013-.254c0-.807 .386-1.525 .984-1.977C3.501 9.044 3.134 8.431 3.063 7.729L3.05 7.475c0-.807 .387-1.524 .985-1.976C3.501 5.095 3.134 4.481 3.063 3.779L3.05 3.525C3.05 2.243 4.024 1.19 5.272 1.063l.253-.013h3.95l.253 .013ZM5.525 9.95c-.814 0-1.474 .66-1.475 1.475 0 .814 .66 1.475 1.475 1.476 .814 0 1.475-.661 1.476-1.476v-1.475h-1.476ZM5.525 6C4.71 6 4.05 6.661 4.05 7.475c0 .814 .66 1.475 1.475 1.476h1.476v-2.95h-1.476ZM9.475 6C8.661 6 8 6.661 8 7.475c0 .814 .66 1.475 1.475 1.476 .814-0 1.475-.661 1.476-1.476C10.95 6.66 10.289 6 9.475 6ZM8 5h1.475c.815 0 1.476-.661 1.476-1.476C10.95 2.71 10.289 2.05 9.475 2.05h-1.475v2.95ZM5.525 2.05C4.71 2.05 4.05 2.71 4.05 3.525c0 .814 .66 1.475 1.475 1.476h1.476v-2.95h-1.476Z"),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
