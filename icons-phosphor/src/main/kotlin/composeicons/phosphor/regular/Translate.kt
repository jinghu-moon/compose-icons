package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorRegularIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.15 212.42l-56-112c-1.355-2.71-4.125-4.421-7.155-4.421-3.03 0-5.8 1.712-7.155 4.421l-21.71 43.43C138.113 142.893 121.74 137.015 108 126.93 124.121 109.715 133.889 87.516 135.69 64h24.31c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-56v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-56c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h87.63C117.848 83.607 109.526 102.044 96 116.35 87.572 107.457 81.099 96.897 77 85.35c-.917-2.742-3.243-4.776-6.083-5.319-2.84-.543-5.752 .488-7.617 2.697-1.865 2.21-2.393 5.253-1.38 7.962C66.693 104.189 74.211 116.552 84 127 68.928 138.076 50.704 144.033 32 144c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 23.206 .026 45.747-7.751 64-22.08 14.896 11.639 32.678 19.005 51.44 21.31l-26.6 53.19c-1.977 3.952-.377 8.758 3.575 10.735 3.952 1.977 8.758 .377 10.735-3.575L148.94 192h70.11l13.79 27.58c1.357 2.711 4.129 4.422 7.16 4.42 2.772-.001 5.346-1.438 6.803-3.797 1.456-2.359 1.588-5.304 .347-7.783ZM156.94 176 184 121.89 211.05 176Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
