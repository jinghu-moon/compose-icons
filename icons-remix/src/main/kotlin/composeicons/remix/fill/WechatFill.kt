package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WechatFill: ImageVector
    get() {
        if (_wechatFill != null) return _wechatFill!!
        _wechatFill = remixIcon(
            name = "WechatFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.575 13.711c.499 0 .898-.424 .898-.898 0-.499-.399-.898-.898-.898-.499 0-.898 .399-.898 .898 0 .499 .399 .898 .898 .898ZM14.15 13.711c.499 0 .898-.424 .898-.898 0-.499-.399-.898-.898-.898-.499 0-.898 .399-.898 .898 0 .499 .399 .898 .898 .898ZM20.717 18.752c-.123 .074-.196 .197-.172 .369 0 .049 0 .098 .024 .147 .098 .418 .295 1.081 .295 1.106 0 .074 .025 .123 .025 .172 0 .123-.098 .221-.221 .221-.049 0-.074-.025-.123-.049l-1.449-.836c-.098-.049-.221-.098-.344-.098-.074 0-.147 0-.196 .025-.688 .197-1.4 .295-2.161 .295-3.659 0-6.606-2.458-6.606-5.505 0-3.047 2.947-5.505 6.606-5.505 3.659 0 6.606 2.458 6.606 5.505 0 1.647-.884 3.146-2.284 4.153ZM16.674 8.098c-.093-.003-.186-.004-.279-.004-4.175 0-7.606 2.86-7.606 6.505 0 .554 .079 1.089 .228 1.599h-.089c-.886 0-1.772-.147-2.585-.368-.074-.025-.148-.025-.222-.025-.148 0-.295 .049-.418 .123L3.955 16.933c-.049 .025-.098 .049-.148 .049-.148 0-.271-.123-.271-.27 0-.074 .025-.123 .049-.196 .025-.024 .246-.834 .369-1.325 0-.049 .025-.123 .025-.172 0-.196-.098-.343-.222-.442C2.059 13.377 1.001 11.586 1.001 9.599 1.001 5.944 4.57 3 8.952 3c3.764 0 6.928 2.169 7.722 5.098ZM11.52 8.516c.573 0 1.026-.477 1.026-1.026 0-.573-.453-1.026-1.026-1.026-.573 0-1.026 .453-1.026 1.026 0 .573 .453 1.026 1.026 1.026ZM6.26 8.516c.573 0 1.026-.477 1.026-1.026C7.287 6.917 6.833 6.464 6.26 6.464c-.573 0-1.026 .453-1.026 1.026 0 .573 .453 1.026 1.026 1.026Z"),
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
        return _wechatFill!!
    }

private var _wechatFill: ImageVector? = null
