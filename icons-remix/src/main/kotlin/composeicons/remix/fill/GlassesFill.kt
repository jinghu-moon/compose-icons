package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GlassesFill: ImageVector
    get() {
        if (_glassesFill != null) return _glassesFill!!
        _glassesFill = remixIcon(
            name = "GlassesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 12C1 9.239 3.239 7 6 7c1.214 0 2.327 .433 3.192 1.151C9.914 7.44 10.905 7 12 7c1.095 0 2.086 .44 2.808 1.151C15.673 7.433 16.786 7 18 7c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5-2.761 0-5-2.239-5-5 0-.816 .196-1.589 .545-2.271C13.177 9.283 12.621 9 12 9c-.621 0-1.177 .283-1.545 .729 .348 .682 .545 1.454 .545 2.271 0 2.761-2.239 5-5 5C3.239 17 1 14.761 1 12Z"),
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
        return _glassesFill!!
    }

private var _glassesFill: ImageVector? = null
