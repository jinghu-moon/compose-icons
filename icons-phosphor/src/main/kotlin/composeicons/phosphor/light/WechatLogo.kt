package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorLightIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M142 140c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM188 130c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM237.42 212c1.472 4.929 .122 10.267-3.515 13.905-3.637 3.637-8.976 4.987-13.905 3.515l-25.46-7.49c-19.393 9.575-41.891 10.667-62.12 3.017C112.19 217.297 96.045 201.591 87.84 181.58c-9.194-.944-18.144-3.535-26.42-7.65L36 181.42c-4.929 1.472-10.267 .122-13.905-3.515C18.458 174.267 17.108 168.929 18.58 164l7.49-25.46C13.481 112.976 15.835 82.581 32.21 59.26 48.585 35.938 76.374 23.403 104.694 26.562c28.32 3.159 52.663 21.511 63.496 47.868 25.38 2.675 47.846 17.597 60.154 39.954 12.308 22.357 12.9 49.321 1.586 72.196ZM83.86 168.87c-4.942-22.209 .07-45.469 13.721-63.672C111.231 86.995 132.155 75.667 154.86 74.19 138.032 41.854 98.176 29.282 65.84 46.11 33.504 62.938 20.932 102.794 37.76 135.13c.741 1.391 .909 3.016 .47 4.53l-8.17 27.76c-.209 .702-.017 1.463 .5 1.982 .517 .519 1.277 .714 1.98 .508l27.77-8.17c1.514-.438 3.139-.27 4.53 .47 5.957 3.192 12.373 5.439 19.02 6.66ZM218.21 183.13c15.425-28.847 7.392-64.641-18.881-84.13C173.055 79.511 136.471 82.208 113.339 105.339c-23.131 23.131-25.828 59.716-6.339 85.99 19.489 26.273 55.283 34.307 84.13 18.881 1.391-.74 3.016-.908 4.53-.47l27.77 8.17c.701 .204 1.458 .011 1.974-.506 .516-.516 .71-1.273 .506-1.974l-8.17-27.77c-.439-1.514-.271-3.139 .47-4.53Z"),
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
