package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorDuotoneIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 96c0 35.346-28.654 64-64 64C92.654 160 64 131.346 64 96 64 60.654 92.654 32 128 32c35.346 0 64 28.654 64 64Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M230.92 212C215.69 185.67 192.22 166.79 164.83 157.84c27.848-16.578 41.188-49.719 32.591-80.966C188.824 45.626 160.409 23.973 128 23.973c-32.409 0-60.824 21.653-69.421 52.901-8.597 31.248 4.743 64.388 32.591 80.966C63.78 166.78 40.31 185.66 25.08 212c-1.52 2.479-1.576 5.588-.144 8.12 1.432 2.532 4.124 4.087 7.032 4.062 2.908-.025 5.574-1.626 6.962-4.182C57.77 187.44 91.07 168 128 168c36.93 0 70.23 19.44 89.07 52 1.388 2.556 4.053 4.157 6.962 4.182 2.908 .025 5.601-1.53 7.032-4.062 1.432-2.532 1.376-5.641-.144-8.12ZM72 96C72 65.072 97.072 40 128 40c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56C97.086 151.967 72.033 126.914 72 96Z"),
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
        return _user!!
    }

private var _user: ImageVector? = null
