package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InstagramLine: ImageVector
    get() {
        if (_instagramLine != null) return _instagramLine!!
        _instagramLine = remixIcon(
            name = "InstagramLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 9C10.344 9 9.001 10.343 9.001 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3ZM12.001 7c2.76 0 5 2.237 5 5 0 2.76-2.237 5-5 5C9.241 17 7.001 14.763 7.001 12c0-2.76 2.237-5 5-5ZM18.501 6.749c0 .69-.561 1.25-1.25 1.25-.69 0-1.25-.561-1.25-1.25 0-.689 .561-1.249 1.25-1.249 .688-.001 1.25 .56 1.25 1.249ZM12.001 4C9.526 4 9.123 4.007 7.972 4.058c-.784 .037-1.31 .142-1.798 .332-.434 .168-.747 .369-1.081 .703-.335 .335-.535 .647-.703 1.081-.19 .489-.295 1.014-.332 1.797C4.007 9.075 4.001 9.461 4.001 12c0 2.474 .007 2.878 .058 4.029 .037 .784 .142 1.31 .332 1.797 .169 .435 .37 .748 .702 1.08 .336 .336 .649 .537 1.079 .703 .494 .191 1.02 .297 1.8 .333 1.104 .052 1.49 .058 4.029 .058 2.474 0 2.878-.007 4.029-.058 .782-.037 1.309-.143 1.797-.332 .433-.168 .748-.37 1.08-.702 .336-.337 .537-.649 .703-1.08 .191-.493 .296-1.019 .332-1.799 .052-1.104 .058-1.49 .058-4.029 0-2.474-.007-2.878-.058-4.029-.037-.782-.143-1.31-.332-1.798-.168-.433-.37-.747-.703-1.081-.335-.335-.647-.536-1.081-.703-.489-.19-1.015-.295-1.797-.332C14.926 4.006 14.54 4 12.001 4ZM12.001 2c2.717 0 3.056 .01 4.123 .06 1.064 .049 1.79 .217 2.427 .465 .659 .254 1.216 .597 1.772 1.153 .555 .556 .898 1.114 1.153 1.772 .247 .637 .415 1.363 .465 2.428 .048 1.067 .06 1.406 .06 4.122 0 2.717-.01 3.056-.06 4.122-.049 1.064-.218 1.79-.465 2.427-.254 .659-.598 1.216-1.153 1.772-.556 .555-1.115 .898-1.772 1.153-.638 .247-1.363 .415-2.427 .465C15.057 21.987 14.718 22 12.001 22 9.284 22 8.945 21.99 7.878 21.94 6.814 21.891 6.089 21.722 5.451 21.475 4.793 21.221 4.235 20.877 3.679 20.322 3.123 19.766 2.781 19.207 2.526 18.55c-.247-.637-.415-1.363-.465-2.427C2.013 15.056 2.001 14.717 2.001 12c0-2.717 .01-3.056 .06-4.122C2.11 6.812 2.278 6.088 2.526 5.45 2.78 4.792 3.123 4.234 3.679 3.678 4.235 3.122 4.793 2.78 5.451 2.525c.637-.248 1.362-.415 2.427-.465C8.945 2.013 9.284 2 12.001 2Z"),
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
        return _instagramLine!!
    }

private var _instagramLine: ImageVector? = null
