package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorThinIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.35 178C212.58 168 204 140.13 204 104 204 62.026 169.974 28 128 28 86.026 28 52 62.026 52 104c0 36.13-8.59 64-14.36 73.95-2.166 3.711-2.183 8.297-.044 12.024 2.139 3.727 6.107 6.025 10.404 6.026h44.23c2.066 18.193 17.46 31.937 35.77 31.937 18.31 0 33.704-13.744 35.77-31.937h44.23c4.28-.015 8.227-2.308 10.361-6.018 2.133-3.71 2.129-8.275-.011-11.982ZM128 220c-13.918-.001-25.722-10.225-27.71-24h55.42c-1.988 13.775-13.792 23.999-27.71 24ZM211.45 186c-.696 1.244-2.014 2.01-3.44 2h-160.01c-1.426 .01-2.744-.756-3.44-2-.715-1.238-.715-2.762 0-4C52 169.17 60 139.32 60 104 60 66.445 90.445 36 128 36c37.555 0 68 30.445 68 68 0 35.31 8 65.17 15.44 78 .718 1.236 .721 2.761 .01 4Z"),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
