package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Key2Line: ImageVector
    get() {
        if (_key2Line != null) return _key2Line!!
        _key2Line = remixIcon(
            name = "Key2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.758 11.828 L 18.607 3.979 L 20.021 5.393 L 18.607 6.808 L 21.081 9.282 L 19.667 10.697 L 17.192 8.222 L 15.778 9.636 L 17.899 11.757 L 16.485 13.172 L 14.364 11.050 L 12.172 13.242 C 13.458 15.184 13.246 17.825 11.535 19.535 C 9.583 21.488 6.417 21.488 4.464 19.535 C 2.512 17.583 2.512 14.417 4.464 12.465 C 6.175 10.754 8.816 10.542 10.758 11.828 ZM 10.121 18.121 C 11.293 16.950 11.293 15.050 10.121 13.879 C 8.950 12.707 7.050 12.707 5.879 13.879 C 4.707 15.050 4.707 16.950 5.879 18.121 C 7.050 19.293 8.950 19.293 10.121 18.121 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _key2Line!!
    }

private var _key2Line: ImageVector? = null
