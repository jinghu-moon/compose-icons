package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorLightIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.85 90.72h0l-104-56c-1.773-.953-3.907-.953-5.68 0l-104 56h0C19.222 91.762 18.004 93.791 18 96v64c-0 2.205 1.21 4.233 3.15 5.28h0l104 56c1.773 .953 3.907 .953 5.68 0l104-56h0c1.948-1.042 3.166-3.071 3.17-5.28v-64c0-2.205-1.21-4.233-3.15-5.28ZM226 150 185.23 128 226 106ZM172.57 121.23 134 100.42v-50.42l85.34 46ZM128 145.23 96.08 128 128 110.81 159.92 128ZM122 50v50.38L83.43 121.18 36.66 96ZM30 106l40.77 22L30 150ZM83.43 134.76 122 155.58v50.42L36.66 160ZM134 206v-50.42l38.57-20.77L219.34 160Z"),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
