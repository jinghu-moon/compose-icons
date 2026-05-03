package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpeechToTextFill: ImageVector
    get() {
        if (_speechToTextFill != null) return _speechToTextFill!!
        _speechToTextFill = remixIcon(
            name = "SpeechToTextFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 20.209 3.000 22.000 4.791 22.000 7.000 L 22.000 17.000 C 22.000 19.209 20.209 21.000 18.000 21.000 L 6.000 21.000 C 3.791 21.000 2.000 19.209 2.000 17.000 L 2.000 11.999 L 4.268 14.267 C 4.933 14.932 5.990 15.059 6.689 14.429 C 8.721 12.599 10.000 9.950 10.000 7.000 C 10.000 5.577 9.699 4.225 9.163 3.000 L 18.000 3.000 ZM 10.000 11.000 L 13.000 11.000 L 13.000 17.000 L 15.000 17.000 L 15.000 11.000 L 18.000 11.000 L 18.000 9.000 L 10.000 9.000 L 10.000 11.000 ZM 5.657 1.343 C 7.105 2.790 8.000 4.791 8.000 7.000 C 8.000 9.209 7.105 11.210 5.657 12.657 L 4.242 11.242 C 5.328 10.156 6.000 8.657 6.000 7.000 C 6.000 5.343 5.328 3.844 4.242 2.758 L 5.657 1.343 ZM 2.828 4.172 C 3.552 4.896 4.000 5.895 4.000 7.000 C 4.000 8.105 3.552 9.104 2.828 9.828 L 1.414 8.414 C 1.776 8.052 2.000 7.552 2.000 7.000 C 2.000 6.448 1.776 5.948 1.414 5.586 L 2.828 4.172 Z"),
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
        return _speechToTextFill!!
    }

private var _speechToTextFill: ImageVector? = null
