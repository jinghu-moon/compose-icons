package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorBoldIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 164c-15.249 .021-28.837 9.63-33.94 24h-94.06C56.536 188 44 175.464 44 160c0-15.464 12.536-28 28-28h96c24.301 0 44-19.699 44-44C212 63.699 192.301 44 168 44h-96C65.373 44 60 49.373 60 56c0 6.627 5.373 12 12 12h96c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20h-96c-28.719 0-52 23.281-52 52 0 28.719 23.281 52 52 52h94.06c6.103 17.261 24.188 27.193 42.028 23.08 17.84-4.113 29.752-20.96 27.682-39.15C233.7 177.739 218.308 163.999 200 164ZM200 212c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
