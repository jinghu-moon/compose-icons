package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorLightIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 208c0 3.314-2.686 6-6 6h-48c-2.273 0-4.35-1.284-5.367-3.317-1.016-2.033-.797-4.465 .567-6.283l43.17-57.56c4.229-5.667 4.748-13.286 1.327-19.475-3.422-6.189-10.15-9.8-17.198-9.232-7.049 .568-13.112 5.21-15.498 11.867-.676 2.07-2.422 3.612-4.56 4.027-2.138 .415-4.333-.361-5.735-2.028-1.402-1.667-1.79-3.963-1.015-5.998 3.994-11.071 14.092-18.783 25.824-19.723 11.731-.94 22.929 5.067 28.634 15.36 5.706 10.293 4.866 22.972-2.148 32.423L204 202h36c3.314 0 6 2.686 6 6ZM147.93 51.47c-2.502-2.169-6.289-1.9-8.46 .6L92 106.84 44.53 52.07C43.148 50.374 40.952 49.565 38.8 49.958c-2.152 .393-3.92 1.927-4.613 4.002-.693 2.075-.202 4.363 1.282 5.97L84.06 116 35.47 172.07c-1.484 1.608-1.975 3.895-1.282 5.97 .693 2.075 2.46 3.608 4.613 4.002 2.152 .393 4.348-.416 5.73-2.112L92 125.16l47.47 54.77c2.199 2.382 5.892 2.587 8.341 .462 2.449-2.124 2.767-5.809 .719-8.322L99.94 116 148.53 59.93c2.169-2.502 1.9-6.289-.6-8.46Z"),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
