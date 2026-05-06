package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Wechat2Line: ImageVector
    get() {
        if (_wechat2Line != null) return _wechat2Line!!
        _wechat2Line = remixIcon(
            name = "Wechat2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.667 11.511c-.717 0-1.285-.568-1.285-1.286 0-.718 .568-1.286 1.285-1.286 .717 0 1.285 .568 1.285 1.286 0 .718-.568 1.286-1.285 1.286ZM15.334 11.511c-.717 0-1.285-.568-1.285-1.286 0-.718 .568-1.286 1.285-1.286 .717 0 1.285 .568 1.285 1.286 0 .718-.568 1.286-1.285 1.286ZM6.823 19.215l.716-.436c.81-.494 1.769-.684 2.705-.536 .212 .033 .385 .059 .52 .077 .406 .054 .819 .081 1.237 .081 4.421 0 7.9-3.022 7.9-6.6 0-3.578-3.479-6.6-7.9-6.6-4.421 0-7.9 3.022-7.9 6.6 0 1.365 .5 2.673 1.432 3.781 .048 .057 .121 .137 .214 .235 .795 .828 1.196 1.958 1.101 3.103l-.025 .297ZM6.193 21.942c-.183 .114-.398 .166-.613 .148-.55-.046-.959-.529-.914-1.08l.188-2.259c.048-.572-.153-1.137-.55-1.551-.122-.127-.223-.238-.302-.333C2.806 15.447 2.101 13.695 2.101 11.8c0-4.75 4.432-8.6 9.9-8.6 5.468 0 9.9 3.85 9.9 8.6 0 4.75-4.432 8.6-9.9 8.6-.509 0-1.01-.033-1.499-.098-.153-.02-.342-.048-.569-.084-.468-.074-.948 .021-1.353 .268L6.193 21.942Z"),
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
        return _wechat2Line!!
    }

private var _wechat2Line: ImageVector? = null
