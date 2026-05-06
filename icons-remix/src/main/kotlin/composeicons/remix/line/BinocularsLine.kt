package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BinocularsLine: ImageVector
    get() {
        if (_binocularsLine != null) return _binocularsLine!!
        _binocularsLine = remixIcon(
            name = "BinocularsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.488 3.33c2.134-.571 4.327 .695 4.898 2.829l2.459 9.176c.643 2.4-.781 4.868-3.182 5.512-2.401 .643-4.868-.782-5.512-3.183-.085-.319-.134-.64-.148-.957-.636 .19-1.309 .293-2.005 .293-.697 0-1.37-.103-2.006-.293-.015 .317-.062 .638-.147 .957-.643 2.401-3.111 3.826-5.512 3.183C1.934 20.204 .509 17.736 1.153 15.335L3.611 6.159C4.183 4.026 6.376 2.759 8.51 3.33c1.732 .464 2.892 1.997 2.962 3.698 .174-.018 .349-.028 .527-.028 .178 0 .353 .01 .526 .028 .07-1.702 1.231-3.234 2.963-3.698ZM6.146 14.085c-1.333-.357-2.704 .434-3.062 1.767-.357 1.334 .434 2.705 1.768 3.062 1.334 .357 2.705-.435 3.062-1.768 .161-.603 .088-1.21-.163-1.731C7.445 14.781 6.877 14.281 6.146 14.085ZM20.835 15.61c-.45-1.185-1.733-1.859-2.983-1.524-.731 .196-1.299 .696-1.605 1.33-.251 .521-.323 1.129-.162 1.731 .357 1.333 1.728 2.125 3.062 1.768 1.25-.335 2.025-1.561 1.822-2.812l-.054-.25-.079-.243ZM18.455 6.677C18.169 5.61 17.073 4.977 16.006 5.263c-1 .268-1.62 1.248-1.458 2.249l.043 .2 .022 .103 .32 2.029-1.975 .313L12.792 9.106c-.252-.069-.518-.105-.793-.105-.276 0-.542 .037-.794 .105l-.166 1.051L9.064 9.844 9.321 8.218l.063-.403 .021-.103C9.692 6.645 9.059 5.549 7.992 5.263 6.925 4.977 5.829 5.61 5.543 6.677L4.052 12.238c.815-.277 1.718-.325 2.612-.085 1.209 .324 2.17 1.113 2.743 2.119 .756 .459 1.641 .727 2.592 .727 .951 0 1.835-.268 2.591-.727 .574-1.007 1.535-1.795 2.744-2.119 .894-.239 1.797-.192 2.611 .085L18.455 6.677Z"),
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
        return _binocularsLine!!
    }

private var _binocularsLine: ImageVector? = null
