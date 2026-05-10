package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CursorAiFill: ImageVector
    get() {
        if (_cursorAiFill != null) return _cursorAiFill!!
        _cursorAiFill = remixIcon(
            name = "CursorAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.121 6.33 12.45 1.353c-.278-.16-.622-.16-.9 0L2.879 6.33c-.234 .134-.379 .383-.379 .652v10.036c0 .269 .144 .518 .379 .652l8.671 4.977c.278 .16 .622 .16 .9 0l8.671-4.977c.234-.134 .379-.383 .379-.652v-10.036c0-.269-.145-.518-.379-.652ZM20.577 7.384 12.206 21.798c-.057 .097-.206 .057-.206-.055v-9.438c0-.189-.101-.363-.266-.458L3.512 7.128c-.098-.056-.058-.205 .055-.205h16.742c.238 0 .386 .256 .267 .461Z"),
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
        return _cursorAiFill!!
    }

private var _cursorAiFill: ImageVector? = null
