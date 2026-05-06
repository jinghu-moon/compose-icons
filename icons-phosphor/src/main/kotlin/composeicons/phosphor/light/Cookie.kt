package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorLightIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M163.07 164.93c2.861 2.86 3.717 7.161 2.169 10.898-1.548 3.737-5.194 6.174-9.239 6.174-4.045 0-7.691-2.437-9.239-6.174-1.548-3.737-.692-8.039 2.169-10.898 3.905-3.904 10.235-3.904 14.14 0ZM84.93 156.93c-2.861 2.86-3.717 7.161-2.169 10.898 1.548 3.737 5.194 6.174 9.239 6.174 4.045 0 7.691-2.437 9.239-6.174 1.548-3.737 .692-8.039-2.169-10.898-3.905-3.904-10.235-3.904-14.14 0ZM91.07 115.07c2.861-2.86 3.717-7.161 2.169-10.898C91.691 100.435 88.045 97.998 84 97.998c-4.045 0-7.691 2.437-9.239 6.174-1.548 3.737-.692 8.039 2.169 10.898 3.905 3.904 10.235 3.904 14.14 0ZM124.93 116.93c-2.861 2.86-3.717 7.161-2.169 10.898 1.548 3.737 5.194 6.174 9.239 6.174 4.045 0 7.691-2.437 9.239-6.174 1.548-3.737 .692-8.039-2.169-10.898-3.905-3.904-10.235-3.904-14.14 0ZM230 128c0 56.333-45.667 102-102 102C71.667 230 26 184.333 26 128 26 71.667 71.667 26 128 26c3.314 0 6 2.686 6 6 0 23.196 18.804 42 42 42 3.314 0 6 2.686 6 6 0 23.196 18.804 42 42 42 3.314 0 6 2.686 6 6ZM217.82 133.65C192.726 130.726 172.998 110.82 170.3 85.7c-25.142-2.677-45.076-22.415-48-47.53C74.156 41.197 36.96 81.644 37.968 129.873c1.008 48.229 39.862 87.086 88.09 88.1 48.229 1.013 88.68-36.179 91.712-84.323Z"),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
