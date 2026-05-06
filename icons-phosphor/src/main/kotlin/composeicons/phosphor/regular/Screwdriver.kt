package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorRegularIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.66 50.32c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-56 56c-3.123 3.126-8.189 3.128-11.315 .005-3.126-3.123-3.128-8.189-.005-11.315l56-56c1.499-1.504 3.535-2.349 5.658-2.351 2.123-.002 4.16 .84 5.662 2.341ZM248 58.41c.034 13.382-5.285 26.221-14.77 35.66L180 147.3c-2.989 3.018-7.063 4.711-11.31 4.7h-16.69v16.83c-.001 3.488-1.143 6.88-3.25 9.66-.221 .293-.461 .57-.72 .83l-8 8c-6.248 6.243-16.372 6.243-22.62 0L98.7 168.6 21.7 245.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L87.43 157.29 68.73 138.58c-3.001-3.001-4.688-7.071-4.688-11.315 0-4.244 1.686-8.314 4.688-11.315l8-8c.257-.258 .531-.499 .82-.72 2.776-2.083 6.149-3.216 9.62-3.23h16.83v-16.7c-.007-4.24 1.678-8.307 4.68-11.3L161.92 22.77C176.341 8.356 198.023 4.045 216.862 11.845c18.839 7.8 31.127 26.176 31.138 46.565ZM232 58.41C231.999 44.486 223.612 31.933 210.749 26.603c-12.864-5.33-27.671-2.387-37.519 7.457L120 87.3v16.7c0 8.837-7.163 16-16 16h-16.72L80 127.27 128.72 176 136 168.72v-16.72c0-8.837 7.163-16 16-16h16.69L221.92 82.76C228.397 76.315 232.027 67.547 232 58.41Z"),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
