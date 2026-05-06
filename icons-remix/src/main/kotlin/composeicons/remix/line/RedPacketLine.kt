package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RedPacketLine: ImageVector
    get() {
        if (_redPacketLine != null) return _redPacketLine!!
        _redPacketLine = remixIcon(
            name = "RedPacketLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.178 9.766c1.855-.411 3.517-1.338 4.827-2.622v-3.141h-14v3.141C6.315 8.428 7.976 9.355 9.832 9.766c.43-.755 1.242-1.263 2.173-1.263 .931 0 1.743 .509 2.173 1.263ZM14.386 11.767c-.323 1.007-1.267 1.736-2.381 1.736-1.114 0-2.058-.729-2.381-1.736C7.927 11.425 6.36 10.726 5.005 9.751v10.252h14v-10.252c-1.355 .975-2.922 1.674-4.619 2.016ZM4.005 2.003h16c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-18c0-.552 .448-1 1-1Z"),
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
        return _redPacketLine!!
    }

private var _redPacketLine: ImageVector? = null
