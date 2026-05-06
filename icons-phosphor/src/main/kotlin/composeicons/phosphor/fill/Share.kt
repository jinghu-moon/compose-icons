package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorFillIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.66 109.66l-48 48c-2.288 2.291-5.731 2.976-8.722 1.737C169.947 158.158 167.997 155.238 168 152v-40h-3c-40.137-.011-75.196 27.138-85.23 66-1.105 4.28-5.47 6.855-9.75 5.75C65.74 182.645 63.165 178.28 64.27 174 76.11 128.058 117.557 95.964 165 96h3v-40c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737l48 48c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66ZM192 208h-152v-120c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v128c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
