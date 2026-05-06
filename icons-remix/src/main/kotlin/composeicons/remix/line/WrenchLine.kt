package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WrenchLine: ImageVector
    get() {
        if (_wrenchLine != null) return _wrenchLine!!
        _wrenchLine = remixIcon(
            name = "WrenchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.038 6.378c.23-.23 .556-.333 .876-.278 .32 .055 .593 .262 .733 .555 1.242 2.601 .789 5.811-1.367 7.967-1.833 1.833-4.428 2.435-6.762 1.812L8.673 20.279c-1.367 1.367-3.583 1.367-4.95 0-1.367-1.367-1.367-3.583 0-4.95L7.568 11.484C6.945 9.151 7.547 6.555 9.38 4.722 11.536 2.566 14.747 2.113 17.347 3.355c.293 .14 .5 .413 .555 .733 .055 .32-.049 .647-.278 .876L15.037 7.551c-.391 .391-.391 1.024 0 1.414 .391 .391 1.024 .391 1.414 0L19.038 6.378ZM17.865 10.379c-1.172 1.172-3.071 1.172-4.243 0-1.172-1.172-1.172-3.071 0-4.243L15.037 4.722c-1.505-.214-3.087 .259-4.243 1.415C9.368 7.562 8.981 9.637 9.641 11.415c.136 .366 .046 .778-.23 1.054L5.137 16.743c-.586 .586-.586 1.536 0 2.121 .586 .586 1.536 .586 2.121 0l4.274-4.274c.276-.276 .688-.366 1.055-.23 1.778 .659 3.853 .273 5.278-1.153 1.156-1.156 1.629-2.739 1.415-4.243l-1.415 1.415Z"),
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
        return _wrenchLine!!
    }

private var _wrenchLine: ImageVector? = null
