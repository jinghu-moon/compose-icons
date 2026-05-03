package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CodepenFill: ImageVector
    get() {
        if (_codepenFill != null) return _codepenFill!!
        _codepenFill = remixIcon(
            name = "CodepenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 10.202 L 9.303 12.000 L 12.000 13.798 L 14.697 12.000 L 12.000 10.202 ZM 16.500 10.798 L 19.197 9.000 L 13.000 4.869 L 13.000 8.465 L 16.500 10.798 ZM 20.000 10.868 L 18.303 12.000 L 20.000 13.132 L 20.000 10.868 ZM 16.500 13.202 L 13.000 15.535 L 13.000 19.132 L 19.197 15.000 L 16.500 13.202 ZM 11.000 8.465 L 11.000 4.869 L 4.803 9.000 L 7.500 10.798 L 11.000 8.465 ZM 4.803 15.000 L 11.000 19.132 L 11.000 15.535 L 7.500 13.202 L 4.803 15.000 ZM 5.697 12.000 L 4.000 10.868 L 4.000 13.132 L 5.697 12.000 ZM 2.000 9.000 C 2.000 8.666 2.167 8.353 2.445 8.168 L 11.445 2.168 C 11.781 1.944 12.219 1.944 12.555 2.168 L 21.555 8.168 C 21.833 8.353 22.000 8.666 22.000 9.000 L 22.000 15.000 C 22.000 15.334 21.833 15.647 21.555 15.832 L 12.555 21.832 C 12.219 22.056 11.781 22.056 11.445 21.832 L 2.445 15.832 C 2.167 15.647 2.000 15.334 2.000 15.000 L 2.000 9.000 Z"),
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
        return _codepenFill!!
    }

private var _codepenFill: ImageVector? = null
