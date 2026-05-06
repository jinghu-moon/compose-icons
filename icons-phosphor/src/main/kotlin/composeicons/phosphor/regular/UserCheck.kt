package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorRegularIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 157.68c25.766-16.048 37.775-47.23 29.43-76.415C165.084 52.079 138.405 31.96 108.05 31.96c-30.355 0-57.034 20.119-65.38 49.305-8.346 29.185 3.663 60.367 29.43 76.415-20.65 6.76-39.23 19.39-54.17 37.17-2.844 3.383-2.408 8.431 .975 11.275 3.383 2.844 8.431 2.408 11.275-.975C50.25 181.19 77.91 168 108 168c30.09 0 57.75 13.19 77.87 37.15 2.844 3.383 7.892 3.819 11.275 .975 3.383-2.844 3.819-7.892 .975-11.275C183.18 177.07 164.6 164.44 144 157.68ZM56 100C56 71.281 79.281 48 108 48c28.719 0 52 23.281 52 52 0 28.719-23.281 52-52 52C79.295 151.967 56.033 128.705 56 100ZM253.66 133.66l-32 32c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-16-16c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L216 148.69l26.34-26.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
